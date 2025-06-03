package J3;

public final class k
  extends B.e.c
{
  public final int a;
  public final String b;
  public final int c;
  public final long d;
  public final long e;
  public final boolean f;
  public final int g;
  public final String h;
  public final String i;
  
  public k(int paramInt1, String paramString1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, int paramInt3, String paramString2, String paramString3)
  {
    a = paramInt1;
    b = paramString1;
    c = paramInt2;
    d = paramLong1;
    e = paramLong2;
    f = paramBoolean;
    g = paramInt3;
    h = paramString2;
    i = paramString3;
  }
  
  public int b()
  {
    return a;
  }
  
  public int c()
  {
    return c;
  }
  
  public long d()
  {
    return e;
  }
  
  public String e()
  {
    return h;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof B.e.c))
    {
      paramObject = (B.e.c)paramObject;
      if ((a != ((B.e.c)paramObject).b()) || (!b.equals(((B.e.c)paramObject).f())) || (c != ((B.e.c)paramObject).c()) || (d != ((B.e.c)paramObject).h()) || (e != ((B.e.c)paramObject).d()) || (f != ((B.e.c)paramObject).j()) || (g != ((B.e.c)paramObject).i()) || (!h.equals(((B.e.c)paramObject).e())) || (!i.equals(((B.e.c)paramObject).g()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public String f()
  {
    return b;
  }
  
  public String g()
  {
    return i;
  }
  
  public long h()
  {
    return d;
  }
  
  public int hashCode()
  {
    int j = a;
    int k = b.hashCode();
    int m = c;
    long l = d;
    int n = (int)(l ^ l >>> 32);
    l = e;
    int i1 = (int)(l ^ l >>> 32);
    int i2;
    if (f) {
      i2 = 1231;
    } else {
      i2 = 1237;
    }
    return ((((((((j ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ g) * 1000003 ^ h.hashCode()) * 1000003 ^ i.hashCode();
  }
  
  public int i()
  {
    return g;
  }
  
  public boolean j()
  {
    return f;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Device{arch=");
    localStringBuilder.append(a);
    localStringBuilder.append(", model=");
    localStringBuilder.append(b);
    localStringBuilder.append(", cores=");
    localStringBuilder.append(c);
    localStringBuilder.append(", ram=");
    localStringBuilder.append(d);
    localStringBuilder.append(", diskSpace=");
    localStringBuilder.append(e);
    localStringBuilder.append(", simulator=");
    localStringBuilder.append(f);
    localStringBuilder.append(", state=");
    localStringBuilder.append(g);
    localStringBuilder.append(", manufacturer=");
    localStringBuilder.append(h);
    localStringBuilder.append(", modelClass=");
    localStringBuilder.append(i);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends B.e.c.a
  {
    public Integer a;
    public String b;
    public Integer c;
    public Long d;
    public Long e;
    public Boolean f;
    public Integer g;
    public String h;
    public String i;
    
    public B.e.c a()
    {
      Object localObject1 = a;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("");
        ((StringBuilder)localObject1).append(" arch");
        localObject2 = ((StringBuilder)localObject1).toString();
      }
      localObject1 = localObject2;
      if (b == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" model");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (c == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" cores");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (d == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" ram");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (e == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" diskSpace");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (f == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" simulator");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (g == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" state");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (h == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" manufacturer");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (i == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" modelClass");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      if (((String)localObject2).isEmpty()) {
        return new k(a.intValue(), b, c.intValue(), d.longValue(), e.longValue(), f.booleanValue(), g.intValue(), h, i, null);
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Missing required properties:");
      ((StringBuilder)localObject1).append((String)localObject2);
      throw new IllegalStateException(((StringBuilder)localObject1).toString());
    }
    
    public B.e.c.a b(int paramInt)
    {
      a = Integer.valueOf(paramInt);
      return this;
    }
    
    public B.e.c.a c(int paramInt)
    {
      c = Integer.valueOf(paramInt);
      return this;
    }
    
    public B.e.c.a d(long paramLong)
    {
      e = Long.valueOf(paramLong);
      return this;
    }
    
    public B.e.c.a e(String paramString)
    {
      if (paramString != null)
      {
        h = paramString;
        return this;
      }
      throw new NullPointerException("Null manufacturer");
    }
    
    public B.e.c.a f(String paramString)
    {
      if (paramString != null)
      {
        b = paramString;
        return this;
      }
      throw new NullPointerException("Null model");
    }
    
    public B.e.c.a g(String paramString)
    {
      if (paramString != null)
      {
        i = paramString;
        return this;
      }
      throw new NullPointerException("Null modelClass");
    }
    
    public B.e.c.a h(long paramLong)
    {
      d = Long.valueOf(paramLong);
      return this;
    }
    
    public B.e.c.a i(boolean paramBoolean)
    {
      f = Boolean.valueOf(paramBoolean);
      return this;
    }
    
    public B.e.c.a j(int paramInt)
    {
      g = Integer.valueOf(paramInt);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     J3.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */