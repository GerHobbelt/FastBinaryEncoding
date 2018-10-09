// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

// Fast Binary Encoding timestamp field model class
public final class FieldModelTimestamp extends FieldModel
{
    public FieldModelTimestamp(Buffer buffer, long offset) { super(buffer, offset); }

    // Get the field size
    @Override
    public long fbeSize() { return 8; }

    // Get the value
    public Instant get() { return get(Instant.EPOCH); }
    public Instant get(Instant defaults)
    {
        assert (defaults != null) : "Invalid default timestamp value!";
        if (defaults == null)
            throw new IllegalArgumentException("Invalid default timestamp value!");

        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return defaults;

        long nanoseconds = readInt64(fbeOffset());
        return Instant.ofEpochSecond(nanoseconds / 1000000000, nanoseconds % 1000000000);
    }

    // Set the value
    public void set(Instant value)
    {
        assert (value != null) : "Invalid timestamp value!";
        if (value == null)
            throw new IllegalArgumentException("Invalid timestamp value!");

        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return;

        long nanoseconds = value.getEpochSecond() * 1000000000 + value.getNano();
        write(fbeOffset(), nanoseconds);
    }
}
