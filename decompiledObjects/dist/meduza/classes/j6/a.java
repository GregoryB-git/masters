package j6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m6.j;

public final class a
  implements ServiceConnection
{
  public boolean a = false;
  public final LinkedBlockingQueue b = new LinkedBlockingQueue();
  
  public final IBinder a()
  {
    j.h("BlockingServiceConnection.getService() called on main thread");
    if (!a)
    {
      a = true;
      return (IBinder)b.take();
    }
    throw new IllegalStateException("Cannot call get on this connection more than once");
  }
  
  public final IBinder b(TimeUnit paramTimeUnit)
  {
    j.h("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
    if (!a)
    {
      a = true;
      paramTimeUnit = (IBinder)b.poll(10000L, paramTimeUnit);
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
 * Qualified Name:     j6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */