package com.google.protobuf;

public enum m0$b
{
  public final m0.c o;
  public final int p;
  
  static
  {
    m0.c localc1 = m0.c.q;
    s = new b("INT64", 2, localc1, 0);
    t = new b("UINT64", 3, localc1, 0);
    m0.c localc2 = m0.c.p;
    u = new b("INT32", 4, localc2, 0);
    v = new b("FIXED64", 5, localc1, 1);
    w = new b("FIXED32", 6, localc2, 5);
    x = new b("BOOL", 7, m0.c.t, 0);
    y = new a("STRING", 8, m0.c.u, 2);
    m0.c localc3 = m0.c.x;
    z = new b("GROUP", 9, localc3, 3);
    A = new c("MESSAGE", 10, localc3, 2);
    B = new d("BYTES", 11, m0.c.v, 2);
    C = new b("UINT32", 12, localc2, 0);
    D = new b("ENUM", 13, m0.c.w, 0);
    E = new b("SFIXED32", 14, localc2, 5);
    F = new b("SFIXED64", 15, localc1, 1);
    G = new b("SINT32", 16, localc2, 0);
    H = new b("SINT64", 17, localc1, 0);
  }
  
  public m0$b(m0.c paramc, int paramInt1)
  {
    o = paramc;
    p = paramInt1;
  }
  
  public m0.c e()
  {
    return o;
  }
  
  public int h()
  {
    return p;
  }
  
  public enum a
  {
    public a(m0.c paramc, int paramInt1)
    {
      super(paramInt, paramc, paramInt1, null);
    }
  }
  
  public enum b
  {
    public b(m0.c paramc, int paramInt1)
    {
      super(paramInt, paramc, paramInt1, null);
    }
  }
  
  public enum c
  {
    public c(m0.c paramc, int paramInt1)
    {
      super(paramInt, paramc, paramInt1, null);
    }
  }
  
  public enum d
  {
    public d(m0.c paramc, int paramInt1)
    {
      super(paramInt, paramc, paramInt1, null);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.m0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */