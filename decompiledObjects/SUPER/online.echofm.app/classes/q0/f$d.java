package q0;

import A0.c;
import android.os.SystemClock;
import d0.J;
import java.util.List;
import y0.n;

public final class f$d
  extends c
{
  public int h = a(paramJ.a(paramArrayOfInt[0]));
  
  public f$d(J paramJ, int[] paramArrayOfInt)
  {
    super(paramJ, paramArrayOfInt);
  }
  
  public int n()
  {
    return 0;
  }
  
  public int o()
  {
    return h;
  }
  
  public Object s()
  {
    return null;
  }
  
  public void v(long paramLong1, long paramLong2, long paramLong3, List paramList, n[] paramArrayOfn)
  {
    paramLong1 = SystemClock.elapsedRealtime();
    if (!i(h, paramLong1)) {
      return;
    }
    for (int i = b - 1; i >= 0; i--) {
      if (!i(i, paramLong1))
      {
        h = i;
        return;
      }
    }
    throw new IllegalStateException();
  }
}

/* Location:
 * Qualified Name:     q0.f.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */