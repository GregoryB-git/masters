package com.google.android.gms.internal.measurement;

import java.lang.reflect.Type;

public enum T3
{
  public static final T3[] s0;
  public static final Type[] t0;
  public final l4 o;
  public final int p;
  public final V3 q;
  public final Class r;
  public final boolean s;
  
  static
  {
    Object localObject1 = V3.p;
    Object localObject2 = l4.v;
    T3 localT31 = new T3("DOUBLE", 0, 0, (V3)localObject1, (l4)localObject2);
    t = localT31;
    Object localObject3 = l4.u;
    T3 localT32 = new T3("FLOAT", 1, 1, (V3)localObject1, (l4)localObject3);
    u = localT32;
    Object localObject4 = l4.t;
    T3 localT33 = new T3("INT64", 2, 2, (V3)localObject1, (l4)localObject4);
    v = localT33;
    T3 localT34 = new T3("UINT64", 3, 3, (V3)localObject1, (l4)localObject4);
    w = localT34;
    Object localObject5 = l4.s;
    T3 localT35 = new T3("INT32", 4, 4, (V3)localObject1, (l4)localObject5);
    x = localT35;
    T3 localT36 = new T3("FIXED64", 5, 5, (V3)localObject1, (l4)localObject4);
    y = localT36;
    T3 localT37 = new T3("FIXED32", 6, 6, (V3)localObject1, (l4)localObject5);
    z = localT37;
    Object localObject6 = l4.w;
    T3 localT38 = new T3("BOOL", 7, 7, (V3)localObject1, (l4)localObject6);
    A = localT38;
    Object localObject7 = l4.x;
    T3 localT39 = new T3("STRING", 8, 8, (V3)localObject1, (l4)localObject7);
    B = localT39;
    Object localObject8 = l4.A;
    T3 localT310 = new T3("MESSAGE", 9, 9, (V3)localObject1, (l4)localObject8);
    C = localT310;
    Object localObject9 = l4.y;
    T3 localT311 = new T3("BYTES", 10, 10, (V3)localObject1, (l4)localObject9);
    D = localT311;
    T3 localT312 = new T3("UINT32", 11, 11, (V3)localObject1, (l4)localObject5);
    E = localT312;
    Object localObject10 = l4.z;
    T3 localT313 = new T3("ENUM", 12, 12, (V3)localObject1, (l4)localObject10);
    F = localT313;
    Object localObject11 = new T3("SFIXED32", 13, 13, (V3)localObject1, (l4)localObject5);
    G = (T3)localObject11;
    T3 localT314 = new T3("SFIXED64", 14, 14, (V3)localObject1, (l4)localObject4);
    H = localT314;
    T3 localT315 = new T3("SINT32", 15, 15, (V3)localObject1, (l4)localObject5);
    I = localT315;
    T3 localT316 = new T3("SINT64", 16, 16, (V3)localObject1, (l4)localObject4);
    J = localT316;
    T3 localT317 = new T3("GROUP", 17, 17, (V3)localObject1, (l4)localObject8);
    K = localT317;
    Object localObject12 = V3.q;
    localObject1 = new T3("DOUBLE_LIST", 18, 18, (V3)localObject12, (l4)localObject2);
    L = (T3)localObject1;
    T3 localT318 = new T3("FLOAT_LIST", 19, 19, (V3)localObject12, (l4)localObject3);
    M = localT318;
    T3 localT319 = new T3("INT64_LIST", 20, 20, (V3)localObject12, (l4)localObject4);
    N = localT319;
    T3 localT320 = new T3("UINT64_LIST", 21, 21, (V3)localObject12, (l4)localObject4);
    O = localT320;
    T3 localT321 = new T3("INT32_LIST", 22, 22, (V3)localObject12, (l4)localObject5);
    P = localT321;
    T3 localT322 = new T3("FIXED64_LIST", 23, 23, (V3)localObject12, (l4)localObject4);
    Q = localT322;
    T3 localT323 = new T3("FIXED32_LIST", 24, 24, (V3)localObject12, (l4)localObject5);
    R = localT323;
    T3 localT324 = new T3("BOOL_LIST", 25, 25, (V3)localObject12, (l4)localObject6);
    S = localT324;
    T3 localT325 = new T3("STRING_LIST", 26, 26, (V3)localObject12, (l4)localObject7);
    T = localT325;
    localObject7 = new T3("MESSAGE_LIST", 27, 27, (V3)localObject12, (l4)localObject8);
    U = (T3)localObject7;
    T3 localT326 = new T3("BYTES_LIST", 28, 28, (V3)localObject12, (l4)localObject9);
    V = localT326;
    T3 localT327 = new T3("UINT32_LIST", 29, 29, (V3)localObject12, (l4)localObject5);
    W = localT327;
    T3 localT328 = new T3("ENUM_LIST", 30, 30, (V3)localObject12, (l4)localObject10);
    X = localT328;
    T3 localT329 = new T3("SFIXED32_LIST", 31, 31, (V3)localObject12, (l4)localObject5);
    Y = localT329;
    T3 localT330 = new T3("SFIXED64_LIST", 32, 32, (V3)localObject12, (l4)localObject4);
    Z = localT330;
    T3 localT331 = new T3("SINT32_LIST", 33, 33, (V3)localObject12, (l4)localObject5);
    a0 = localT331;
    localObject9 = new T3("SINT64_LIST", 34, 34, (V3)localObject12, (l4)localObject4);
    b0 = (T3)localObject9;
    V3 localV3 = V3.r;
    localObject2 = new T3("DOUBLE_LIST_PACKED", 35, 35, localV3, (l4)localObject2);
    c0 = (T3)localObject2;
    T3 localT332 = new T3("FLOAT_LIST_PACKED", 36, 36, localV3, (l4)localObject3);
    d0 = localT332;
    localObject3 = new T3("INT64_LIST_PACKED", 37, 37, localV3, (l4)localObject4);
    e0 = (T3)localObject3;
    T3 localT333 = new T3("UINT64_LIST_PACKED", 38, 38, localV3, (l4)localObject4);
    f0 = localT333;
    T3 localT334 = new T3("INT32_LIST_PACKED", 39, 39, localV3, (l4)localObject5);
    g0 = localT334;
    T3 localT335 = new T3("FIXED64_LIST_PACKED", 40, 40, localV3, (l4)localObject4);
    h0 = localT335;
    T3 localT336 = new T3("FIXED32_LIST_PACKED", 41, 41, localV3, (l4)localObject5);
    i0 = localT336;
    localObject6 = new T3("BOOL_LIST_PACKED", 42, 42, localV3, (l4)localObject6);
    j0 = (T3)localObject6;
    T3 localT337 = new T3("UINT32_LIST_PACKED", 43, 43, localV3, (l4)localObject5);
    k0 = localT337;
    T3 localT338 = new T3("ENUM_LIST_PACKED", 44, 44, localV3, (l4)localObject10);
    l0 = localT338;
    T3 localT339 = new T3("SFIXED32_LIST_PACKED", 45, 45, localV3, (l4)localObject5);
    m0 = localT339;
    localObject10 = new T3("SFIXED64_LIST_PACKED", 46, 46, localV3, (l4)localObject4);
    n0 = (T3)localObject10;
    localObject5 = new T3("SINT32_LIST_PACKED", 47, 47, localV3, (l4)localObject5);
    o0 = (T3)localObject5;
    localObject4 = new T3("SINT64_LIST_PACKED", 48, 48, localV3, (l4)localObject4);
    p0 = (T3)localObject4;
    localObject12 = new T3("GROUP_LIST", 49, 49, (V3)localObject12, (l4)localObject8);
    q0 = (T3)localObject12;
    localObject8 = new T3("MAP", 50, 50, V3.s, l4.r);
    r0 = (T3)localObject8;
    int i = 0;
    u0 = new T3[] { localT31, localT32, localT33, localT34, localT35, localT36, localT37, localT38, localT39, localT310, localT311, localT312, localT313, localObject11, localT314, localT315, localT316, localT317, localObject1, localT318, localT319, localT320, localT321, localT322, localT323, localT324, localT325, localObject7, localT326, localT327, localT328, localT329, localT330, localT331, localObject9, localObject2, localT332, localObject3, localT333, localT334, localT335, localT336, localObject6, localT337, localT338, localT339, localObject10, localObject5, localObject4, localObject12, localObject8 };
    t0 = new Type[0];
    localObject11 = values();
    s0 = new T3[localObject11.length];
    int j = localObject11.length;
    while (i < j)
    {
      localT315 = localObject11[i];
      s0[p] = localT315;
      i++;
    }
  }
  
  public T3(int paramInt1, V3 paramV3, l4 paraml4)
  {
    p = paramInt1;
    q = paramV3;
    o = paraml4;
    paramInt = paramV3.ordinal();
    boolean bool = true;
    if ((paramInt != 1) && (paramInt != 3)) {}
    for (paramString = null;; paramString = paraml4.c())
    {
      r = paramString;
      break;
    }
    if (paramV3 == V3.p)
    {
      paramInt = W3.a[paraml4.ordinal()];
      if ((paramInt != 1) && (paramInt != 2) && (paramInt != 3)) {}
    }
    else
    {
      bool = false;
    }
    s = bool;
  }
  
  public final int a()
  {
    return p;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.T3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */