package ea;

import a0.j;
import ec.i;
import f;
import java.util.ArrayList;
import java.util.List;

public final class a
{
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  public final s e;
  public final List<s> f;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, s params, ArrayList paramArrayList)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
    d = paramString4;
    e = params;
    f = paramArrayList;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
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
    if (!i.a(e, e)) {
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
    StringBuilder localStringBuilder = f.l("AndroidApplicationInfo(packageName=");
    localStringBuilder.append(a);
    localStringBuilder.append(", versionName=");
    localStringBuilder.append(b);
    localStringBuilder.append(", appBuildVersion=");
    localStringBuilder.append(c);
    localStringBuilder.append(", deviceManufacturer=");
    localStringBuilder.append(d);
    localStringBuilder.append(", currentProcessDetails=");
    localStringBuilder.append(e);
    localStringBuilder.append(", appProcessDetails=");
    localStringBuilder.append(f);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     ea.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */