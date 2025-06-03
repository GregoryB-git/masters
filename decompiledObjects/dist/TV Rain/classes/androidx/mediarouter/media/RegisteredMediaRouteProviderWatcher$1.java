package androidx.mediarouter.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class RegisteredMediaRouteProviderWatcher$1
  extends BroadcastReceiver
{
  public RegisteredMediaRouteProviderWatcher$1(RegisteredMediaRouteProviderWatcher paramRegisteredMediaRouteProviderWatcher) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    this$0.scanPackages();
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.RegisteredMediaRouteProviderWatcher.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */