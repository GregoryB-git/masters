package R4;

import android.os.SystemClock;
import o6.a;
import o6.a.a;
import o6.c;
import o6.d;

public final class w
  implements x
{
  public static final a a = new a(null);
  
  public long a()
  {
    return System.currentTimeMillis() * 1000L;
  }
  
  public long b()
  {
    a.a locala = a.p;
    return c.p(SystemClock.elapsedRealtime(), d.r);
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     R4.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */