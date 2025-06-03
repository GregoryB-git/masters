package J3;

public final class n$b
  extends B.e.d.a.b.b
{
  public C a;
  public B.e.d.a.b.c b;
  public B.a c;
  public B.e.d.a.b.d d;
  public C e;
  
  public B.e.d.a.b a()
  {
    Object localObject1 = d;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("");
      ((StringBuilder)localObject2).append(" signal");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (e == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" binaries");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    if (((String)localObject1).isEmpty()) {
      return new n(a, b, c, d, e, null);
    }
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Missing required properties:");
    ((StringBuilder)localObject2).append((String)localObject1);
    throw new IllegalStateException(((StringBuilder)localObject2).toString());
  }
  
  public B.e.d.a.b.b b(B.a parama)
  {
    c = parama;
    return this;
  }
  
  public B.e.d.a.b.b c(C paramC)
  {
    if (paramC != null)
    {
      e = paramC;
      return this;
    }
    throw new NullPointerException("Null binaries");
  }
  
  public B.e.d.a.b.b d(B.e.d.a.b.c paramc)
  {
    b = paramc;
    return this;
  }
  
  public B.e.d.a.b.b e(B.e.d.a.b.d paramd)
  {
    if (paramd != null)
    {
      d = paramd;
      return this;
    }
    throw new NullPointerException("Null signal");
  }
  
  public B.e.d.a.b.b f(C paramC)
  {
    a = paramC;
    return this;
  }
}

/* Location:
 * Qualified Name:     J3.n.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */