package J3;

public final class q
  extends B.e.d.a.b.d
{
  public final String a;
  public final String b;
  public final long c;
  
  public q(String paramString1, String paramString2, long paramLong)
  {
    a = paramString1;
    b = paramString2;
    c = paramLong;
  }
  
  public long b()
  {
    return c;
  }
  
  public String c()
  {
    return b;
  }
  
  public String d()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof B.e.d.a.b.d))
    {
      paramObject = (B.e.d.a.b.d)paramObject;
      if ((!a.equals(((B.e.d.a.b.d)paramObject).d())) || (!b.equals(((B.e.d.a.b.d)paramObject).c())) || (c != ((B.e.d.a.b.d)paramObject).b())) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = a.hashCode();
    int j = b.hashCode();
    long l = c;
    return ((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ (int)(l ^ l >>> 32);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Signal{name=");
    localStringBuilder.append(a);
    localStringBuilder.append(", code=");
    localStringBuilder.append(b);
    localStringBuilder.append(", address=");
    localStringBuilder.append(c);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends B.e.d.a.b.d.a
  {
    public String a;
    public String b;
    public Long c;
    
    public B.e.d.a.b.d a()
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
        ((StringBuilder)localObject1).append(" code");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (c == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" address");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      if (((String)localObject2).isEmpty()) {
        return new q(a, b, c.longValue(), null);
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Missing required properties:");
      ((StringBuilder)localObject1).append((String)localObject2);
      throw new IllegalStateException(((StringBuilder)localObject1).toString());
    }
    
    public B.e.d.a.b.d.a b(long paramLong)
    {
      c = Long.valueOf(paramLong);
      return this;
    }
    
    public B.e.d.a.b.d.a c(String paramString)
    {
      if (paramString != null)
      {
        b = paramString;
        return this;
      }
      throw new NullPointerException("Null code");
    }
    
    public B.e.d.a.b.d.a d(String paramString)
    {
      if (paramString != null)
      {
        a = paramString;
        return this;
      }
      throw new NullPointerException("Null name");
    }
  }
}

/* Location:
 * Qualified Name:     J3.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */