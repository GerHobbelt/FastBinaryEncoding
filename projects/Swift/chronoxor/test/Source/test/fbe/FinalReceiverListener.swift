// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.3.0.0


import fbe

import proto

// Fast Binary Encoding test final receiver listener
open class FinalReceiverListener : proto.FinalReceiverListener
{
    open func onReceive(value: test.StructSimple) { }
    open func onReceive(value: test.StructOptional) { }
    open func onReceive(value: test.StructNested) { }
    open func onReceive(value: test.StructBytes) { }
    open func onReceive(value: test.StructArray) { }
    open func onReceive(value: test.StructVector) { }
    open func onReceive(value: test.StructList) { }
    open func onReceive(value: test.StructSet) { }
    open func onReceive(value: test.StructMap) { }
    open func onReceive(value: test.StructHash) { }
    open func onReceive(value: test.StructHashEx) { }
    open func onReceive(value: test.StructEmpty) { }
}
