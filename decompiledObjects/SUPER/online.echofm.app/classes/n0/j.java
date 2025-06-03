package n0;

import Q0.c;
import d0.q;
import g0.M;
import j0.a;
import j0.i;
import java.nio.ByteBuffer;
import k0.v0;
import o0.f;
import x0.Q;

public final class j
  implements Q
{
  public final q o;
  public final c p;
  public long[] q;
  public boolean r;
  public f s;
  public boolean t;
  public int u;
  public long v;
  
  public j(f paramf, q paramq, boolean paramBoolean)
  {
    o = paramq;
    s = paramf;
    p = new c();
    v = -9223372036854775807L;
    q = b;
    d(paramf, paramBoolean);
  }
  
  public void a() {}
  
  public String b()
  {
    return s.a();
  }
  
  public void c(long paramLong)
  {
    int i = M.d(q, paramLong, true, false);
    u = i;
    if ((!r) || (i != q.length)) {
      paramLong = -9223372036854775807L;
    }
    v = paramLong;
  }
  
  public void d(f paramf, boolean paramBoolean)
  {
    int i = u;
    long l1;
    if (i == 0) {
      l1 = -9223372036854775807L;
    } else {
      l1 = q[(i - 1)];
    }
    r = paramBoolean;
    s = paramf;
    paramf = b;
    q = paramf;
    long l2 = v;
    if (l2 != -9223372036854775807L) {
      c(l2);
    } else if (l1 != -9223372036854775807L) {
      u = M.d(paramf, l1, false, false);
    }
  }
  
  public boolean e()
  {
    return true;
  }
  
  public int j(v0 paramv0, i parami, int paramInt)
  {
    int i = u;
    int j;
    if (i == q.length) {
      j = 1;
    } else {
      j = 0;
    }
    if ((j != 0) && (!r))
    {
      parami.w(4);
      return -4;
    }
    if (((paramInt & 0x2) == 0) && (t))
    {
      if (j != 0) {
        return -3;
      }
      if ((paramInt & 0x1) == 0) {
        u = (i + 1);
      }
      if ((paramInt & 0x4) == 0)
      {
        paramv0 = p.a(s.a[i]);
        parami.z(paramv0.length);
        r.put(paramv0);
      }
      t = q[i];
      parami.w(1);
      return -4;
    }
    b = o;
    t = true;
    return -5;
  }
  
  public int m(long paramLong)
  {
    int i = Math.max(u, M.d(q, paramLong, true, false));
    int j = u;
    u = i;
    return i - j;
  }
}

/* Location:
 * Qualified Name:     n0.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */