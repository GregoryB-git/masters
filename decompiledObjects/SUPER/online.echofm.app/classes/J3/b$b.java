package J3;

public final class b$b
  extends B.b
{
  public String a;
  public String b;
  public Integer c;
  public String d;
  public String e;
  public String f;
  public String g;
  public String h;
  public B.e i;
  public B.d j;
  public B.a k;
  
  public b$b() {}
  
  public b$b(B paramB)
  {
    a = paramB.l();
    b = paramB.h();
    c = Integer.valueOf(paramB.k());
    d = paramB.i();
    e = paramB.g();
    f = paramB.d();
    g = paramB.e();
    h = paramB.f();
    i = paramB.m();
    j = paramB.j();
    k = paramB.c();
  }
  
  public B a()
  {
    Object localObject1 = a;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("");
      ((StringBuilder)localObject2).append(" sdkVersion");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (b == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" gmpAppId");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    localObject2 = localObject1;
    if (c == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" platform");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (d == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" installationUuid");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    localObject2 = localObject1;
    if (g == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" buildVersion");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (h == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" displayVersion");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    if (((String)localObject1).isEmpty()) {
      return new b(a, b, c.intValue(), d, e, f, g, h, i, j, k, null);
    }
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Missing required properties:");
    ((StringBuilder)localObject2).append((String)localObject1);
    throw new IllegalStateException(((StringBuilder)localObject2).toString());
  }
  
  public B.b b(B.a parama)
  {
    k = parama;
    return this;
  }
  
  public B.b c(String paramString)
  {
    f = paramString;
    return this;
  }
  
  public B.b d(String paramString)
  {
    if (paramString != null)
    {
      g = paramString;
      return this;
    }
    throw new NullPointerException("Null buildVersion");
  }
  
  public B.b e(String paramString)
  {
    if (paramString != null)
    {
      h = paramString;
      return this;
    }
    throw new NullPointerException("Null displayVersion");
  }
  
  public B.b f(String paramString)
  {
    e = paramString;
    return this;
  }
  
  public B.b g(String paramString)
  {
    if (paramString != null)
    {
      b = paramString;
      return this;
    }
    throw new NullPointerException("Null gmpAppId");
  }
  
  public B.b h(String paramString)
  {
    if (paramString != null)
    {
      d = paramString;
      return this;
    }
    throw new NullPointerException("Null installationUuid");
  }
  
  public B.b i(B.d paramd)
  {
    j = paramd;
    return this;
  }
  
  public B.b j(int paramInt)
  {
    c = Integer.valueOf(paramInt);
    return this;
  }
  
  public B.b k(String paramString)
  {
    if (paramString != null)
    {
      a = paramString;
      return this;
    }
    throw new NullPointerException("Null sdkVersion");
  }
  
  public B.b l(B.e parame)
  {
    i = parame;
    return this;
  }
}

/* Location:
 * Qualified Name:     J3.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */