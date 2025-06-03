package I1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

public final class e$b
  implements ServiceConnection
{
  public final CountDownLatch a = new CountDownLatch(1);
  public IBinder b;
  
  public final IBinder a()
  {
    a.await(5L, TimeUnit.SECONDS);
    return b;
  }
  
  public void onNullBinding(ComponentName paramComponentName)
  {
    Intrinsics.checkNotNullParameter(paramComponentName, "name");
    a.countDown();
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    Intrinsics.checkNotNullParameter(paramComponentName, "name");
    Intrinsics.checkNotNullParameter(paramIBinder, "serviceBinder");
    b = paramIBinder;
    a.countDown();
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    Intrinsics.checkNotNullParameter(paramComponentName, "name");
  }
}

/* Location:
 * Qualified Name:     I1.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */