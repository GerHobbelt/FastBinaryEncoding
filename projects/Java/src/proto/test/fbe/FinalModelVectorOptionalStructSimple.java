// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package test.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import test.*;

// Fast Binary Encoding OptionalStructSimple vector final model class
public final class FinalModelVectorOptionalStructSimple extends FinalModel
{
    private final FinalModelOptionalStructSimple _model;

    public FinalModelVectorOptionalStructSimple(Buffer buffer, long offset)
    {
        super(buffer, offset);
        _model = new FinalModelOptionalStructSimple(buffer, offset);
    }

    // Get the allocation size
    public long fbeAllocationSize(StructSimple[] values)
    {
        long size = 4;
        for (var value : values)
            size += _model.fbeAllocationSize(value);
        return size;
    }
    public long fbeAllocationSize(ArrayList<StructSimple> values)
    {
        long size = 4;
        for (var value : values)
            size += _model.fbeAllocationSize(value);
        return size;
    }
    public long fbeAllocationSize(LinkedList<StructSimple> values)
    {
        long size = 4;
        for (var value : values)
            size += _model.fbeAllocationSize(value);
        return size;
    }
    public long fbeAllocationSize(HashSet<StructSimple> values)
    {
        long size = 4;
        for (var value : values)
            size += _model.fbeAllocationSize(value);
        return size;
    }

    // Check if the vector is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return Long.MAX_VALUE;

        int fbeVectorSize = readInt32(fbeOffset());

        long size = 4;
        _model.fbeOffset(fbeOffset() + 4);
        for (int i = fbeVectorSize; i-- > 0;)
        {
            long offset = _model.verify();
            if (offset == Long.MAX_VALUE)
                return Long.MAX_VALUE;
            _model.fbeShift(offset);
            size += offset;
        }
        return size;
    }

    // Get the vector as ArrayList
    public long get(ArrayList<StructSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        long fbeVectorSize = readInt32(fbeOffset());
        if (fbeVectorSize == 0)
            return 4;

        values.ensureCapacity((int)fbeVectorSize);

        long size = 4;
        var offset = new Size();
        _model.fbeOffset(fbeOffset() + 4);
        for (long i = 0; i < fbeVectorSize; i++)
        {
            offset.value = 0;
            StructSimple value = _model.get(offset);
            values.add(value);
            _model.fbeShift(offset.value);
            size += offset.value;
        }
        return size;
    }

    // Get the vector as LinkedList
    public long get(LinkedList<StructSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        long fbeVectorSize = readInt32(fbeOffset());
        if (fbeVectorSize == 0)
            return 4;

        long size = 4;
        var offset = new Size();
        _model.fbeOffset(fbeOffset() + 4);
        for (long i = 0; i < fbeVectorSize; i++)
        {
            offset.value = 0;
            StructSimple value = _model.get(offset);
            values.add(value);
            _model.fbeShift(offset.value);
            size += offset.value;
        }
        return size;
    }

    // Get the vector as HashSet
    public long get(HashSet<StructSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        long fbeVectorSize = readInt32(fbeOffset());
        if (fbeVectorSize == 0)
            return 4;

        long size = 4;
        var offset = new Size();
        _model.fbeOffset(fbeOffset() + 4);
        for (long i = 0; i < fbeVectorSize; i++)
        {
            offset.value = 0;
            StructSimple value = _model.get(offset);
            values.add(value);
            _model.fbeShift(offset.value);
            size += offset.value;
        }
        return size;
    }

    // Set the vector as ArrayList
    public long set(ArrayList<StructSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        write(fbeOffset(), (int)values.size());

        long size = 4;
        _model.fbeOffset(fbeOffset() + 4);
        for (var value : values)
        {
            long offset = _model.set(value);
            _model.fbeShift(offset);
            size += offset;
        }
        return size;
    }

    // Set the vector as LinkedList
    public long set(LinkedList<StructSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        write(fbeOffset(), (int)values.size());

        long size = 4;
        _model.fbeOffset(fbeOffset() + 4);
        for (var value : values)
        {
            long offset = _model.set(value);
            _model.fbeShift(offset);
            size += offset;
        }
        return size;
    }

    // Set the vector as HashSet
    public long set(HashSet<StructSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        write(fbeOffset(), (int)values.size());

        long size = 4;
        _model.fbeOffset(fbeOffset() + 4);
        for (var value : values)
        {
            long offset = _model.set(value);
            _model.fbeShift(offset);
            size += offset;
        }
        return size;
    }
}
