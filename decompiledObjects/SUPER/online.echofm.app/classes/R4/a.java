package R4;

import kotlin.jvm.internal.Intrinsics;

public final class a
{
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
    d = paramString4;
  }
  
  public final String a()
  {
    return c;
  }
  
  public final String b()
  {
    return d;
  }
  
  public final String c()
  {
    return a;
  }
  
  public final String d()
  {
    return b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    if (!Intrinsics.a(a, a)) {
      return false;
    }
    if (!Intrinsics.a(b, b)) {
      return false;
    }
    if (!Intrinsics.a(c, c)) {
      return false;
    }
    return Intrinsics.a(d, d);
  }
  
  public int hashCode()
  {
    return ((a.hashCode() * 31 + b.hashCode()) * 31 + c.hashCode()) * 31 + d.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AndroidApplicationInfo(packageName=");
    localStringBuilder.append(a);
    localStringBuilder.append(", versionName=");
    localStringBuilder.append(b);
    localStringBuilder.append(", appBuildVersion=");
    localStringBuilder.append(c);
    localStringBuilder.append(", deviceManufacturer=");
    localStringBuilder.append(d);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     R4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */