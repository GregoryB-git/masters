package e2;

import java.util.Arrays;

public final class f
  extends l
{
  public final long a;
  public final Integer b;
  public final long c;
  public final byte[] d;
  public final String e;
  public final long f;
  public final o g;
  
  public f(long paramLong1, Integer paramInteger, long paramLong2, byte[] paramArrayOfByte, String paramString, long paramLong3, o paramo)
  {
    a = paramLong1;
    b = paramInteger;
    c = paramLong2;
    d = paramArrayOfByte;
    e = paramString;
    f = paramLong3;
    g = paramo;
  }
  
  public Integer b()
  {
    return b;
  }
  
  public long c()
  {
    return a;
  }
  
  public long d()
  {
    return c;
  }
  
  public o e()
  {
    return g;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof l))
    {
      Object localObject = (l)paramObject;
      if (a == ((l)localObject).c())
      {
        paramObject = b;
        if ((paramObject == null ? ((l)localObject).b() == null : ((Integer)paramObject).equals(((l)localObject).b())) && (c == ((l)localObject).d()))
        {
          byte[] arrayOfByte = d;
          if ((localObject instanceof f)) {
            paramObject = d;
          } else {
            paramObject = ((l)localObject).f();
          }
          if (Arrays.equals(arrayOfByte, (byte[])paramObject))
          {
            paramObject = e;
            if ((paramObject == null ? ((l)localObject).g() == null : ((String)paramObject).equals(((l)localObject).g())) && (f == ((l)localObject).h()))
            {
              paramObject = g;
              localObject = ((l)localObject).e();
              if (paramObject == null ? localObject == null : paramObject.equals(localObject)) {
                break label189;
              }
            }
          }
        }
      }
      bool = false;
      label189:
      return bool;
    }
    return false;
  }
  
  public byte[] f()
  {
    return d;
  }
  
  public String g()
  {
    return e;
  }
  
  public long h()
  {
    return f;
  }
  
  public int hashCode()
  {
    long l = a;
    int i = (int)(l ^ l >>> 32);
    Object localObject = b;
    int j = 0;
    int k;
    if (localObject == null) {
      k = 0;
    } else {
      k = ((Integer)localObject).hashCode();
    }
    l = c;
    int m = (int)(l ^ l >>> 32);
    int n = Arrays.hashCode(d);
    localObject = e;
    int i1;
    if (localObject == null) {
      i1 = 0;
    } else {
      i1 = ((String)localObject).hashCode();
    }
    l = f;
    int i2 = (int)(l >>> 32 ^ l);
    localObject = g;
    if (localObject != null) {
      j = localObject.hashCode();
    }
    return ((((((i ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("LogEvent{eventTimeMs=");
    localStringBuilder.append(a);
    localStringBuilder.append(", eventCode=");
    localStringBuilder.append(b);
    localStringBuilder.append(", eventUptimeMs=");
    localStringBuilder.append(c);
    localStringBuilder.append(", sourceExtension=");
    localStringBuilder.append(Arrays.toString(d));
    localStringBuilder.append(", sourceExtensionJsonProto3=");
    localStringBuilder.append(e);
    localStringBuilder.append(", timezoneOffsetSeconds=");
    localStringBuilder.append(f);
    localStringBuilder.append(", networkConnectionInfo=");
    localStringBuilder.append(g);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends l.a
  {
    public Long a;
    public Integer b;
    public Long c;
    public byte[] d;
    public String e;
    public Long f;
    public o g;
    
    public l a()
    {
      Object localObject1 = a;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("");
        ((StringBuilder)localObject1).append(" eventTimeMs");
        localObject2 = ((StringBuilder)localObject1).toString();
      }
      localObject1 = localObject2;
      if (c == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" eventUptimeMs");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (f == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" timezoneOffsetSeconds");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      if (((String)localObject2).isEmpty()) {
        return new f(a.longValue(), b, c.longValue(), d, e, f.longValue(), g, null);
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Missing required properties:");
      ((StringBuilder)localObject1).append((String)localObject2);
      throw new IllegalStateException(((StringBuilder)localObject1).toString());
    }
    
    public l.a b(Integer paramInteger)
    {
      b = paramInteger;
      return this;
    }
    
    public l.a c(long paramLong)
    {
      a = Long.valueOf(paramLong);
      return this;
    }
    
    public l.a d(long paramLong)
    {
      c = Long.valueOf(paramLong);
      return this;
    }
    
    public l.a e(o paramo)
    {
      g = paramo;
      return this;
    }
    
    public l.a f(byte[] paramArrayOfByte)
    {
      d = paramArrayOfByte;
      return this;
    }
    
    public l.a g(String paramString)
    {
      e = paramString;
      return this;
    }
    
    public l.a h(long paramLong)
    {
      f = Long.valueOf(paramLong);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     e2.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */