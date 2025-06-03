package y4;

import m4.c;

public final class a
{
  public static final a p = new a().a();
  public final long a;
  public final String b;
  public final String c;
  public final c d;
  public final d e;
  public final String f;
  public final String g;
  public final int h;
  public final int i;
  public final String j;
  public final long k;
  public final b l;
  public final String m;
  public final long n;
  public final String o;
  
  public a(long paramLong1, String paramString1, String paramString2, c paramc, d paramd, String paramString3, String paramString4, int paramInt1, int paramInt2, String paramString5, long paramLong2, b paramb, String paramString6, long paramLong3, String paramString7)
  {
    a = paramLong1;
    b = paramString1;
    c = paramString2;
    d = paramc;
    e = paramd;
    f = paramString3;
    g = paramString4;
    h = paramInt1;
    i = paramInt2;
    j = paramString5;
    k = paramLong2;
    l = paramb;
    m = paramString6;
    n = paramLong3;
    o = paramString7;
  }
  
  public static a p()
  {
    return new a();
  }
  
  public String a()
  {
    return m;
  }
  
  public long b()
  {
    return k;
  }
  
  public long c()
  {
    return n;
  }
  
  public String d()
  {
    return g;
  }
  
  public String e()
  {
    return o;
  }
  
  public b f()
  {
    return l;
  }
  
  public String g()
  {
    return c;
  }
  
  public String h()
  {
    return b;
  }
  
  public c i()
  {
    return d;
  }
  
  public String j()
  {
    return f;
  }
  
  public int k()
  {
    return h;
  }
  
  public long l()
  {
    return a;
  }
  
  public d m()
  {
    return e;
  }
  
  public String n()
  {
    return j;
  }
  
  public int o()
  {
    return i;
  }
  
  public static final class a
  {
    public long a = 0L;
    public String b = "";
    public String c = "";
    public a.c d = a.c.p;
    public a.d e = a.d.p;
    public String f = "";
    public String g = "";
    public int h = 0;
    public int i = 0;
    public String j = "";
    public long k = 0L;
    public a.b l = a.b.p;
    public String m = "";
    public long n = 0L;
    public String o = "";
    
    public a a()
    {
      return new a(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o);
    }
    
    public a b(String paramString)
    {
      m = paramString;
      return this;
    }
    
    public a c(String paramString)
    {
      g = paramString;
      return this;
    }
    
    public a d(String paramString)
    {
      o = paramString;
      return this;
    }
    
    public a e(a.b paramb)
    {
      l = paramb;
      return this;
    }
    
    public a f(String paramString)
    {
      c = paramString;
      return this;
    }
    
    public a g(String paramString)
    {
      b = paramString;
      return this;
    }
    
    public a h(a.c paramc)
    {
      d = paramc;
      return this;
    }
    
    public a i(String paramString)
    {
      f = paramString;
      return this;
    }
    
    public a j(long paramLong)
    {
      a = paramLong;
      return this;
    }
    
    public a k(a.d paramd)
    {
      e = paramd;
      return this;
    }
    
    public a l(String paramString)
    {
      j = paramString;
      return this;
    }
    
    public a m(int paramInt)
    {
      i = paramInt;
      return this;
    }
  }
  
  public static enum b
    implements c
  {
    public final int o;
    
    static
    {
      b localb1 = new b("UNKNOWN_EVENT", 0, 0);
      p = localb1;
      b localb2 = new b("MESSAGE_DELIVERED", 1, 1);
      q = localb2;
      b localb3 = new b("MESSAGE_OPEN", 2, 2);
      r = localb3;
      s = new b[] { localb1, localb2, localb3 };
    }
    
    public b(int paramInt1)
    {
      o = paramInt1;
    }
    
    public int g()
    {
      return o;
    }
  }
  
  public static enum c
    implements c
  {
    public final int o;
    
    static
    {
      c localc1 = new c("UNKNOWN", 0, 0);
      p = localc1;
      c localc2 = new c("DATA_MESSAGE", 1, 1);
      q = localc2;
      c localc3 = new c("TOPIC", 2, 2);
      r = localc3;
      c localc4 = new c("DISPLAY_NOTIFICATION", 3, 3);
      s = localc4;
      t = new c[] { localc1, localc2, localc3, localc4 };
    }
    
    public c(int paramInt1)
    {
      o = paramInt1;
    }
    
    public int g()
    {
      return o;
    }
  }
  
  public static enum d
    implements c
  {
    public final int o;
    
    static
    {
      d locald1 = new d("UNKNOWN_OS", 0, 0);
      p = locald1;
      d locald2 = new d("ANDROID", 1, 1);
      q = locald2;
      d locald3 = new d("IOS", 2, 2);
      r = locald3;
      d locald4 = new d("WEB", 3, 3);
      s = locald4;
      t = new d[] { locald1, locald2, locald3, locald4 };
    }
    
    public d(int paramInt1)
    {
      o = paramInt1;
    }
    
    public int g()
    {
      return o;
    }
  }
}

/* Location:
 * Qualified Name:     y4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */