package androidx.media;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import androidx.collection.SimpleArrayMap;

class MediaBrowserServiceCompat$ServiceBinderImpl$2
  implements Runnable
{
  public MediaBrowserServiceCompat$ServiceBinderImpl$2(MediaBrowserServiceCompat.ServiceBinderImpl paramServiceBinderImpl, MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks) {}
  
  public void run()
  {
    Object localObject = val$callbacks.asBinder();
    localObject = (MediaBrowserServiceCompat.ConnectionRecord)this$1.this$0.mConnections.remove(localObject);
    if (localObject != null) {
      callbacks.asBinder().unlinkToDeath((IBinder.DeathRecipient)localObject, 0);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */