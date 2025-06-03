package j8;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class y
  extends d
{
  public y(ExecutorService paramExecutorService, TimeUnit paramTimeUnit) {}
  
  public final void a()
  {
    int i = 0;
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("Executing shutdown hook for ");
      ((StringBuilder)localObject).append(a);
      localObject = ((StringBuilder)localObject).toString();
      if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0) {
        Log.d("FirebaseCrashlytics", (String)localObject, null);
      }
      b.shutdown();
      if (!b.awaitTermination(c, d))
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append(a);
        ((StringBuilder)localObject).append(" did not shut down in the allocated time. Requesting immediate shutdown.");
        localObject = ((StringBuilder)localObject).toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
          j = 1;
        } else {
          j = 0;
        }
        if (j != 0) {
          Log.d("FirebaseCrashlytics", (String)localObject, null);
        }
        b.shutdownNow();
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      String str = String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[] { a });
      int j = i;
      if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        j = 1;
      }
      if (j != 0) {
        Log.d("FirebaseCrashlytics", str, null);
      }
      b.shutdownNow();
    }
  }
}

/* Location:
 * Qualified Name:     j8.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */