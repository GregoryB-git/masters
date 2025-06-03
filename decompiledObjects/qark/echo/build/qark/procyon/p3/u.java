// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p3;

import com.google.crypto.tink.shaded.protobuf.z;

public enum u implements a
{
    p("UNKNOWN_HASH", 0, 0), 
    q("SHA1", 1, 1), 
    r("SHA384", 2, 2), 
    s("SHA256", 3, 3), 
    t("SHA512", 4, 4), 
    u("SHA224", 5, 5), 
    v("UNRECOGNIZED", 6, -1);
    
    public static final b w;
    public final int o;
    
    static {
        w = new b() {};
    }
    
    public u(final String name, final int ordinal, final int o) {
        this.o = o;
    }
    
    public static u c(final int n) {
        if (n == 0) {
            return u.p;
        }
        if (n == 1) {
            return u.q;
        }
        if (n == 2) {
            return u.r;
        }
        if (n == 3) {
            return u.s;
        }
        if (n == 4) {
            return u.t;
        }
        if (n != 5) {
            return null;
        }
        return u.u;
    }
    
    public final int g() {
        if (this != u.v) {
            return this.o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
