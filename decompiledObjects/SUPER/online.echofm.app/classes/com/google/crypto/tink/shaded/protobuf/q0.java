package com.google.crypto.tink.shaded.protobuf;

public abstract class q0
{
  public static final int a = c(1, 3);
  public static final int b = c(1, 4);
  public static final int c = c(2, 0);
  public static final int d = c(3, 2);
  
  public static int a(int paramInt)
  {
    return paramInt >>> 3;
  }
  
  public static int b(int paramInt)
  {
    return paramInt & 0x7;
  }
  
  public static int c(int paramInt1, int paramInt2)
  {
    return paramInt1 << 3 | paramInt2;
  }
  
  public static enum b
  {
    public final q0.c o;
    public final int p;
    
    static
    {
      b localb1 = new b("DOUBLE", 0, q0.c.s, 1);
      q = localb1;
      b localb2 = new b("FLOAT", 1, q0.c.r, 5);
      r = localb2;
      Object localObject1 = q0.c.q;
      b localb3 = new b("INT64", 2, (q0.c)localObject1, 0);
      s = localb3;
      b localb4 = new b("UINT64", 3, (q0.c)localObject1, 0);
      t = localb4;
      Object localObject2 = q0.c.p;
      b localb5 = new b("INT32", 4, (q0.c)localObject2, 0);
      u = localb5;
      b localb6 = new b("FIXED64", 5, (q0.c)localObject1, 1);
      v = localb6;
      b localb7 = new b("FIXED32", 6, (q0.c)localObject2, 5);
      w = localb7;
      b localb8 = new b("BOOL", 7, q0.c.t, 0);
      x = localb8;
      a locala = new a("STRING", 8, q0.c.u, 2);
      y = locala;
      Object localObject3 = q0.c.x;
      b localb = new b("GROUP", 9, (q0.c)localObject3, 3);
      z = localb;
      c localc = new c("MESSAGE", 10, (q0.c)localObject3, 2);
      A = localc;
      d locald = new d("BYTES", 11, q0.c.v, 2);
      B = locald;
      b localb9 = new b("UINT32", 12, (q0.c)localObject2, 0);
      C = localb9;
      b localb10 = new b("ENUM", 13, q0.c.w, 0);
      D = localb10;
      localObject3 = new b("SFIXED32", 14, (q0.c)localObject2, 5);
      E = (b)localObject3;
      b localb11 = new b("SFIXED64", 15, (q0.c)localObject1, 1);
      F = localb11;
      localObject2 = new b("SINT32", 16, (q0.c)localObject2, 0);
      G = (b)localObject2;
      localObject1 = new b("SINT64", 17, (q0.c)localObject1, 0);
      H = (b)localObject1;
      I = new b[] { localb1, localb2, localb3, localb4, localb5, localb6, localb7, localb8, locala, localb, localc, locald, localb9, localb10, localObject3, localb11, localObject2, localObject1 };
    }
    
    public b(q0.c paramc, int paramInt1)
    {
      o = paramc;
      p = paramInt1;
    }
    
    public enum a
    {
      public a(q0.c paramc, int paramInt1)
      {
        super(paramInt, paramc, paramInt1, null);
      }
    }
    
    public enum b
    {
      public b(q0.c paramc, int paramInt1)
      {
        super(paramInt, paramc, paramInt1, null);
      }
    }
    
    public enum c
    {
      public c(q0.c paramc, int paramInt1)
      {
        super(paramInt, paramc, paramInt1, null);
      }
    }
    
    public enum d
    {
      public d(q0.c paramc, int paramInt1)
      {
        super(paramInt, paramc, paramInt1, null);
      }
    }
  }
  
  public static enum c
  {
    public final Object o;
    
    static
    {
      c localc1 = new c("INT", 0, Integer.valueOf(0));
      p = localc1;
      c localc2 = new c("LONG", 1, Long.valueOf(0L));
      q = localc2;
      c localc3 = new c("FLOAT", 2, Float.valueOf(0.0F));
      r = localc3;
      c localc4 = new c("DOUBLE", 3, Double.valueOf(0.0D));
      s = localc4;
      c localc5 = new c("BOOLEAN", 4, Boolean.FALSE);
      t = localc5;
      c localc6 = new c("STRING", 5, "");
      u = localc6;
      c localc7 = new c("BYTE_STRING", 6, h.p);
      v = localc7;
      c localc8 = new c("ENUM", 7, null);
      w = localc8;
      c localc9 = new c("MESSAGE", 8, null);
      x = localc9;
      y = new c[] { localc1, localc2, localc3, localc4, localc5, localc6, localc7, localc8, localc9 };
    }
    
    public c(Object paramObject)
    {
      o = paramObject;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.q0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */