package s4;

public final class a$b
  extends n.a
{
  public String a;
  public Long b;
  public Long c;
  
  public n a()
  {
    Object localObject1 = a;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("");
      ((StringBuilder)localObject1).append(" token");
      localObject2 = ((StringBuilder)localObject1).toString();
    }
    localObject1 = localObject2;
    if (b == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" tokenExpirationTimestamp");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    localObject2 = localObject1;
    if (c == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" tokenCreationTimestamp");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    if (((String)localObject2).isEmpty()) {
      return new a(a, b.longValue(), c.longValue(), null);
    }
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Missing required properties:");
    ((StringBuilder)localObject1).append((String)localObject2);
    throw new IllegalStateException(((StringBuilder)localObject1).toString());
  }
  
  public n.a b(String paramString)
  {
    if (paramString != null)
    {
      a = paramString;
      return this;
    }
    throw new NullPointerException("Null token");
  }
  
  public n.a c(long paramLong)
  {
    c = Long.valueOf(paramLong);
    return this;
  }
  
  public n.a d(long paramLong)
  {
    b = Long.valueOf(paramLong);
    return this;
  }
}

/* Location:
 * Qualified Name:     s4.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */