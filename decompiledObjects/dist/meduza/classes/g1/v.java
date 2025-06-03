package g1;

import android.text.TextUtils;
import java.util.Objects;

public class v
{
  public String a;
  public int b;
  public int c;
  
  public v(String paramString, int paramInt1, int paramInt2)
  {
    a = paramString;
    b = paramInt1;
    c = paramInt2;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof v)) {
      return false;
    }
    paramObject = (v)paramObject;
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
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { a, Integer.valueOf(c) });
  }
}

/* Location:
 * Qualified Name:     g1.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */