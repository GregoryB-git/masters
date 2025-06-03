package T4;

import kotlin.jvm.internal.Intrinsics;

public final class e
{
  public final Boolean a;
  public final Double b;
  public final Integer c;
  public final Integer d;
  public final Long e;
  
  public e(Boolean paramBoolean, Double paramDouble, Integer paramInteger1, Integer paramInteger2, Long paramLong)
  {
    a = paramBoolean;
    b = paramDouble;
    c = paramInteger1;
    d = paramInteger2;
    e = paramLong;
  }
  
  public final Integer a()
  {
    return d;
  }
  
  public final Long b()
  {
    return e;
  }
  
  public final Boolean c()
  {
    return a;
  }
  
  public final Integer d()
  {
    return c;
  }
  
  public final Double e()
  {
    return b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof e)) {
      return false;
    }
    paramObject = (e)paramObject;
    if (!Intrinsics.a(a, a)) {
      return false;
    }
    if (!Intrinsics.a(b, b)) {
      return false;
    }
    if (!Intrinsics.a(c, c)) {
      return false;
    }
    if (!Intrinsics.a(d, d)) {
      return false;
    }
    return Intrinsics.a(e, e);
  }
  
  public int hashCode()
  {
    Object localObject = a;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = localObject.hashCode();
    }
    localObject = b;
    int k;
    if (localObject == null) {
      k = 0;
    } else {
      k = localObject.hashCode();
    }
    localObject = c;
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
      n = localObject.hashCode();
    }
    localObject = e;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return (((j * 31 + k) * 31 + m) * 31 + n) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SessionConfigs(sessionEnabled=");
    localStringBuilder.append(a);
    localStringBuilder.append(", sessionSamplingRate=");
    localStringBuilder.append(b);
    localStringBuilder.append(", sessionRestartTimeout=");
    localStringBuilder.append(c);
    localStringBuilder.append(", cacheDuration=");
    localStringBuilder.append(d);
    localStringBuilder.append(", cacheUpdatedTime=");
    localStringBuilder.append(e);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     T4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */