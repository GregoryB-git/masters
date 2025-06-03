package v7;

import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzdi;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class b
  extends ThreadPoolExecutor
{
  public b(TimeUnit paramTimeUnit, ArrayBlockingQueue paramArrayBlockingQueue)
  {
    super(0, 1, 30L, paramTimeUnit, paramArrayBlockingQueue);
  }
  
  public final void execute(Runnable paramRunnable)
  {
    super.execute(zzdi.zza().zza(paramRunnable));
  }
}

/* Location:
 * Qualified Name:     v7.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */