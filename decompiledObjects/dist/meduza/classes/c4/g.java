package c4;

import java.io.EOFException;
import t5.h;
import v3.i0;
import v5.u;

public final class g
  implements v
{
  public final byte[] a = new byte['က'];
  
  public final void a(int paramInt, u paramu)
  {
    paramu.H(paramInt);
  }
  
  public final void b(int paramInt, u paramu)
  {
    paramu.H(paramInt);
  }
  
  public final void c(long paramLong, int paramInt1, int paramInt2, int paramInt3, v.a parama) {}
  
  public final void d(i0 parami0) {}
  
  public final int e(h paramh, int paramInt, boolean paramBoolean)
  {
    return f(paramh, paramInt, paramBoolean);
  }
  
  public final int f(h paramh, int paramInt, boolean paramBoolean)
  {
    paramInt = Math.min(a.length, paramInt);
    paramInt = paramh.read(a, 0, paramInt);
    if (paramInt == -1)
    {
      if (paramBoolean) {
        return -1;
      }
      throw new EOFException();
    }
    return paramInt;
  }
}

/* Location:
 * Qualified Name:     c4.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */