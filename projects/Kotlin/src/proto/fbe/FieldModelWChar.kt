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
import javafx.util.*;

// Fast Binary Encoding Char field model class
class FieldModelWChar(buffer: Buffer, offset: Long) : FieldModel(buffer, offset)
{
    // Field size
    override val FBESize: Long = 4

    // Get the value
    fun get(defaults: Char = '\u0000'): Char {
        if (_buffer.offset + FBEOffset + FBESize > _buffer.size)
            return defaults

        return readWChar(FBEOffset)
    }

    // Set the value
    fun set(value: Char) {
        assert(_buffer.offset + FBEOffset + FBESize <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset + FBESize > _buffer.size)
            return

        write(FBEOffset, value.toInt())
    }
}