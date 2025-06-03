package a0;

import H.c;
import android.text.TextUtils;

public class m
  implements g
{
  public String a;
  public int b;
  public int c;
  
  public m(String paramString, int paramInt1, int paramInt2)
  {
    a = paramString;
    b = paramInt1;
    c = paramInt2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof m)) {
      return false;
    }
    paramObject = (m)paramObject;
    if ((b >= 0) && (b >= 0))
    {
      if ((!TextUtils.equals(a, a)) || (b != b) || (c != c)) {
        bool2 = false;
      }
      return bool2;
    }
    if ((TextUtils.equals(a, a)) && (c == c)) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    return bool2;
  }
  
  public int hashCode()
  {
    return c.b(new Object[] { a, Integer.valueOf(c) });
  }
}

/* Location:
 * Qualified Name:     a0.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */