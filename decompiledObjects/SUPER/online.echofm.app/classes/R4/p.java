package R4;

import kotlin.jvm.internal.Intrinsics;
import x1.j;

public final class p
{
  public final String a;
  public final String b;
  public final int c;
  public final long d;
  
  public p(String paramString1, String paramString2, int paramInt, long paramLong)
  {
    a = paramString1;
    b = paramString2;
    c = paramInt;
    d = paramLong;
  }
  
  public final String a()
  {
    return b;
  }
  
  public final String b()
  {
    return a;
  }
  
  public final int c()
  {
    return c;
  }
  
  public final long d()
  {
    return d;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof p)) {
      return false;
    }
    paramObject = (p)paramObject;
    if (!Intrinsics.a(a, a)) {
      return false;
    }
    if (!Intrinsics.a(b, b)) {
      return false;
    }
    if (c != c) {
      return false;
    }
    return d == d;
  }
  
  public int hashCode()
  {
    return ((a.hashCode() * 31 + b.hashCode()) * 31 + c) * 31 + j.a(d);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SessionDetails(sessionId=");
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
 * Qualified Name:     R4.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */