package l1;

import F0.t;
import android.util.SparseArray;
import g0.y;
import g0.z;

public class J$a
  implements D
{
  public final y a = new y(new byte[4]);
  
  public J$a(J paramJ) {}
  
  public void a(z paramz)
  {
    if (paramz.G() != 0) {
      return;
    }
    if ((paramz.G() & 0x80) == 0) {
      return;
    }
    paramz.U(6);
    int i = paramz.a() / 4;
    for (int j = 0; j < i; j++)
    {
      paramz.k(a, 4);
      int k = a.h(16);
      a.r(3);
      if (k == 0)
      {
        a.r(13);
      }
      else
      {
        k = a.h(13);
        if (J.f(b).get(k) == null)
        {
          J.f(b).put(k, new E(new J.b(b, k)));
          J.m(b);
        }
      }
    }
    if (J.n(b) != 2) {
      J.f(b).remove(0);
    }
  }
  
  public void c(g0.E paramE, t paramt, K.d paramd) {}
}

/* Location:
 * Qualified Name:     l1.J.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */