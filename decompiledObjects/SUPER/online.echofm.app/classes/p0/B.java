package p0;

import android.media.DeniedByServerException;
import android.media.MediaDrm.MediaDrmStateException;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import g0.M;

public abstract class B
{
  public static int a(Throwable paramThrowable, int paramInt)
  {
    int i = M.a;
    if ((i >= 21) && (a.a(paramThrowable))) {
      return a.b(paramThrowable);
    }
    if ((i >= 23) && (b.a(paramThrowable))) {
      return 6006;
    }
    if ((!(paramThrowable instanceof NotProvisionedException)) && (!b(paramThrowable)))
    {
      if ((paramThrowable instanceof DeniedByServerException)) {
        return 6007;
      }
      if ((paramThrowable instanceof T)) {
        return 6001;
      }
      if ((paramThrowable instanceof h.e)) {
        return 6003;
      }
      if ((paramThrowable instanceof P)) {
        return 6008;
      }
      if (paramInt == 1) {
        return 6006;
      }
      if (paramInt == 2) {
        return 6004;
      }
      if (paramInt == 3) {
        return 6002;
      }
      throw new IllegalArgumentException();
    }
    return 6002;
  }
  
  public static boolean b(Throwable paramThrowable)
  {
    boolean bool;
    if ((M.a == 34) && ((paramThrowable instanceof NoSuchMethodError)) && (paramThrowable.getMessage() != null) && (paramThrowable.getMessage().contains("Landroid/media/NotProvisionedException;.<init>("))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean c(Throwable paramThrowable)
  {
    boolean bool;
    if ((M.a == 34) && ((paramThrowable instanceof NoSuchMethodError)) && (paramThrowable.getMessage() != null) && (paramThrowable.getMessage().contains("Landroid/media/ResourceBusyException;.<init>("))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static final abstract class a
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
  
  public static final abstract class b
  {
    public static boolean a(Throwable paramThrowable)
    {
      return paramThrowable instanceof MediaDrmResetException;
    }
  }
}

/* Location:
 * Qualified Name:     p0.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */