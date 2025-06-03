package J3;

public final class r$b
  extends B.e.d.a.b.e.a
{
  public String a;
  public Integer b;
  public C c;
  
  public B.e.d.a.b.e a()
  {
    Object localObject1 = a;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("");
      ((StringBuilder)localObject1).append(" name");
      localObject2 = ((StringBuilder)localObject1).toString();
    }
    localObject1 = localObject2;
    if (b == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" importance");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    localObject2 = localObject1;
    if (c == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" frames");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    if (((String)localObject2).isEmpty()) {
      return new r(a, b.intValue(), c, null);
    }
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Missing required properties:");
    ((StringBuilder)localObject1).append((String)localObject2);
    throw new IllegalStateException(((StringBuilder)localObject1).toString());
  }
  
  public B.e.d.a.b.e.a b(C paramC)
  {
    if (paramC != null)
    {
      c = paramC;
      return this;
    }
    throw new NullPointerException("Null frames");
  }
  
  public B.e.d.a.b.e.a c(int paramInt)
  {
    b = Integer.valueOf(paramInt);
    return this;
  }
  
  public B.e.d.a.b.e.a d(String paramString)
  {
    if (paramString != null)
    {
      a = paramString;
      return this;
    }
    throw new NullPointerException("Null name");
  }
}

/* Location:
 * Qualified Name:     J3.r.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */