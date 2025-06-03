package j8;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import k8.i;
import p8.e;
import r8.h;
import sb.t;

public final class n$a
  implements Callable<Task<Void>>
{
  public final Object call()
  {
    long l = a / 1000L;
    Object localObject1 = f.e();
    if (localObject1 == null)
    {
      Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
    }
    else
    {
      f.c.d();
      Object localObject2 = f.m;
      Object localObject3 = b;
      Object localObject4 = c;
      localObject2.getClass();
      Object localObject5 = new StringBuilder();
      ((StringBuilder)localObject5).append("Persisting fatal event for session ");
      ((StringBuilder)localObject5).append((String)localObject1);
      localObject5 = ((StringBuilder)localObject5).toString();
      if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        Log.v("FirebaseCrashlytics", (String)localObject5, null);
      }
      ((d0)localObject2).e((Throwable)localObject3, (Thread)localObject4, "crash", new l8.c((String)localObject1, l, t.a), true);
      localObject2 = f;
      l = a;
      localObject2.getClass();
      try
      {
        localObject2 = g;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        ((StringBuilder)localObject3).append(".ae");
        ((StringBuilder)localObject3).append(l);
        localObject3 = ((StringBuilder)localObject3).toString();
        localObject2.getClass();
        localObject4 = new java/io/File;
        ((File)localObject4).<init>(c, (String)localObject3);
        if (!((File)localObject4).createNewFile())
        {
          localObject2 = new java/io/IOException;
          ((IOException)localObject2).<init>("Create new file failed.");
          throw ((Throwable)localObject2);
        }
      }
      catch (IOException localIOException)
      {
        Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", localIOException);
        f.b(false, d, false);
        f.c(fa, Boolean.valueOf(e));
        if (f.b.b()) {
          break label318;
        }
      }
    }
    return Tasks.forResult(null);
    label318:
    localObject1 = ((TaskCompletionSource)d).i.get()).getTask().onSuccessTask(f.e.a, new m(this, (String)localObject1));
    return localObject1;
  }
}

/* Location:
 * Qualified Name:     j8.n.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */