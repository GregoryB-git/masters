package t5;

import android.system.ErrnoException;
import android.system.OsConstants;

public final class v$a
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
 * Qualified Name:     t5.v.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */