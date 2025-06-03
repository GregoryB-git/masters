package l1;

import F0.T;
import F0.t;
import d0.q.b;
import g0.a;
import g0.z;
import java.util.Collections;
import java.util.List;

public final class l
  implements m
{
  public final List a;
  public final T[] b;
  public boolean c;
  public int d;
  public int e;
  public long f;
  
  public l(List paramList)
  {
    a = paramList;
    b = new T[paramList.size()];
    f = -9223372036854775807L;
  }
  
  public void a(z paramz)
  {
    if (c)
    {
      if ((d == 2) && (!f(paramz, 32))) {
        return;
      }
      int i = d;
      int j = 0;
      if ((i == 1) && (!f(paramz, 0))) {
        return;
      }
      int k = paramz.f();
      i = paramz.a();
      T[] arrayOfT = b;
      int m = arrayOfT.length;
      while (j < m)
      {
        T localT = arrayOfT[j];
        paramz.T(k);
        localT.e(paramz, i);
        j++;
      }
      e += i;
    }
  }
  
  public void b()
  {
    c = false;
    f = -9223372036854775807L;
  }
  
  public void c(boolean paramBoolean)
  {
    if (c)
    {
      if (f != -9223372036854775807L) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      }
      a.f(paramBoolean);
      T[] arrayOfT = b;
      int i = arrayOfT.length;
      for (int j = 0; j < i; j++) {
        arrayOfT[j].b(f, 1, e, 0, null);
      }
      c = false;
    }
  }
  
  public void d(long paramLong, int paramInt)
  {
    if ((paramInt & 0x4) == 0) {
      return;
    }
    c = true;
    f = paramLong;
    e = 0;
    d = 2;
  }
  
  public void e(t paramt, K.d paramd)
  {
    for (int i = 0; i < b.length; i++)
    {
      K.a locala = (K.a)a.get(i);
      paramd.a();
      T localT = paramt.a(paramd.c(), 3);
      localT.d(new q.b().a0(paramd.b()).o0("application/dvbsubs").b0(Collections.singletonList(c)).e0(a).K());
      b[i] = localT;
    }
  }
  
  public final boolean f(z paramz, int paramInt)
  {
    if (paramz.a() == 0) {
      return false;
    }
    if (paramz.G() != paramInt) {
      c = false;
    }
    d -= 1;
    return c;
  }
}

/* Location:
 * Qualified Name:     l1.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */