// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public enum K5
{
    A(x2, 2, (Q5)null) {
        public N5(final String s, final int n, final U5 u5, final int n2) {
        }
        
        {
            this(s, 10, u5, 2);
        }
    }, 
    B(U5.v, 2, (S5)null) {
        public P5(final String s, final int n, final U5 u5, final int n2) {
        }
        
        {
            this(s, 11, u5, 2);
        }
    }, 
    C("UINT32", 12, p, 0), 
    D("ENUM", 13, U5.w, 0), 
    E("SFIXED32", 14, p, 5), 
    F("SFIXED64", 15, q2, 1), 
    G("SINT32", 16, p, 0), 
    H("SINT64", 17, q2, 0), 
    q("DOUBLE", 0, U5.s, 1), 
    r("FLOAT", 1, U5.r, 5), 
    s("INT64", 2, q2, 0), 
    t("UINT64", 3, q2, 0), 
    u("INT32", 4, p, 0), 
    v("FIXED64", 5, q2, 1), 
    w("FIXED32", 6, p, 5), 
    x("BOOL", 7, U5.t, 0), 
    y(U5.u, 2, (M5)null) {
        public J5(final String s, final int n, final U5 u5, final int n2) {
        }
        
        {
            this(s, 8, u5, 2);
        }
    }, 
    z(x2, 3, (O5)null) {
        public L5(final String s, final int n, final U5 u5, final int n2) {
        }
        
        {
            this(s, 9, u5, 3);
        }
    };
    
    public final U5 o;
    public final int p;
    
    static {
        final U5 q2 = U5.q;
        final U5 p = U5.p;
        final U5 x2 = U5.x;
    }
    
    public K5(final String name, final int ordinal, final U5 o, final int p4) {
        this.o = o;
        this.p = p4;
    }
    
    public final U5 c() {
        return this.o;
    }
}
