package F3;

import E3.f;
import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class c
  implements b, a
{
  public final e a;
  public final int b;
  public final TimeUnit c;
  public final Object d = new Object();
  public CountDownLatch e;
  public boolean f = false;
  
  public c(e parame, int paramInt, TimeUnit paramTimeUnit)
  {
    a = parame;
    b = paramInt;
    c = paramTimeUnit;
  }
  
  public void a(String paramString, Bundle paramBundle)
  {
    synchronized (d)
    {
      f localf = f.f();
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("Logging event ");
      ((StringBuilder)localObject2).append(paramString);
      ((StringBuilder)localObject2).append(" to Firebase Analytics with params ");
      ((StringBuilder)localObject2).append(paramBundle);
      localf.i(((StringBuilder)localObject2).toString());
      localObject2 = new java/util/concurrent/CountDownLatch;
      ((CountDownLatch)localObject2).<init>(1);
      e = ((CountDownLatch)localObject2);
      f = false;
      a.a(paramString, paramBundle);
      f.f().i("Awaiting app exception callback from Analytics...");
    }
    try
    {
      if (e.await(b, c))
      {
        f = true;
        f.f().i("App exception callback received from Analytics listener.");
        break label160;
        paramString = finally;
        break label168;
      }
      else
      {
        f.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
      }
    }
    catch (InterruptedException paramString)
    {
      f.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
    }
    label160:
    e = null;
    return;
    label168:
    throw paramString;
  }
  
  public void t(String paramString, Bundle paramBundle)
  {
    paramBundle = e;
    if (paramBundle == null) {
      return;
    }
    if ("_ae".equals(paramString)) {
      paramBundle.countDown();
    }
  }
}

/* Location:
 * Qualified Name:     F3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */