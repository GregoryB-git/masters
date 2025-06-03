package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Type;

public enum t
{
  public static final t[] s0;
  public static final Type[] t0;
  public final A o;
  public final int p;
  public final b q;
  public final Class r;
  public final boolean s;
  
  static
  {
    Object localObject1 = b.p;
    Object localObject2 = A.v;
    t localt1 = new t("DOUBLE", 0, 0, (b)localObject1, (A)localObject2);
    t = localt1;
    Object localObject3 = A.u;
    t localt2 = new t("FLOAT", 1, 1, (b)localObject1, (A)localObject3);
    u = localt2;
    Object localObject4 = A.t;
    t localt3 = new t("INT64", 2, 2, (b)localObject1, (A)localObject4);
    v = localt3;
    t localt4 = new t("UINT64", 3, 3, (b)localObject1, (A)localObject4);
    w = localt4;
    Object localObject5 = A.s;
    t localt5 = new t("INT32", 4, 4, (b)localObject1, (A)localObject5);
    x = localt5;
    t localt6 = new t("FIXED64", 5, 5, (b)localObject1, (A)localObject4);
    y = localt6;
    t localt7 = new t("FIXED32", 6, 6, (b)localObject1, (A)localObject5);
    z = localt7;
    Object localObject6 = A.w;
    t localt8 = new t("BOOL", 7, 7, (b)localObject1, (A)localObject6);
    A = localt8;
    Object localObject7 = A.x;
    Object localObject8 = new t("STRING", 8, 8, (b)localObject1, (A)localObject7);
    B = (t)localObject8;
    Object localObject9 = A.A;
    t localt9 = new t("MESSAGE", 9, 9, (b)localObject1, (A)localObject9);
    C = localt9;
    Object localObject10 = A.y;
    t localt10 = new t("BYTES", 10, 10, (b)localObject1, (A)localObject10);
    D = localt10;
    t localt11 = new t("UINT32", 11, 11, (b)localObject1, (A)localObject5);
    E = localt11;
    Object localObject11 = A.z;
    t localt12 = new t("ENUM", 12, 12, (b)localObject1, (A)localObject11);
    F = localt12;
    t localt13 = new t("SFIXED32", 13, 13, (b)localObject1, (A)localObject5);
    G = localt13;
    t localt14 = new t("SFIXED64", 14, 14, (b)localObject1, (A)localObject4);
    H = localt14;
    t localt15 = new t("SINT32", 15, 15, (b)localObject1, (A)localObject5);
    I = localt15;
    t localt16 = new t("SINT64", 16, 16, (b)localObject1, (A)localObject4);
    J = localt16;
    t localt17 = new t("GROUP", 17, 17, (b)localObject1, (A)localObject9);
    K = localt17;
    Object localObject12 = b.q;
    t localt18 = new t("DOUBLE_LIST", 18, 18, (b)localObject12, (A)localObject2);
    L = localt18;
    t localt19 = new t("FLOAT_LIST", 19, 19, (b)localObject12, (A)localObject3);
    M = localt19;
    t localt20 = new t("INT64_LIST", 20, 20, (b)localObject12, (A)localObject4);
    N = localt20;
    t localt21 = new t("UINT64_LIST", 21, 21, (b)localObject12, (A)localObject4);
    O = localt21;
    localObject1 = new t("INT32_LIST", 22, 22, (b)localObject12, (A)localObject5);
    P = (t)localObject1;
    t localt22 = new t("FIXED64_LIST", 23, 23, (b)localObject12, (A)localObject4);
    Q = localt22;
    t localt23 = new t("FIXED32_LIST", 24, 24, (b)localObject12, (A)localObject5);
    R = localt23;
    t localt24 = new t("BOOL_LIST", 25, 25, (b)localObject12, (A)localObject6);
    S = localt24;
    t localt25 = new t("STRING_LIST", 26, 26, (b)localObject12, (A)localObject7);
    T = localt25;
    localObject7 = new t("MESSAGE_LIST", 27, 27, (b)localObject12, (A)localObject9);
    U = (t)localObject7;
    t localt26 = new t("BYTES_LIST", 28, 28, (b)localObject12, (A)localObject10);
    V = localt26;
    t localt27 = new t("UINT32_LIST", 29, 29, (b)localObject12, (A)localObject5);
    W = localt27;
    t localt28 = new t("ENUM_LIST", 30, 30, (b)localObject12, (A)localObject11);
    X = localt28;
    t localt29 = new t("SFIXED32_LIST", 31, 31, (b)localObject12, (A)localObject5);
    Y = localt29;
    localObject10 = new t("SFIXED64_LIST", 32, 32, (b)localObject12, (A)localObject4);
    Z = (t)localObject10;
    t localt30 = new t("SINT32_LIST", 33, 33, (b)localObject12, (A)localObject5);
    a0 = localt30;
    t localt31 = new t("SINT64_LIST", 34, 34, (b)localObject12, (A)localObject4);
    b0 = localt31;
    b localb = b.r;
    localObject2 = new t("DOUBLE_LIST_PACKED", 35, 35, localb, (A)localObject2);
    c0 = (t)localObject2;
    t localt32 = new t("FLOAT_LIST_PACKED", 36, 36, localb, (A)localObject3);
    d0 = localt32;
    t localt33 = new t("INT64_LIST_PACKED", 37, 37, localb, (A)localObject4);
    e0 = localt33;
    t localt34 = new t("UINT64_LIST_PACKED", 38, 38, localb, (A)localObject4);
    f0 = localt34;
    t localt35 = new t("INT32_LIST_PACKED", 39, 39, localb, (A)localObject5);
    g0 = localt35;
    t localt36 = new t("FIXED64_LIST_PACKED", 40, 40, localb, (A)localObject4);
    h0 = localt36;
    localObject3 = new t("FIXED32_LIST_PACKED", 41, 41, localb, (A)localObject5);
    i0 = (t)localObject3;
    t localt37 = new t("BOOL_LIST_PACKED", 42, 42, localb, (A)localObject6);
    j0 = localt37;
    localObject6 = new t("UINT32_LIST_PACKED", 43, 43, localb, (A)localObject5);
    k0 = (t)localObject6;
    t localt38 = new t("ENUM_LIST_PACKED", 44, 44, localb, (A)localObject11);
    l0 = localt38;
    localObject11 = new t("SFIXED32_LIST_PACKED", 45, 45, localb, (A)localObject5);
    m0 = (t)localObject11;
    t localt39 = new t("SFIXED64_LIST_PACKED", 46, 46, localb, (A)localObject4);
    n0 = localt39;
    localObject5 = new t("SINT32_LIST_PACKED", 47, 47, localb, (A)localObject5);
    o0 = (t)localObject5;
    localObject4 = new t("SINT64_LIST_PACKED", 48, 48, localb, (A)localObject4);
    p0 = (t)localObject4;
    localObject9 = new t("GROUP_LIST", 49, 49, (b)localObject12, (A)localObject9);
    q0 = (t)localObject9;
    localObject12 = new t("MAP", 50, 50, b.s, A.r);
    r0 = (t)localObject12;
    int i = 0;
    u0 = new t[] { localt1, localt2, localt3, localt4, localt5, localt6, localt7, localt8, localObject8, localt9, localt10, localt11, localt12, localt13, localt14, localt15, localt16, localt17, localt18, localt19, localt20, localt21, localObject1, localt22, localt23, localt24, localt25, localObject7, localt26, localt27, localt28, localt29, localObject10, localt30, localt31, localObject2, localt32, localt33, localt34, localt35, localt36, localObject3, localt37, localObject6, localt38, localObject11, localt39, localObject5, localObject4, localObject9, localObject12 };
    t0 = new Type[0];
    localObject8 = values();
    s0 = new t[localObject8.length];
    int j = localObject8.length;
    while (i < j)
    {
      localt3 = localObject8[i];
      s0[p] = localt3;
      i++;
    }
  }
  
  public t(int paramInt1, b paramb, A paramA)
  {
    p = paramInt1;
    q = paramb;
    o = paramA;
    paramInt = a.a[paramb.ordinal()];
    boolean bool = true;
    if ((paramInt != 1) && (paramInt != 2)) {}
    for (paramString = null;; paramString = paramA.c())
    {
      r = paramString;
      break;
    }
    if (paramb == b.p)
    {
      paramInt = a.b[paramA.ordinal()];
      if ((paramInt != 1) && (paramInt != 2) && (paramInt != 3)) {}
    }
    else
    {
      bool = false;
    }
    s = bool;
  }
  
  public int c()
  {
    return p;
  }
  
  public static enum b
  {
    public final boolean o;
    
    static
    {
      b localb1 = new b("SCALAR", 0, false);
      p = localb1;
      b localb2 = new b("VECTOR", 1, true);
      q = localb2;
      b localb3 = new b("PACKED_VECTOR", 2, true);
      r = localb3;
      b localb4 = new b("MAP", 3, false);
      s = localb4;
      t = new b[] { localb1, localb2, localb3, localb4 };
    }
    
    public b(boolean paramBoolean)
    {
      o = paramBoolean;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */