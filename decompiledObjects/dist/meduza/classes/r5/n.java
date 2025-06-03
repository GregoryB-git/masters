package r5;

import android.os.SystemClock;
import t5.c0.a;

public final class n
{
  public static c0.a a(h paramh)
  {
    long l = SystemClock.elapsedRealtime();
    int i = paramh.length();
    int j = 0;
    int m;
    for (int k = j; j < i; k = m)
    {
      m = k;
      if (paramh.l(j, l)) {
        m = k + 1;
      }
      j++;
    }
    return new c0.a(1, 0, i, k);
  }
}

/* Location:
 * Qualified Name:     r5.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */