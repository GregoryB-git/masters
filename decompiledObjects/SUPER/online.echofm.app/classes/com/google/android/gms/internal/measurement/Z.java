package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

public enum Z
{
  public static final Map D0;
  public final int o;
  
  static
  {
    Z localZ1 = new Z("ADD", 0, 0);
    p = localZ1;
    Z localZ2 = new Z("AND", 1, 1);
    q = localZ2;
    Z localZ3 = new Z("APPLY", 2, 2);
    r = localZ3;
    Z localZ4 = new Z("ASSIGN", 3, 3);
    s = localZ4;
    Z localZ5 = new Z("BITWISE_AND", 4, 56);
    t = localZ5;
    Z localZ6 = new Z("BITWISE_LEFT_SHIFT", 5, 57);
    u = localZ6;
    Z localZ7 = new Z("BITWISE_NOT", 6, 58);
    v = localZ7;
    Z localZ8 = new Z("BITWISE_OR", 7, 59);
    w = localZ8;
    Z localZ9 = new Z("BITWISE_RIGHT_SHIFT", 8, 60);
    x = localZ9;
    Z localZ10 = new Z("BITWISE_UNSIGNED_RIGHT_SHIFT", 9, 61);
    y = localZ10;
    Z localZ11 = new Z("BITWISE_XOR", 10, 62);
    z = localZ11;
    Z localZ12 = new Z("BLOCK", 11, 53);
    A = localZ12;
    Z localZ13 = new Z("BREAK", 12, 4);
    B = localZ13;
    Z localZ14 = new Z("CASE", 13, 5);
    C = localZ14;
    Z localZ15 = new Z("CONST", 14, 52);
    D = localZ15;
    Z localZ16 = new Z("CONTINUE", 15, 6);
    E = localZ16;
    Z localZ17 = new Z("CONTROL", 16, 49);
    F = localZ17;
    Object localObject = new Z("CREATE_ARRAY", 17, 7);
    G = (Z)localObject;
    Z localZ18 = new Z("CREATE_OBJECT", 18, 8);
    H = localZ18;
    Z localZ19 = new Z("DEFAULT", 19, 9);
    I = localZ19;
    Z localZ20 = new Z("DEFINE_FUNCTION", 20, 50);
    J = localZ20;
    Z localZ21 = new Z("DIVIDE", 21, 10);
    K = localZ21;
    Z localZ22 = new Z("DO", 22, 11);
    L = localZ22;
    Z localZ23 = new Z("EQUALS", 23, 12);
    M = localZ23;
    Z localZ24 = new Z("EXPRESSION_LIST", 24, 13);
    N = localZ24;
    Z localZ25 = new Z("FN", 25, 51);
    O = localZ25;
    Z localZ26 = new Z("FOR_IN", 26, 47);
    P = localZ26;
    Z localZ27 = new Z("FOR_IN_CONST", 27, 54);
    Q = localZ27;
    Z localZ28 = new Z("FOR_IN_LET", 28, 55);
    R = localZ28;
    Z localZ29 = new Z("FOR_LET", 29, 63);
    S = localZ29;
    Z localZ30 = new Z("FOR_OF", 30, 64);
    T = localZ30;
    Z localZ31 = new Z("FOR_OF_CONST", 31, 65);
    U = localZ31;
    Z localZ32 = new Z("FOR_OF_LET", 32, 66);
    V = localZ32;
    Z localZ33 = new Z("GET", 33, 15);
    W = localZ33;
    Z localZ34 = new Z("GET_CONTAINER_VARIABLE", 34, 48);
    X = localZ34;
    Z localZ35 = new Z("GET_INDEX", 35, 16);
    Y = localZ35;
    Z localZ36 = new Z("GET_PROPERTY", 36, 17);
    Z = localZ36;
    Z localZ37 = new Z("GREATER_THAN", 37, 18);
    a0 = localZ37;
    Z localZ38 = new Z("GREATER_THAN_EQUALS", 38, 19);
    b0 = localZ38;
    Z localZ39 = new Z("IDENTITY_EQUALS", 39, 20);
    c0 = localZ39;
    Z localZ40 = new Z("IDENTITY_NOT_EQUALS", 40, 21);
    d0 = localZ40;
    Z localZ41 = new Z("IF", 41, 22);
    e0 = localZ41;
    Z localZ42 = new Z("LESS_THAN", 42, 23);
    f0 = localZ42;
    Z localZ43 = new Z("LESS_THAN_EQUALS", 43, 24);
    g0 = localZ43;
    Z localZ44 = new Z("MODULUS", 44, 25);
    h0 = localZ44;
    Z localZ45 = new Z("MULTIPLY", 45, 26);
    i0 = localZ45;
    Z localZ46 = new Z("NEGATE", 46, 27);
    j0 = localZ46;
    Z localZ47 = new Z("NOT", 47, 28);
    k0 = localZ47;
    Z localZ48 = new Z("NOT_EQUALS", 48, 29);
    l0 = localZ48;
    Z localZ49 = new Z("NULL", 49, 45);
    m0 = localZ49;
    Z localZ50 = new Z("OR", 50, 30);
    n0 = localZ50;
    Z localZ51 = new Z("PLUS_EQUALS", 51, 31);
    o0 = localZ51;
    Z localZ52 = new Z("POST_DECREMENT", 52, 32);
    p0 = localZ52;
    Z localZ53 = new Z("POST_INCREMENT", 53, 33);
    q0 = localZ53;
    Z localZ54 = new Z("QUOTE", 54, 46);
    r0 = localZ54;
    Z localZ55 = new Z("PRE_DECREMENT", 55, 34);
    s0 = localZ55;
    Z localZ56 = new Z("PRE_INCREMENT", 56, 35);
    t0 = localZ56;
    Z localZ57 = new Z("RETURN", 57, 36);
    u0 = localZ57;
    Z localZ58 = new Z("SET_PROPERTY", 58, 43);
    v0 = localZ58;
    Z localZ59 = new Z("SUBTRACT", 59, 37);
    w0 = localZ59;
    Z localZ60 = new Z("SWITCH", 60, 38);
    x0 = localZ60;
    Z localZ61 = new Z("TERNARY", 61, 39);
    y0 = localZ61;
    Z localZ62 = new Z("TYPEOF", 62, 40);
    z0 = localZ62;
    Z localZ63 = new Z("UNDEFINED", 63, 44);
    A0 = localZ63;
    Z localZ64 = new Z("VAR", 64, 41);
    B0 = localZ64;
    Z localZ65 = new Z("WHILE", 65, 42);
    C0 = localZ65;
    E0 = new Z[] { localZ1, localZ2, localZ3, localZ4, localZ5, localZ6, localZ7, localZ8, localZ9, localZ10, localZ11, localZ12, localZ13, localZ14, localZ15, localZ16, localZ17, localObject, localZ18, localZ19, localZ20, localZ21, localZ22, localZ23, localZ24, localZ25, localZ26, localZ27, localZ28, localZ29, localZ30, localZ31, localZ32, localZ33, localZ34, localZ35, localZ36, localZ37, localZ38, localZ39, localZ40, localZ41, localZ42, localZ43, localZ44, localZ45, localZ46, localZ47, localZ48, localZ49, localZ50, localZ51, localZ52, localZ53, localZ54, localZ55, localZ56, localZ57, localZ58, localZ59, localZ60, localZ61, localZ62, localZ63, localZ64, localZ65 };
    D0 = new HashMap();
    for (localZ63 : values()) {
      D0.put(Integer.valueOf(o), localZ63);
    }
  }
  
  public Z(int paramInt1)
  {
    if (paramInt1 <= 100)
    {
      o = paramInt1;
      return;
    }
    throw new AssertionError("Native functions over 100 are reserved for runtime implementations.");
  }
  
  public static Z c(int paramInt)
  {
    return (Z)D0.get(Integer.valueOf(paramInt));
  }
  
  public final String toString()
  {
    return Integer.valueOf(o).toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.Z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */