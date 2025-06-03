package J3;

public final class s
  extends B.e.d.a.b.e.b
{
  public final long a;
  public final String b;
  public final String c;
  public final long d;
  public final int e;
  
  public s(long paramLong1, String paramString1, String paramString2, long paramLong2, int paramInt)
  {
    a = paramLong1;
    b = paramString1;
    c = paramString2;
    d = paramLong2;
    e = paramInt;
  }
  
  public String b()
  {
    return c;
  }
  
  public int c()
  {
    return e;
  }
  
  public long d()
  {
    return d;
  }
  
  public long e()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof B.e.d.a.b.e.b))
    {
      paramObject = (B.e.d.a.b.e.b)paramObject;
      if ((a == ((B.e.d.a.b.e.b)paramObject).e()) && (b.equals(((B.e.d.a.b.e.b)paramObject).f())))
      {
        String str = c;
        if ((str == null ? ((B.e.d.a.b.e.b)paramObject).b() == null : str.equals(((B.e.d.a.b.e.b)paramObject).b())) && (d == ((B.e.d.a.b.e.b)paramObject).d()) && (e == ((B.e.d.a.b.e.b)paramObject).c())) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public String f()
  {
    return b;
  }
  
  public int hashCode()
  {
    long l = a;
    int i = (int)(l ^ l >>> 32);
    int j = b.hashCode();
    String str = c;
    int k;
    if (str == null) {
      k = 0;
    } else {
      k = str.hashCode();
    }
    l = d;
    return ((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ (int)(l >>> 32 ^ l)) * 1000003 ^ e;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Frame{pc=");
    localStringBuilder.append(a);
    localStringBuilder.append(", symbol=");
    localStringBuilder.append(b);
    localStringBuilder.append(", file=");
    localStringBuilder.append(c);
    localStringBuilder.append(", offset=");
    localStringBuilder.append(d);
    localStringBuilder.append(", importance=");
    localStringBuilder.append(e);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends B.e.d.a.b.e.b.a
  {
    public Long a;
    public String b;
    public String c;
    public Long d;
    public Integer e;
    
    public B.e.d.a.b.e.b a()
    {
      Object localObject1 = a;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("");
        ((StringBuilder)localObject2).append(" pc");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (b == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" symbol");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (d == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" offset");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (e == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" importance");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      if (((String)localObject1).isEmpty()) {
        return new s(a.longValue(), b, c, d.longValue(), e.intValue(), null);
      }
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Missing required properties:");
      ((StringBuilder)localObject2).append((String)localObject1);
      throw new IllegalStateException(((StringBuilder)localObject2).toString());
    }
    
    public B.e.d.a.b.e.b.a b(String paramString)
    {
      c = paramString;
      return this;
    }
    
    public B.e.d.a.b.e.b.a c(int paramInt)
    {
      e = Integer.valueOf(paramInt);
      return this;
    }
    
    public B.e.d.a.b.e.b.a d(long paramLong)
    {
      d = Long.valueOf(paramLong);
      return this;
    }
    
    public B.e.d.a.b.e.b.a e(long paramLong)
    {
      a = Long.valueOf(paramLong);
      return this;
    }
    
    public B.e.d.a.b.e.b.a f(String paramString)
    {
      if (paramString != null)
      {
        b = paramString;
        return this;
      }
      throw new NullPointerException("Null symbol");
    }
  }
}

/* Location:
 * Qualified Name:     J3.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */