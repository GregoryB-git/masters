package m4;

import c4.v;
import java.util.Collections;
import java.util.List;
import v3.i0;
import v3.i0.a;
import v5.u;

public final class i
  implements j
{
  public final List<d0.a> a;
  public final v[] b;
  public boolean c;
  public int d;
  public int e;
  public long f;
  
  public i(List<d0.a> paramList)
  {
    a = paramList;
    b = new v[paramList.size()];
    f = -9223372036854775807L;
  }
  
  public final void a(u paramu)
  {
    if (c)
    {
      int i = d;
      int j = 0;
      boolean bool;
      if (i == 2)
      {
        if (c - b == 0)
        {
          bool = false;
        }
        else
        {
          if (paramu.v() != 32) {
            c = false;
          }
          d -= 1;
          bool = c;
        }
        if (!bool) {
          return;
        }
      }
      if (d == 1)
      {
        if (c - b == 0)
        {
          bool = false;
        }
        else
        {
          if (paramu.v() != 0) {
            c = false;
          }
          d -= 1;
          bool = c;
        }
        if (!bool) {
          return;
        }
      }
      int k = b;
      i = c - k;
      v[] arrayOfv = b;
      int m = arrayOfv.length;
      while (j < m)
      {
        v localv = arrayOfv[j];
        paramu.G(k);
        localv.b(i, paramu);
        j++;
      }
      e += i;
    }
  }
  
  public final void b()
  {
    c = false;
    f = -9223372036854775807L;
  }
  
  public final void c()
  {
    if (c)
    {
      if (f != -9223372036854775807L)
      {
        v[] arrayOfv = b;
        int i = arrayOfv.length;
        for (int j = 0; j < i; j++) {
          arrayOfv[j].c(f, 1, e, 0, null);
        }
      }
      c = false;
    }
  }
  
  public final void d(int paramInt, long paramLong)
  {
    if ((paramInt & 0x4) == 0) {
      return;
    }
    c = true;
    if (paramLong != -9223372036854775807L) {
      f = paramLong;
    }
    e = 0;
    d = 2;
  }
  
  public final void e(c4.j paramj, d0.d paramd)
  {
    for (int i = 0; i < b.length; i++)
    {
      d0.a locala = (d0.a)a.get(i);
      paramd.a();
      paramd.b();
      v localv = paramj.r(d, 3);
      i0.a locala1 = new i0.a();
      paramd.b();
      a = e;
      k = "application/dvbsubs";
      m = Collections.singletonList(b);
      c = a;
      localv.d(new i0(locala1));
      b[i] = localv;
    }
  }
}

/* Location:
 * Qualified Name:     m4.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */