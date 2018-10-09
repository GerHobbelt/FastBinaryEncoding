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

// Fast Binary Encoding StructSimple field model class
public final class FieldModelStructSimple extends FieldModel
{
    public final FieldModelInt32 uid;
    public final FieldModelBoolean f1;
    public final FieldModelBoolean f2;
    public final FieldModelByte f3;
    public final FieldModelByte f4;
    public final FieldModelChar f5;
    public final FieldModelChar f6;
    public final FieldModelWChar f7;
    public final FieldModelWChar f8;
    public final FieldModelInt8 f9;
    public final FieldModelInt8 f10;
    public final FieldModelInt8 f11;
    public final FieldModelInt8 f12;
    public final FieldModelInt16 f13;
    public final FieldModelInt16 f14;
    public final FieldModelInt16 f15;
    public final FieldModelInt16 f16;
    public final FieldModelInt32 f17;
    public final FieldModelInt32 f18;
    public final FieldModelInt32 f19;
    public final FieldModelInt32 f20;
    public final FieldModelInt64 f21;
    public final FieldModelInt64 f22;
    public final FieldModelInt64 f23;
    public final FieldModelInt64 f24;
    public final FieldModelFloat f25;
    public final FieldModelFloat f26;
    public final FieldModelDouble f27;
    public final FieldModelDouble f28;
    public final FieldModelDecimal f29;
    public final FieldModelDecimal f30;
    public final FieldModelString f31;
    public final FieldModelString f32;
    public final FieldModelTimestamp f33;
    public final FieldModelTimestamp f34;
    public final FieldModelTimestamp f35;
    public final FieldModelUUID f36;
    public final FieldModelUUID f37;
    public final FieldModelUUID f38;
    public final proto.fbe.FieldModelOrderSide f39;
    public final proto.fbe.FieldModelOrderType f40;
    public final proto.fbe.FieldModelOrder f41;
    public final proto.fbe.FieldModelBalance f42;
    public final proto.fbe.FieldModelState f43;
    public final proto.fbe.FieldModelAccount f44;

    public FieldModelStructSimple(Buffer buffer, long offset)
    {
        super(buffer, offset);
        uid = new FieldModelInt32(buffer, 4 + 4);
        f1 = new FieldModelBoolean(buffer, uid.fbeOffset() + uid.fbeSize());
        f2 = new FieldModelBoolean(buffer, f1.fbeOffset() + f1.fbeSize());
        f3 = new FieldModelByte(buffer, f2.fbeOffset() + f2.fbeSize());
        f4 = new FieldModelByte(buffer, f3.fbeOffset() + f3.fbeSize());
        f5 = new FieldModelChar(buffer, f4.fbeOffset() + f4.fbeSize());
        f6 = new FieldModelChar(buffer, f5.fbeOffset() + f5.fbeSize());
        f7 = new FieldModelWChar(buffer, f6.fbeOffset() + f6.fbeSize());
        f8 = new FieldModelWChar(buffer, f7.fbeOffset() + f7.fbeSize());
        f9 = new FieldModelInt8(buffer, f8.fbeOffset() + f8.fbeSize());
        f10 = new FieldModelInt8(buffer, f9.fbeOffset() + f9.fbeSize());
        f11 = new FieldModelInt8(buffer, f10.fbeOffset() + f10.fbeSize());
        f12 = new FieldModelInt8(buffer, f11.fbeOffset() + f11.fbeSize());
        f13 = new FieldModelInt16(buffer, f12.fbeOffset() + f12.fbeSize());
        f14 = new FieldModelInt16(buffer, f13.fbeOffset() + f13.fbeSize());
        f15 = new FieldModelInt16(buffer, f14.fbeOffset() + f14.fbeSize());
        f16 = new FieldModelInt16(buffer, f15.fbeOffset() + f15.fbeSize());
        f17 = new FieldModelInt32(buffer, f16.fbeOffset() + f16.fbeSize());
        f18 = new FieldModelInt32(buffer, f17.fbeOffset() + f17.fbeSize());
        f19 = new FieldModelInt32(buffer, f18.fbeOffset() + f18.fbeSize());
        f20 = new FieldModelInt32(buffer, f19.fbeOffset() + f19.fbeSize());
        f21 = new FieldModelInt64(buffer, f20.fbeOffset() + f20.fbeSize());
        f22 = new FieldModelInt64(buffer, f21.fbeOffset() + f21.fbeSize());
        f23 = new FieldModelInt64(buffer, f22.fbeOffset() + f22.fbeSize());
        f24 = new FieldModelInt64(buffer, f23.fbeOffset() + f23.fbeSize());
        f25 = new FieldModelFloat(buffer, f24.fbeOffset() + f24.fbeSize());
        f26 = new FieldModelFloat(buffer, f25.fbeOffset() + f25.fbeSize());
        f27 = new FieldModelDouble(buffer, f26.fbeOffset() + f26.fbeSize());
        f28 = new FieldModelDouble(buffer, f27.fbeOffset() + f27.fbeSize());
        f29 = new FieldModelDecimal(buffer, f28.fbeOffset() + f28.fbeSize());
        f30 = new FieldModelDecimal(buffer, f29.fbeOffset() + f29.fbeSize());
        f31 = new FieldModelString(buffer, f30.fbeOffset() + f30.fbeSize());
        f32 = new FieldModelString(buffer, f31.fbeOffset() + f31.fbeSize());
        f33 = new FieldModelTimestamp(buffer, f32.fbeOffset() + f32.fbeSize());
        f34 = new FieldModelTimestamp(buffer, f33.fbeOffset() + f33.fbeSize());
        f35 = new FieldModelTimestamp(buffer, f34.fbeOffset() + f34.fbeSize());
        f36 = new FieldModelUUID(buffer, f35.fbeOffset() + f35.fbeSize());
        f37 = new FieldModelUUID(buffer, f36.fbeOffset() + f36.fbeSize());
        f38 = new FieldModelUUID(buffer, f37.fbeOffset() + f37.fbeSize());
        f39 = new proto.fbe.FieldModelOrderSide(buffer, f38.fbeOffset() + f38.fbeSize());
        f40 = new proto.fbe.FieldModelOrderType(buffer, f39.fbeOffset() + f39.fbeSize());
        f41 = new proto.fbe.FieldModelOrder(buffer, f40.fbeOffset() + f40.fbeSize());
        f42 = new proto.fbe.FieldModelBalance(buffer, f41.fbeOffset() + f41.fbeSize());
        f43 = new proto.fbe.FieldModelState(buffer, f42.fbeOffset() + f42.fbeSize());
        f44 = new proto.fbe.FieldModelAccount(buffer, f43.fbeOffset() + f43.fbeSize());
    }

    // Get the field size
    @Override
    public long fbeSize() { return 4; }
    // Get the field body size
    public long FBEBody()
    {
        long fbeResult = 4 + 4
            + uid.fbeSize()
            + f1.fbeSize()
            + f2.fbeSize()
            + f3.fbeSize()
            + f4.fbeSize()
            + f5.fbeSize()
            + f6.fbeSize()
            + f7.fbeSize()
            + f8.fbeSize()
            + f9.fbeSize()
            + f10.fbeSize()
            + f11.fbeSize()
            + f12.fbeSize()
            + f13.fbeSize()
            + f14.fbeSize()
            + f15.fbeSize()
            + f16.fbeSize()
            + f17.fbeSize()
            + f18.fbeSize()
            + f19.fbeSize()
            + f20.fbeSize()
            + f21.fbeSize()
            + f22.fbeSize()
            + f23.fbeSize()
            + f24.fbeSize()
            + f25.fbeSize()
            + f26.fbeSize()
            + f27.fbeSize()
            + f28.fbeSize()
            + f29.fbeSize()
            + f30.fbeSize()
            + f31.fbeSize()
            + f32.fbeSize()
            + f33.fbeSize()
            + f34.fbeSize()
            + f35.fbeSize()
            + f36.fbeSize()
            + f37.fbeSize()
            + f38.fbeSize()
            + f39.fbeSize()
            + f40.fbeSize()
            + f41.fbeSize()
            + f42.fbeSize()
            + f43.fbeSize()
            + f44.fbeSize()
            ;
        return fbeResult;
    }
    // Get the field extra size
    @Override
    public long fbeExtra()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        int fbeStructOffset = readInt32(fbeOffset());
        if ((fbeStructOffset == 0) || ((_buffer.getOffset() + fbeStructOffset + 4) > _buffer.getSize()))
            return 0;

        _buffer.shift(fbeStructOffset);

        long fbeResult = FBEBody()
            + uid.fbeExtra()
            + f1.fbeExtra()
            + f2.fbeExtra()
            + f3.fbeExtra()
            + f4.fbeExtra()
            + f5.fbeExtra()
            + f6.fbeExtra()
            + f7.fbeExtra()
            + f8.fbeExtra()
            + f9.fbeExtra()
            + f10.fbeExtra()
            + f11.fbeExtra()
            + f12.fbeExtra()
            + f13.fbeExtra()
            + f14.fbeExtra()
            + f15.fbeExtra()
            + f16.fbeExtra()
            + f17.fbeExtra()
            + f18.fbeExtra()
            + f19.fbeExtra()
            + f20.fbeExtra()
            + f21.fbeExtra()
            + f22.fbeExtra()
            + f23.fbeExtra()
            + f24.fbeExtra()
            + f25.fbeExtra()
            + f26.fbeExtra()
            + f27.fbeExtra()
            + f28.fbeExtra()
            + f29.fbeExtra()
            + f30.fbeExtra()
            + f31.fbeExtra()
            + f32.fbeExtra()
            + f33.fbeExtra()
            + f34.fbeExtra()
            + f35.fbeExtra()
            + f36.fbeExtra()
            + f37.fbeExtra()
            + f38.fbeExtra()
            + f39.fbeExtra()
            + f40.fbeExtra()
            + f41.fbeExtra()
            + f42.fbeExtra()
            + f43.fbeExtra()
            + f44.fbeExtra()
            ;

        _buffer.unshift(fbeStructOffset);

        return fbeResult;
    }
    // Get the field type
    public static final long FBETypeConst = 110;
    public long FBEType() { return FBETypeConst; }

    // Check if the struct value is valid
    @Override
    public boolean verify() { return verify(true); }
    public boolean verify(boolean fbeVerifyType)
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return true;

        int fbeStructOffset = readInt32(fbeOffset());
        if ((fbeStructOffset == 0) || ((_buffer.getOffset() + fbeStructOffset + 4 + 4) > _buffer.getSize()))
            return false;

        int fbeStructSize = readInt32(fbeStructOffset);
        if (fbeStructSize < 4 + 4)
            return false;

        int fbeStructType = readInt32(fbeStructOffset + 4);
        if (fbeVerifyType && (fbeStructType != FBEType()))
            return false;

        _buffer.shift(fbeStructOffset);
        boolean fbeResult = verifyFields(fbeStructSize);
        _buffer.unshift(fbeStructOffset);
        return fbeResult;
    }

    // Check if the struct fields are valid
    public boolean verifyFields(long fbeStructSize)
    {
        long fbeCurrentSize = 4 + 4;

        if ((fbeCurrentSize + uid.fbeSize()) > fbeStructSize)
            return true;
        if (!uid.verify())
            return false;
        fbeCurrentSize += uid.fbeSize();

        if ((fbeCurrentSize + f1.fbeSize()) > fbeStructSize)
            return true;
        if (!f1.verify())
            return false;
        fbeCurrentSize += f1.fbeSize();

        if ((fbeCurrentSize + f2.fbeSize()) > fbeStructSize)
            return true;
        if (!f2.verify())
            return false;
        fbeCurrentSize += f2.fbeSize();

        if ((fbeCurrentSize + f3.fbeSize()) > fbeStructSize)
            return true;
        if (!f3.verify())
            return false;
        fbeCurrentSize += f3.fbeSize();

        if ((fbeCurrentSize + f4.fbeSize()) > fbeStructSize)
            return true;
        if (!f4.verify())
            return false;
        fbeCurrentSize += f4.fbeSize();

        if ((fbeCurrentSize + f5.fbeSize()) > fbeStructSize)
            return true;
        if (!f5.verify())
            return false;
        fbeCurrentSize += f5.fbeSize();

        if ((fbeCurrentSize + f6.fbeSize()) > fbeStructSize)
            return true;
        if (!f6.verify())
            return false;
        fbeCurrentSize += f6.fbeSize();

        if ((fbeCurrentSize + f7.fbeSize()) > fbeStructSize)
            return true;
        if (!f7.verify())
            return false;
        fbeCurrentSize += f7.fbeSize();

        if ((fbeCurrentSize + f8.fbeSize()) > fbeStructSize)
            return true;
        if (!f8.verify())
            return false;
        fbeCurrentSize += f8.fbeSize();

        if ((fbeCurrentSize + f9.fbeSize()) > fbeStructSize)
            return true;
        if (!f9.verify())
            return false;
        fbeCurrentSize += f9.fbeSize();

        if ((fbeCurrentSize + f10.fbeSize()) > fbeStructSize)
            return true;
        if (!f10.verify())
            return false;
        fbeCurrentSize += f10.fbeSize();

        if ((fbeCurrentSize + f11.fbeSize()) > fbeStructSize)
            return true;
        if (!f11.verify())
            return false;
        fbeCurrentSize += f11.fbeSize();

        if ((fbeCurrentSize + f12.fbeSize()) > fbeStructSize)
            return true;
        if (!f12.verify())
            return false;
        fbeCurrentSize += f12.fbeSize();

        if ((fbeCurrentSize + f13.fbeSize()) > fbeStructSize)
            return true;
        if (!f13.verify())
            return false;
        fbeCurrentSize += f13.fbeSize();

        if ((fbeCurrentSize + f14.fbeSize()) > fbeStructSize)
            return true;
        if (!f14.verify())
            return false;
        fbeCurrentSize += f14.fbeSize();

        if ((fbeCurrentSize + f15.fbeSize()) > fbeStructSize)
            return true;
        if (!f15.verify())
            return false;
        fbeCurrentSize += f15.fbeSize();

        if ((fbeCurrentSize + f16.fbeSize()) > fbeStructSize)
            return true;
        if (!f16.verify())
            return false;
        fbeCurrentSize += f16.fbeSize();

        if ((fbeCurrentSize + f17.fbeSize()) > fbeStructSize)
            return true;
        if (!f17.verify())
            return false;
        fbeCurrentSize += f17.fbeSize();

        if ((fbeCurrentSize + f18.fbeSize()) > fbeStructSize)
            return true;
        if (!f18.verify())
            return false;
        fbeCurrentSize += f18.fbeSize();

        if ((fbeCurrentSize + f19.fbeSize()) > fbeStructSize)
            return true;
        if (!f19.verify())
            return false;
        fbeCurrentSize += f19.fbeSize();

        if ((fbeCurrentSize + f20.fbeSize()) > fbeStructSize)
            return true;
        if (!f20.verify())
            return false;
        fbeCurrentSize += f20.fbeSize();

        if ((fbeCurrentSize + f21.fbeSize()) > fbeStructSize)
            return true;
        if (!f21.verify())
            return false;
        fbeCurrentSize += f21.fbeSize();

        if ((fbeCurrentSize + f22.fbeSize()) > fbeStructSize)
            return true;
        if (!f22.verify())
            return false;
        fbeCurrentSize += f22.fbeSize();

        if ((fbeCurrentSize + f23.fbeSize()) > fbeStructSize)
            return true;
        if (!f23.verify())
            return false;
        fbeCurrentSize += f23.fbeSize();

        if ((fbeCurrentSize + f24.fbeSize()) > fbeStructSize)
            return true;
        if (!f24.verify())
            return false;
        fbeCurrentSize += f24.fbeSize();

        if ((fbeCurrentSize + f25.fbeSize()) > fbeStructSize)
            return true;
        if (!f25.verify())
            return false;
        fbeCurrentSize += f25.fbeSize();

        if ((fbeCurrentSize + f26.fbeSize()) > fbeStructSize)
            return true;
        if (!f26.verify())
            return false;
        fbeCurrentSize += f26.fbeSize();

        if ((fbeCurrentSize + f27.fbeSize()) > fbeStructSize)
            return true;
        if (!f27.verify())
            return false;
        fbeCurrentSize += f27.fbeSize();

        if ((fbeCurrentSize + f28.fbeSize()) > fbeStructSize)
            return true;
        if (!f28.verify())
            return false;
        fbeCurrentSize += f28.fbeSize();

        if ((fbeCurrentSize + f29.fbeSize()) > fbeStructSize)
            return true;
        if (!f29.verify())
            return false;
        fbeCurrentSize += f29.fbeSize();

        if ((fbeCurrentSize + f30.fbeSize()) > fbeStructSize)
            return true;
        if (!f30.verify())
            return false;
        fbeCurrentSize += f30.fbeSize();

        if ((fbeCurrentSize + f31.fbeSize()) > fbeStructSize)
            return true;
        if (!f31.verify())
            return false;
        fbeCurrentSize += f31.fbeSize();

        if ((fbeCurrentSize + f32.fbeSize()) > fbeStructSize)
            return true;
        if (!f32.verify())
            return false;
        fbeCurrentSize += f32.fbeSize();

        if ((fbeCurrentSize + f33.fbeSize()) > fbeStructSize)
            return true;
        if (!f33.verify())
            return false;
        fbeCurrentSize += f33.fbeSize();

        if ((fbeCurrentSize + f34.fbeSize()) > fbeStructSize)
            return true;
        if (!f34.verify())
            return false;
        fbeCurrentSize += f34.fbeSize();

        if ((fbeCurrentSize + f35.fbeSize()) > fbeStructSize)
            return true;
        if (!f35.verify())
            return false;
        fbeCurrentSize += f35.fbeSize();

        if ((fbeCurrentSize + f36.fbeSize()) > fbeStructSize)
            return true;
        if (!f36.verify())
            return false;
        fbeCurrentSize += f36.fbeSize();

        if ((fbeCurrentSize + f37.fbeSize()) > fbeStructSize)
            return true;
        if (!f37.verify())
            return false;
        fbeCurrentSize += f37.fbeSize();

        if ((fbeCurrentSize + f38.fbeSize()) > fbeStructSize)
            return true;
        if (!f38.verify())
            return false;
        fbeCurrentSize += f38.fbeSize();

        if ((fbeCurrentSize + f39.fbeSize()) > fbeStructSize)
            return true;
        if (!f39.verify())
            return false;
        fbeCurrentSize += f39.fbeSize();

        if ((fbeCurrentSize + f40.fbeSize()) > fbeStructSize)
            return true;
        if (!f40.verify())
            return false;
        fbeCurrentSize += f40.fbeSize();

        if ((fbeCurrentSize + f41.fbeSize()) > fbeStructSize)
            return true;
        if (!f41.verify())
            return false;
        fbeCurrentSize += f41.fbeSize();

        if ((fbeCurrentSize + f42.fbeSize()) > fbeStructSize)
            return true;
        if (!f42.verify())
            return false;
        fbeCurrentSize += f42.fbeSize();

        if ((fbeCurrentSize + f43.fbeSize()) > fbeStructSize)
            return true;
        if (!f43.verify())
            return false;
        fbeCurrentSize += f43.fbeSize();

        if ((fbeCurrentSize + f44.fbeSize()) > fbeStructSize)
            return true;
        if (!f44.verify())
            return false;
        fbeCurrentSize += f44.fbeSize();

        return true;
    }

    // Get the struct value (begin phase)
    public long getBegin()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        int fbeStructOffset = readInt32(fbeOffset());
        assert ((fbeStructOffset > 0) && ((_buffer.getOffset() + fbeStructOffset + 4 + 4) <= _buffer.getSize())) : "Model is broken!";
        if ((fbeStructOffset == 0) || ((_buffer.getOffset() + fbeStructOffset + 4 + 4) > _buffer.getSize()))
            return 0;

        int fbeStructSize = readInt32(fbeStructOffset);
        assert (fbeStructSize >= 4 + 4) : "Model is broken!";
        if (fbeStructSize < 4 + 4)
            return 0;

        _buffer.shift(fbeStructOffset);
        return fbeStructOffset;
    }

    // Get the struct value (end phase)
    public void getEnd(long fbeBegin)
    {
        _buffer.unshift(fbeBegin);
    }

    // Get the struct value
    public StructSimple get() { return get(new StructSimple()); }
    public StructSimple get(StructSimple fbeValue)
    {
        long fbeBegin = getBegin();
        if (fbeBegin == 0)
            return fbeValue;

        int fbeStructSize = readInt32(0);
        getFields(fbeValue, fbeStructSize);
        getEnd(fbeBegin);
        return fbeValue;
    }

    // Get the struct fields values
    public void getFields(StructSimple fbeValue, long fbeStructSize)
    {
        long fbeCurrentSize = 4 + 4;

        if ((fbeCurrentSize + uid.fbeSize()) <= fbeStructSize)
            fbeValue.uid = uid.get();
        else
            fbeValue.uid = 0;
        fbeCurrentSize += uid.fbeSize();

        if ((fbeCurrentSize + f1.fbeSize()) <= fbeStructSize)
            fbeValue.f1 = f1.get();
        else
            fbeValue.f1 = false;
        fbeCurrentSize += f1.fbeSize();

        if ((fbeCurrentSize + f2.fbeSize()) <= fbeStructSize)
            fbeValue.f2 = f2.get(true);
        else
            fbeValue.f2 = true;
        fbeCurrentSize += f2.fbeSize();

        if ((fbeCurrentSize + f3.fbeSize()) <= fbeStructSize)
            fbeValue.f3 = f3.get();
        else
            fbeValue.f3 = (byte)0;
        fbeCurrentSize += f3.fbeSize();

        if ((fbeCurrentSize + f4.fbeSize()) <= fbeStructSize)
            fbeValue.f4 = f4.get((byte)255);
        else
            fbeValue.f4 = (byte)255;
        fbeCurrentSize += f4.fbeSize();

        if ((fbeCurrentSize + f5.fbeSize()) <= fbeStructSize)
            fbeValue.f5 = f5.get();
        else
            fbeValue.f5 = '\0';
        fbeCurrentSize += f5.fbeSize();

        if ((fbeCurrentSize + f6.fbeSize()) <= fbeStructSize)
            fbeValue.f6 = f6.get((char)'!');
        else
            fbeValue.f6 = (char)'!';
        fbeCurrentSize += f6.fbeSize();

        if ((fbeCurrentSize + f7.fbeSize()) <= fbeStructSize)
            fbeValue.f7 = f7.get();
        else
            fbeValue.f7 = '\0';
        fbeCurrentSize += f7.fbeSize();

        if ((fbeCurrentSize + f8.fbeSize()) <= fbeStructSize)
            fbeValue.f8 = f8.get((char)0x0444);
        else
            fbeValue.f8 = (char)0x0444;
        fbeCurrentSize += f8.fbeSize();

        if ((fbeCurrentSize + f9.fbeSize()) <= fbeStructSize)
            fbeValue.f9 = f9.get();
        else
            fbeValue.f9 = (byte)0;
        fbeCurrentSize += f9.fbeSize();

        if ((fbeCurrentSize + f10.fbeSize()) <= fbeStructSize)
            fbeValue.f10 = f10.get((byte)127);
        else
            fbeValue.f10 = (byte)127;
        fbeCurrentSize += f10.fbeSize();

        if ((fbeCurrentSize + f11.fbeSize()) <= fbeStructSize)
            fbeValue.f11 = f11.get();
        else
            fbeValue.f11 = (byte)0;
        fbeCurrentSize += f11.fbeSize();

        if ((fbeCurrentSize + f12.fbeSize()) <= fbeStructSize)
            fbeValue.f12 = f12.get((byte)255);
        else
            fbeValue.f12 = (byte)255;
        fbeCurrentSize += f12.fbeSize();

        if ((fbeCurrentSize + f13.fbeSize()) <= fbeStructSize)
            fbeValue.f13 = f13.get();
        else
            fbeValue.f13 = (short)0;
        fbeCurrentSize += f13.fbeSize();

        if ((fbeCurrentSize + f14.fbeSize()) <= fbeStructSize)
            fbeValue.f14 = f14.get((short)32767);
        else
            fbeValue.f14 = (short)32767;
        fbeCurrentSize += f14.fbeSize();

        if ((fbeCurrentSize + f15.fbeSize()) <= fbeStructSize)
            fbeValue.f15 = f15.get();
        else
            fbeValue.f15 = (short)0;
        fbeCurrentSize += f15.fbeSize();

        if ((fbeCurrentSize + f16.fbeSize()) <= fbeStructSize)
            fbeValue.f16 = f16.get((short)65535);
        else
            fbeValue.f16 = (short)65535;
        fbeCurrentSize += f16.fbeSize();

        if ((fbeCurrentSize + f17.fbeSize()) <= fbeStructSize)
            fbeValue.f17 = f17.get();
        else
            fbeValue.f17 = 0;
        fbeCurrentSize += f17.fbeSize();

        if ((fbeCurrentSize + f18.fbeSize()) <= fbeStructSize)
            fbeValue.f18 = f18.get((int)2147483647);
        else
            fbeValue.f18 = (int)2147483647;
        fbeCurrentSize += f18.fbeSize();

        if ((fbeCurrentSize + f19.fbeSize()) <= fbeStructSize)
            fbeValue.f19 = f19.get();
        else
            fbeValue.f19 = 0;
        fbeCurrentSize += f19.fbeSize();

        if ((fbeCurrentSize + f20.fbeSize()) <= fbeStructSize)
            fbeValue.f20 = f20.get((int)0xFFFFFFFF);
        else
            fbeValue.f20 = (int)0xFFFFFFFF;
        fbeCurrentSize += f20.fbeSize();

        if ((fbeCurrentSize + f21.fbeSize()) <= fbeStructSize)
            fbeValue.f21 = f21.get();
        else
            fbeValue.f21 = 0L;
        fbeCurrentSize += f21.fbeSize();

        if ((fbeCurrentSize + f22.fbeSize()) <= fbeStructSize)
            fbeValue.f22 = f22.get((long)9223372036854775807L);
        else
            fbeValue.f22 = (long)9223372036854775807L;
        fbeCurrentSize += f22.fbeSize();

        if ((fbeCurrentSize + f23.fbeSize()) <= fbeStructSize)
            fbeValue.f23 = f23.get();
        else
            fbeValue.f23 = 0L;
        fbeCurrentSize += f23.fbeSize();

        if ((fbeCurrentSize + f24.fbeSize()) <= fbeStructSize)
            fbeValue.f24 = f24.get((long)0xFFFFFFFFFFFFFFFFL);
        else
            fbeValue.f24 = (long)0xFFFFFFFFFFFFFFFFL;
        fbeCurrentSize += f24.fbeSize();

        if ((fbeCurrentSize + f25.fbeSize()) <= fbeStructSize)
            fbeValue.f25 = f25.get();
        else
            fbeValue.f25 = 0.0f;
        fbeCurrentSize += f25.fbeSize();

        if ((fbeCurrentSize + f26.fbeSize()) <= fbeStructSize)
            fbeValue.f26 = f26.get((float)123.456f);
        else
            fbeValue.f26 = (float)123.456f;
        fbeCurrentSize += f26.fbeSize();

        if ((fbeCurrentSize + f27.fbeSize()) <= fbeStructSize)
            fbeValue.f27 = f27.get();
        else
            fbeValue.f27 = 0.0d;
        fbeCurrentSize += f27.fbeSize();

        if ((fbeCurrentSize + f28.fbeSize()) <= fbeStructSize)
            fbeValue.f28 = f28.get((double)-123.456e+123d);
        else
            fbeValue.f28 = (double)-123.456e+123d;
        fbeCurrentSize += f28.fbeSize();

        if ((fbeCurrentSize + f29.fbeSize()) <= fbeStructSize)
            fbeValue.f29 = f29.get();
        else
            fbeValue.f29 = BigDecimal.valueOf(0L);
        fbeCurrentSize += f29.fbeSize();

        if ((fbeCurrentSize + f30.fbeSize()) <= fbeStructSize)
            fbeValue.f30 = f30.get(BigDecimal.valueOf(123456.123456d));
        else
            fbeValue.f30 = BigDecimal.valueOf(123456.123456d);
        fbeCurrentSize += f30.fbeSize();

        if ((fbeCurrentSize + f31.fbeSize()) <= fbeStructSize)
            fbeValue.f31 = f31.get();
        else
            fbeValue.f31 = "";
        fbeCurrentSize += f31.fbeSize();

        if ((fbeCurrentSize + f32.fbeSize()) <= fbeStructSize)
            fbeValue.f32 = f32.get("Initial string!");
        else
            fbeValue.f32 = "Initial string!";
        fbeCurrentSize += f32.fbeSize();

        if ((fbeCurrentSize + f33.fbeSize()) <= fbeStructSize)
            fbeValue.f33 = f33.get();
        else
            fbeValue.f33 = Instant.EPOCH;
        fbeCurrentSize += f33.fbeSize();

        if ((fbeCurrentSize + f34.fbeSize()) <= fbeStructSize)
            fbeValue.f34 = f34.get(Instant.EPOCH);
        else
            fbeValue.f34 = Instant.EPOCH;
        fbeCurrentSize += f34.fbeSize();

        if ((fbeCurrentSize + f35.fbeSize()) <= fbeStructSize)
            fbeValue.f35 = f35.get(Instant.now());
        else
            fbeValue.f35 = Instant.now();
        fbeCurrentSize += f35.fbeSize();

        if ((fbeCurrentSize + f36.fbeSize()) <= fbeStructSize)
            fbeValue.f36 = f36.get();
        else
            fbeValue.f36 = fbe.UUIDGenerator.nil();
        fbeCurrentSize += f36.fbeSize();

        if ((fbeCurrentSize + f37.fbeSize()) <= fbeStructSize)
            fbeValue.f37 = f37.get(fbe.UUIDGenerator.sequential());
        else
            fbeValue.f37 = fbe.UUIDGenerator.sequential();
        fbeCurrentSize += f37.fbeSize();

        if ((fbeCurrentSize + f38.fbeSize()) <= fbeStructSize)
            fbeValue.f38 = f38.get(UUID.fromString("123e4567-e89b-12d3-a456-426655440000"));
        else
            fbeValue.f38 = UUID.fromString("123e4567-e89b-12d3-a456-426655440000");
        fbeCurrentSize += f38.fbeSize();

        if ((fbeCurrentSize + f39.fbeSize()) <= fbeStructSize)
            fbeValue.f39 = f39.get();
        else
            fbeValue.f39 = new proto.OrderSide();
        fbeCurrentSize += f39.fbeSize();

        if ((fbeCurrentSize + f40.fbeSize()) <= fbeStructSize)
            fbeValue.f40 = f40.get();
        else
            fbeValue.f40 = new proto.OrderType();
        fbeCurrentSize += f40.fbeSize();

        if ((fbeCurrentSize + f41.fbeSize()) <= fbeStructSize)
            fbeValue.f41 = f41.get();
        else
            fbeValue.f41 = new proto.Order();
        fbeCurrentSize += f41.fbeSize();

        if ((fbeCurrentSize + f42.fbeSize()) <= fbeStructSize)
            fbeValue.f42 = f42.get();
        else
            fbeValue.f42 = new proto.Balance();
        fbeCurrentSize += f42.fbeSize();

        if ((fbeCurrentSize + f43.fbeSize()) <= fbeStructSize)
            fbeValue.f43 = f43.get();
        else
            fbeValue.f43 = new proto.State();
        fbeCurrentSize += f43.fbeSize();

        if ((fbeCurrentSize + f44.fbeSize()) <= fbeStructSize)
            fbeValue.f44 = f44.get();
        else
            fbeValue.f44 = new proto.Account();
        fbeCurrentSize += f44.fbeSize();
    }

    // Set the struct value (begin phase)
    public long setBegin()
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        int fbeStructSize = (int)FBEBody();
        int fbeStructOffset = (int)(_buffer.allocate(fbeStructSize) - _buffer.getOffset());
        assert ((fbeStructOffset > 0) && ((_buffer.getOffset() + fbeStructOffset + fbeStructSize) <= _buffer.getSize())) : "Model is broken!";
        if ((fbeStructOffset <= 0) || ((_buffer.getOffset() + fbeStructOffset + fbeStructSize) > _buffer.getSize()))
            return 0;

        write(fbeOffset(), fbeStructOffset);
        write(fbeStructOffset, fbeStructSize);
        write(fbeStructOffset + 4, (int)FBEType());

        _buffer.shift(fbeStructOffset);
        return fbeStructOffset;
    }

    // Set the struct value (end phase)
    public void setEnd(long fbeBegin)
    {
        _buffer.unshift(fbeBegin);
    }

    // Set the struct value
    public void set(StructSimple fbeValue)
    {
        long fbeBegin = setBegin();
        if (fbeBegin == 0)
            return;

        setFields(fbeValue);
        setEnd(fbeBegin);
    }

    // Set the struct fields values
    public void setFields(StructSimple fbeValue)
    {
        uid.set(fbeValue.uid);
        f1.set(fbeValue.f1);
        f2.set(fbeValue.f2);
        f3.set(fbeValue.f3);
        f4.set(fbeValue.f4);
        f5.set(fbeValue.f5);
        f6.set(fbeValue.f6);
        f7.set(fbeValue.f7);
        f8.set(fbeValue.f8);
        f9.set(fbeValue.f9);
        f10.set(fbeValue.f10);
        f11.set(fbeValue.f11);
        f12.set(fbeValue.f12);
        f13.set(fbeValue.f13);
        f14.set(fbeValue.f14);
        f15.set(fbeValue.f15);
        f16.set(fbeValue.f16);
        f17.set(fbeValue.f17);
        f18.set(fbeValue.f18);
        f19.set(fbeValue.f19);
        f20.set(fbeValue.f20);
        f21.set(fbeValue.f21);
        f22.set(fbeValue.f22);
        f23.set(fbeValue.f23);
        f24.set(fbeValue.f24);
        f25.set(fbeValue.f25);
        f26.set(fbeValue.f26);
        f27.set(fbeValue.f27);
        f28.set(fbeValue.f28);
        f29.set(fbeValue.f29);
        f30.set(fbeValue.f30);
        f31.set(fbeValue.f31);
        f32.set(fbeValue.f32);
        f33.set(fbeValue.f33);
        f34.set(fbeValue.f34);
        f35.set(fbeValue.f35);
        f36.set(fbeValue.f36);
        f37.set(fbeValue.f37);
        f38.set(fbeValue.f38);
        f39.set(fbeValue.f39);
        f40.set(fbeValue.f40);
        f41.set(fbeValue.f41);
        f42.set(fbeValue.f42);
        f43.set(fbeValue.f43);
        f44.set(fbeValue.f44);
    }
}
