package J3;

public final class h$b
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
  
  public h$b() {}
  
  public h$b(B.e parame)
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

/* Location:
 * Qualified Name:     J3.h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */