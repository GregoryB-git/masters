package H0;

import F0.M.a;
import F0.N;
import F0.T;
import F0.s;
import g0.M;
import g0.a;
import java.util.Arrays;

public final class e
{
  public final T a;
  public final int b;
  public final int c;
  public final long d;
  public final int e;
  public int f;
  public int g;
  public int h;
  public int i;
  public int j;
  public long[] k;
  public int[] l;
  
  public e(int paramInt1, int paramInt2, long paramLong, int paramInt3, T paramT)
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (paramInt2 != 1) {
      if (paramInt2 == 2) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    a.a(bool2);
    d = paramLong;
    e = paramInt3;
    a = paramT;
    if (paramInt2 == 2) {
      paramInt3 = 1667497984;
    } else {
      paramInt3 = 1651965952;
    }
    b = d(paramInt1, paramInt3);
    if (paramInt2 == 2) {
      paramInt1 = d(paramInt1, 1650720768);
    } else {
      paramInt1 = -1;
    }
    c = paramInt1;
    k = new long['Ȁ'];
    l = new int['Ȁ'];
  }
  
  public static int d(int paramInt1, int paramInt2)
  {
    return paramInt1 % 10 + 48 << 8 | paramInt1 / 10 + 48 | paramInt2;
  }
  
  public void a()
  {
    h += 1;
  }
  
  public void b(long paramLong)
  {
    if (j == l.length)
    {
      localObject = k;
      k = Arrays.copyOf((long[])localObject, localObject.length * 3 / 2);
      localObject = l;
      l = Arrays.copyOf((int[])localObject, localObject.length * 3 / 2);
    }
    Object localObject = k;
    int m = j;
    localObject[m] = paramLong;
    l[m] = i;
    j = (m + 1);
  }
  
  public void c()
  {
    k = Arrays.copyOf(k, j);
    l = Arrays.copyOf(l, j);
  }
  
  public final long e(int paramInt)
  {
    return d * paramInt / e;
  }
  
  public long f()
  {
    return e(h);
  }
  
  public long g()
  {
    return e(1);
  }
  
  public final N h(int paramInt)
  {
    return new N(l[paramInt] * g(), k[paramInt]);
  }
  
  public M.a i(long paramLong)
  {
    int m = (int)(paramLong / g());
    int n = M.g(l, m, true, true);
    if (l[n] == m) {
      return new M.a(h(n));
    }
    N localN = h(n);
    m = n + 1;
    if (m < k.length) {
      return new M.a(localN, h(m));
    }
    return new M.a(localN);
  }
  
  public boolean j(int paramInt)
  {
    boolean bool;
    if ((b != paramInt) && (c != paramInt)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void k()
  {
    i += 1;
  }
  
  public boolean l()
  {
    boolean bool;
    if (Arrays.binarySearch(l, h) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean m(s params)
  {
    int m = g;
    T localT = a;
    boolean bool = false;
    m -= localT.f(params, m, false);
    g = m;
    if (m == 0) {
      bool = true;
    }
    if (bool)
    {
      if (f > 0) {
        a.b(f(), l(), f, 0, null);
      }
      a();
    }
    return bool;
  }
  
  public void n(int paramInt)
  {
    f = paramInt;
    g = paramInt;
  }
  
  public void o(long paramLong)
  {
    if (j == 0) {}
    for (int m = 0;; m = l[m])
    {
      h = m;
      break;
      m = M.h(k, paramLong, true, true);
    }
  }
}

/* Location:
 * Qualified Name:     H0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */