package w2;

import F2.a;
import L2.e;
import V2.j;
import V2.k;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class w
{
  public static w e;
  public final Context a;
  public final ScheduledExecutorService b;
  public q c = new q(this, null);
  public int d = 1;
  
  public w(Context paramContext, ScheduledExecutorService paramScheduledExecutorService)
  {
    b = paramScheduledExecutorService;
    a = paramContext.getApplicationContext();
  }
  
  public static w b(Context paramContext)
  {
    try
    {
      if (e == null)
      {
        w localw = new w2/w;
        e.a();
        a locala = new F2/a;
        locala.<init>("MessengerIpcClient");
        localw.<init>(paramContext, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, locala)));
        e = localw;
      }
    }
    finally
    {
      break label60;
    }
    paramContext = e;
    return paramContext;
    label60:
    throw paramContext;
  }
  
  public final j c(int paramInt, Bundle paramBundle)
  {
    return g(new s(f(), 2, paramBundle));
  }
  
  public final j d(int paramInt, Bundle paramBundle)
  {
    return g(new v(f(), 1, paramBundle));
  }
  
  public final int f()
  {
    try
    {
      int i = d;
      d = (i + 1);
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final j g(t paramt)
  {
    Object localObject;
    try
    {
      if (Log.isLoggable("MessengerIpcClient", 3))
      {
        String str = String.valueOf(paramt);
        int i = str.length();
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>(i + 9);
        ((StringBuilder)localObject).append("Queueing ");
        ((StringBuilder)localObject).append(str);
        Log.d("MessengerIpcClient", ((StringBuilder)localObject).toString());
      }
    }
    finally
    {
      break label116;
    }
    if (!c.g(paramt))
    {
      localObject = new w2/q;
      ((q)localObject).<init>(this, null);
      c = ((q)localObject);
      ((q)localObject).g(paramt);
    }
    paramt = b.a();
    return paramt;
    label116:
    throw paramt;
  }
}

/* Location:
 * Qualified Name:     w2.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */