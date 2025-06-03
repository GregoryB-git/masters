package ea;

import a0.j;
import ec.i;
import f;

public final class b
{
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  public final r e;
  public final a f;
  
  public b(String paramString1, String paramString2, String paramString3, a parama)
  {
    a = paramString1;
    b = paramString2;
    c = "2.0.8";
    d = paramString3;
    e = localr;
    f = parama;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
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
    if (e != e) {
      return false;
    }
    return i.a(f, f);
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    i = j.e(b, i * 31, 31);
    i = j.e(c, i, 31);
    int j = j.e(d, i, 31);
    i = e.hashCode();
    return f.hashCode() + (i + j) * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("ApplicationInfo(appId=");
    localStringBuilder.append(a);
    localStringBuilder.append(", deviceModel=");
    localStringBuilder.append(b);
    localStringBuilder.append(", sessionSdkVersion=");
    localStringBuilder.append(c);
    localStringBuilder.append(", osVersion=");
    localStringBuilder.append(d);
    localStringBuilder.append(", logEnvironment=");
    localStringBuilder.append(e);
    localStringBuilder.append(", androidAppInfo=");
    localStringBuilder.append(f);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     ea.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */