package p0;

import android.media.MediaDrm.MediaDrmStateException;
import g0.M;

public abstract class B$a
{
  public static boolean a(Throwable paramThrowable)
  {
    return paramThrowable instanceof MediaDrm.MediaDrmStateException;
  }
  
  public static int b(Throwable paramThrowable)
  {
    return M.W(M.X(((MediaDrm.MediaDrmStateException)paramThrowable).getDiagnosticInfo()));
  }
}

/* Location:
 * Qualified Name:     p0.B.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */