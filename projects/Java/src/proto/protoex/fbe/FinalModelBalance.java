// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package protoex.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import protoex.*;

// Fast Binary Encoding Balance final model class
public final class FinalModelBalance extends FinalModel
{
    public final proto.fbe.FinalModelBalance parent;
    public final FinalModelDouble locked;

    public FinalModelBalance(Buffer buffer, long offset)
    {
        super(buffer, offset);
        parent = new proto.fbe.FinalModelBalance(buffer, 0);
        locked = new FinalModelDouble(buffer, 0);
    }

    // Get the allocation size
    public long fbeAllocationSize(Balance fbeValue)
    {
        long fbeResult = 0
            + parent.fbeAllocationSize(fbeValue)
            + locked.fbeAllocationSize(fbeValue.locked)
            ;
        return fbeResult;
    }

    // Get the field type
    public static final long FBETypeConst = proto.fbe.FinalModelBalance.FBETypeConst;
    public long FBEType() { return FBETypeConst; }

    // Check if the struct value is valid
    @Override
    public long verify()
    {
        _buffer.shift(fbeOffset());
        long fbeResult = verifyFields();
        _buffer.unshift(fbeOffset());
        return fbeResult;
    }

    // Check if the struct fields are valid
    public long verifyFields()
    {
        long fbeCurrentOffset = 0;
        long fbeFieldSize = 0;

        parent.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = parent.verifyFields();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        locked.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = locked.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        return fbeCurrentOffset;
    }

    // Get the struct value
    public Balance get(Size fbeSize) { return get(fbeSize, new Balance()); }
    public Balance get(Size fbeSize, Balance fbeValue)
    {
        _buffer.shift(fbeOffset());
        fbeSize.value = getFields(fbeValue);
        _buffer.unshift(fbeOffset());
        return fbeValue;
    }

    // Get the struct fields values
    public long getFields(Balance fbeValue)
    {
        long fbeCurrentOffset = 0;
        long fbeCurrentSize = 0;
        var fbeFieldSize = new Size(0);

        parent.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = parent.getFields(fbeValue);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        locked.fbeOffset(fbeCurrentOffset);
        fbeValue.locked = locked.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        return fbeCurrentSize;
    }

    // Set the struct value
    public long set(Balance fbeValue)
    {
        _buffer.shift(fbeOffset());
        long fbeSize = setFields(fbeValue);
        _buffer.unshift(fbeOffset());
        return fbeSize;
    }

    // Set the struct fields values
    public long setFields(Balance fbeValue)
    {
        long fbeCurrentOffset = 0;
        long fbeCurrentSize = 0;
        var fbeFieldSize = new Size(0);

        parent.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = parent.setFields(fbeValue);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        locked.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = locked.set(fbeValue.locked);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        return fbeCurrentSize;
    }
}
