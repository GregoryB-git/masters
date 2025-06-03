package v4;

public final class b$b
  extends f.a
{
  public String a;
  public Long b;
  public f.b c;
  
  public f a()
  {
    Object localObject1 = b;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("");
      ((StringBuilder)localObject2).append(" tokenExpirationTimestamp");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    if (((String)localObject2).isEmpty()) {
      return new b(a, b.longValue(), c, null);
    }
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Missing required properties:");
    ((StringBuilder)localObject1).append((String)localObject2);
    throw new IllegalStateException(((StringBuilder)localObject1).toString());
  }
  
  public f.a b(f.b paramb)
  {
    c = paramb;
    return this;
  }
  
  public f.a c(String paramString)
  {
    a = paramString;
    return this;
  }
  
  public f.a d(long paramLong)
  {
    b = Long.valueOf(paramLong);
    return this;
  }
}

/* Location:
 * Qualified Name:     v4.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */