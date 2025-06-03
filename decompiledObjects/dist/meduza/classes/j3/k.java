package j3;

import f;
import java.util.List;

public final class k
  extends u
{
  public final long a;
  public final long b;
  public final o c;
  public final Integer d;
  public final String e;
  public final List<t> f;
  public final x g;
  
  public k() {}
  
  public k(long paramLong1, long paramLong2, o paramo, Integer paramInteger, String paramString, List paramList, x paramx)
  {
    a = paramLong1;
    b = paramLong2;
    c = paramo;
    d = paramInteger;
    e = paramString;
    f = paramList;
    g = paramx;
  }
  
  public final o a()
  {
    return c;
  }
  
  public final List<t> b()
  {
    return f;
  }
  
  public final Integer c()
  {
    return d;
  }
  
  public final String d()
  {
    return e;
  }
  
  public final x e()
  {
    return g;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof u))
    {
      paramObject = (u)paramObject;
      if ((a == ((u)paramObject).f()) && (b == ((u)paramObject).g()))
      {
        Object localObject = c;
        if (localObject == null ? ((u)paramObject).a() == null : localObject.equals(((u)paramObject).a()))
        {
          localObject = d;
          if (localObject == null ? ((u)paramObject).c() == null : ((Integer)localObject).equals(((u)paramObject).c()))
          {
            localObject = e;
            if (localObject == null ? ((u)paramObject).d() == null : ((String)localObject).equals(((u)paramObject).d()))
            {
              localObject = f;
              if (localObject == null ? ((u)paramObject).b() == null : ((List)localObject).equals(((u)paramObject).b()))
              {
                localObject = g;
                paramObject = ((u)paramObject).e();
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
  
  public final long f()
  {
    return a;
  }
  
  public final long g()
  {
    return b;
  }
  
  public final int hashCode()
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
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("LogRequest{requestTimeMs=");
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
}

/* Location:
 * Qualified Name:     j3.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */