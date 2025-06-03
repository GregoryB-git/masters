package com.facebook.appevents.ondeviceprocessing;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.Nullable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class RemoteServiceWrapper$RemoteServiceConnection
  implements ServiceConnection
{
  @Nullable
  private IBinder binder;
  private final CountDownLatch latch = new CountDownLatch(1);
  
  @Nullable
  public IBinder getBinder()
    throws InterruptedException
  {
    latch.await(5L, TimeUnit.SECONDS);
    return binder;
  }
  
  public void onNullBinding(ComponentName paramComponentName)
  {
    latch.countDown();
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    binder = paramIBinder;
    latch.countDown();
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName) {}
}

/* Location:
 * Qualified Name:     com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.RemoteServiceConnection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */