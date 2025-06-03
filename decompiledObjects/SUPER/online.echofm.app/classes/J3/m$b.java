package J3;

public final class m$b
  extends B.e.d.a.a
{
  public B.e.d.a.b a;
  public C b;
  public C c;
  public Boolean d;
  public Integer e;
  
  public m$b() {}
  
  public m$b(B.e.d.a parama)
  {
    a = parama.d();
    b = parama.c();
    c = parama.e();
    d = parama.b();
    e = Integer.valueOf(parama.f());
  }
  
  public B.e.d.a a()
  {
    Object localObject1 = a;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("");
      ((StringBuilder)localObject2).append(" execution");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (e == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" uiOrientation");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    if (((String)localObject1).isEmpty()) {
      return new m(a, b, c, d, e.intValue(), null);
    }
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Missing required properties:");
    ((StringBuilder)localObject2).append((String)localObject1);
    throw new IllegalStateException(((StringBuilder)localObject2).toString());
  }
  
  public B.e.d.a.a b(Boolean paramBoolean)
  {
    d = paramBoolean;
    return this;
  }
  
  public B.e.d.a.a c(C paramC)
  {
    b = paramC;
    return this;
  }
  
  public B.e.d.a.a d(B.e.d.a.b paramb)
  {
    if (paramb != null)
    {
      a = paramb;
      return this;
    }
    throw new NullPointerException("Null execution");
  }
  
  public B.e.d.a.a e(C paramC)
  {
    c = paramC;
    return this;
  }
  
  public B.e.d.a.a f(int paramInt)
  {
    e = Integer.valueOf(paramInt);
    return this;
  }
}

/* Location:
 * Qualified Name:     J3.m.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */