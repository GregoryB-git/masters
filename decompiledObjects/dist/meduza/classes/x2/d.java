package x2;

import ec.i;
import f;

public final class d
{
  public final String a;
  public final Long b;
  
  public d(String paramString, Long paramLong)
  {
    a = paramString;
    b = paramLong;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof d)) {
      return false;
    }
    paramObject = (d)paramObject;
    if (!i.a(a, a)) {
      return false;
    }
    return i.a(b, b);
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    Long localLong = b;
    int j;
    if (localLong == null) {
      j = 0;
    } else {
      j = localLong.hashCode();
    }
    return i * 31 + j;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Preference(key=");
    localStringBuilder.append(a);
    localStringBuilder.append(", value=");
    localStringBuilder.append(b);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     x2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */