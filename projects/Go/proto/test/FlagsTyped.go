// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.1.0.0

package test

import "strings"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = fbe.Version
var _ = proto.Version

// FlagsTyped flags key
type FlagsTypedKey uint64

// Convert FlagsTyped flags key to string
func (k FlagsTypedKey) String() string {
    return FlagsTyped(k).String()
}

// FlagsTyped flags
type FlagsTyped uint64

// FlagsTyped flags values
//noinspection GoSnakeCaseUsage
const (
    FlagsTyped_FLAG_VALUE_0 = FlagsTyped(0x00)
    FlagsTyped_FLAG_VALUE_1 = FlagsTyped(0x01)
    FlagsTyped_FLAG_VALUE_2 = FlagsTyped(0x02)
    FlagsTyped_FLAG_VALUE_3 = FlagsTyped(0x04)
    FlagsTyped_FLAG_VALUE_4 = FlagsTyped(0x08)
    FlagsTyped_FLAG_VALUE_5 = FlagsTyped(0x10)
    FlagsTyped_FLAG_VALUE_6 = FlagsTyped(0x20)
    FlagsTyped_FLAG_VALUE_7 = FlagsTyped(0x40)
    FlagsTyped_FLAG_VALUE_8 = FlagsTyped(FlagsTyped_FLAG_VALUE_7)
    FlagsTyped_FLAG_VALUE_9 = FlagsTyped(FlagsTyped_FLAG_VALUE_2 | FlagsTyped_FLAG_VALUE_4 | FlagsTyped_FLAG_VALUE_6)
)

// Create a new FlagsTyped flags
func NewFlagsTyped() *FlagsTyped {
    return new(FlagsTyped)
}

// Is flags set?
func (f FlagsTyped) HasFlags(flags FlagsTyped) bool {
    return ((f & flags) != 0) && ((f & flags) == flags)
}

// Set flags
func (f *FlagsTyped) SetFlags(flags FlagsTyped) *FlagsTyped {
    *f |= flags
    return f
}

// Remove flags
func (f *FlagsTyped) RemoveFlags(flags FlagsTyped) *FlagsTyped {
    *f &^= flags
    return f
}

// Get the flags key
func (f FlagsTyped) Key() FlagsTypedKey {
    return FlagsTypedKey(f)
}

// Convert flags to optional
func (f FlagsTyped) Optional() *FlagsTyped {
    return &f
}

// Convert flags to string
//noinspection GoBoolExpressions
func (f FlagsTyped) String() string {
    var sb strings.Builder
    first := true
    if ((f & FlagsTyped_FLAG_VALUE_0) != 0) && ((f & FlagsTyped_FLAG_VALUE_0) == FlagsTyped_FLAG_VALUE_0) {
        if first {
            first = false
        } else {
            sb.WriteRune('|')
        }
        sb.WriteString("FLAG_VALUE_0")
    }
    if ((f & FlagsTyped_FLAG_VALUE_1) != 0) && ((f & FlagsTyped_FLAG_VALUE_1) == FlagsTyped_FLAG_VALUE_1) {
        if first {
            first = false
        } else {
            sb.WriteRune('|')
        }
        sb.WriteString("FLAG_VALUE_1")
    }
    if ((f & FlagsTyped_FLAG_VALUE_2) != 0) && ((f & FlagsTyped_FLAG_VALUE_2) == FlagsTyped_FLAG_VALUE_2) {
        if first {
            first = false
        } else {
            sb.WriteRune('|')
        }
        sb.WriteString("FLAG_VALUE_2")
    }
    if ((f & FlagsTyped_FLAG_VALUE_3) != 0) && ((f & FlagsTyped_FLAG_VALUE_3) == FlagsTyped_FLAG_VALUE_3) {
        if first {
            first = false
        } else {
            sb.WriteRune('|')
        }
        sb.WriteString("FLAG_VALUE_3")
    }
    if ((f & FlagsTyped_FLAG_VALUE_4) != 0) && ((f & FlagsTyped_FLAG_VALUE_4) == FlagsTyped_FLAG_VALUE_4) {
        if first {
            first = false
        } else {
            sb.WriteRune('|')
        }
        sb.WriteString("FLAG_VALUE_4")
    }
    if ((f & FlagsTyped_FLAG_VALUE_5) != 0) && ((f & FlagsTyped_FLAG_VALUE_5) == FlagsTyped_FLAG_VALUE_5) {
        if first {
            first = false
        } else {
            sb.WriteRune('|')
        }
        sb.WriteString("FLAG_VALUE_5")
    }
    if ((f & FlagsTyped_FLAG_VALUE_6) != 0) && ((f & FlagsTyped_FLAG_VALUE_6) == FlagsTyped_FLAG_VALUE_6) {
        if first {
            first = false
        } else {
            sb.WriteRune('|')
        }
        sb.WriteString("FLAG_VALUE_6")
    }
    if ((f & FlagsTyped_FLAG_VALUE_7) != 0) && ((f & FlagsTyped_FLAG_VALUE_7) == FlagsTyped_FLAG_VALUE_7) {
        if first {
            first = false
        } else {
            sb.WriteRune('|')
        }
        sb.WriteString("FLAG_VALUE_7")
    }
    if ((f & FlagsTyped_FLAG_VALUE_8) != 0) && ((f & FlagsTyped_FLAG_VALUE_8) == FlagsTyped_FLAG_VALUE_8) {
        if first {
            first = false
        } else {
            sb.WriteRune('|')
        }
        sb.WriteString("FLAG_VALUE_8")
    }
    if ((f & FlagsTyped_FLAG_VALUE_9) != 0) && ((f & FlagsTyped_FLAG_VALUE_9) == FlagsTyped_FLAG_VALUE_9) {
        if first {
            first = false
        } else {
            sb.WriteRune('|')
        }
        sb.WriteString("FLAG_VALUE_9")
    }
    return sb.String()
}

// Convert flags to JSON
func (f FlagsTyped) MarshalJSON() ([]byte, error) {
    value := uint64(f)
    return fbe.Json.Marshal(&value)
}

// Convert JSON to flags
func (f *FlagsTyped) UnmarshalJSON(buffer []byte) error {
    var result uint64
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return err
    }
    *f = FlagsTyped(result)
    return nil
}
