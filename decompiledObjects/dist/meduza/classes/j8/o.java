package j8;

import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import k8.i;
import r8.c;

public final class o
  implements SuccessContinuation<c, Void>
{
  public o(n.b paramb) {}
  
  public final Task then(Object paramObject)
  {
    if ((c)paramObject == null)
    {
      Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
    }
    else
    {
      n.a(a.b);
      paramObject = a.b;
      m.g(e.a, null);
      a.b.r.trySetResult(null);
    }
    return Tasks.forResult(null);
  }
}

/* Location:
 * Qualified Name:     j8.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */