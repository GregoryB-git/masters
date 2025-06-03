package f2;

import java.util.Map;

public final class b
  extends i
{
  public final String a;
  public final Integer b;
  public final h c;
  public final long d;
  public final long e;
  public final Map f;
  
  public b(String paramString, Integer paramInteger, h paramh, long paramLong1, long paramLong2, Map paramMap)
  {
    a = paramString;
    b = paramInteger;
    c = paramh;
    d = paramLong1;
    e = paramLong2;
    f = paramMap;
  }
  
  public Map c()
  {
    return f;
  }
  
  public Integer d()
  {
    return b;
  }
  
  public h e()
  {
    return c;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof i))
    {
      paramObject = (i)paramObject;
      if (a.equals(((i)paramObject).j()))
      {
        Integer localInteger = b;
        if ((localInteger == null ? ((i)paramObject).d() == null : localInteger.equals(((i)paramObject).d())) && (c.equals(((i)paramObject).e())) && (d == ((i)paramObject).f()) && (e == ((i)paramObject).k()) && (f.equals(((i)paramObject).c()))) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public long f()
  {
    return d;
  }
  
  public int hashCode()
  {
    int i = a.hashCode();
    Integer localInteger = b;
    int j;
    if (localInteger == null) {
      j = 0;
    } else {
      j = localInteger.hashCode();
    }
    int k = c.hashCode();
    long l = d;
    int m = (int)(l ^ l >>> 32);
    l = e;
    return (((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ (int)(l ^ l >>> 32)) * 1000003 ^ f.hashCode();
  }
  
  public String j()
  {
    return a;
  }
  
  public long k()
  {
    return e;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("EventInternal{transportName=");
    localStringBuilder.append(a);
    localStringBuilder.append(", code=");
    localStringBuilder.append(b);
    localStringBuilder.append(", encodedPayload=");
    localStringBuilder.append(c);
    localStringBuilder.append(", eventMillis=");
    localStringBuilder.append(d);
    localStringBuilder.append(", uptimeMillis=");
    localStringBuilder.append(e);
    localStringBuilder.append(", autoMetadata=");
    localStringBuilder.append(f);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends i.a
  {
    public String a;
    public Integer b;
    public h c;
    public Long d;
    public Long e;
    public Map f;
    
    public i d()
    {
      Object localObject1 = a;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("");
        ((StringBuilder)localObject1).append(" transportName");
        localObject2 = ((StringBuilder)localObject1).toString();
      }
      localObject1 = localObject2;
      if (c == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" encodedPayload");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (d == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" eventMillis");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (e == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" uptimeMillis");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (f == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" autoMetadata");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      if (((String)localObject2).isEmpty()) {
        return new b(a, b, c, d.longValue(), e.longValue(), f, null);
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Missing required properties:");
      ((StringBuilder)localObject1).append((String)localObject2);
      throw new IllegalStateException(((StringBuilder)localObject1).toString());
    }
    
    public Map e()
    {
      Map localMap = f;
      if (localMap != null) {
        return localMap;
      }
      throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }
    
    public i.a f(Map paramMap)
    {
      if (paramMap != null)
      {
        f = paramMap;
        return this;
      }
      throw new NullPointerException("Null autoMetadata");
    }
    
    public i.a g(Integer paramInteger)
    {
      b = paramInteger;
      return this;
    }
    
    public i.a h(h paramh)
    {
      if (paramh != null)
      {
        c = paramh;
        return this;
      }
      throw new NullPointerException("Null encodedPayload");
    }
    
    public i.a i(long paramLong)
    {
      d = Long.valueOf(paramLong);
      return this;
    }
    
    public i.a j(String paramString)
    {
      if (paramString != null)
      {
        a = paramString;
        return this;
      }
      throw new NullPointerException("Null transportName");
    }
    
    public i.a k(long paramLong)
    {
      e = Long.valueOf(paramLong);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     f2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */