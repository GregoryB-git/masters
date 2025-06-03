package k0;

import g0.a;

public final class t0$e
{
  public boolean a;
  public U0 b;
  public int c;
  public boolean d;
  public int e;
  
  public t0$e(U0 paramU0)
  {
    b = paramU0;
  }
  
  public void b(int paramInt)
  {
    boolean bool1 = a;
    boolean bool2;
    if (paramInt > 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    a = (bool1 | bool2);
    c += paramInt;
  }
  
  public void c(U0 paramU0)
  {
    boolean bool1 = a;
    boolean bool2;
    if (b != paramU0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    a = (bool1 | bool2);
    b = paramU0;
  }
  
  public void d(int paramInt)
  {
    boolean bool1 = d;
    boolean bool2 = true;
    if ((bool1) && (e != 5))
    {
      if (paramInt != 5) {
        bool2 = false;
      }
      a.a(bool2);
      return;
    }
    a = true;
    d = true;
    e = paramInt;
  }
}

/* Location:
 * Qualified Name:     k0.t0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */