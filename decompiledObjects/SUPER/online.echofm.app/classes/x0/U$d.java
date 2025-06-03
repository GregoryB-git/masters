package x0;

import g0.M;
import j0.a;
import j0.i;
import java.nio.ByteBuffer;
import k0.v0;

public final class U$d
  implements Q
{
  public final long o;
  public boolean p;
  public long q;
  
  public U$d(long paramLong)
  {
    o = U.E(paramLong);
    b(0L);
  }
  
  public void a() {}
  
  public void b(long paramLong)
  {
    q = M.q(U.E(paramLong), 0L, o);
  }
  
  public boolean e()
  {
    return true;
  }
  
  public int j(v0 paramv0, i parami, int paramInt)
  {
    if ((p) && ((paramInt & 0x2) == 0))
    {
      long l1 = o;
      long l2 = q;
      l1 -= l2;
      if (l1 == 0L)
      {
        parami.l(4);
        return -4;
      }
      t = U.F(l2);
      parami.l(1);
      int i = (int)Math.min(U.G().length, l1);
      if ((paramInt & 0x4) == 0)
      {
        parami.z(i);
        r.put(U.G(), 0, i);
      }
      if ((paramInt & 0x1) == 0) {
        q += i;
      }
      return -4;
    }
    b = U.D();
    p = true;
    return -5;
  }
  
  public int m(long paramLong)
  {
    long l = q;
    b(paramLong);
    return (int)((q - l) / U.G().length);
  }
}

/* Location:
 * Qualified Name:     x0.U.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */