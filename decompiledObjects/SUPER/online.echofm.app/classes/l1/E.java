package l1;

import F0.t;
import g0.M;
import g0.z;

public final class E
  implements K
{
  public final D a;
  public final z b;
  public int c;
  public int d;
  public boolean e;
  public boolean f;
  
  public E(D paramD)
  {
    a = paramD;
    b = new z(32);
  }
  
  public void a(z paramz, int paramInt)
  {
    if ((paramInt & 0x1) != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    int i;
    if (paramInt != 0)
    {
      i = paramz.G();
      i = paramz.f() + i;
    }
    else
    {
      i = -1;
    }
    if (f)
    {
      if (paramInt == 0) {
        return;
      }
      f = false;
      paramz.T(i);
    }
    for (;;)
    {
      d = 0;
      do
      {
        for (;;)
        {
          if (paramz.a() <= 0) {
            return;
          }
          paramInt = d;
          if (paramInt >= 3) {
            break;
          }
          if (paramInt == 0)
          {
            paramInt = paramz.G();
            paramz.T(paramz.f() - 1);
            if (paramInt == 255)
            {
              f = true;
              return;
            }
          }
          paramInt = Math.min(paramz.a(), 3 - d);
          paramz.l(b.e(), d, paramInt);
          paramInt = d + paramInt;
          d = paramInt;
          if (paramInt == 3)
          {
            b.T(0);
            b.S(3);
            b.U(1);
            i = b.G();
            paramInt = b.G();
            boolean bool;
            if ((i & 0x80) != 0) {
              bool = true;
            } else {
              bool = false;
            }
            e = bool;
            c = (((i & 0xF) << 8 | paramInt) + 3);
            i = b.b();
            paramInt = c;
            if (i < paramInt)
            {
              paramInt = Math.min(4098, Math.max(paramInt, b.b() * 2));
              b.c(paramInt);
            }
          }
        }
        paramInt = Math.min(paramz.a(), c - d);
        paramz.l(b.e(), d, paramInt);
        paramInt = d + paramInt;
        d = paramInt;
        i = c;
      } while (paramInt != i);
      if (e)
      {
        if (M.x(b.e(), 0, c, -1) != 0)
        {
          f = true;
          return;
        }
        b.S(c - 4);
      }
      else
      {
        b.S(i);
      }
      b.T(0);
      a.a(b);
    }
  }
  
  public void b()
  {
    f = true;
  }
  
  public void c(g0.E paramE, t paramt, K.d paramd)
  {
    a.c(paramE, paramt, paramd);
    f = true;
  }
}

/* Location:
 * Qualified Name:     l1.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */