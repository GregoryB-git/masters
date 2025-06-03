package a4;

import android.media.MediaDrm.MediaDrmStateException;
import v5.e0;

public final class k
{
  public static boolean a(Throwable paramThrowable)
  {
    return paramThrowable instanceof MediaDrm.MediaDrmStateException;
  }
  
  public static int b(Throwable paramThrowable)
  {
    return e0.r(e0.s(((MediaDrm.MediaDrmStateException)paramThrowable).getDiagnosticInfo()));
  }
}

/* Location:
 * Qualified Name:     a4.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */