package ea;

import ec.i;
import f;

public final class f0
{
  public final String a;
  public final String b;
  public final int c;
  public final long d;
  public final j e;
  public final String f;
  public final String g;
  
  public f0(String paramString1, String paramString2, int paramInt, long paramLong, j paramj, String paramString3, String paramString4)
  {
    a = paramString1;
    b = paramString2;
    c = paramInt;
    d = paramLong;
    e = paramj;
    f = paramString3;
    g = paramString4;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof f0)) {
      return false;
    }
    paramObject = (f0)paramObject;
    if (!i.a(a, a)) {
      return false;
    }
    if (!i.a(b, b)) {
      return false;
    }
    if (c != c) {
      return false;
    }
    if (d != d) {
      return false;
    }
    if (!i.a(e, e)) {
      return false;
    }
    if (!i.a(f, f)) {
      return false;
    }
    return i.a(g, g);
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = a0.j.e(b, i * 31, 31);
    i = c;
    long l = d;
    int k = (int)(l ^ l >>> 32);
    int m = e.hashCode();
    i = a0.j.e(f, (m + ((j + i) * 31 + k) * 31) * 31, 31);
    return g.hashCode() + i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("SessionInfo(sessionId=");
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
    localStringBuilder.append(", firebaseAuthenticationToken=");
    localStringBuilder.append(g);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     ea.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */