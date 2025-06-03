package l6;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import k6.b;

public abstract class u0
  extends j0
{
  public final TaskCompletionSource b;
  
  public u0(int paramInt, TaskCompletionSource paramTaskCompletionSource)
  {
    super(paramInt);
    b = paramTaskCompletionSource;
  }
  
  public final void a(Status paramStatus)
  {
    paramStatus = new b(paramStatus);
    b.trySetException(paramStatus);
  }
  
  public final void b(RuntimeException paramRuntimeException)
  {
    b.trySetException(paramRuntimeException);
  }
  
  public final void c(d0 paramd0)
  {
    try
    {
      h(paramd0);
      return;
    }
    catch (RuntimeException paramd0)
    {
      b.trySetException(paramd0);
      return;
    }
    catch (RemoteException paramd0)
    {
      a(a1.e(paramd0));
      return;
    }
    catch (DeadObjectException paramd0)
    {
      a(a1.e(paramd0));
      throw paramd0;
    }
  }
  
  public abstract void h(d0 paramd0);
}

/* Location:
 * Qualified Name:     l6.u0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */