// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.3.0.0


import Foundation

import fbe

// Fast Binary Encoding proto final client
open class FinalClient : FinalReceiverListener, fbe.ClientProtocol {
    // Client sender models accessors
    let OrderSenderModel: OrderFinalModel
    let BalanceSenderModel: BalanceFinalModel
    let AccountSenderModel: AccountFinalModel

    // Client receiver values accessors
    private var OrderReceiverValue: proto.Order
    private var BalanceReceiverValue: proto.Balance
    private var AccountReceiverValue: proto.Account

    // Client receiver models accessors
    private let OrderReceiverModel: OrderFinalModel
    private let BalanceReceiverModel: BalanceFinalModel
    private let AccountReceiverModel: AccountFinalModel

    public var sendBuffer: Buffer = Buffer()
    public var receiveBuffer: Buffer = Buffer()
    public var logging: Bool = false
    public var final: Bool = false

    public override init() {
        OrderSenderModel = OrderFinalModel(buffer: sendBuffer)
        OrderReceiverValue = proto.Order()
        OrderReceiverModel = OrderFinalModel()
        BalanceSenderModel = BalanceFinalModel(buffer: sendBuffer)
        BalanceReceiverValue = proto.Balance()
        BalanceReceiverModel = BalanceFinalModel()
        AccountSenderModel = AccountFinalModel(buffer: sendBuffer)
        AccountReceiverValue = proto.Account()
        AccountReceiverModel = AccountFinalModel()
        super.init()
        build(with: true)
    }

    public init(sendBuffer: fbe.Buffer, receiveBuffer: fbe.Buffer) {
        OrderSenderModel = OrderFinalModel(buffer: sendBuffer)
        OrderReceiverValue = proto.Order()
        OrderReceiverModel = OrderFinalModel()
        BalanceSenderModel = BalanceFinalModel(buffer: sendBuffer)
        BalanceReceiverValue = proto.Balance()
        BalanceReceiverModel = BalanceFinalModel()
        AccountSenderModel = AccountFinalModel(buffer: sendBuffer)
        AccountReceiverValue = proto.Account()
        AccountReceiverModel = AccountFinalModel()
        super.init()
        build(with: sendBuffer, receiveBuffer: receiveBuffer, final: true)
    }

    public func send(obj: Any) throws -> Int {
        switch obj {
            case is proto.Order: return try send(value: obj as! proto.Order)
            case is proto.Balance: return try send(value: obj as! proto.Balance)
            case is proto.Account: return try send(value: obj as! proto.Account)
            default: break
        }

        return 0
    }

    public func send(value: proto.Order) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try OrderSenderModel.serialize(value: value)
        assert(serialized > 0, "proto.Order serialization failed!")
        assert(OrderSenderModel.verify(), "proto.Order validation failed!")

        // Log the value
        if logging {
            let message = value.description
            onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: proto.Balance) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try BalanceSenderModel.serialize(value: value)
        assert(serialized > 0, "proto.Balance serialization failed!")
        assert(BalanceSenderModel.verify(), "proto.Balance validation failed!")

        // Log the value
        if logging {
            let message = value.description
            onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: proto.Account) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try AccountSenderModel.serialize(value: value)
        assert(serialized > 0, "proto.Account serialization failed!")
        assert(AccountSenderModel.verify(), "proto.Account validation failed!")

        // Log the value
        if logging {
            let message = value.description
            onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }

    // Send message handler
    open func onSend(buffer: Data, offset: Int, size: Int) throws -> Int { throw NSError() }
    open func onReceive(type: Int, buffer: Data, offset: Int, size: Int) -> Bool {
        return onReceiveListener(listener: self, type: type, buffer: buffer, offset: offset, size: size)
    }

    open func onReceiveListener(listener: FinalReceiverListener, type: Int, buffer: Data, offset: Int, size: Int) -> Bool {
        switch type {
        case proto.OrderFinalModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            OrderReceiverModel.attach(buffer: buffer, offset: offset)
            assert(OrderReceiverModel.verify(), "proto.Order validation failed!")
            let deserialized = OrderReceiverModel.deserialize(value: &OrderReceiverValue)
            assert(deserialized > 0, "proto.Order deserialization failed!")

            // Log the value
            if logging {
                let message = OrderReceiverValue.description
                onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: OrderReceiverValue)
            return true
        case proto.BalanceFinalModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            BalanceReceiverModel.attach(buffer: buffer, offset: offset)
            assert(BalanceReceiverModel.verify(), "proto.Balance validation failed!")
            let deserialized = BalanceReceiverModel.deserialize(value: &BalanceReceiverValue)
            assert(deserialized > 0, "proto.Balance deserialization failed!")

            // Log the value
            if logging {
                let message = BalanceReceiverValue.description
                onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: BalanceReceiverValue)
            return true
        case proto.AccountFinalModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            AccountReceiverModel.attach(buffer: buffer, offset: offset)
            assert(AccountReceiverModel.verify(), "proto.Account validation failed!")
            let deserialized = AccountReceiverModel.deserialize(value: &AccountReceiverValue)
            assert(deserialized > 0, "proto.Account deserialization failed!")

            // Log the value
            if logging {
                let message = AccountReceiverValue.description
                onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: AccountReceiverValue)
            return true
        default: break
        }

        return false
    }
}
