package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import z2;

class MediaBrowserServiceCompat$ServiceBinderImpl$3
  implements Runnable
{
  public MediaBrowserServiceCompat$ServiceBinderImpl$3(MediaBrowserServiceCompat.ServiceBinderImpl paramServiceBinderImpl, MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks, String paramString, IBinder paramIBinder, Bundle paramBundle) {}
  
  public void run()
  {
    Object localObject = val$callbacks.asBinder();
    localObject = (MediaBrowserServiceCompat.ConnectionRecord)this$1.this$0.mConnections.get(localObject);
    if (localObject == null)
    {
      localObject = z2.t("addSubscription for callback that isn't registered id=");
      ((StringBuilder)localObject).append(val$id);
      Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
      return;
    }
    this$1.this$0.addSubscription(val$id, (MediaBrowserServiceCompat.ConnectionRecord)localObject, val$token, val$options);
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */