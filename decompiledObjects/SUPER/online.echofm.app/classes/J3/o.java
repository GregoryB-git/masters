package J3;

public final class o
  extends B.e.d.a.b.a
{
  public final long a;
  public final long b;
  public final String c;
  public final String d;
  
  public o(long paramLong1, long paramLong2, String paramString1, String paramString2)
  {
    a = paramLong1;
    b = paramLong2;
    c = paramString1;
    d = paramString2;
  }
  
  public long b()
  {
    return a;
  }
  
  public String c()
  {
    return c;
  }
  
  public long d()
  {
    return b;
  }
  
  public String e()
  {
    return d;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof B.e.d.a.b.a))
    {
      Object localObject = (B.e.d.a.b.a)paramObject;
      if ((a == ((B.e.d.a.b.a)localObject).b()) && (b == ((B.e.d.a.b.a)localObject).d()) && (c.equals(((B.e.d.a.b.a)localObject).c())))
      {
        paramObject = d;
        localObject = ((B.e.d.a.b.a)localObject).e();
        if (paramObject == null ? localObject == null : ((String)paramObject).equals(localObject)) {}
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
    long l = a;
    int i = (int)(l ^ l >>> 32);
    l = b;
    int j = (int)(l >>> 32 ^ l);
    int k = c.hashCode();
    String str = d;
    int m;
    if (str == null) {
      m = 0;
    } else {
      m = str.hashCode();
    }
    return (((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ m;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("BinaryImage{baseAddress=");
    localStringBuilder.append(a);
    localStringBuilder.append(", size=");
    localStringBuilder.append(b);
    localStringBuilder.append(", name=");
    localStringBuilder.append(c);
    localStringBuilder.append(", uuid=");
    localStringBuilder.append(d);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends B.e.d.a.b.a.a
  {
    public Long a;
    public Long b;
    public String c;
    public String d;
    
    public B.e.d.a.b.a a()
    {
      Object localObject1 = a;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("");
        ((StringBuilder)localObject1).append(" baseAddress");
        localObject2 = ((StringBuilder)localObject1).toString();
      }
      localObject1 = localObject2;
      if (b == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" size");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (c == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" name");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      if (((String)localObject2).isEmpty()) {
        return new o(a.longValue(), b.longValue(), c, d, null);
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Missing required properties:");
      ((StringBuilder)localObject1).append((String)localObject2);
      throw new IllegalStateException(((StringBuilder)localObject1).toString());
    }
    
    public B.e.d.a.b.a.a b(long paramLong)
    {
      a = Long.valueOf(paramLong);
      return this;
    }
    
    public B.e.d.a.b.a.a c(String paramString)
    {
      if (paramString != null)
      {
        c = paramString;
        return this;
      }
      throw new NullPointerException("Null name");
    }
    
    public B.e.d.a.b.a.a d(long paramLong)
    {
      b = Long.valueOf(paramLong);
      return this;
    }
    
    public B.e.d.a.b.a.a e(String paramString)
    {
      d = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     J3.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */