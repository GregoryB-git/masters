// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

public enum Z
{
    A("BLOCK", 11, 53), 
    A0("UNDEFINED", 63, 44), 
    B("BREAK", 12, 4), 
    B0("VAR", 64, 41), 
    C("CASE", 13, 5), 
    C0("WHILE", 65, 42), 
    D("CONST", 14, 52);
    
    public static final Map D0;
    
    E("CONTINUE", 15, 6), 
    F("CONTROL", 16, 49), 
    G("CREATE_ARRAY", 17, 7), 
    H("CREATE_OBJECT", 18, 8), 
    I("DEFAULT", 19, 9), 
    J("DEFINE_FUNCTION", 20, 50), 
    K("DIVIDE", 21, 10), 
    L("DO", 22, 11), 
    M("EQUALS", 23, 12), 
    N("EXPRESSION_LIST", 24, 13), 
    O("FN", 25, 51), 
    P("FOR_IN", 26, 47), 
    Q("FOR_IN_CONST", 27, 54), 
    R("FOR_IN_LET", 28, 55), 
    S("FOR_LET", 29, 63), 
    T("FOR_OF", 30, 64), 
    U("FOR_OF_CONST", 31, 65), 
    V("FOR_OF_LET", 32, 66), 
    W("GET", 33, 15), 
    X("GET_CONTAINER_VARIABLE", 34, 48), 
    Y("GET_INDEX", 35, 16), 
    Z("GET_PROPERTY", 36, 17), 
    a0("GREATER_THAN", 37, 18), 
    b0("GREATER_THAN_EQUALS", 38, 19), 
    c0("IDENTITY_EQUALS", 39, 20), 
    d0("IDENTITY_NOT_EQUALS", 40, 21), 
    e0("IF", 41, 22), 
    f0("LESS_THAN", 42, 23), 
    g0("LESS_THAN_EQUALS", 43, 24), 
    h0("MODULUS", 44, 25), 
    i0("MULTIPLY", 45, 26), 
    j0("NEGATE", 46, 27), 
    k0("NOT", 47, 28), 
    l0("NOT_EQUALS", 48, 29), 
    m0("NULL", 49, 45), 
    n0("OR", 50, 30), 
    o0("PLUS_EQUALS", 51, 31), 
    p("ADD", 0, 0), 
    p0("POST_DECREMENT", 52, 32), 
    q("AND", 1, 1), 
    q0("POST_INCREMENT", 53, 33), 
    r("APPLY", 2, 2), 
    r0("QUOTE", 54, 46), 
    s("ASSIGN", 3, 3), 
    s0("PRE_DECREMENT", 55, 34), 
    t("BITWISE_AND", 4, 56), 
    t0("PRE_INCREMENT", 56, 35), 
    u("BITWISE_LEFT_SHIFT", 5, 57), 
    u0("RETURN", 57, 36), 
    v("BITWISE_NOT", 6, 58), 
    v0("SET_PROPERTY", 58, 43), 
    w("BITWISE_OR", 7, 59), 
    w0("SUBTRACT", 59, 37), 
    x("BITWISE_RIGHT_SHIFT", 8, 60), 
    x0("SWITCH", 60, 38), 
    y("BITWISE_UNSIGNED_RIGHT_SHIFT", 9, 61), 
    y0("TERNARY", 61, 39), 
    z("BITWISE_XOR", 10, 62), 
    z0("TYPEOF", 62, 40);
    
    public final int o;
    
    static {
        D0 = new HashMap();
        final Z[] values = values();
        for (int length = values.length, n = 0; n < length; ++n) {
            final Z z2 = values[n];
            Z.D0.put(z2.o, z2);
        }
    }
    
    public Z(final String name, final int ordinal, final int o) {
        if (o <= 100) {
            this.o = o;
            return;
        }
        throw new AssertionError((Object)"Native functions over 100 are reserved for runtime implementations.");
    }
    
    public static Z c(final int i) {
        return Z.D0.get(i);
    }
    
    @Override
    public final String toString() {
        return Integer.valueOf(this.o).toString();
    }
}
