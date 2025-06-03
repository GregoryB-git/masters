package c1;

import F0.T;
import F0.T.a;
import d0.i;
import d0.q;
import d0.q.b;
import g0.M;
import g0.a;
import java.io.EOFException;

public final class x
  implements T
{
  public final T a;
  public final t.a b;
  public final d c;
  public final g0.z d;
  public int e;
  public int f;
  public byte[] g;
  public t h;
  public q i;
  
  public x(T paramT, t.a parama)
  {
    a = paramT;
    b = parama;
    c = new d();
    e = 0;
    f = 0;
    g = M.f;
    d = new g0.z();
  }
  
  public void a(g0.z paramz, int paramInt1, int paramInt2)
  {
    if (h == null)
    {
      a.a(paramz, paramInt1, paramInt2);
      return;
    }
    h(paramInt1);
    paramz.l(g, f, paramInt1);
    f += paramInt1;
  }
  
  public void b(long paramLong, int paramInt1, int paramInt2, int paramInt3, T.a parama)
  {
    if (h == null)
    {
      a.b(paramLong, paramInt1, paramInt2, paramInt3, parama);
      return;
    }
    boolean bool;
    if (parama == null) {
      bool = true;
    } else {
      bool = false;
    }
    a.b(bool, "DRM on subtitles is not supported");
    paramInt3 = f - paramInt3 - paramInt2;
    h.c(g, paramInt3, paramInt2, t.b.b(), new w(this, paramLong, paramInt1));
    paramInt1 = paramInt3 + paramInt2;
    e = paramInt1;
    if (paramInt1 == f)
    {
      e = 0;
      f = 0;
    }
  }
  
  public int c(i parami, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    if (h == null) {
      return a.c(parami, paramInt1, paramBoolean, paramInt2);
    }
    h(paramInt1);
    paramInt1 = parami.read(g, f, paramInt1);
    if (paramInt1 == -1)
    {
      if (paramBoolean) {
        return -1;
      }
      throw new EOFException();
    }
    f += paramInt1;
    return paramInt1;
  }
  
  public void d(q paramq)
  {
    a.e(n);
    boolean bool;
    if (d0.z.k(n) == 3) {
      bool = true;
    } else {
      bool = false;
    }
    a.a(bool);
    Object localObject;
    if (!paramq.equals(i))
    {
      i = paramq;
      if (b.a(paramq)) {
        localObject = b.b(paramq);
      } else {
        localObject = null;
      }
      h = ((t)localObject);
    }
    if (h == null) {
      localObject = a;
    }
    for (;;)
    {
      ((T)localObject).d(paramq);
      break;
      localObject = a;
      paramq = paramq.a().o0("application/x-media3-cues").O(n).s0(Long.MAX_VALUE).S(b.c(paramq)).K();
    }
  }
  
  public final void h(int paramInt)
  {
    int j = g.length;
    int k = f;
    if (j - k >= paramInt) {
      return;
    }
    j = k - e;
    paramInt = Math.max(j * 2, paramInt + j);
    byte[] arrayOfByte1 = g;
    byte[] arrayOfByte2;
    if (paramInt <= arrayOfByte1.length) {
      arrayOfByte2 = arrayOfByte1;
    } else {
      arrayOfByte2 = new byte[paramInt];
    }
    System.arraycopy(arrayOfByte1, e, arrayOfByte2, 0, j);
    e = 0;
    f = j;
    g = arrayOfByte2;
  }
  
  public final void j(e parame, long paramLong, int paramInt)
  {
    a.h(i);
    byte[] arrayOfByte = c.a(a, c);
    d.Q(arrayOfByte);
    a.e(d, arrayOfByte.length);
    long l1 = b;
    if (l1 == -9223372036854775807L)
    {
      boolean bool;
      if (i.s == Long.MAX_VALUE) {
        bool = true;
      } else {
        bool = false;
      }
      a.f(bool);
    }
    for (;;)
    {
      break;
      long l2 = i.s;
      if (l2 == Long.MAX_VALUE) {
        paramLong += l1;
      } else {
        paramLong = l1 + l2;
      }
    }
    a.b(paramLong, paramInt, arrayOfByte.length, 0, null);
  }
  
  public void k()
  {
    t localt = h;
    if (localt != null) {
      localt.b();
    }
  }
}

/* Location:
 * Qualified Name:     c1.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */