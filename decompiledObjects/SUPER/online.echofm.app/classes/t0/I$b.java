package t0;

import android.text.TextUtils;

public final class I$b
{
  public final String a;
  public final boolean b;
  public final boolean c;
  
  public I$b(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramString;
    b = paramBoolean1;
    c = paramBoolean2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (paramObject.getClass() == b.class))
    {
      paramObject = (b)paramObject;
      if ((!TextUtils.equals(a, a)) || (b != b) || (c != c)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = a.hashCode();
    boolean bool = b;
    int j = 1237;
    int k;
    if (bool) {
      k = 1231;
    } else {
      k = 1237;
    }
    if (c) {
      j = 1231;
    }
    return ((i + 31) * 31 + k) * 31 + j;
  }
}

/* Location:
 * Qualified Name:     t0.I.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */