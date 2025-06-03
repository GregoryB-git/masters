// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c3;

import com.google.crypto.tink.shaded.protobuf.x;
import p3.I;
import com.google.crypto.tink.shaded.protobuf.h;
import p3.A;

public final class l
{
    public final A a;
    
    public l(final A a) {
        this.a = a;
    }
    
    public static l a(final String s, final byte[] array, final b b) {
        return new l((A)((x.a)A.c0().z(s).A(h.i(array)).y(c(b))).n());
    }
    
    public static I c(final b b) {
        final int n = l$a.b[b.ordinal()];
        if (n == 1) {
            return I.q;
        }
        if (n == 2) {
            return I.r;
        }
        if (n == 3) {
            return I.s;
        }
        if (n == 4) {
            return I.t;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }
    
    public A b() {
        return this.a;
    }
    
    public enum b
    {
        o("TINK", 0), 
        p("LEGACY", 1), 
        q("RAW", 2), 
        r("CRUNCHY", 3);
        
        public b(final String name, final int ordinal) {
        }
    }
}
