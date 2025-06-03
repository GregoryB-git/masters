package J3;

public final class p$b
  extends B.e.d.a.b.c.a
{
  public String a;
  public String b;
  public C c;
  public B.e.d.a.b.c d;
  public Integer e;
  
  public B.e.d.a.b.c a()
  {
    Object localObject1 = a;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("");
      ((StringBuilder)localObject2).append(" type");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (c == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" frames");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    localObject2 = localObject1;
    if (e == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" overflowCount");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    if (((String)localObject2).isEmpty()) {
      return new p(a, b, c, d, e.intValue(), null);
    }
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Missing required properties:");
    ((StringBuilder)localObject1).append((String)localObject2);
    throw new IllegalStateException(((StringBuilder)localObject1).toString());
  }
  
  public B.e.d.a.b.c.a b(B.e.d.a.b.c paramc)
  {
    d = paramc;
    return this;
  }
  
  public B.e.d.a.b.c.a c(C paramC)
  {
    if (paramC != null)
    {
      c = paramC;
      return this;
    }
    throw new NullPointerException("Null frames");
  }
  
  public B.e.d.a.b.c.a d(int paramInt)
  {
    e = Integer.valueOf(paramInt);
    return this;
  }
  
  public B.e.d.a.b.c.a e(String paramString)
  {
    b = paramString;
    return this;
  }
  
  public B.e.d.a.b.c.a f(String paramString)
  {
    if (paramString != null)
    {
      a = paramString;
      return this;
    }
    throw new NullPointerException("Null type");
  }
}

/* Location:
 * Qualified Name:     J3.p.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */