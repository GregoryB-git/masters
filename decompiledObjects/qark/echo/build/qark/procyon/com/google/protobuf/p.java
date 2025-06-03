// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.lang.reflect.Type;

public enum p
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
    M("FLOAT_LIST", 19, 19, q, u2), 
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
    d0("FLOAT_LIST_PACKED", 36, 36, r, u2), 
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
    r0("MAP", 50, 50, b.s, com.google.protobuf.w.r);
    
    public static final p[] s0;
    
    t("DOUBLE", 0, 0, p, v2);
    
    public static final Type[] t0;
    
    u("FLOAT", 1, 1, p, u2), 
    v("INT64", 2, 2, p, t2), 
    w("UINT64", 3, 3, p, t2), 
    x("INT32", 4, 4, p, s), 
    y("FIXED64", 5, 5, p, t2), 
    z("FIXED32", 6, 6, p, s);
    
    public final w o;
    public final int p;
    public final b q;
    public final Class r;
    public final boolean s;
    
    static {
        final b p = b.p;
        final w v2 = com.google.protobuf.w.v;
        final w u2 = com.google.protobuf.w.u;
        final w t2 = com.google.protobuf.w.t;
        final w s = com.google.protobuf.w.s;
        final w w2 = com.google.protobuf.w.w;
        final w x2 = com.google.protobuf.w.x;
        final w a = com.google.protobuf.w.A;
        final w y2 = com.google.protobuf.w.y;
        final w z2 = com.google.protobuf.w.z;
        final b q = b.q;
        final b r = b.r;
        u0 = c();
        int n = 0;
        t0 = new Type[0];
        final p[] values = values();
        s0 = new p[values.length];
        while (n < values.length) {
            final p p2 = values[n];
            com.google.protobuf.p.s0[p2.p] = p2;
            ++n;
        }
    }
    
    public p(final String name, int ordinal, final int p5, final b q, final w o) {
        this.p = p5;
        this.q = q;
        this.o = o;
        ordinal = p$a.a[q.ordinal()];
        boolean s = true;
        Class e;
        if (ordinal != 1 && ordinal != 2) {
            e = null;
        }
        else {
            e = o.e();
        }
        this.r = e;
        Label_0104: {
            if (q == b.p) {
                ordinal = p$a.b[o.ordinal()];
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    break Label_0104;
                }
            }
            s = false;
        }
        this.s = s;
    }
    
    public static /* synthetic */ p[] c() {
        return new p[] { p.t, p.u, p.v, p.w, p.x, p.y, p.z, p.A, p.B, p.C, p.D, p.E, p.F, p.G, p.H, p.I, p.J, p.K, p.L, p.M, p.N, p.O, p.P, p.Q, p.R, p.S, p.T, p.U, p.V, p.W, p.X, p.Y, p.Z, p.a0, p.b0, p.c0, p.d0, p.e0, p.f0, p.g0, p.h0, p.i0, p.j0, p.k0, p.l0, p.m0, p.n0, p.o0, p.p0, p.q0, p.r0 };
    }
    
    public int e() {
        return this.p;
    }
    
    public enum b
    {
        p("SCALAR", 0, false), 
        q("VECTOR", 1, true), 
        r("PACKED_VECTOR", 2, true), 
        s("MAP", 3, false);
        
        public final boolean o;
        
        static {
            t = c();
        }
        
        public b(final String name, final int ordinal, final boolean o) {
            this.o = o;
        }
        
        public static /* synthetic */ b[] c() {
            return new b[] { b.p, b.q, b.r, b.s };
        }
    }
}
