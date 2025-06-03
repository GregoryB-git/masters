package j8;

import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import k8.b;
import k8.i;
import r8.c;

public final class m
  implements SuccessContinuation<c, Void>
{
  public final Task then(Object paramObject)
  {
    Object localObject1 = (c)paramObject;
    paramObject = null;
    if (localObject1 == null)
    {
      Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
      paramObject = Tasks.forResult(null);
    }
    else
    {
      localObject1 = n.a(b.f);
      n.a locala = b;
      Object localObject2 = f;
      d0 locald0 = m;
      localObject2 = e.a;
      if (e) {
        paramObject = a;
      }
      paramObject = Tasks.whenAll(new Task[] { localObject1, locald0.g((b)localObject2, (String)paramObject) });
    }
    return (Task)paramObject;
  }
}

/* Location:
 * Qualified Name:     j8.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */