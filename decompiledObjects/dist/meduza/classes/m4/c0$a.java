package m4;

import android.util.SparseArray;
import c4.j;
import v5.t;
import v5.u;

public final class c0$a
  implements x
{
  public final t a = new t(new byte[4], 4);
  
  public c0$a(c0 paramc0) {}
  
  public final void a(u paramu)
  {
    if (paramu.v() != 0) {
      return;
    }
    if ((paramu.v() & 0x80) == 0) {
      return;
    }
    paramu.H(6);
    int i = (c - b) / 4;
    for (int j = 0; j < i; j++)
    {
      Object localObject = a;
      paramu.d(a, 0, 4);
      ((t)localObject).k(0);
      int k = a.g(16);
      a.m(3);
      if (k == 0)
      {
        a.m(13);
      }
      else
      {
        k = a.g(13);
        if (b.f.get(k) == null)
        {
          localObject = b;
          f.put(k, new y(new c0.b((c0)localObject, k)));
          localObject = b;
          l += 1;
        }
      }
    }
    paramu = b;
    if (a != 2) {
      f.remove(0);
    }
  }
  
  public final void c(v5.c0 paramc0, j paramj, d0.d paramd) {}
}

/* Location:
 * Qualified Name:     m4.c0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */