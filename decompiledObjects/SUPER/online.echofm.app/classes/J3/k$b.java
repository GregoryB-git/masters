package J3;

public final class k$b
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

/* Location:
 * Qualified Name:     J3.k.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */