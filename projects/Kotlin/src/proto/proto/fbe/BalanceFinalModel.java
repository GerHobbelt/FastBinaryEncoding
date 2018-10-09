// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

@file:Suppress("UnusedImport", "unused")

package proto.fbe

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

import fbe.*
import proto.*

// Fast Binary Encoding Balance final model class
public final class BalanceFinalModel extends Model
{
    private final FinalModelBalance _model;

    public BalanceFinalModel() { _model = new FinalModelBalance(getBuffer(), 8); }
    public BalanceFinalModel(Buffer buffer) { super(buffer); _model = new FinalModelBalance(getBuffer(), 8); }

    // Get the model type
    public static final long FBETypeConst = FinalModelBalance.FBETypeConst;
    public long FBEType() { return FBETypeConst; }

    // Check if the struct value is valid
    public boolean verify()
    {
        if ((getBuffer().getOffset() + _model.fbeOffset()) > getBuffer().getSize())
            return false;

        int fbeStructSize = readInt32(_model.fbeOffset() - 8);
        int fbeStructType = readInt32(_model.fbeOffset() - 4);
        if ((fbeStructSize <= 0) || (fbeStructType != FBEType()))
            return false;

        return ((8 + _model.verify()) == fbeStructSize);
    }

    // Serialize the struct value
    public long serialize(Balance value)
    {
        long fbeInitialSize = getBuffer().getSize();

        int fbeStructType = (int)FBEType();
        int fbeStructSize = (int)(8 + _model.fbeAllocationSize(value));
        int fbeStructOffset = (int)(getBuffer().allocate(fbeStructSize) - getBuffer().getOffset());
        assert ((getBuffer().getOffset() + fbeStructOffset + fbeStructSize) <= getBuffer().getSize()) : "Model is broken!";
        if ((getBuffer().getOffset() + fbeStructOffset + fbeStructSize) > getBuffer().getSize())
            return 0;

        fbeStructSize = (int)(8 + _model.set(value));
        getBuffer().resize(fbeInitialSize + fbeStructSize);

        write(_model.fbeOffset() - 8, fbeStructSize);
        write(_model.fbeOffset() - 4, fbeStructType);

        return fbeStructSize;
    }

    // Deserialize the struct value
    public Balance deserialize() { var value = new Balance(); deserialize(value); return value; }
    public long deserialize(Balance value)
    {
        assert ((getBuffer().getOffset() + _model.fbeOffset()) <= getBuffer().getSize()) : "Model is broken!";
        if ((getBuffer().getOffset() + _model.fbeOffset()) > getBuffer().getSize())
            return 0;

        long fbeStructSize = readInt32(_model.fbeOffset() - 8);
        long fbeStructType = readInt32(_model.fbeOffset() - 4);
        assert ((fbeStructSize > 0) && (fbeStructType == FBEType())) : "Model is broken!";
        if ((fbeStructSize <= 0) || (fbeStructType != FBEType()))
            return 8;

        var fbeSize = new Size(0);
        value = _model.get(fbeSize, value);
        return 8 + fbeSize.value;
    }

    // Move to the next struct value
    public void next(long prev)
    {
        _model.fbeShift(prev);
    }
}
