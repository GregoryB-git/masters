package androidx.datastore.preferences.protobuf;

public enum r0$b
{
  public final r0.c o;
  public final int p;
  
  static
  {
    b localb1 = new b("DOUBLE", 0, r0.c.s, 1);
    q = localb1;
    b localb2 = new b("FLOAT", 1, r0.c.r, 5);
    r = localb2;
    Object localObject1 = r0.c.q;
    b localb3 = new b("INT64", 2, (r0.c)localObject1, 0);
    s = localb3;
    b localb4 = new b("UINT64", 3, (r0.c)localObject1, 0);
    t = localb4;
    Object localObject2 = r0.c.p;
    b localb5 = new b("INT32", 4, (r0.c)localObject2, 0);
    u = localb5;
    b localb6 = new b("FIXED64", 5, (r0.c)localObject1, 1);
    v = localb6;
    b localb7 = new b("FIXED32", 6, (r0.c)localObject2, 5);
    w = localb7;
    b localb8 = new b("BOOL", 7, r0.c.t, 0);
    x = localb8;
    a locala = new a("STRING", 8, r0.c.u, 2);
    y = locala;
    Object localObject3 = r0.c.x;
    b localb = new b("GROUP", 9, (r0.c)localObject3, 3);
    z = localb;
    c localc = new c("MESSAGE", 10, (r0.c)localObject3, 2);
    A = localc;
    localObject3 = new d("BYTES", 11, r0.c.v, 2);
    B = (b)localObject3;
    b localb9 = new b("UINT32", 12, (r0.c)localObject2, 0);
    C = localb9;
    b localb10 = new b("ENUM", 13, r0.c.w, 0);
    D = localb10;
    b localb11 = new b("SFIXED32", 14, (r0.c)localObject2, 5);
    E = localb11;
    b localb12 = new b("SFIXED64", 15, (r0.c)localObject1, 1);
    F = localb12;
    localObject2 = new b("SINT32", 16, (r0.c)localObject2, 0);
    G = (b)localObject2;
    localObject1 = new b("SINT64", 17, (r0.c)localObject1, 0);
    H = (b)localObject1;
    I = new b[] { localb1, localb2, localb3, localb4, localb5, localb6, localb7, localb8, locala, localb, localc, localObject3, localb9, localb10, localb11, localb12, localObject2, localObject1 };
  }
  
  public r0$b(r0.c paramc, int paramInt1)
  {
    o = paramc;
    p = paramInt1;
  }
  
  public r0.c c()
  {
    return o;
  }
  
  public int e()
  {
    return p;
  }
  
  public static enum a
  {
    public a(r0.c paramc, int paramInt1)
    {
      super(paramInt, paramc, paramInt1, null);
    }
  }
  
  public static enum b
  {
    public b(r0.c paramc, int paramInt1)
    {
      super(paramInt, paramc, paramInt1, null);
    }
  }
  
  public static enum c
  {
    public c(r0.c paramc, int paramInt1)
    {
      super(paramInt, paramc, paramInt1, null);
    }
  }
  
  public static enum d
  {
    public d(r0.c paramc, int paramInt1)
    {
      super(paramInt, paramc, paramInt1, null);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.r0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */