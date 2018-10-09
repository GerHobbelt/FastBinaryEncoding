// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

@file:Suppress("UnusedImport", "unused")

package test

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*
import fbe.*
import proto.*

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
open class StructSet : Comparable<Any?>
{
    var f1: HashSet<Byte> = HashSet()
    var f2: HashSet<EnumSimple> = HashSet()
    var f3: HashSet<FlagsSimple> = HashSet()
    var f4: HashSet<StructSimple> = HashSet()

    constructor()

    constructor(f1: HashSet<Byte>, f2: HashSet<EnumSimple>, f3: HashSet<FlagsSimple>, f4: HashSet<StructSimple>)
    {
        this.f1 = f1
        this.f2 = f2
        this.f3 = f3
        this.f4 = f4
    }

    constructor(other: StructSet)
    {
        this.f1 = other.f1
        this.f2 = other.f2
        this.f3 = other.f3
        this.f4 = other.f4
    }

    open fun clone(): StructSet
    {
        // Serialize the struct to the FBE stream
        val writer = test.fbe.StructSetModel()
        writer.serialize(this)

        // Deserialize the struct from the FBE stream
        val reader = test.fbe.StructSetModel()
        reader.attach(writer.buffer)
        return reader.deserialize()
    }

    override fun compareTo(other: Any?): Int
    {
        if (other == null)
            return -1

        if (!StructSet::class.java.isAssignableFrom(other.javaClass))
            return -1

        @Suppress("UNUSED_VARIABLE")
        val obj = other as StructSet? ?: return -1

        @Suppress("VARIABLE_WITH_REDUNDANT_INITIALIZER", "CanBeVal", "UnnecessaryVariable")
        var result = 0
        return result
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!StructSet::class.java.isAssignableFrom(other.javaClass))
            return false

        @Suppress("UNUSED_VARIABLE")
        val obj = other as StructSet? ?: return false

        return true
    }

    override fun hashCode(): Int
    {
        @Suppress("CanBeVal", "UnnecessaryVariable")
        var hash = 17
        return hash
    }

    override fun toString(): String
    {
        val sb = StringBuilder()
        sb.append("StructSet(")
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append("f1=[").append(f1.size).append("]{")
            for (item in f1)
            {
                sb.append(if (first) "" else ",").append(item)
                first = false
            }
            sb.append("}")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f2=[").append(f2.size).append("]{")
            for (item in f2)
            {
                sb.append(if (first) "" else ",").append(item)
                first = false
            }
            sb.append("}")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f3=[").append(f3.size).append("]{")
            for (item in f3)
            {
                sb.append(if (first) "" else ",").append(item)
                first = false
            }
            sb.append("}")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f4=[").append(f4.size).append("]{")
            for (item in f4)
            {
                sb.append(if (first) "" else ",").append(item)
                first = false
            }
            sb.append("}")
        }
        sb.append(")")
        return sb.toString()
    }

    //public String toJson() { return test.fbe.Json.getJsonEngine().toJson(this); }
    //public static StructSet fromJson(String json) { return test.fbe.Json.getJsonEngine().fromJson(json, StructSet.class); }
}
