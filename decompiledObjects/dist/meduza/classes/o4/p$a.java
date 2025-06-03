package o4;

import a0.j;
import android.text.TextUtils;

public final class p$a
{
  public final String a;
  public final boolean b;
  public final boolean c;
  
  public p$a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramString;
    b = paramBoolean1;
    c = paramBoolean2;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (paramObject.getClass() == a.class))
    {
      paramObject = (a)paramObject;
      if ((!TextUtils.equals(a, a)) || (b != b) || (c != c)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = j.e(a, 31, 31);
    boolean bool = b;
    int j = 1231;
    int k;
    if (bool) {
      k = 1231;
    } else {
      k = 1237;
    }
    if (!c) {
      j = 1237;
    }
    return (i + k) * 31 + j;
  }
}

/* Location:
 * Qualified Name:     o4.p.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */