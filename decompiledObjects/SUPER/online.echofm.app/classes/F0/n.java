package F0;

import d0.i;
import d0.q;
import g0.z;
import java.io.EOFException;

public final class n
  implements T
{
  public final byte[] a = new byte['က'];
  
  public void a(z paramz, int paramInt1, int paramInt2)
  {
    paramz.U(paramInt1);
  }
  
  public void b(long paramLong, int paramInt1, int paramInt2, int paramInt3, T.a parama) {}
  
  public int c(i parami, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    paramInt1 = Math.min(a.length, paramInt1);
    paramInt1 = parami.read(a, 0, paramInt1);
    if (paramInt1 == -1)
    {
      if (paramBoolean) {
        return -1;
      }
      throw new EOFException();
    }
    return paramInt1;
  }
  
  public void d(q paramq) {}
}

/* Location:
 * Qualified Name:     F0.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */