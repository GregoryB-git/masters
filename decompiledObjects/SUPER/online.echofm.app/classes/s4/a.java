package s4;

public final class a
  extends n
{
  public final String a;
  public final long b;
  public final long c;
  
  public a(String paramString, long paramLong1, long paramLong2)
  {
    a = paramString;
    b = paramLong1;
    c = paramLong2;
  }
  
  public String b()
  {
    return a;
  }
  
  public long c()
  {
    return c;
  }
  
  public long d()
  {
    return b;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof n))
    {
      paramObject = (n)paramObject;
      if ((!a.equals(((n)paramObject).b())) || (b != ((n)paramObject).d()) || (c != ((n)paramObject).c())) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = a.hashCode();
    long l = b;
    int j = (int)(l ^ l >>> 32);
    l = c;
    return ((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ (int)(l ^ l >>> 32);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("InstallationTokenResult{token=");
    localStringBuilder.append(a);
    localStringBuilder.append(", tokenExpirationTimestamp=");
    localStringBuilder.append(b);
    localStringBuilder.append(", tokenCreationTimestamp=");
    localStringBuilder.append(c);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
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
}

/* Location:
 * Qualified Name:     s4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */