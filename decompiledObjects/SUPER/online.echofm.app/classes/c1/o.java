package c1;

import F0.H;
import F0.L;
import F0.T;
import F0.r;
import F0.s;
import a3.f;
import d0.A;
import d0.q;
import d0.q.b;
import g0.M;
import g0.a;
import g0.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class o
  implements r
{
  public final t a;
  public final d b;
  public final q c;
  public final List d;
  public final z e;
  public byte[] f;
  public T g;
  public int h;
  public int i;
  public long[] j;
  public long k;
  
  public o(t paramt, q paramq)
  {
    a = paramt;
    b = new d();
    f = M.f;
    e = new z();
    c = paramq.a().o0("application/x-media3-cues").O(n).S(paramt.d()).K();
    d = new ArrayList();
    i = 0;
    j = M.g;
    k = -9223372036854775807L;
  }
  
  public void a(long paramLong1, long paramLong2)
  {
    int m = i;
    boolean bool;
    if ((m != 0) && (m != 5)) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    k = paramLong2;
    if (i == 2) {
      i = 1;
    }
    if (i == 4) {
      i = 3;
    }
  }
  
  public void b(F0.t paramt)
  {
    boolean bool;
    if (i == 0) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    T localT = paramt.a(0, 3);
    g = localT;
    localT.d(c);
    paramt.j();
    paramt.e(new H(new long[] { 0L }, new long[] { 0L }, -9223372036854775807L));
    i = 1;
  }
  
  public boolean e(s params)
  {
    return true;
  }
  
  public final void h()
  {
    t.b localb2;
    for (;;)
    {
      try
      {
        long l = k;
        if (l != -9223372036854775807L) {
          t.b localb1 = t.b.c(l);
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        break;
      }
      localb2 = t.b.b();
    }
    t localt = a;
    byte[] arrayOfByte = f;
    int m = h;
    n localn = new c1/n;
    localn.<init>(this);
    localt.c(arrayOfByte, 0, m, localb2, localn);
    Collections.sort(d);
    j = new long[d.size()];
    for (m = 0; m < d.size(); m++) {
      j[m] = b.c((b)d.get(m));
    }
    f = M.f;
    return;
    throw A.a("SubtitleParser failed.", localb2);
  }
  
  public int i(s params, L paramL)
  {
    int m = i;
    boolean bool;
    if ((m != 0) && (m != 5)) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    if (i == 1)
    {
      if (params.a() != -1L) {
        m = f.d(params.a());
      } else {
        m = 1024;
      }
      if (m > f.length) {
        f = new byte[m];
      }
      h = 0;
      i = 2;
    }
    if ((i == 2) && (j(params)))
    {
      h();
      i = 4;
    }
    if ((i == 3) && (k(params)))
    {
      l();
      i = 4;
    }
    if (i == 4) {
      return -1;
    }
    return 0;
  }
  
  public final boolean j(s params)
  {
    byte[] arrayOfByte = f;
    if (arrayOfByte.length == h) {
      f = Arrays.copyOf(arrayOfByte, arrayOfByte.length + 1024);
    }
    arrayOfByte = f;
    int m = h;
    m = params.read(arrayOfByte, m, arrayOfByte.length - m);
    if (m != -1) {
      h += m;
    }
    long l = params.a();
    boolean bool;
    if (((l != -1L) && (h == l)) || (m == -1)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean k(s params)
  {
    int m;
    if (params.a() != -1L) {
      m = f.d(params.a());
    } else {
      m = 1024;
    }
    boolean bool;
    if (params.b(m) == -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void l()
  {
    long l = k;
    if (l == -9223372036854775807L) {
      m = 0;
    }
    for (int m = M.h(j, l, true, true); m < d.size(); m++) {
      m((b)d.get(m));
    }
  }
  
  public final void m(b paramb)
  {
    a.h(g);
    int m = b.e(paramb).length;
    e.Q(b.e(paramb));
    g.e(e, m);
    g.b(b.c(paramb), 1, m, 0, null);
  }
  
  public void release()
  {
    if (i == 5) {
      return;
    }
    a.b();
    i = 5;
  }
  
  public static class b
    implements Comparable
  {
    public final long o;
    public final byte[] p;
    
    public b(long paramLong, byte[] paramArrayOfByte)
    {
      o = paramLong;
      p = paramArrayOfByte;
    }
    
    public int h(b paramb)
    {
      return Long.compare(o, o);
    }
  }
}

/* Location:
 * Qualified Name:     c1.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */