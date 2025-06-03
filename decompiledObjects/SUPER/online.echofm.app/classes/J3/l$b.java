package J3;

public final class l$b
  extends B.e.d.b
{
  public Long a;
  public String b;
  public B.e.d.a c;
  public B.e.d.c d;
  public B.e.d.d e;
  
  public l$b() {}
  
  public l$b(B.e.d paramd)
  {
    a = Long.valueOf(paramd.e());
    b = paramd.f();
    c = paramd.b();
    d = paramd.c();
    e = paramd.d();
  }
  
  public B.e.d a()
  {
    Object localObject1 = a;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("");
      ((StringBuilder)localObject1).append(" timestamp");
      localObject2 = ((StringBuilder)localObject1).toString();
    }
    localObject1 = localObject2;
    if (b == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" type");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    localObject2 = localObject1;
    if (c == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" app");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (d == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" device");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    if (((String)localObject1).isEmpty()) {
      return new l(a.longValue(), b, c, d, e, null);
    }
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Missing required properties:");
    ((StringBuilder)localObject2).append((String)localObject1);
    throw new IllegalStateException(((StringBuilder)localObject2).toString());
  }
  
  public B.e.d.b b(B.e.d.a parama)
  {
    if (parama != null)
    {
      c = parama;
      return this;
    }
    throw new NullPointerException("Null app");
  }
  
  public B.e.d.b c(B.e.d.c paramc)
  {
    if (paramc != null)
    {
      d = paramc;
      return this;
    }
    throw new NullPointerException("Null device");
  }
  
  public B.e.d.b d(B.e.d.d paramd)
  {
    e = paramd;
    return this;
  }
  
  public B.e.d.b e(long paramLong)
  {
    a = Long.valueOf(paramLong);
    return this;
  }
  
  public B.e.d.b f(String paramString)
  {
    if (paramString != null)
    {
      b = paramString;
      return this;
    }
    throw new NullPointerException("Null type");
  }
}

/* Location:
 * Qualified Name:     J3.l.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */