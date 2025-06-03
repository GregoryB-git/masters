package z3;

import a0.j;
import android.text.TextUtils;
import v3.i0;
import x6.b;

public final class i
{
  public final String a;
  public final i0 b;
  public final i0 c;
  public final int d;
  public final int e;
  
  public i(String paramString, i0 parami01, i0 parami02, int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramInt1 != 0) && (paramInt2 != 0)) {
      bool = false;
    } else {
      bool = true;
    }
    b.q(bool);
    if (!TextUtils.isEmpty(paramString))
    {
      a = paramString;
      parami01.getClass();
      b = parami01;
      parami02.getClass();
      c = parami02;
      d = paramInt1;
      e = paramInt2;
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (i.class == paramObject.getClass()))
    {
      paramObject = (i)paramObject;
      if ((d != d) || (e != e) || (!a.equals(a)) || (!b.equals(b)) || (!c.equals(c))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = d;
    int j = e;
    j = j.e(a, ((i + 527) * 31 + j) * 31, 31);
    i = b.hashCode();
    return c.hashCode() + (i + j) * 31;
  }
}

/* Location:
 * Qualified Name:     z3.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */