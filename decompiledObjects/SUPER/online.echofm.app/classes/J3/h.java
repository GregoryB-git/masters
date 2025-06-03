package J3;

public final class h
  extends B.e
{
  public final String a;
  public final String b;
  public final String c;
  public final long d;
  public final Long e;
  public final boolean f;
  public final B.e.a g;
  public final B.e.f h;
  public final B.e.e i;
  public final B.e.c j;
  public final C k;
  public final int l;
  
  public h(String paramString1, String paramString2, String paramString3, long paramLong, Long paramLong1, boolean paramBoolean, B.e.a parama, B.e.f paramf, B.e.e parame, B.e.c paramc, C paramC, int paramInt)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
    d = paramLong;
    e = paramLong1;
    f = paramBoolean;
    g = parama;
    h = paramf;
    i = parame;
    j = paramc;
    k = paramC;
    l = paramInt;
  }
  
  public B.e.a b()
  {
    return g;
  }
  
  public String c()
  {
    return c;
  }
  
  public B.e.c d()
  {
    return j;
  }
  
  public Long e()
  {
    return e;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof B.e))
    {
      paramObject = (B.e)paramObject;
      if ((a.equals(((B.e)paramObject).g())) && (b.equals(((B.e)paramObject).i())))
      {
        Object localObject = c;
        if ((localObject == null ? ((B.e)paramObject).c() == null : ((String)localObject).equals(((B.e)paramObject).c())) && (d == ((B.e)paramObject).l()))
        {
          localObject = e;
          if ((localObject == null ? ((B.e)paramObject).e() == null : ((Long)localObject).equals(((B.e)paramObject).e())) && (f == ((B.e)paramObject).n()) && (g.equals(((B.e)paramObject).b())))
          {
            localObject = h;
            if (localObject == null ? ((B.e)paramObject).m() == null : localObject.equals(((B.e)paramObject).m()))
            {
              localObject = i;
              if (localObject == null ? ((B.e)paramObject).k() == null : localObject.equals(((B.e)paramObject).k()))
              {
                localObject = j;
                if (localObject == null ? ((B.e)paramObject).d() == null : localObject.equals(((B.e)paramObject).d()))
                {
                  localObject = k;
                  if ((localObject == null ? ((B.e)paramObject).f() == null : ((C)localObject).equals(((B.e)paramObject).f())) && (l == ((B.e)paramObject).h())) {
                    break label282;
                  }
                }
              }
            }
          }
        }
      }
      bool = false;
      label282:
      return bool;
    }
    return false;
  }
  
  public C f()
  {
    return k;
  }
  
  public String g()
  {
    return a;
  }
  
  public int h()
  {
    return l;
  }
  
  public int hashCode()
  {
    int m = a.hashCode();
    int n = b.hashCode();
    Object localObject = c;
    int i1 = 0;
    int i2;
    if (localObject == null) {
      i2 = 0;
    } else {
      i2 = ((String)localObject).hashCode();
    }
    long l1 = d;
    int i3 = (int)(l1 ^ l1 >>> 32);
    localObject = e;
    int i4;
    if (localObject == null) {
      i4 = 0;
    } else {
      i4 = ((Long)localObject).hashCode();
    }
    int i5;
    if (f) {
      i5 = 1231;
    } else {
      i5 = 1237;
    }
    int i6 = g.hashCode();
    localObject = h;
    int i7;
    if (localObject == null) {
      i7 = 0;
    } else {
      i7 = localObject.hashCode();
    }
    localObject = i;
    int i8;
    if (localObject == null) {
      i8 = 0;
    } else {
      i8 = localObject.hashCode();
    }
    localObject = j;
    int i9;
    if (localObject == null) {
      i9 = 0;
    } else {
      i9 = localObject.hashCode();
    }
    localObject = k;
    if (localObject != null) {
      i1 = ((C)localObject).hashCode();
    }
    return (((((((((((m ^ 0xF4243) * 1000003 ^ n) * 1000003 ^ i2) * 1000003 ^ i3) * 1000003 ^ i4) * 1000003 ^ i5) * 1000003 ^ i6) * 1000003 ^ i7) * 1000003 ^ i8) * 1000003 ^ i9) * 1000003 ^ i1) * 1000003 ^ l;
  }
  
  public String i()
  {
    return b;
  }
  
  public B.e.e k()
  {
    return i;
  }
  
  public long l()
  {
    return d;
  }
  
  public B.e.f m()
  {
    return h;
  }
  
  public boolean n()
  {
    return f;
  }
  
  public B.e.b o()
  {
    return new b(this, null);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Session{generator=");
    localStringBuilder.append(a);
    localStringBuilder.append(", identifier=");
    localStringBuilder.append(b);
    localStringBuilder.append(", appQualitySessionId=");
    localStringBuilder.append(c);
    localStringBuilder.append(", startedAt=");
    localStringBuilder.append(d);
    localStringBuilder.append(", endedAt=");
    localStringBuilder.append(e);
    localStringBuilder.append(", crashed=");
    localStringBuilder.append(f);
    localStringBuilder.append(", app=");
    localStringBuilder.append(g);
    localStringBuilder.append(", user=");
    localStringBuilder.append(h);
    localStringBuilder.append(", os=");
    localStringBuilder.append(i);
    localStringBuilder.append(", device=");
    localStringBuilder.append(j);
    localStringBuilder.append(", events=");
    localStringBuilder.append(k);
    localStringBuilder.append(", generatorType=");
    localStringBuilder.append(l);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends B.e.b
  {
    public String a;
    public String b;
    public String c;
    public Long d;
    public Long e;
    public Boolean f;
    public B.e.a g;
    public B.e.f h;
    public B.e.e i;
    public B.e.c j;
    public C k;
    public Integer l;
    
    public b() {}
    
    public b(B.e parame)
    {
      a = parame.g();
      b = parame.i();
      c = parame.c();
      d = Long.valueOf(parame.l());
      e = parame.e();
      f = Boolean.valueOf(parame.n());
      g = parame.b();
      h = parame.m();
      i = parame.k();
      j = parame.d();
      k = parame.f();
      l = Integer.valueOf(parame.h());
    }
    
    public B.e a()
    {
      Object localObject1 = a;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("");
        ((StringBuilder)localObject2).append(" generator");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (b == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" identifier");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      Object localObject3 = localObject1;
      if (d == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" startedAt");
        localObject3 = ((StringBuilder)localObject2).toString();
      }
      localObject2 = localObject3;
      if (f == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject3);
        ((StringBuilder)localObject2).append(" crashed");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (g == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" app");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (l == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" generatorType");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      if (((String)localObject2).isEmpty()) {
        return new h(a, b, c, d.longValue(), e, f.booleanValue(), g, h, i, j, k, l.intValue(), null);
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Missing required properties:");
      ((StringBuilder)localObject1).append((String)localObject2);
      throw new IllegalStateException(((StringBuilder)localObject1).toString());
    }
    
    public B.e.b b(B.e.a parama)
    {
      if (parama != null)
      {
        g = parama;
        return this;
      }
      throw new NullPointerException("Null app");
    }
    
    public B.e.b c(String paramString)
    {
      c = paramString;
      return this;
    }
    
    public B.e.b d(boolean paramBoolean)
    {
      f = Boolean.valueOf(paramBoolean);
      return this;
    }
    
    public B.e.b e(B.e.c paramc)
    {
      j = paramc;
      return this;
    }
    
    public B.e.b f(Long paramLong)
    {
      e = paramLong;
      return this;
    }
    
    public B.e.b g(C paramC)
    {
      k = paramC;
      return this;
    }
    
    public B.e.b h(String paramString)
    {
      if (paramString != null)
      {
        a = paramString;
        return this;
      }
      throw new NullPointerException("Null generator");
    }
    
    public B.e.b i(int paramInt)
    {
      l = Integer.valueOf(paramInt);
      return this;
    }
    
    public B.e.b j(String paramString)
    {
      if (paramString != null)
      {
        b = paramString;
        return this;
      }
      throw new NullPointerException("Null identifier");
    }
    
    public B.e.b l(B.e.e parame)
    {
      i = parame;
      return this;
    }
    
    public B.e.b m(long paramLong)
    {
      d = Long.valueOf(paramLong);
      return this;
    }
    
    public B.e.b n(B.e.f paramf)
    {
      h = paramf;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     J3.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */