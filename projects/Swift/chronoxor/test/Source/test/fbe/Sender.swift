// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.3.0.0


import fbe

import Foundation

import proto

// Fast Binary Encoding com.chronoxor.test sender
open class Sender : fbe.SenderProtocol { 
    // Imported senders
    let protoSender: proto.Sender

    // Sender models accessors
    private let StructSimpleModel: StructSimpleModel
    private let StructOptionalModel: StructOptionalModel
    private let StructNestedModel: StructNestedModel
    private let StructBytesModel: StructBytesModel
    private let StructArrayModel: StructArrayModel
    private let StructVectorModel: StructVectorModel
    private let StructListModel: StructListModel
    private let StructSetModel: StructSetModel
    private let StructMapModel: StructMapModel
    private let StructHashModel: StructHashModel
    private let StructHashExModel: StructHashExModel
    private let StructEmptyModel: StructEmptyModel

    public var buffer: Buffer = Buffer()
    public var logging: Bool = false
    public var final: Bool = false

    public init() {
        protoSender = proto.Sender(buffer: buffer)
        StructSimpleModel = test.StructSimpleModel(buffer: buffer)
        StructOptionalModel = test.StructOptionalModel(buffer: buffer)
        StructNestedModel = test.StructNestedModel(buffer: buffer)
        StructBytesModel = test.StructBytesModel(buffer: buffer)
        StructArrayModel = test.StructArrayModel(buffer: buffer)
        StructVectorModel = test.StructVectorModel(buffer: buffer)
        StructListModel = test.StructListModel(buffer: buffer)
        StructSetModel = test.StructSetModel(buffer: buffer)
        StructMapModel = test.StructMapModel(buffer: buffer)
        StructHashModel = test.StructHashModel(buffer: buffer)
        StructHashExModel = test.StructHashExModel(buffer: buffer)
        StructEmptyModel = test.StructEmptyModel(buffer: buffer)
        build(with: false)
    }

    public init(buffer: fbe.Buffer) {
        protoSender = proto.Sender(buffer: buffer)
        StructSimpleModel = test.StructSimpleModel(buffer: buffer)
        StructOptionalModel = test.StructOptionalModel(buffer: buffer)
        StructNestedModel = test.StructNestedModel(buffer: buffer)
        StructBytesModel = test.StructBytesModel(buffer: buffer)
        StructArrayModel = test.StructArrayModel(buffer: buffer)
        StructVectorModel = test.StructVectorModel(buffer: buffer)
        StructListModel = test.StructListModel(buffer: buffer)
        StructSetModel = test.StructSetModel(buffer: buffer)
        StructMapModel = test.StructMapModel(buffer: buffer)
        StructHashModel = test.StructHashModel(buffer: buffer)
        StructHashExModel = test.StructHashExModel(buffer: buffer)
        StructEmptyModel = test.StructEmptyModel(buffer: buffer)
        build(with: buffer, final: false)
    }

    public func send(obj: Any) throws -> Int {
        switch obj {
            case is test.StructSimple: return try send(value: obj as! test.StructSimple)
            case is test.StructOptional: return try send(value: obj as! test.StructOptional)
            case is test.StructNested: return try send(value: obj as! test.StructNested)
            case is test.StructBytes: return try send(value: obj as! test.StructBytes)
            case is test.StructArray: return try send(value: obj as! test.StructArray)
            case is test.StructVector: return try send(value: obj as! test.StructVector)
            case is test.StructList: return try send(value: obj as! test.StructList)
            case is test.StructSet: return try send(value: obj as! test.StructSet)
            case is test.StructMap: return try send(value: obj as! test.StructMap)
            case is test.StructHash: return try send(value: obj as! test.StructHash)
            case is test.StructHashEx: return try send(value: obj as! test.StructHashEx)
            case is test.StructEmpty: return try send(value: obj as! test.StructEmpty)
            default: break
        }

        // Try to send using imported senders
        var result: Int = 0
        result = try protoSender.send(obj: obj)
        if result > 0 {
            return result
            }

        return 0
    }

    public func send(value: test.StructSimple) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructSimpleModel.serialize(value: value)
        assert(serialized > 0, "test.StructSimple serialization failed!")
        assert(StructSimpleModel.verify(), "test.StructSimple validation failed!")

        // Log the value
        if logging {
            let message = value.description
            onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: test.StructOptional) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructOptionalModel.serialize(value: value)
        assert(serialized > 0, "test.StructOptional serialization failed!")
        assert(StructOptionalModel.verify(), "test.StructOptional validation failed!")

        // Log the value
        if logging {
            let message = value.description
            onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: test.StructNested) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructNestedModel.serialize(value: value)
        assert(serialized > 0, "test.StructNested serialization failed!")
        assert(StructNestedModel.verify(), "test.StructNested validation failed!")

        // Log the value
        if logging {
            let message = value.description
            onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: test.StructBytes) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructBytesModel.serialize(value: value)
        assert(serialized > 0, "test.StructBytes serialization failed!")
        assert(StructBytesModel.verify(), "test.StructBytes validation failed!")

        // Log the value
        if logging {
            let message = value.description
            onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: test.StructArray) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructArrayModel.serialize(value: value)
        assert(serialized > 0, "test.StructArray serialization failed!")
        assert(StructArrayModel.verify(), "test.StructArray validation failed!")

        // Log the value
        if logging {
            let message = value.description
            onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: test.StructVector) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructVectorModel.serialize(value: value)
        assert(serialized > 0, "test.StructVector serialization failed!")
        assert(StructVectorModel.verify(), "test.StructVector validation failed!")

        // Log the value
        if logging {
            let message = value.description
            onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: test.StructList) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructListModel.serialize(value: value)
        assert(serialized > 0, "test.StructList serialization failed!")
        assert(StructListModel.verify(), "test.StructList validation failed!")

        // Log the value
        if logging {
            let message = value.description
            onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: test.StructSet) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructSetModel.serialize(value: value)
        assert(serialized > 0, "test.StructSet serialization failed!")
        assert(StructSetModel.verify(), "test.StructSet validation failed!")

        // Log the value
        if logging {
            let message = value.description
            onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: test.StructMap) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructMapModel.serialize(value: value)
        assert(serialized > 0, "test.StructMap serialization failed!")
        assert(StructMapModel.verify(), "test.StructMap validation failed!")

        // Log the value
        if logging {
            let message = value.description
            onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: test.StructHash) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructHashModel.serialize(value: value)
        assert(serialized > 0, "test.StructHash serialization failed!")
        assert(StructHashModel.verify(), "test.StructHash validation failed!")

        // Log the value
        if logging {
            let message = value.description
            onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: test.StructHashEx) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructHashExModel.serialize(value: value)
        assert(serialized > 0, "test.StructHashEx serialization failed!")
        assert(StructHashExModel.verify(), "test.StructHashEx validation failed!")

        // Log the value
        if logging {
            let message = value.description
            onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(serialized: serialized)
    }
    public func send(value: test.StructEmpty) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try StructEmptyModel.serialize(value: value)
        assert(serialized > 0, "test.StructEmpty serialization failed!")
        assert(StructEmptyModel.verify(), "test.StructEmpty validation failed!")

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
}
