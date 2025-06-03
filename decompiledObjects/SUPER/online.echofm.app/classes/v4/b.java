package v4;

public final class b
  extends f
{
  public final String a;
  public final long b;
  public final f.b c;
  
  public b(String paramString, long paramLong, f.b paramb)
  {
    a = paramString;
    b = paramLong;
    c = paramb;
  }
  
  public f.b b()
  {
    return c;
  }
  
  public String c()
  {
    return a;
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
    if ((paramObject instanceof f))
    {
      Object localObject = (f)paramObject;
      paramObject = a;
      if ((paramObject == null ? ((f)localObject).c() == null : ((String)paramObject).equals(((f)localObject).c())) && (b == ((f)localObject).d()))
      {
        paramObject = c;
        localObject = ((f)localObject).b();
        if (paramObject == null ? localObject == null : paramObject.equals(localObject)) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    Object localObject = a;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = ((String)localObject).hashCode();
    }
    long l = b;
    int k = (int)(l ^ l >>> 32);
    localObject = c;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return ((j ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("TokenResult{token=");
    localStringBuilder.append(a);
    localStringBuilder.append(", tokenExpirationTimestamp=");
    localStringBuilder.append(b);
    localStringBuilder.append(", responseCode=");
    localStringBuilder.append(c);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
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
}

/* Location:
 * Qualified Name:     v4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */