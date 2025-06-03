package j3;

import f;
import java.util.Arrays;

public final class j
  extends t
{
  public final long a;
  public final Integer b;
  public final p c;
  public final long d;
  public final byte[] e;
  public final String f;
  public final long g;
  public final w h;
  public final q i;
  
  public j(long paramLong1, Integer paramInteger, p paramp, long paramLong2, byte[] paramArrayOfByte, String paramString, long paramLong3, w paramw, q paramq)
  {
    a = paramLong1;
    b = paramInteger;
    c = paramp;
    d = paramLong2;
    e = paramArrayOfByte;
    f = paramString;
    g = paramLong3;
    h = paramw;
    i = paramq;
  }
  
  public final p a()
  {
    return c;
  }
  
  public final Integer b()
  {
    return b;
  }
  
  public final long c()
  {
    return a;
  }
  
  public final long d()
  {
    return d;
  }
  
  public final q e()
  {
    return i;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof t))
    {
      Object localObject = (t)paramObject;
      if (a == ((t)localObject).c())
      {
        paramObject = b;
        if (paramObject == null ? ((t)localObject).b() == null : ((Integer)paramObject).equals(((t)localObject).b()))
        {
          paramObject = c;
          if ((paramObject == null ? ((t)localObject).a() == null : paramObject.equals(((t)localObject).a())) && (d == ((t)localObject).d()))
          {
            byte[] arrayOfByte = e;
            if ((localObject instanceof j)) {
              paramObject = e;
            } else {
              paramObject = ((t)localObject).g();
            }
            if (Arrays.equals(arrayOfByte, (byte[])paramObject))
            {
              paramObject = f;
              if ((paramObject == null ? ((t)localObject).h() == null : ((String)paramObject).equals(((t)localObject).h())) && (g == ((t)localObject).i()))
              {
                paramObject = h;
                if (paramObject == null ? ((t)localObject).f() == null : paramObject.equals(((t)localObject).f()))
                {
                  paramObject = i;
                  localObject = ((t)localObject).e();
                  if (paramObject == null ? localObject == null : paramObject.equals(localObject)) {
                    break label249;
                  }
                }
              }
            }
          }
        }
      }
      bool = false;
      label249:
      return bool;
    }
    return false;
  }
  
  public final w f()
  {
    return h;
  }
  
  public final byte[] g()
  {
    return e;
  }
  
  public final String h()
  {
    return f;
  }
  
  public final int hashCode()
  {
    long l = a;
    int j = (int)(l ^ l >>> 32);
    Object localObject = b;
    int k = 0;
    int m;
    if (localObject == null) {
      m = 0;
    } else {
      m = ((Integer)localObject).hashCode();
    }
    localObject = c;
    int n;
    if (localObject == null) {
      n = 0;
    } else {
      n = localObject.hashCode();
    }
    l = d;
    int i1 = (int)(l ^ l >>> 32);
    int i2 = Arrays.hashCode(e);
    localObject = f;
    int i3;
    if (localObject == null) {
      i3 = 0;
    } else {
      i3 = ((String)localObject).hashCode();
    }
    l = g;
    int i4 = (int)(l >>> 32 ^ l);
    localObject = h;
    int i5;
    if (localObject == null) {
      i5 = 0;
    } else {
      i5 = localObject.hashCode();
    }
    localObject = i;
    if (localObject != null) {
      k = localObject.hashCode();
    }
    return ((((((((j ^ 0xF4243) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ i3) * 1000003 ^ i4) * 1000003 ^ i5) * 1000003 ^ k;
  }
  
  public final long i()
  {
    return g;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("LogEvent{eventTimeMs=");
    localStringBuilder.append(a);
    localStringBuilder.append(", eventCode=");
    localStringBuilder.append(b);
    localStringBuilder.append(", complianceData=");
    localStringBuilder.append(c);
    localStringBuilder.append(", eventUptimeMs=");
    localStringBuilder.append(d);
    localStringBuilder.append(", sourceExtension=");
    localStringBuilder.append(Arrays.toString(e));
    localStringBuilder.append(", sourceExtensionJsonProto3=");
    localStringBuilder.append(f);
    localStringBuilder.append(", timezoneOffsetSeconds=");
    localStringBuilder.append(g);
    localStringBuilder.append(", networkConnectionInfo=");
    localStringBuilder.append(h);
    localStringBuilder.append(", experimentIds=");
    localStringBuilder.append(i);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class a
    extends t.a
  {
    public Long a;
    public Integer b;
    public p c;
    public Long d;
    public byte[] e;
    public String f;
    public Long g;
    public w h;
    public q i;
  }
}

/* Location:
 * Qualified Name:     j3.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */