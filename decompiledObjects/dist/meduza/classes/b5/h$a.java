package b5;

import l3.l;
import z3.g;
import z4.b0;
import z4.c0;
import z4.w.a;

public final class h$a
  implements c0
{
  public final h<T> a;
  public final b0 b;
  public final int c;
  public boolean d;
  
  public h$a(h<T> paramh, b0 paramb0, int paramInt)
  {
    a = paramb0;
    b = paramInt;
    int i;
    c = i;
  }
  
  public final void a() {}
  
  public final boolean b()
  {
    boolean bool;
    if ((!e.x()) && (b.q(e.E))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void c()
  {
    if (!d)
    {
      h localh = e;
      w.a locala = o;
      int[] arrayOfInt = b;
      int i = c;
      locala.b(arrayOfInt[i], c[i], 0, null, B);
      d = true;
    }
  }
  
  public final int m(long paramLong)
  {
    if (e.x()) {
      return 0;
    }
    int i = b.o(paramLong, e.E);
    Object localObject = e.D;
    int j = i;
    if (localObject != null)
    {
      j = ((a)localObject).e(c + 1);
      localObject = b;
      j = Math.min(i, j - (q + s));
    }
    b.y(j);
    if (j > 0) {
      c();
    }
    return j;
  }
  
  public final int r(l paraml, g paramg, int paramInt)
  {
    if (e.x()) {
      return -3;
    }
    Object localObject = e.D;
    if (localObject != null)
    {
      int i = ((a)localObject).e(c + 1);
      localObject = b;
      if (i <= q + s) {
        return -3;
      }
    }
    c();
    return b.u(paraml, paramg, paramInt, e.E);
  }
}

/* Location:
 * Qualified Name:     b5.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */