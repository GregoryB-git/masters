package a4;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;

public final class j
{
  public static boolean a(Throwable paramThrowable)
  {
    return paramThrowable instanceof DeniedByServerException;
  }
  
  public static boolean b(Throwable paramThrowable)
  {
    return paramThrowable instanceof NotProvisionedException;
  }
}

/* Location:
 * Qualified Name:     a4.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */