package R4;

import kotlin.jvm.internal.Intrinsics;
import x1.j;

public final class t
{
  public final String a;
  public final String b;
  public final int c;
  public long d;
  public f e;
  public String f;
  
  public t(String paramString1, String paramString2, int paramInt, long paramLong, f paramf, String paramString3)
  {
    a = paramString1;
    b = paramString2;
    c = paramInt;
    d = paramLong;
    e = paramf;
    f = paramString3;
  }
  
  public final f a()
  {
    return e;
  }
  
  public final long b()
  {
    return d;
  }
  
  public final String c()
  {
    return f;
  }
  
  public final String d()
  {
    return b;
  }
  
  public final String e()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof t)) {
      return false;
    }
    paramObject = (t)paramObject;
    if (!Intrinsics.a(a, a)) {
      return false;
    }
    if (!Intrinsics.a(b, b)) {
      return false;
    }
    if (c != c) {
      return false;
    }
    if (d != d) {
      return false;
    }
    if (!Intrinsics.a(e, e)) {
      return false;
    }
    return Intrinsics.a(f, f);
  }
  
  public final int f()
  {
    return c;
  }
  
  public final void g(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "<set-?>");
    f = paramString;
  }
  
  public int hashCode()
  {
    return ((((a.hashCode() * 31 + b.hashCode()) * 31 + c) * 31 + j.a(d)) * 31 + e.hashCode()) * 31 + f.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SessionInfo(sessionId=");
    localStringBuilder.append(a);
    localStringBuilder.append(", firstSessionId=");
    localStringBuilder.append(b);
    localStringBuilder.append(", sessionIndex=");
    localStringBuilder.append(c);
    localStringBuilder.append(", eventTimestampUs=");
    localStringBuilder.append(d);
    localStringBuilder.append(", dataCollectionStatus=");
    localStringBuilder.append(e);
    localStringBuilder.append(", firebaseInstallationId=");
    localStringBuilder.append(f);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     R4.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */