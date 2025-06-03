// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.lang.reflect.Type;

public enum T3
{
    A("BOOL", 7, 7, p, w2), 
    B("STRING", 8, 8, p, x2), 
    C("MESSAGE", 9, 9, p, a), 
    D("BYTES", 10, 10, p, y2), 
    E("UINT32", 11, 11, p, s), 
    F("ENUM", 12, 12, p, z2), 
    G("SFIXED32", 13, 13, p, s), 
    H("SFIXED64", 14, 14, p, t4), 
    I("SINT32", 15, 15, p, s), 
    J("SINT64", 16, 16, p, t4), 
    K("GROUP", 17, 17, p, a), 
    L("DOUBLE_LIST", 18, 18, q, v2), 
    M("FLOAT_LIST", 19, 19, q, u2), 
    N("INT64_LIST", 20, 20, q, t4), 
    O("UINT64_LIST", 21, 21, q, t4), 
    P("INT32_LIST", 22, 22, q, s), 
    Q("FIXED64_LIST", 23, 23, q, t4), 
    R("FIXED32_LIST", 24, 24, q, s), 
    S("BOOL_LIST", 25, 25, q, w2), 
    T("STRING_LIST", 26, 26, q, x2), 
    U("MESSAGE_LIST", 27, 27, q, a), 
    V("BYTES_LIST", 28, 28, q, y2), 
    W("UINT32_LIST", 29, 29, q, s), 
    X("ENUM_LIST", 30, 30, q, z2), 
    Y("SFIXED32_LIST", 31, 31, q, s), 
    Z("SFIXED64_LIST", 32, 32, q, t4), 
    a0("SINT32_LIST", 33, 33, q, s), 
    b0("SINT64_LIST", 34, 34, q, t4), 
    c0("DOUBLE_LIST_PACKED", 35, 35, r, v2), 
    d0("FLOAT_LIST_PACKED", 36, 36, r, u2), 
    e0("INT64_LIST_PACKED", 37, 37, r, t4), 
    f0("UINT64_LIST_PACKED", 38, 38, r, t4), 
    g0("INT32_LIST_PACKED", 39, 39, r, s), 
    h0("FIXED64_LIST_PACKED", 40, 40, r, t4), 
    i0("FIXED32_LIST_PACKED", 41, 41, r, s), 
    j0("BOOL_LIST_PACKED", 42, 42, r, w2), 
    k0("UINT32_LIST_PACKED", 43, 43, r, s), 
    l0("ENUM_LIST_PACKED", 44, 44, r, z2), 
    m0("SFIXED32_LIST_PACKED", 45, 45, r, s), 
    n0("SFIXED64_LIST_PACKED", 46, 46, r, t4), 
    o0("SINT32_LIST_PACKED", 47, 47, r, s), 
    p0("SINT64_LIST_PACKED", 48, 48, r, t4), 
    q0("GROUP_LIST", 49, 49, q, a), 
    r0("MAP", 50, 50, V3.s, l4.r);
    
    public static final T3[] s0;
    
    t("DOUBLE", 0, 0, p, v2);
    
    public static final Type[] t0;
    
    u("FLOAT", 1, 1, p, u2), 
    v("INT64", 2, 2, p, t4), 
    w("UINT64", 3, 3, p, t4), 
    x("INT32", 4, 4, p, s), 
    y("FIXED64", 5, 5, p, t4), 
    z("FIXED32", 6, 6, p, s);
    
    public final l4 o;
    public final int p;
    public final V3 q;
    public final Class r;
    public final boolean s;
    
    static {
        final V3 p = V3.p;
        final l4 v2 = l4.v;
        final l4 u2 = l4.u;
        final l4 t4 = l4.t;
        final l4 s = l4.s;
        final l4 w2 = l4.w;
        final l4 x2 = l4.x;
        final l4 a = l4.A;
        final l4 y2 = l4.y;
        final l4 z2 = l4.z;
        final V3 q = V3.q;
        final V3 r = V3.r;
        int n = 0;
        t0 = new Type[0];
        final T3[] values = values();
        s0 = new T3[values.length];
        while (n < values.length) {
            final T3 t54 = values[n];
            T3.s0[t54.p] = t54;
            ++n;
        }
    }
    
    public T3(final String name, int ordinal, final int p5, final V3 q, final l4 o) {
        this.p = p5;
        this.q = q;
        this.o = o;
        ordinal = q.ordinal();
        boolean s = true;
        Class c;
        if (ordinal != 1 && ordinal != 3) {
            c = null;
        }
        else {
            c = o.c();
        }
        this.r = c;
        Label_0100: {
            if (q == V3.p) {
                ordinal = W3.a[o.ordinal()];
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    break Label_0100;
                }
            }
            s = false;
        }
        this.s = s;
    }
    
    public final int a() {
        return this.p;
    }
}
