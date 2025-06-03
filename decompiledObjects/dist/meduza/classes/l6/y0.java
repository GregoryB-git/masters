package l6;

import android.os.DeadObjectException;
import android.os.RemoteException;
import b.a0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j6.d;
import java.util.Map;
import z4.i;

public final class y0
  extends j0
{
  public final q b;
  public final TaskCompletionSource c;
  public final o d;
  
  public y0(int paramInt, q paramq, TaskCompletionSource paramTaskCompletionSource, o paramo)
  {
    super(paramInt);
    c = paramTaskCompletionSource;
    b = paramq;
    d = paramo;
    if ((paramInt == 2) && (b)) {
      throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
    }
  }
  
  public final void a(Status paramStatus)
  {
    o localo = d;
    TaskCompletionSource localTaskCompletionSource = c;
    ((i)localo).getClass();
    localTaskCompletionSource.trySetException(a0.r(paramStatus));
  }
  
  public final void b(RuntimeException paramRuntimeException)
  {
    c.trySetException(paramRuntimeException);
  }
  
  public final void c(d0 paramd0)
  {
    try
    {
      b.a(b, c);
      return;
    }
    catch (RuntimeException paramd0)
    {
      c.trySetException(paramd0);
      return;
    }
    catch (RemoteException paramd0)
    {
      a(a1.e(paramd0));
      return;
    }
    catch (DeadObjectException paramd0)
    {
      throw paramd0;
    }
  }
  
  public final void d(u paramu, boolean paramBoolean)
  {
    TaskCompletionSource localTaskCompletionSource = c;
    b.put(localTaskCompletionSource, Boolean.valueOf(paramBoolean));
    localTaskCompletionSource.getTask().addOnCompleteListener(new t(paramu, localTaskCompletionSource));
  }
  
  public final boolean f(d0 paramd0)
  {
    return b.b;
  }
  
  public final d[] g(d0 paramd0)
  {
    return b.a;
  }
}

/* Location:
 * Qualified Name:     l6.y0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */