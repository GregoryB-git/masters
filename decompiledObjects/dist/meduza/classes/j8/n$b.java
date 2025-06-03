package j8;

import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Iterator;
import java.util.List;
import k8.i;
import p8.c;
import p8.e;

public final class n$b
  implements SuccessContinuation<Boolean, Void>
{
  public final Task then(Object paramObject)
  {
    paramObject = (Boolean)paramObject;
    if (!((Boolean)paramObject).booleanValue())
    {
      if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
      }
      e locale = b.g;
      paramObject = n.t;
      paramObject = e.e(c.listFiles((FilenameFilter)paramObject)).iterator();
      while (((Iterator)paramObject).hasNext()) {
        ((File)((Iterator)paramObject).next()).delete();
      }
      paramObject = b.m.b;
      c.a(e.e(b.e.listFiles()));
      c.a(e.e(b.f.listFiles()));
      c.a(e.e(b.g.listFiles()));
      b.r.trySetResult(null);
      paramObject = Tasks.forResult(null);
    }
    else
    {
      if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
      }
      boolean bool = ((Boolean)paramObject).booleanValue();
      paramObject = b.b;
      if (!bool) {
        break label235;
      }
      h.trySetResult(null);
      paramObject = a.onSuccessTask(b.e.a, new o(this));
    }
    return (Task)paramObject;
    label235:
    paramObject.getClass();
    throw new IllegalStateException("An invalid data collection token was used.");
  }
}

/* Location:
 * Qualified Name:     j8.n.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */