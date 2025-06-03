package j8;

import ec.i;
import f;

public final class z
{
  public final String a;
  public final String b;
  
  public z(String paramString1, String paramString2)
  {
    a = paramString1;
    b = paramString2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof z)) {
      return false;
    }
    paramObject = (z)paramObject;
    if (!i.a(a, a)) {
      return false;
    }
    return i.a(b, b);
  }
  
  public final int hashCode()
  {
    String str = a;
    int i = 0;
    int j;
    if (str == null) {
      j = 0;
    } else {
      j = str.hashCode();
    }
    str = b;
    if (str != null) {
      i = str.hashCode();
    }
    return j * 31 + i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("FirebaseInstallationId(fid=");
    localStringBuilder.append(a);
    localStringBuilder.append(", authToken=");
    localStringBuilder.append(b);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     j8.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */