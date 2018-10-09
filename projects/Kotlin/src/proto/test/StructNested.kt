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
open class StructNested : StructOptional
{
    var f1000: EnumSimple = EnumSimple()
    var f1001: EnumSimple? = null
    var f1002: EnumTyped = EnumTyped.ENUM_VALUE_2
    var f1003: EnumTyped? = null
    var f1004: FlagsSimple = FlagsSimple()
    var f1005: FlagsSimple? = null
    var f1006: FlagsTyped = FlagsTyped.fromSet(EnumSet.of(FlagsTyped.FLAG_VALUE_2.value, FlagsTyped.FLAG_VALUE_4.value, FlagsTyped.FLAG_VALUE_6.value))
    var f1007: FlagsTyped? = null
    var f1008: StructSimple = StructSimple()
    var f1009: StructSimple? = null
    var f1010: StructOptional = StructOptional()
    var f1011: StructOptional? = null

    constructor()

    constructor(parent: StructOptional, f1000: EnumSimple, f1001: EnumSimple?, f1002: EnumTyped, f1003: EnumTyped?, f1004: FlagsSimple, f1005: FlagsSimple?, f1006: FlagsTyped, f1007: FlagsTyped?, f1008: StructSimple, f1009: StructSimple?, f1010: StructOptional, f1011: StructOptional?): super(parent.clone())
    {
        this.f1000 = f1000
        this.f1001 = f1001
        this.f1002 = f1002
        this.f1003 = f1003
        this.f1004 = f1004
        this.f1005 = f1005
        this.f1006 = f1006
        this.f1007 = f1007
        this.f1008 = f1008
        this.f1009 = f1009
        this.f1010 = f1010
        this.f1011 = f1011
    }

    constructor(other: StructNested): super(other)
    {
        this.f1000 = other.f1000
        this.f1001 = other.f1001
        this.f1002 = other.f1002
        this.f1003 = other.f1003
        this.f1004 = other.f1004
        this.f1005 = other.f1005
        this.f1006 = other.f1006
        this.f1007 = other.f1007
        this.f1008 = other.f1008
        this.f1009 = other.f1009
        this.f1010 = other.f1010
        this.f1011 = other.f1011
    }

    override fun clone(): StructNested
    {
        // Serialize the struct to the FBE stream
        val writer = test.fbe.StructNestedModel()
        writer.serialize(this)

        // Deserialize the struct from the FBE stream
        val reader = test.fbe.StructNestedModel()
        reader.attach(writer.buffer)
        return reader.deserialize()
    }

    override fun compareTo(other: Any?): Int
    {
        if (other == null)
            return -1

        if (!StructNested::class.java.isAssignableFrom(other.javaClass))
            return -1

        @Suppress("UNUSED_VARIABLE")
        val obj = other as StructNested? ?: return -1

        @Suppress("VARIABLE_WITH_REDUNDANT_INITIALIZER", "CanBeVal", "UnnecessaryVariable")
        var result = 0
        result = super.compareTo(obj)
        if (result != 0)
            return result
        return result
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!StructNested::class.java.isAssignableFrom(other.javaClass))
            return false

        @Suppress("UNUSED_VARIABLE")
        val obj = other as StructNested? ?: return false

        if (!super.equals(obj))
            return false
        return true
    }

    override fun hashCode(): Int
    {
        @Suppress("CanBeVal", "UnnecessaryVariable")
        var hash = 17
        hash = hash * 31 + super.hashCode()
        return hash
    }

    override fun toString(): String
    {
        val sb = StringBuilder()
        sb.append("StructNested(")
        sb.append(super.toString())
        sb.append(",f1000="); sb.append(f1000)
        sb.append(",f1001="); if (f1001 != null) sb.append(f1001!!); else sb.append("null")
        sb.append(",f1002="); sb.append(f1002)
        sb.append(",f1003="); if (f1003 != null) sb.append(f1003!!); else sb.append("null")
        sb.append(",f1004="); sb.append(f1004)
        sb.append(",f1005="); if (f1005 != null) sb.append(f1005!!); else sb.append("null")
        sb.append(",f1006="); sb.append(f1006)
        sb.append(",f1007="); if (f1007 != null) sb.append(f1007!!); else sb.append("null")
        sb.append(",f1008="); sb.append(f1008)
        sb.append(",f1009="); if (f1009 != null) sb.append(f1009!!); else sb.append("null")
        sb.append(",f1010="); sb.append(f1010)
        sb.append(",f1011="); if (f1011 != null) sb.append(f1011!!); else sb.append("null")
        sb.append(")")
        return sb.toString()
    }

    //public String toJson() { return test.fbe.Json.getJsonEngine().toJson(this); }
    //public static StructNested fromJson(String json) { return test.fbe.Json.getJsonEngine().fromJson(json, StructNested.class); }
}
