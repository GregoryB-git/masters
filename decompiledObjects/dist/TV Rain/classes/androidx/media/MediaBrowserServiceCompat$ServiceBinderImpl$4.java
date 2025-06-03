package androidx.media;

import android.os.IBinder;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import z2;

class MediaBrowserServiceCompat$ServiceBinderImpl$4
  implements Runnable
{
  public MediaBrowserServiceCompat$ServiceBinderImpl$4(MediaBrowserServiceCompat.ServiceBinderImpl paramServiceBinderImpl, MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks, String paramString, IBinder paramIBinder) {}
  
  public void run()
  {
    Object localObject = val$callbacks.asBinder();
    localObject = (MediaBrowserServiceCompat.ConnectionRecord)this$1.this$0.mConnections.get(localObject);
    if (localObject == null)
    {
      localObject = z2.t("removeSubscription for callback that isn't registered id=");
      ((StringBuilder)localObject).append(val$id);
      Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
      return;
    }
    if (!this$1.this$0.removeSubscription(val$id, (MediaBrowserServiceCompat.ConnectionRecord)localObject, val$token))
    {
      localObject = z2.t("removeSubscription called for ");
      ((StringBuilder)localObject).append(val$id);
      ((StringBuilder)localObject).append(" which is not subscribed");
      Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */