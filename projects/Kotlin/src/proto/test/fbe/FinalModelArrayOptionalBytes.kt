// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

@file:Suppress("UnusedImport", "unused")

package test.fbe

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

import fbe.*
import test.*

// Fast Binary Encoding OptionalBytes array final model class
class FinalModelArrayOptionalBytes(buffer: Buffer, offset: Long, private val _size: Long) : FinalModel(buffer, offset)
{
    private val _model = FinalModelOptionalBytes(buffer, offset)

    // Get the allocation size
    fun fbeAllocationSize(values: Array<ByteArray?>): Long
    {
        var size: Long = 0
        var i: Long = 0
        while (i < values.size && i < _size)
        {
            size += _model.fbeAllocationSize(values[i.toInt()])
            i++
        }
        return size
    }
    fun fbeAllocationSize(values: ArrayList<ByteArray?>): Long
    {
        var size: Long = 0
        var i: Long = 0
        while (i < values.size && i < _size)
        {
            size += _model.fbeAllocationSize(values[i.toInt()])
            i++
        }
        return size
    }

    // Check if the array is valid
    override fun verify(): Long
    {
        if (_buffer.offset + fbeOffset > _buffer.size)
            return Long.MAX_VALUE

        var size: Long = 0
        _model.fbeOffset = fbeOffset
        var i = _size
        while (i-- > 0)
        {
            val offset = _model.verify()
            if (offset == Long.MAX_VALUE)
                return Long.MAX_VALUE
            _model.fbeShift(offset)
            size += offset
        }
        return size
    }

    // Get the array
    fun get(size: Size): Array<ByteArray?>
    {
        val values = arrayOfNulls<ByteArray?>(_size.toInt())

        assert(_buffer.offset + fbeOffset <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + fbeOffset > _buffer.size)
        {
            size.value = 0
            return values
        }

        size.value = 0
        val offset = Size()
        _model.fbeOffset = fbeOffset
        for (i in 0 until _size)
        {
            offset.value = 0
            values[i.toInt()] = _model.get(offset)
            _model.fbeShift(offset.value)
            size.value += offset.value
        }
        return values
    }

    // Get the array
    fun get(values: Array<ByteArray?>): Long
    {
        assert(_buffer.offset + fbeOffset <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + fbeOffset > _buffer.size)
            return 0

        var size: Long = 0
        val offset = Size()
        _model.fbeOffset = fbeOffset
        var i: Long = 0
        while (i < values.size && i < _size)
        {
            offset.value = 0
            values[i.toInt()] = _model.get(offset)
            _model.fbeShift(offset.value)
            size += offset.value
            i++
        }
        return size
    }

    // Get the array as ArrayList
    fun get(values: ArrayList<ByteArray?>): Long
    {
        values.clear()

        assert(_buffer.offset + fbeOffset <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + fbeOffset > _buffer.size)
            return 0

        values.ensureCapacity(_size.toInt())

        var size: Long = 0
        val offset = Size()
        _model.fbeOffset = fbeOffset
        var i = _size
        while (i-- > 0)
        {
            offset.value = 0
            val value = _model.get(offset)
            values.add(value)
            _model.fbeShift(offset.value)
            size += offset.value
        }
        return size
    }

    // Set the array
    fun set(values: Array<ByteArray?>): Long
    {
        assert(_buffer.offset + fbeOffset <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + fbeOffset > _buffer.size)
            return 0

        var size: Long = 0
        _model.fbeOffset = fbeOffset
        var i: Long = 0
        while (i < values.size && i < _size)
        {
            val offset = _model.set(values[i.toInt()])
            _model.fbeShift(offset)
            size += offset
            i++
        }
        return size
    }

    // Set the array as List
    fun set(values: ArrayList<ByteArray?>): Long
    {
        assert(_buffer.offset + fbeOffset <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + fbeOffset > _buffer.size)
            return 0

        var size: Long = 0
        _model.fbeOffset = fbeOffset
        var i: Long = 0
        while (i < values.size && i < _size)
        {
            val offset = _model.set(values[i.toInt()])
            _model.fbeShift(offset)
            size += offset
            i++
        }
        return size
    }
}
