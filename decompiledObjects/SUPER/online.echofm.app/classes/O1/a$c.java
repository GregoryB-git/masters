package O1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class a$c
  implements ServiceConnection
{
  public final AtomicBoolean a = new AtomicBoolean(false);
  public final BlockingQueue b = new LinkedBlockingDeque();
  
  public final IBinder a()
  {
    if ((a.compareAndSet(true, true) ^ true))
    {
      Object localObject = b.take();
      Intrinsics.checkNotNullExpressionValue(localObject, "queue.take()");
      return (IBinder)localObject;
    }
    throw new IllegalStateException("Binder already consumed".toString());
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    if (paramIBinder != null) {}
    try
    {
      b.put(paramIBinder);
      return;
    }
    catch (InterruptedException paramComponentName)
    {
      for (;;) {}
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName) {}
}

/* Location:
 * Qualified Name:     O1.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */