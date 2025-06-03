package x0;

import B0.n.e;
import F0.L;
import F0.T;
import F0.t;
import S0.b;
import android.net.Uri;
import android.os.Handler;
import d0.i;
import g0.a;
import g0.f;
import g0.z;
import i0.g;
import i0.j;
import i0.k;
import i0.k.b;
import i0.x;
import java.io.InterruptedIOException;
import java.util.Map;

public final class K$b
  implements n.e, q.a
{
  public final long a;
  public final Uri b;
  public final x c;
  public final F d;
  public final t e;
  public final f f;
  public final L g;
  public volatile boolean h;
  public boolean i;
  public long j;
  public k k;
  public T l;
  public boolean m;
  
  public K$b(K paramK, Uri paramUri, g paramg, F paramF, t paramt, f paramf)
  {
    b = paramUri;
    c = new x(paramg);
    d = paramF;
    e = paramt;
    f = paramf;
    g = new L();
    i = true;
    a = r.a();
    k = i(0L);
  }
  
  public void a(z paramz)
  {
    if (!m) {}
    for (long l1 = j;; l1 = Math.max(K.C(n, true), j)) {
      break;
    }
    int i1 = paramz.a();
    T localT = (T)a.e(l);
    localT.e(paramz, i1);
    localT.b(l1, 1, i1, 0, null);
    m = true;
  }
  
  public void b()
  {
    int i1 = 0;
    while ((i1 == 0) && (!h))
    {
      int i2 = i1;
      long l1;
      boolean bool;
      try
      {
        l1 = g.a;
        i2 = i1;
        k localk = i(l1);
        i2 = i1;
        k = localk;
        i2 = i1;
        l2 = c.e(localk);
        i2 = i1;
        bool = h;
        if (bool)
        {
          if ((i1 != 1) && (d.d() != -1L)) {
            g.a = d.d();
          }
          j.a(c);
          break;
        }
        l3 = l2;
        if (l2 != -1L)
        {
          l3 = l2 + l1;
          i2 = i1;
          K.G(n);
        }
      }
      finally
      {
        break label604;
      }
      i2 = i1;
      K.I(n, b.a(c.g()));
      i2 = i1;
      Object localObject3 = c;
      i2 = i1;
      Object localObject2 = localObject3;
      if (K.H(n) != null)
      {
        i2 = i1;
        localObject2 = localObject3;
        if (Hn).t != -1)
        {
          i2 = i1;
          localObject2 = new x0/q;
          i2 = i1;
          ((q)localObject2).<init>(c, Hn).t, this);
          i2 = i1;
          localObject3 = n.P();
          i2 = i1;
          l = ((T)localObject3);
          i2 = i1;
          ((T)localObject3).d(K.J());
        }
      }
      i2 = i1;
      F localF = d;
      i2 = i1;
      Uri localUri = b;
      i2 = i1;
      Map localMap = c.g();
      i2 = i1;
      localObject3 = e;
      long l2 = l1;
      i2 = i1;
      localF.b((i)localObject2, localUri, localMap, l1, l3, (t)localObject3);
      i2 = i1;
      if (K.H(n) != null)
      {
        i2 = i1;
        d.e();
      }
      i2 = i1;
      int i3 = i1;
      long l3 = l2;
      if (i)
      {
        i2 = i1;
        d.a(l2, j);
        i2 = i1;
        i = false;
        l3 = l2;
        i3 = i1;
      }
      label407:
      InterruptedIOException localInterruptedIOException;
      for (;;)
      {
        i1 = i3;
        if (i1 == 0)
        {
          i2 = i1;
          bool = h;
          if (!bool)
          {
            i2 = i1;
            try
            {
              f.a();
              i2 = i1;
              i3 = d.c(g);
              i2 = i3;
              l2 = d.d();
              i2 = i3;
              i1 = i3;
              if (l2 <= K.z(n) + l3) {
                break label407;
              }
              i2 = i3;
              f.c();
              i2 = i3;
              K.B(n).post(K.A(n));
              l3 = l2;
            }
            catch (InterruptedException localInterruptedException)
            {
              i2 = i1;
              localInterruptedIOException = new java/io/InterruptedIOException;
              i2 = i1;
              localInterruptedIOException.<init>();
              i2 = i1;
              throw localInterruptedIOException;
            }
          }
        }
      }
      if (i1 == 1)
      {
        i2 = 0;
      }
      else
      {
        i2 = i1;
        if (d.d() != -1L)
        {
          g.a = d.d();
          i2 = i1;
        }
      }
      j.a(c);
      i1 = i2;
      continue;
      label604:
      if ((i2 != 1) && (d.d() != -1L)) {
        g.a = d.d();
      }
      j.a(c);
      throw localInterruptedIOException;
    }
  }
  
  public void c()
  {
    h = true;
  }
  
  public final k i(long paramLong)
  {
    return new k.b().i(b).h(paramLong).f(K.E(n)).b(6).e(K.D()).a();
  }
  
  public final void j(long paramLong1, long paramLong2)
  {
    g.a = paramLong1;
    j = paramLong2;
    i = true;
    m = false;
  }
}

/* Location:
 * Qualified Name:     x0.K.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */