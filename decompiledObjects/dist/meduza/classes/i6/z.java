package i6;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import w6.a;

public final class z
{
  public static z e;
  public final Context a;
  public final ScheduledExecutorService b;
  public u c = new u(this);
  public int d = 1;
  
  public z(Context paramContext, ScheduledExecutorService paramScheduledExecutorService)
  {
    b = paramScheduledExecutorService;
    a = paramContext.getApplicationContext();
  }
  
  public static z a(Context paramContext)
  {
    try
    {
      if (e == null)
      {
        z localz = new i6/z;
        zze.zza();
        a locala = new w6/a;
        locala.<init>("MessengerIpcClient");
        localz.<init>(paramContext, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, locala)));
        e = localz;
      }
      paramContext = e;
      return paramContext;
    }
    finally {}
  }
  
  public final Task b(x paramx)
  {
    try
    {
      if (Log.isLoggable("MessengerIpcClient", 3)) {
        Log.d("MessengerIpcClient", "Queueing ".concat(paramx.toString()));
      }
      if (!c.d(paramx))
      {
        u localu = new i6/u;
        localu.<init>(this);
        c = localu;
        localu.d(paramx);
      }
      paramx = b.getTask();
      return paramx;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     i6.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */