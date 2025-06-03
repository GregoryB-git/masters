package a1;

import F0.s;
import F0.u;
import g0.a;
import g0.z;
import java.util.Arrays;

public final class e
{
  public final f a = new f();
  public final z b = new z(new byte[65025], 0);
  public int c = -1;
  public int d;
  public boolean e;
  
  public final int a(int paramInt)
  {
    int i = 0;
    d = 0;
    int j;
    int k;
    do
    {
      j = d;
      Object localObject = a;
      k = i;
      if (paramInt + j >= g) {
        break;
      }
      localObject = j;
      d = (j + 1);
      j = localObject[(j + paramInt)];
      k = i + j;
      i = k;
    } while (j == 255);
    return k;
  }
  
  public f b()
  {
    return a;
  }
  
  public z c()
  {
    return b;
  }
  
  public boolean d(s params)
  {
    boolean bool;
    if (params != null) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    if (e)
    {
      e = false;
      b.P(0);
    }
    while (!e)
    {
      Object localObject;
      if (c < 0) {
        if ((a.c(params)) && (a.a(params, true)))
        {
          localObject = a;
          i = h;
          if (((b & 0x1) == 1) && (b.g() == 0))
          {
            i += a(0);
            j = d;
          }
          else
          {
            j = 0;
          }
          if (!u.e(params, i)) {
            return false;
          }
          c = j;
        }
        else
        {
          return false;
        }
      }
      int i = a(c);
      int j = c + d;
      if (i > 0)
      {
        localObject = b;
        ((z)localObject).c(((z)localObject).g() + i);
        if (!u.d(params, b.e(), b.g(), i)) {
          return false;
        }
        localObject = b;
        ((z)localObject).S(((z)localObject).g() + i);
        if (a.j[(j - 1)] != 255) {
          bool = true;
        } else {
          bool = false;
        }
        e = bool;
      }
      i = j;
      if (j == a.g) {
        i = -1;
      }
      c = i;
    }
    return true;
  }
  
  public void e()
  {
    a.b();
    b.P(0);
    c = -1;
    e = false;
  }
  
  public void f()
  {
    if (b.e().length == 65025) {
      return;
    }
    z localz = b;
    localz.R(Arrays.copyOf(localz.e(), Math.max(65025, b.g())), b.g());
  }
}

/* Location:
 * Qualified Name:     a1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */