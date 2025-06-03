package J3;

public final class c$b
  extends B.a.b
{
  public Integer a;
  public String b;
  public Integer c;
  public Integer d;
  public Long e;
  public Long f;
  public Long g;
  public String h;
  public C i;
  
  public B.a a()
  {
    Object localObject1 = a;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("");
      ((StringBuilder)localObject1).append(" pid");
      localObject2 = ((StringBuilder)localObject1).toString();
    }
    localObject1 = localObject2;
    if (b == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" processName");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    localObject2 = localObject1;
    if (c == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" reasonCode");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (d == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" importance");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    localObject2 = localObject1;
    if (e == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" pss");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (f == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" rss");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    localObject2 = localObject1;
    if (g == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" timestamp");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    if (((String)localObject2).isEmpty()) {
      return new c(a.intValue(), b, c.intValue(), d.intValue(), e.longValue(), f.longValue(), g.longValue(), h, i, null);
    }
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Missing required properties:");
    ((StringBuilder)localObject1).append((String)localObject2);
    throw new IllegalStateException(((StringBuilder)localObject1).toString());
  }
  
  public B.a.b b(C paramC)
  {
    i = paramC;
    return this;
  }
  
  public B.a.b c(int paramInt)
  {
    d = Integer.valueOf(paramInt);
    return this;
  }
  
  public B.a.b d(int paramInt)
  {
    a = Integer.valueOf(paramInt);
    return this;
  }
  
  public B.a.b e(String paramString)
  {
    if (paramString != null)
    {
      b = paramString;
      return this;
    }
    throw new NullPointerException("Null processName");
  }
  
  public B.a.b f(long paramLong)
  {
    e = Long.valueOf(paramLong);
    return this;
  }
  
  public B.a.b g(int paramInt)
  {
    c = Integer.valueOf(paramInt);
    return this;
  }
  
  public B.a.b h(long paramLong)
  {
    f = Long.valueOf(paramLong);
    return this;
  }
  
  public B.a.b i(long paramLong)
  {
    g = Long.valueOf(paramLong);
    return this;
  }
  
  public B.a.b j(String paramString)
  {
    h = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     J3.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */