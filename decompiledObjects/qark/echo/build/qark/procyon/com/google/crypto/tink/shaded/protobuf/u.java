// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Type;

public enum u
{
    A("BOOL", 7, 7, p, w2), 
    B("STRING", 8, 8, p, x2), 
    C("MESSAGE", 9, 9, p, a), 
    D("BYTES", 10, 10, p, y2), 
    E("UINT32", 11, 11, p, s), 
    F("ENUM", 12, 12, p, z2), 
    G("SFIXED32", 13, 13, p, s), 
    H("SFIXED64", 14, 14, p, t2), 
    I("SINT32", 15, 15, p, s), 
    J("SINT64", 16, 16, p, t2), 
    K("GROUP", 17, 17, p, a), 
    L("DOUBLE_LIST", 18, 18, q, v2), 
    M("FLOAT_LIST", 19, 19, q, u3), 
    N("INT64_LIST", 20, 20, q, t2), 
    O("UINT64_LIST", 21, 21, q, t2), 
    P("INT32_LIST", 22, 22, q, s), 
    Q("FIXED64_LIST", 23, 23, q, t2), 
    R("FIXED32_LIST", 24, 24, q, s), 
    S("BOOL_LIST", 25, 25, q, w2), 
    T("STRING_LIST", 26, 26, q, x2), 
    U("MESSAGE_LIST", 27, 27, q, a), 
    V("BYTES_LIST", 28, 28, q, y2), 
    W("UINT32_LIST", 29, 29, q, s), 
    X("ENUM_LIST", 30, 30, q, z2), 
    Y("SFIXED32_LIST", 31, 31, q, s), 
    Z("SFIXED64_LIST", 32, 32, q, t2), 
    a0("SINT32_LIST", 33, 33, q, s), 
    b0("SINT64_LIST", 34, 34, q, t2), 
    c0("DOUBLE_LIST_PACKED", 35, 35, r, v2), 
    d0("FLOAT_LIST_PACKED", 36, 36, r, u3), 
    e0("INT64_LIST_PACKED", 37, 37, r, t2), 
    f0("UINT64_LIST_PACKED", 38, 38, r, t2), 
    g0("INT32_LIST_PACKED", 39, 39, r, s), 
    h0("FIXED64_LIST_PACKED", 40, 40, r, t2), 
    i0("FIXED32_LIST_PACKED", 41, 41, r, s), 
    j0("BOOL_LIST_PACKED", 42, 42, r, w2), 
    k0("UINT32_LIST_PACKED", 43, 43, r, s), 
    l0("ENUM_LIST_PACKED", 44, 44, r, z2), 
    m0("SFIXED32_LIST_PACKED", 45, 45, r, s), 
    n0("SFIXED64_LIST_PACKED", 46, 46, r, t2), 
    o0("SINT32_LIST_PACKED", 47, 47, r, s), 
    p0("SINT64_LIST_PACKED", 48, 48, r, t2), 
    q0("GROUP_LIST", 49, 49, q, a), 
    r0("MAP", 50, 50, b.s, com.google.crypto.tink.shaded.protobuf.B.r);
    
    public static final u[] s0;
    
    t("DOUBLE", 0, 0, p, v2);
    
    public static final Type[] t0;
    
    u("FLOAT", 1, 1, p, u3), 
    v("INT64", 2, 2, p, t2), 
    w("UINT64", 3, 3, p, t2), 
    x("INT32", 4, 4, p, s), 
    y("FIXED64", 5, 5, p, t2), 
    z("FIXED32", 6, 6, p, s);
    
    public final B o;
    public final int p;
    public final b q;
    public final Class r;
    public final boolean s;
    
    static {
        final b p = b.p;
        final B v2 = com.google.crypto.tink.shaded.protobuf.B.v;
        final B u3 = com.google.crypto.tink.shaded.protobuf.B.u;
        final B t2 = com.google.crypto.tink.shaded.protobuf.B.t;
        final B s = com.google.crypto.tink.shaded.protobuf.B.s;
        final B w2 = com.google.crypto.tink.shaded.protobuf.B.w;
        final B x2 = com.google.crypto.tink.shaded.protobuf.B.x;
        final B a = com.google.crypto.tink.shaded.protobuf.B.A;
        final B y2 = com.google.crypto.tink.shaded.protobuf.B.y;
        final B z2 = com.google.crypto.tink.shaded.protobuf.B.z;
        final b q = b.q;
        final b r = b.r;
        int n = 0;
        t0 = new Type[0];
        final u[] values = values();
        s0 = new u[values.length];
        while (n < values.length) {
            final u u54 = values[n];
            u.s0[u54.p] = u54;
            ++n;
        }
    }
    
    public u(final String name, int ordinal, final int p5, final b q, final B o) {
        this.p = p5;
        this.q = q;
        this.o = o;
        ordinal = u$a.a[q.ordinal()];
        boolean s = true;
        Class c;
        if (ordinal != 1 && ordinal != 2) {
            c = null;
        }
        else {
            c = o.c();
        }
        this.r = c;
        Label_0104: {
            if (q == b.p) {
                ordinal = u$a.b[o.ordinal()];
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    break Label_0104;
                }
            }
            s = false;
        }
        this.s = s;
    }
    
    public int c() {
        return this.p;
    }
    
    public enum b
    {
        p("SCALAR", 0, false), 
        q("VECTOR", 1, true), 
        r("PACKED_VECTOR", 2, true), 
        s("MAP", 3, false);
        
        public final boolean o;
        
        public b(final String name, final int ordinal, final boolean o) {
            this.o = o;
        }
    }
}
