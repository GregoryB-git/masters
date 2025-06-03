package i0;

import android.system.ErrnoException;
import android.system.OsConstants;

public abstract class p$a
{
  private static boolean b(Throwable paramThrowable)
  {
    boolean bool;
    if (((paramThrowable instanceof ErrnoException)) && (errno == OsConstants.EACCES)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     i0.p.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */