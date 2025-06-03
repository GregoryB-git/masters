package h8;

import android.os.Bundle;
import android.util.Log;
import b.z;
import d2.q;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class c
  implements b, a
{
  public final q a;
  public final TimeUnit b;
  public final Object c = new Object();
  public CountDownLatch d;
  
  public c(q paramq, TimeUnit paramTimeUnit)
  {
    a = paramq;
    b = paramTimeUnit;
  }
  
  public final void b(Bundle paramBundle, String paramString)
  {
    paramBundle = d;
    if (paramBundle == null) {
      return;
    }
    if ("_ae".equals(paramString)) {
      paramBundle.countDown();
    }
  }
  
  public final void d(Bundle paramBundle)
  {
    synchronized (c)
    {
      z localz = z.e;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("Logging event ");
      ((StringBuilder)localObject2).append("_ae");
      ((StringBuilder)localObject2).append(" to Firebase Analytics with params ");
      ((StringBuilder)localObject2).append(paramBundle);
      localz.q(((StringBuilder)localObject2).toString());
      localObject2 = new java/util/concurrent/CountDownLatch;
      ((CountDownLatch)localObject2).<init>(1);
      d = ((CountDownLatch)localObject2);
      a.d(paramBundle);
      localz.q("Awaiting app exception callback from Analytics...");
      try
      {
        if (d.await('Ǵ', b)) {
          localz.q("App exception callback received from Analytics listener.");
        } else {
          localz.s("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
        }
      }
      catch (InterruptedException paramBundle)
      {
        Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
      }
      d = null;
      return;
    }
  }
}

/* Location:
 * Qualified Name:     h8.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */