package ga;

import ec.i;
import f;

public final class g
{
  public final Boolean a;
  public final Double b;
  public final Integer c;
  public final Integer d;
  public final Long e;
  
  public g(Boolean paramBoolean, Double paramDouble, Integer paramInteger1, Integer paramInteger2, Long paramLong)
  {
    a = paramBoolean;
    b = paramDouble;
    c = paramInteger1;
    d = paramInteger2;
    e = paramLong;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof g)) {
      return false;
    }
    paramObject = (g)paramObject;
    if (!i.a(a, a)) {
      return false;
    }
    if (!i.a(b, b)) {
      return false;
    }
    if (!i.a(c, c)) {
      return false;
    }
    if (!i.a(d, d)) {
      return false;
    }
    return i.a(e, e);
  }
  
  public final int hashCode()
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
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("SessionConfigs(sessionEnabled=");
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
 * Qualified Name:     ga.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */