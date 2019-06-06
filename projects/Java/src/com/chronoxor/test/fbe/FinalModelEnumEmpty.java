// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.3.0.0

package com.chronoxor.test.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import com.chronoxor.fbe.*;
import com.chronoxor.test.*;

// Fast Binary Encoding EnumEmpty final model
public final class FinalModelEnumEmpty extends FinalModel
{
    public FinalModelEnumEmpty(Buffer buffer, long offset) { super(buffer, offset); }

    // Get the allocation size
    public long fbeAllocationSize(EnumEmpty value) { return fbeSize(); }

    // Get the final size
    @Override
    public long fbeSize() { return 4; }

    // Check if the value is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return Long.MAX_VALUE;

        return fbeSize();
    }

    // Get the value
    public EnumEmpty get(Size size)
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return new EnumEmpty();

        size.value = fbeSize();
        return new EnumEmpty(readInt32(fbeOffset()));
    }

    // Set the value
    public long set(EnumEmpty value)
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        write(fbeOffset(), value.getRaw());
        return fbeSize();
    }
}