package l1;

import F0.L;
import F0.M.b;
import F0.r;
import F0.s;
import F0.t;
import F0.x;
import g0.z;

public final class b
  implements r
{
  public static final x d = new a();
  public final c a = new c();
  public final z b = new z(2786);
  public boolean c;
  
  public void a(long paramLong1, long paramLong2)
  {
    c = false;
    a.b();
  }
  
  public void b(t paramt)
  {
    a.e(paramt, new K.d(0, 1));
    paramt.j();
    paramt.e(new M.b(-9223372036854775807L));
  }
  
  public boolean e(s params)
  {
    z localz = new z(10);
    int i = 0;
    for (;;)
    {
      params.n(localz.e(), 0, 10);
      localz.T(0);
      if (localz.J() != 4801587)
      {
        params.h();
        params.o(i);
        j = 0;
        int k = i;
        for (;;)
        {
          params.n(localz.e(), 0, 6);
          localz.T(0);
          if (localz.M() != 2935)
          {
            params.h();
            k++;
            if (k - i >= 8192) {
              return false;
            }
            params.o(k);
            j = 0;
          }
          else
          {
            j++;
            if (j >= 4) {
              return true;
            }
            int m = F0.b.g(localz.e());
            if (m == -1) {
              return false;
            }
            params.o(m - 6);
          }
        }
      }
      localz.U(3);
      int j = localz.F();
      i += j + 10;
      params.o(j);
    }
  }
  
  public int i(s params, L paramL)
  {
    int i = params.read(b.e(), 0, 2786);
    if (i == -1) {
      return -1;
    }
    b.T(0);
    b.S(i);
    if (!c)
    {
      a.d(0L, 4);
      c = true;
    }
    a.a(b);
    return 0;
  }
  
  public void release() {}
}

/* Location:
 * Qualified Name:     l1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */