package com.facebook.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

final class AttributionIdentifiers$GoogleAdServiceConnection
  implements ServiceConnection
{
  private AtomicBoolean consumed = new AtomicBoolean(false);
  private final BlockingQueue<IBinder> queue = new LinkedBlockingDeque();
  
  public IBinder getBinder()
    throws InterruptedException
  {
    if (!consumed.compareAndSet(true, true)) {
      return (IBinder)queue.take();
    }
    throw new IllegalStateException("Binder already consumed");
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    if (paramIBinder != null) {}
    try
    {
      queue.put(paramIBinder);
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
 * Qualified Name:     com.facebook.internal.AttributionIdentifiers.GoogleAdServiceConnection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */