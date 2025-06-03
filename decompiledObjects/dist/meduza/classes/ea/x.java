package ea;

import a0.j;
import ec.i;
import f;

public final class x
{
  public final String a;
  public final String b;
  public final int c;
  public final long d;
  
  public x(String paramString1, String paramString2, int paramInt, long paramLong)
  {
    a = paramString1;
    b = paramString2;
    c = paramInt;
    d = paramLong;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof x)) {
      return false;
    }
    paramObject = (x)paramObject;
    if (!i.a(a, a)) {
      return false;
    }
    if (!i.a(b, b)) {
      return false;
    }
    if (c != c) {
      return false;
    }
    return d == d;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = j.e(b, i * 31, 31);
    i = c;
    long l = d;
    return (j + i) * 31 + (int)(l ^ l >>> 32);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("SessionDetails(sessionId=");
    localStringBuilder.append(a);
    localStringBuilder.append(", firstSessionId=");
    localStringBuilder.append(b);
    localStringBuilder.append(", sessionIndex=");
    localStringBuilder.append(c);
    localStringBuilder.append(", sessionStartTimestampUs=");
    localStringBuilder.append(d);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     ea.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */