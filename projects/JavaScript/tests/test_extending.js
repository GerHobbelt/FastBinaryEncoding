'use strict'

const test = require('tape')

const fbe = require('../proto/fbe')
const proto = require('../proto/proto')
const protoex = require('../proto/protoex')

test('Extending: old -> new', function (t) {
  // Create a new account with some orders
  let account1 = new proto.Account(1, 'Test', proto.State.good, new proto.Balance('USD', 1000.0), new proto.Balance('EUR', 100.0))
  account1.orders.push(new proto.Order(1, 'EURUSD', proto.OrderSide.buy, proto.OrderType.market, 1.23456, 1000.0))
  account1.orders.push(new proto.Order(2, 'EURUSD', proto.OrderSide.sell, proto.OrderType.limit, 1.0, 100.0))
  account1.orders.push(new proto.Order(3, 'EURUSD', proto.OrderSide.buy, proto.OrderType.stop, 1.5, 10.0))

  // Serialize the account to the FBE stream
  let writer = new proto.AccountModel(new fbe.WriteBuffer())
  t.equal(writer.model.fbeOffset, 4)
  let serialized = writer.serialize(account1)
  t.equal(serialized, writer.buffer.size)
  t.true(writer.verify())
  writer.next(serialized)
  t.equal(writer.model.fbeOffset, (4 + writer.buffer.size))

  // Check the serialized FBE size
  t.equal(writer.buffer.size, 252)

  // Deserialize the account from the FBE stream
  let account2 = new protoex.Account()
  let reader = new protoex.AccountModel(new fbe.ReadBuffer())
  t.equal(reader.model.fbeOffset, 4)
  reader.attachBuffer(writer.buffer)
  t.true(reader.verify())
  let deserialized = reader.deserialize(account2)
  t.true(deserialized.size, reader.buffer.size)
  reader.next(deserialized.size)
  t.true(reader.model.fbeOffset, (4 + reader.buffer.size))

  t.equal(account2.uid, 1)
  t.equal(account2.name, 'Test')
  t.true(account2.state.hasFlags(protoex.StateEx.good))
  t.equal(account2.wallet.currency, 'USD')
  t.equal(account2.wallet.amount, 1000.0)
  t.equal(account2.wallet.locked, 0.0)
  t.notEqual(account2.asset, undefined)
  t.equal(account2.asset.currency, 'EUR')
  t.equal(account2.asset.amount, 100.0)
  t.equal(account2.asset.locked, 0.0)
  t.equal(account2.orders.length, 3)
  t.equal(account2.orders[0].uid, 1)
  t.equal(account2.orders[0].symbol, 'EURUSD')
  t.true(account2.orders[0].side.eq(protoex.OrderSide.buy))
  t.true(account2.orders[0].type.eq(protoex.OrderType.market))
  t.equal(account2.orders[0].price, 1.23456)
  t.equal(account2.orders[0].volume, 1000.0)
  t.equal(account2.orders[0].tp, 10.0)
  t.equal(account2.orders[0].sl, -10.0)
  t.equal(account2.orders[1].uid, 2)
  t.equal(account2.orders[1].symbol, 'EURUSD')
  t.true(account2.orders[1].side.eq(protoex.OrderSide.sell))
  t.true(account2.orders[1].type.eq(protoex.OrderType.limit))
  t.equal(account2.orders[1].price, 1.0)
  t.equal(account2.orders[1].volume, 100.0)
  t.equal(account2.orders[1].tp, 10.0)
  t.equal(account2.orders[1].sl, -10.0)
  t.equal(account2.orders[2].uid, 3)
  t.equal(account2.orders[2].symbol, 'EURUSD')
  t.true(account2.orders[2].side.eq(protoex.OrderSide.buy))
  t.true(account2.orders[2].type.eq(protoex.OrderType.stop))
  t.equal(account2.orders[2].price, 1.5)
  t.equal(account2.orders[2].volume, 10.0)
  t.equal(account2.orders[2].tp, 10.0)
  t.equal(account2.orders[2].sl, -10.0)
  t.end()
})

test('Extending: new -> old', function (t) {
  // Create a new account with some orders
  let account1 = new protoex.Account(1, 'Test', protoex.StateEx.fromFlags(protoex.StateEx.good | protoex.StateEx.happy), new protoex.Balance(new proto.Balance('USD', 1000.0), 123.456), new protoex.Balance(new proto.Balance('EUR', 100.0), 12.34))
  account1.orders.push(new protoex.Order(1, 'EURUSD', protoex.OrderSide.buy, protoex.OrderType.market, 1.23456, 1000.0, 0.0, 0.0))
  account1.orders.push(new protoex.Order(2, 'EURUSD', protoex.OrderSide.sell, protoex.OrderType.limit, 1.0, 100.0, 0.1, -0.1))
  account1.orders.push(new protoex.Order(3, 'EURUSD', protoex.OrderSide.tell, protoex.OrderType.stoplimit, 1.5, 10.0, 1.1, -1.1))

  // Serialize the account to the FBE stream
  let writer = new protoex.AccountModel(new fbe.WriteBuffer())
  t.equal(writer.model.fbeOffset, 4)
  let serialized = writer.serialize(account1)
  t.equal(serialized, writer.buffer.size)
  t.true(writer.verify())
  writer.next(serialized)
  t.equal(writer.model.fbeOffset, (4 + writer.buffer.size))

  // Check the serialized FBE size
  t.equal(writer.buffer.size, 316)

  // Deserialize the account from the FBE stream
  let account2 = new proto.Account()
  let reader = new proto.AccountModel(new fbe.ReadBuffer())
  t.equal(reader.model.fbeOffset, 4)
  reader.attachBuffer(writer.buffer)
  t.true(reader.verify())
  let deserialized = reader.deserialize(account2)
  t.true(deserialized.size, reader.buffer.size)
  reader.next(deserialized.size)
  t.true(reader.model.fbeOffset, (4 + reader.buffer.size))

  t.equal(account2.uid, 1)
  t.equal(account2.name, 'Test')
  t.true(account2.state.hasFlags(proto.State.good))
  t.equal(account2.wallet.currency, 'USD')
  t.equal(account2.wallet.amount, 1000.0)
  t.notEqual(account2.asset, undefined)
  t.equal(account2.asset.currency, 'EUR')
  t.equal(account2.asset.amount, 100.0)
  t.equal(account2.orders.length, 3)
  t.equal(account2.orders[0].uid, 1)
  t.equal(account2.orders[0].symbol, 'EURUSD')
  t.true(account2.orders[0].side.eq(proto.OrderSide.buy))
  t.true(account2.orders[0].type.eq(proto.OrderType.market))
  t.equal(account2.orders[0].price, 1.23456)
  t.equal(account2.orders[0].volume, 1000.0)
  t.equal(account2.orders[1].uid, 2)
  t.equal(account2.orders[1].symbol, 'EURUSD')
  t.true(account2.orders[1].side.eq(proto.OrderSide.sell))
  t.true(account2.orders[1].type.eq(proto.OrderType.limit))
  t.equal(account2.orders[1].price, 1.0)
  t.equal(account2.orders[1].volume, 100.0)
  t.equal(account2.orders[2].uid, 3)
  t.equal(account2.orders[2].symbol, 'EURUSD')
  t.false(account2.orders[2].side.eq(proto.OrderSide.buy))
  t.false(account2.orders[2].type.eq(proto.OrderType.stop))
  t.equal(account2.orders[2].price, 1.5)
  t.equal(account2.orders[2].volume, 10.0)
  t.end()
})
