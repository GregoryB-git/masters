package x2;

import A2.n;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class a
  implements ServiceConnection
{
  public boolean a = false;
  public final BlockingQueue b = new LinkedBlockingQueue();
  
  public IBinder a(long paramLong, TimeUnit paramTimeUnit)
  {
    n.h("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
    if (!a)
    {
      a = true;
      paramTimeUnit = (IBinder)b.poll(paramLong, paramTimeUnit);
      if (paramTimeUnit != null) {
        return paramTimeUnit;
      }
      throw new TimeoutException("Timed out waiting for the service connection");
    }
    throw new IllegalStateException("Cannot call get on this connection more than once");
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    b.add(paramIBinder);
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName) {}
}

/* Location:
 * Qualified Name:     x2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */