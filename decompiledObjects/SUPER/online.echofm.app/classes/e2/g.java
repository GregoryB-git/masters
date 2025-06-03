package e2;

import java.util.List;

public final class g
  extends m
{
  public final long a;
  public final long b;
  public final k c;
  public final Integer d;
  public final String e;
  public final List f;
  public final p g;
  
  public g(long paramLong1, long paramLong2, k paramk, Integer paramInteger, String paramString, List paramList, p paramp)
  {
    a = paramLong1;
    b = paramLong2;
    c = paramk;
    d = paramInteger;
    e = paramString;
    f = paramList;
    g = paramp;
  }
  
  public k b()
  {
    return c;
  }
  
  public List c()
  {
    return f;
  }
  
  public Integer d()
  {
    return d;
  }
  
  public String e()
  {
    return e;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof m))
    {
      paramObject = (m)paramObject;
      if ((a == ((m)paramObject).g()) && (b == ((m)paramObject).h()))
      {
        Object localObject = c;
        if (localObject == null ? ((m)paramObject).b() == null : localObject.equals(((m)paramObject).b()))
        {
          localObject = d;
          if (localObject == null ? ((m)paramObject).d() == null : ((Integer)localObject).equals(((m)paramObject).d()))
          {
            localObject = e;
            if (localObject == null ? ((m)paramObject).e() == null : ((String)localObject).equals(((m)paramObject).e()))
            {
              localObject = f;
              if (localObject == null ? ((m)paramObject).c() == null : ((List)localObject).equals(((m)paramObject).c()))
              {
                localObject = g;
                paramObject = ((m)paramObject).f();
                if (localObject == null ? paramObject == null : localObject.equals(paramObject)) {
                  break label201;
                }
              }
            }
          }
        }
      }
      bool = false;
      label201:
      return bool;
    }
    return false;
  }
  
  public p f()
  {
    return g;
  }
  
  public long g()
  {
    return a;
  }
  
  public long h()
  {
    return b;
  }
  
  public int hashCode()
  {
    long l = a;
    int i = (int)(l ^ l >>> 32);
    l = b;
    int j = (int)(l >>> 32 ^ l);
    Object localObject = c;
    int k = 0;
    int m;
    if (localObject == null) {
      m = 0;
    } else {
      m = localObject.hashCode();
    }
    localObject = d;
    int n;
    if (localObject == null) {
      n = 0;
    } else {
      n = ((Integer)localObject).hashCode();
    }
    localObject = e;
    int i1;
    if (localObject == null) {
      i1 = 0;
    } else {
      i1 = ((String)localObject).hashCode();
    }
    localObject = f;
    int i2;
    if (localObject == null) {
      i2 = 0;
    } else {
      i2 = ((List)localObject).hashCode();
    }
    localObject = g;
    if (localObject != null) {
      k = localObject.hashCode();
    }
    return ((((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("LogRequest{requestTimeMs=");
    localStringBuilder.append(a);
    localStringBuilder.append(", requestUptimeMs=");
    localStringBuilder.append(b);
    localStringBuilder.append(", clientInfo=");
    localStringBuilder.append(c);
    localStringBuilder.append(", logSource=");
    localStringBuilder.append(d);
    localStringBuilder.append(", logSourceName=");
    localStringBuilder.append(e);
    localStringBuilder.append(", logEvents=");
    localStringBuilder.append(f);
    localStringBuilder.append(", qosTier=");
    localStringBuilder.append(g);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends m.a
  {
    public Long a;
    public Long b;
    public k c;
    public Integer d;
    public String e;
    public List f;
    public p g;
    
    public m a()
    {
      Object localObject1 = a;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("");
        ((StringBuilder)localObject2).append(" requestTimeMs");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (b == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" requestUptimeMs");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      if (((String)localObject1).isEmpty()) {
        return new g(a.longValue(), b.longValue(), c, d, e, f, g, null);
      }
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Missing required properties:");
      ((StringBuilder)localObject2).append((String)localObject1);
      throw new IllegalStateException(((StringBuilder)localObject2).toString());
    }
    
    public m.a b(k paramk)
    {
      c = paramk;
      return this;
    }
    
    public m.a c(List paramList)
    {
      f = paramList;
      return this;
    }
    
    public m.a d(Integer paramInteger)
    {
      d = paramInteger;
      return this;
    }
    
    public m.a e(String paramString)
    {
      e = paramString;
      return this;
    }
    
    public m.a f(p paramp)
    {
      g = paramp;
      return this;
    }
    
    public m.a g(long paramLong)
    {
      a = Long.valueOf(paramLong);
      return this;
    }
    
    public m.a h(long paramLong)
    {
      b = Long.valueOf(paramLong);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     e2.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */