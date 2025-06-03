package androidx.media;

import android.os.IBinder;
import androidx.collection.SimpleArrayMap;

class MediaBrowserServiceCompat$ServiceBinderImpl$7
  implements Runnable
{
  public MediaBrowserServiceCompat$ServiceBinderImpl$7(MediaBrowserServiceCompat.ServiceBinderImpl paramServiceBinderImpl, MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks) {}
  
  public void run()
  {
    IBinder localIBinder = val$callbacks.asBinder();
    MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = (MediaBrowserServiceCompat.ConnectionRecord)this$1.this$0.mConnections.remove(localIBinder);
    if (localConnectionRecord != null) {
      localIBinder.unlinkToDeath(localConnectionRecord, 0);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */