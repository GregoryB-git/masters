package R4;

import kotlin.jvm.internal.Intrinsics;

public final class b
{
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  public final n e;
  public final a f;
  
  public b(String paramString1, String paramString2, String paramString3, String paramString4, n paramn, a parama)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
    d = paramString4;
    e = paramn;
    f = parama;
  }
  
  public final a a()
  {
    return f;
  }
  
  public final String b()
  {
    return a;
  }
  
  public final String c()
  {
    return b;
  }
  
  public final n d()
  {
    return e;
  }
  
  public final String e()
  {
    return d;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
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
    if (e != e) {
      return false;
    }
    return Intrinsics.a(f, f);
  }
  
  public final String f()
  {
    return c;
  }
  
  public int hashCode()
  {
    return ((((a.hashCode() * 31 + b.hashCode()) * 31 + c.hashCode()) * 31 + d.hashCode()) * 31 + e.hashCode()) * 31 + f.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ApplicationInfo(appId=");
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
 * Qualified Name:     R4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */