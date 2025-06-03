package J3;

public final class i$b
  extends B.e.a.a
{
  public String a;
  public String b;
  public String c;
  public String d;
  public String e;
  public String f;
  
  public B.e.a a()
  {
    Object localObject1 = a;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("");
      ((StringBuilder)localObject2).append(" identifier");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = localObject2;
    if (b == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" version");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    if (((String)localObject1).isEmpty()) {
      return new i(a, b, c, null, d, e, f, null);
    }
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Missing required properties:");
    ((StringBuilder)localObject2).append((String)localObject1);
    throw new IllegalStateException(((StringBuilder)localObject2).toString());
  }
  
  public B.e.a.a b(String paramString)
  {
    e = paramString;
    return this;
  }
  
  public B.e.a.a c(String paramString)
  {
    f = paramString;
    return this;
  }
  
  public B.e.a.a d(String paramString)
  {
    c = paramString;
    return this;
  }
  
  public B.e.a.a e(String paramString)
  {
    if (paramString != null)
    {
      a = paramString;
      return this;
    }
    throw new NullPointerException("Null identifier");
  }
  
  public B.e.a.a f(String paramString)
  {
    d = paramString;
    return this;
  }
  
  public B.e.a.a g(String paramString)
  {
    if (paramString != null)
    {
      b = paramString;
      return this;
    }
    throw new NullPointerException("Null version");
  }
}

/* Location:
 * Qualified Name:     J3.i.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */