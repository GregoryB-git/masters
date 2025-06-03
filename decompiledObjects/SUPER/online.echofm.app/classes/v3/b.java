package v3;

import com.google.android.gms.internal.measurement.p0;
import com.google.android.gms.internal.measurement.q0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class b
  extends ThreadPoolExecutor
{
  public b(FirebaseAnalytics paramFirebaseAnalytics, int paramInt1, int paramInt2, long paramLong, TimeUnit paramTimeUnit, BlockingQueue paramBlockingQueue)
  {
    super(0, 1, 30L, paramTimeUnit, paramBlockingQueue);
  }
  
  public final void execute(Runnable paramRunnable)
  {
    super.execute(p0.a().b(paramRunnable));
  }
}

/* Location:
 * Qualified Name:     v3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */