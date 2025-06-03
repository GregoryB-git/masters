// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p3;

import com.google.crypto.tink.shaded.protobuf.z;

public enum I implements a
{
    p("UNKNOWN_PREFIX", 0, 0), 
    q("TINK", 1, 1), 
    r("LEGACY", 2, 2), 
    s("RAW", 3, 3), 
    t("CRUNCHY", 4, 4), 
    u("UNRECOGNIZED", 5, -1);
    
    public static final b v;
    public final int o;
    
    static {
        v = new b() {};
    }
    
    public I(final String name, final int ordinal, final int o) {
        this.o = o;
    }
    
    public static I c(final int n) {
        if (n == 0) {
            return I.p;
        }
        if (n == 1) {
            return I.q;
        }
        if (n == 2) {
            return I.r;
        }
        if (n == 3) {
            return I.s;
        }
        if (n != 4) {
            return null;
        }
        return I.t;
    }
    
    public final int g() {
        if (this != I.u) {
            return this.o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
