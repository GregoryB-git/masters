package A0;

import d0.L;
import g0.M;
import g0.a;
import k0.b1;

public final class E
{
  public final int a;
  public final b1[] b;
  public final y[] c;
  public final L d;
  public final Object e;
  
  public E(b1[] paramArrayOfb1, y[] paramArrayOfy, L paramL, Object paramObject)
  {
    boolean bool;
    if (paramArrayOfb1.length == paramArrayOfy.length) {
      bool = true;
    } else {
      bool = false;
    }
    a.a(bool);
    b = paramArrayOfb1;
    c = ((y[])paramArrayOfy.clone());
    d = paramL;
    e = paramObject;
    a = paramArrayOfb1.length;
  }
  
  public boolean a(E paramE)
  {
    if ((paramE != null) && (c.length == c.length))
    {
      for (int i = 0; i < c.length; i++) {
        if (!b(paramE, i)) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public boolean b(E paramE, int paramInt)
  {
    boolean bool1 = false;
    if (paramE == null) {
      return false;
    }
    boolean bool2 = bool1;
    if (M.c(b[paramInt], b[paramInt]))
    {
      bool2 = bool1;
      if (M.c(c[paramInt], c[paramInt])) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public boolean c(int paramInt)
  {
    boolean bool;
    if (b[paramInt] != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     A0.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */