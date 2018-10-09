// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

@file:Suppress("UnusedImport", "unused")

package protoex.fbe

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

import fbe.*
import protoex.*

// Fast Binary Encoding optional Balance final model class
class FinalModelOptionalBalance(buffer: Buffer, offset: Long) : FinalModel(buffer, offset)
{
    // Get the allocation size
    fun fbeAllocationSize(optional: Balance?): Long = (1 + (if (optional != null) value.fbeAllocationSize(optional) else 0)).toLong()

    // Checks whether the object contains a value
    fun hasValue(): Boolean
    {
        if (_buffer.offset + fbeOffset + 1 > _buffer.size)
            return false

        val fbeHasValue = readInt8(fbeOffset)
        return fbeHasValue.toInt() != 0
    }

    // Base final model value
    val value = FinalModelBalance(buffer, 0)

    // Check if the optional value is valid
    override fun verify(): Long
    {
        if (_buffer.offset + fbeOffset + 1 > _buffer.size)
            return Long.MAX_VALUE

        val fbeHasValue = readInt8(fbeOffset)
        if (fbeHasValue.toInt() == 0)
            return 1

        _buffer.shift(fbeOffset + 1)
        val fbeResult = value.verify()
        _buffer.unshift(fbeOffset + 1)
        return 1 + fbeResult
    }

    // Get the optional value
    fun get(size: Size): Balance?
    {
        assert(_buffer.offset + fbeOffset + 1 <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + fbeOffset + 1 > _buffer.size)
        {
            size.value = 0
            return null
        }

        if (!hasValue())
        {
            size.value = 1
            return null
        }

        _buffer.shift(fbeOffset + 1)
        val optional = value.get(size)
        _buffer.unshift(fbeOffset + 1)
        size.value += 1
        return optional
    }

    // Set the optional value
    fun set(optional: Balance?): Long
    {
        assert(_buffer.offset + fbeOffset + 1 <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + fbeOffset + 1 > _buffer.size)
            return 0

        val fbeHasValue = (if (optional != null) 1 else 0).toByte()
        write(fbeOffset, fbeHasValue)
        if (fbeHasValue.toInt() == 0)
            return 1

        _buffer.shift(fbeOffset + 1)
        val size = value.set(optional!!)
        _buffer.unshift(fbeOffset + 1)
        return 1 + size
    }
}
