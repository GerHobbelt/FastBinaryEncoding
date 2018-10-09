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

// Fast Binary Encoding String->OptionalByte map field model class
class FieldModelMapStringOptionalByte(buffer: Buffer, offset: Long) : FieldModel(buffer, offset)
{
    private val _modelKey = FieldModelString(buffer, offset)
    private val _modelValue = FieldModelOptionalByte(buffer, offset)

    // Field size
    override val fbeSize: Long = 4

    // Field extra size
    override val fbeExtra: Long get()
    {
        if (_buffer.offset + fbeOffset + fbeSize > _buffer.size)
            return 0

        val fbeMapOffset = readInt32(fbeOffset).toLong()
        if (fbeMapOffset == 0L || _buffer.offset + fbeMapOffset + 4 > _buffer.size)
            return 0

        val fbeMapSize = readInt32(fbeMapOffset).toLong()

        var fbeResult: Long = 4
        _modelKey.fbeOffset = fbeMapOffset + 4
        _modelValue.fbeOffset = fbeMapOffset + 4 + _modelKey.fbeSize
        var i = fbeMapSize
        while (i-- > 0)
        {
            fbeResult += _modelKey.fbeSize + _modelKey.fbeExtra
            _modelKey.fbeShift(_modelKey.fbeSize + _modelValue.fbeSize)

            fbeResult += _modelValue.fbeSize + _modelValue.fbeExtra
            _modelValue.fbeShift(_modelKey.fbeSize + _modelValue.fbeSize)
        }
        return fbeResult
    }

    // Get the map offset
    val offset: Long get()
    {
        if (_buffer.offset + fbeOffset + fbeSize > _buffer.size)
            return 0

        val fbeMapOffset = readInt32(fbeOffset).toLong()
        return fbeMapOffset
    }

    // Get the map size
    val size: Long get()
    {
        if (_buffer.offset + fbeOffset + fbeSize > _buffer.size)
            return 0

        val fbeMapOffset = readInt32(fbeOffset).toLong()
        if (fbeMapOffset == 0L || _buffer.offset + fbeMapOffset + 4 > _buffer.size)
            return 0

        val fbeMapSize = readInt32(fbeMapOffset).toLong()
        return fbeMapSize
    }

    // Map index operator
    fun getItem(index: Long): Pair<FieldModelString, FieldModelOptionalByte>
    {
        assert(_buffer.offset + fbeOffset + fbeSize <= _buffer.size) { "Model is broken!" }

        val fbeMapOffset = readInt32(fbeOffset).toLong()
        assert(fbeMapOffset > 0 && _buffer.offset + fbeMapOffset + 4 <= _buffer.size) { "Model is broken!" }

        val fbeMapSize = readInt32(fbeMapOffset).toLong()
        assert(index < fbeMapSize) { "Index is out of bounds!" }

        _modelKey.fbeOffset = fbeMapOffset + 4
        _modelValue.fbeOffset = fbeMapOffset + 4 + _modelKey.fbeSize
        _modelKey.fbeShift(index * (_modelKey.fbeSize + _modelValue.fbeSize))
        _modelValue.fbeShift(index * (_modelKey.fbeSize + _modelValue.fbeSize))
        return Pair(_modelKey, _modelValue)
    }

    // Resize the map and get its first model
    fun resize(size: Long): Pair<FieldModelString, FieldModelOptionalByte>
    {
        _modelKey.fbeOffset = fbeOffset
        _modelValue.fbeOffset = fbeOffset + _modelKey.fbeSize

        val fbeMapSize = size * (_modelKey.fbeSize + _modelValue.fbeSize)
        val fbeMapOffset = _buffer.allocate(4 + fbeMapSize) - _buffer.offset
        assert(fbeMapOffset > 0 && _buffer.offset + fbeMapOffset + 4 <= _buffer.size) { "Model is broken!" }

        write(fbeOffset, fbeMapOffset)
        write(fbeMapOffset, size.toInt())
        write(fbeMapOffset + 4, 0.toByte(), fbeMapSize)

        _modelKey.fbeOffset = fbeMapOffset + 4
        _modelValue.fbeOffset = fbeMapOffset + 4 + _modelKey.fbeSize
        return Pair(_modelKey, _modelValue)
    }

    // Check if the map is valid
    override fun verify(): Boolean
    {
        if (_buffer.offset + fbeOffset + fbeSize > _buffer.size)
            return true

        val fbeMapOffset = readInt32(fbeOffset).toLong()
        if (fbeMapOffset == 0L)
            return true

        if (_buffer.offset + fbeMapOffset + 4 > _buffer.size)
            return false

        val fbeMapSize = readInt32(fbeMapOffset).toLong()

        _modelKey.fbeOffset = fbeMapOffset + 4
        _modelValue.fbeOffset = fbeMapOffset + 4 + _modelKey.fbeSize
        var i = fbeMapSize
        while (i-- > 0)
        {
            if (!_modelKey.verify())
                return false
            _modelKey.fbeShift(_modelKey.fbeSize + _modelValue.fbeSize)
            if (!_modelValue.verify())
                return false
            _modelValue.fbeShift(_modelKey.fbeSize + _modelValue.fbeSize)
        }

        return true
    }

    // Get the map as TreeMap
    fun get(values: TreeMap<String, Byte?>)
    {
        values.clear()

        val fbeMapSize = size
        if (fbeMapSize == 0L)
            return

        val fbeModel = getItem(0)
        var i = fbeMapSize
        while (i-- > 0)
        {
            val key = fbeModel.first.get()
            val value = fbeModel.second.get()
            values[key] = value
            fbeModel.first.fbeShift(fbeModel.first.fbeSize + fbeModel.second.fbeSize)
            fbeModel.second.fbeShift(fbeModel.first.fbeSize + fbeModel.second.fbeSize)
        }
    }

    // Get the map as HashMap
    fun get(values: HashMap<String, Byte?>)
    {
        values.clear()

        val fbeMapSize = size
        if (fbeMapSize == 0L)
            return

        val fbeModel = getItem(0)
        var i = fbeMapSize
        while (i-- > 0)
        {
            val key = fbeModel.first.get()
            val value = fbeModel.second.get()
            values[key] = value
            fbeModel.first.fbeShift(fbeModel.first.fbeSize + fbeModel.second.fbeSize)
            fbeModel.second.fbeShift(fbeModel.first.fbeSize + fbeModel.second.fbeSize)
        }
    }

    // Set the map as TreeMap
    fun set(values: TreeMap<String, Byte?>)
    {
        assert(_buffer.offset + fbeOffset + fbeSize <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + fbeOffset + fbeSize > _buffer.size)
            return

        val fbeModel = resize(values.size.toLong())
        for ((key, value1) in values)
        {
            fbeModel.first.set(key)
            fbeModel.first.fbeShift(fbeModel.first.fbeSize + fbeModel.second.fbeSize)
            fbeModel.second.set(value1)
            fbeModel.second.fbeShift(fbeModel.first.fbeSize + fbeModel.second.fbeSize)
        }
    }

    // Set the vector as HashMap
    fun set(values: HashMap<String, Byte?>)
    {
        assert(_buffer.offset + fbeOffset + fbeSize <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + fbeOffset + fbeSize > _buffer.size)
            return

        val fbeModel = resize(values.size.toLong())
        for ((key, value1) in values)
        {
            fbeModel.first.set(key)
            fbeModel.first.fbeShift(fbeModel.first.fbeSize + fbeModel.second.fbeSize)
            fbeModel.second.set(value1)
            fbeModel.second.fbeShift(fbeModel.first.fbeSize + fbeModel.second.fbeSize)
        }
    }
}
