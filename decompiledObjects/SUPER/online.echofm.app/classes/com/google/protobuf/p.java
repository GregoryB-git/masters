package com.google.protobuf;

import java.lang.reflect.Type;

public enum p
{
  public static final p[] s0;
  public static final Type[] t0;
  public final w o;
  public final int p;
  public final b q;
  public final Class r;
  public final boolean s;
  
  static
  {
    b localb = b.p;
    Object localObject1 = w.v;
    t = new p("DOUBLE", 0, 0, localb, (w)localObject1);
    w localw1 = w.u;
    u = new p("FLOAT", 1, 1, localb, localw1);
    w localw2 = w.t;
    v = new p("INT64", 2, 2, localb, localw2);
    w = new p("UINT64", 3, 3, localb, localw2);
    w localw3 = w.s;
    x = new p("INT32", 4, 4, localb, localw3);
    y = new p("FIXED64", 5, 5, localb, localw2);
    z = new p("FIXED32", 6, 6, localb, localw3);
    w localw4 = w.w;
    A = new p("BOOL", 7, 7, localb, localw4);
    Object localObject2 = w.x;
    B = new p("STRING", 8, 8, localb, (w)localObject2);
    w localw5 = w.A;
    C = new p("MESSAGE", 9, 9, localb, localw5);
    w localw6 = w.y;
    D = new p("BYTES", 10, 10, localb, localw6);
    E = new p("UINT32", 11, 11, localb, localw3);
    w localw7 = w.z;
    F = new p("ENUM", 12, 12, localb, localw7);
    G = new p("SFIXED32", 13, 13, localb, localw3);
    H = new p("SFIXED64", 14, 14, localb, localw2);
    I = new p("SINT32", 15, 15, localb, localw3);
    J = new p("SINT64", 16, 16, localb, localw2);
    K = new p("GROUP", 17, 17, localb, localw5);
    localb = b.q;
    L = new p("DOUBLE_LIST", 18, 18, localb, (w)localObject1);
    M = new p("FLOAT_LIST", 19, 19, localb, localw1);
    N = new p("INT64_LIST", 20, 20, localb, localw2);
    O = new p("UINT64_LIST", 21, 21, localb, localw2);
    P = new p("INT32_LIST", 22, 22, localb, localw3);
    Q = new p("FIXED64_LIST", 23, 23, localb, localw2);
    R = new p("FIXED32_LIST", 24, 24, localb, localw3);
    S = new p("BOOL_LIST", 25, 25, localb, localw4);
    T = new p("STRING_LIST", 26, 26, localb, (w)localObject2);
    U = new p("MESSAGE_LIST", 27, 27, localb, localw5);
    V = new p("BYTES_LIST", 28, 28, localb, localw6);
    W = new p("UINT32_LIST", 29, 29, localb, localw3);
    X = new p("ENUM_LIST", 30, 30, localb, localw7);
    Y = new p("SFIXED32_LIST", 31, 31, localb, localw3);
    Z = new p("SFIXED64_LIST", 32, 32, localb, localw2);
    a0 = new p("SINT32_LIST", 33, 33, localb, localw3);
    b0 = new p("SINT64_LIST", 34, 34, localb, localw2);
    localObject2 = b.r;
    c0 = new p("DOUBLE_LIST_PACKED", 35, 35, (b)localObject2, (w)localObject1);
    d0 = new p("FLOAT_LIST_PACKED", 36, 36, (b)localObject2, localw1);
    e0 = new p("INT64_LIST_PACKED", 37, 37, (b)localObject2, localw2);
    f0 = new p("UINT64_LIST_PACKED", 38, 38, (b)localObject2, localw2);
    g0 = new p("INT32_LIST_PACKED", 39, 39, (b)localObject2, localw3);
    h0 = new p("FIXED64_LIST_PACKED", 40, 40, (b)localObject2, localw2);
    i0 = new p("FIXED32_LIST_PACKED", 41, 41, (b)localObject2, localw3);
    j0 = new p("BOOL_LIST_PACKED", 42, 42, (b)localObject2, localw4);
    k0 = new p("UINT32_LIST_PACKED", 43, 43, (b)localObject2, localw3);
    l0 = new p("ENUM_LIST_PACKED", 44, 44, (b)localObject2, localw7);
    m0 = new p("SFIXED32_LIST_PACKED", 45, 45, (b)localObject2, localw3);
    n0 = new p("SFIXED64_LIST_PACKED", 46, 46, (b)localObject2, localw2);
    o0 = new p("SINT32_LIST_PACKED", 47, 47, (b)localObject2, localw3);
    p0 = new p("SINT64_LIST_PACKED", 48, 48, (b)localObject2, localw2);
    q0 = new p("GROUP_LIST", 49, 49, localb, localw5);
    r0 = new p("MAP", 50, 50, b.s, w.r);
    u0 = c();
    int i = 0;
    t0 = new Type[0];
    localObject1 = values();
    s0 = new p[localObject1.length];
    int j = localObject1.length;
    while (i < j)
    {
      localw5 = localObject1[i];
      s0[p] = localw5;
      i++;
    }
  }
  
  public p(int paramInt1, b paramb, w paramw)
  {
    p = paramInt1;
    q = paramb;
    o = paramw;
    paramInt = a.a[paramb.ordinal()];
    boolean bool = true;
    if ((paramInt != 1) && (paramInt != 2)) {}
    for (paramString = null;; paramString = paramw.e())
    {
      r = paramString;
      break;
    }
    if (paramb == b.p)
    {
      paramInt = a.b[paramw.ordinal()];
      if ((paramInt != 1) && (paramInt != 2) && (paramInt != 3)) {}
    }
    else
    {
      bool = false;
    }
    s = bool;
  }
  
  public int e()
  {
    return p;
  }
  
  public static enum b
  {
    public final boolean o;
    
    public b(boolean paramBoolean)
    {
      o = paramBoolean;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */