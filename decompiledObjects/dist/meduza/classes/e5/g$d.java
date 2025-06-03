package e5;

import android.os.SystemClock;
import b5.n;
import java.util.List;
import r5.b;
import z4.i0;

public final class g$d
  extends b
{
  public int g;
  
  public g$d(i0 parami0, int[] paramArrayOfInt)
  {
    super(parami0, paramArrayOfInt);
    int i = paramArrayOfInt[0];
    g = d(d[i]);
  }
  
  public final int i()
  {
    return g;
  }
  
  public final void j(long paramLong1, long paramLong2, List paramList, n[] paramArrayOfn)
  {
    paramLong1 = SystemClock.elapsedRealtime();
    if (!l(g, paramLong1)) {
      return;
    }
    int i = b;
    int j;
    do
    {
      j = i - 1;
      if (j < 0) {
        break;
      }
      i = j;
    } while (l(j, paramLong1));
    g = j;
    return;
    throw new IllegalStateException();
  }
  
  public final int q()
  {
    return 0;
  }
  
  public final Object s()
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     e5.g.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */