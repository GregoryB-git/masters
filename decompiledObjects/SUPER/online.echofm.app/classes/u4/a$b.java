package u4;

public final class a$b
  extends d.a
{
  public String a;
  public c.a b;
  public String c;
  public String d;
  public Long e;
  public Long f;
  public String g;
  
  public a$b() {}
  
  public a$b(d paramd)
  {
    a = paramd.d();
    b = paramd.g();
    c = paramd.b();
    d = paramd.f();
    e = Long.valueOf(paramd.c());
    f = Long.valueOf(paramd.h());
    g = paramd.e();
  }
  
  public d a()
  {
    Object localObject1 = b;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("");
      ((StringBuilder)localObject1).append(" registrationStatus");
      localObject2 = ((StringBuilder)localObject1).toString();
    }
    localObject1 = localObject2;
    if (e == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" expiresInSecs");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    localObject2 = localObject1;
    if (f == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" tokenCreationEpochInSecs");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    if (((String)localObject2).isEmpty()) {
      return new a(a, b, c, d, e.longValue(), f.longValue(), g, null);
    }
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Missing required properties:");
    ((StringBuilder)localObject1).append((String)localObject2);
    throw new IllegalStateException(((StringBuilder)localObject1).toString());
  }
  
  public d.a b(String paramString)
  {
    c = paramString;
    return this;
  }
  
  public d.a c(long paramLong)
  {
    e = Long.valueOf(paramLong);
    return this;
  }
  
  public d.a d(String paramString)
  {
    a = paramString;
    return this;
  }
  
  public d.a e(String paramString)
  {
    g = paramString;
    return this;
  }
  
  public d.a f(String paramString)
  {
    d = paramString;
    return this;
  }
  
  public d.a g(c.a parama)
  {
    if (parama != null)
    {
      b = parama;
      return this;
    }
    throw new NullPointerException("Null registrationStatus");
  }
  
  public d.a h(long paramLong)
  {
    f = Long.valueOf(paramLong);
    return this;
  }
}

/* Location:
 * Qualified Name:     u4.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */