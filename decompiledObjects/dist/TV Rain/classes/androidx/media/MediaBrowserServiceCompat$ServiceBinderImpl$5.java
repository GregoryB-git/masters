package androidx.media;

import android.support.v4.os.ResultReceiver;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import z2;

class MediaBrowserServiceCompat$ServiceBinderImpl$5
  implements Runnable
{
  public MediaBrowserServiceCompat$ServiceBinderImpl$5(MediaBrowserServiceCompat.ServiceBinderImpl paramServiceBinderImpl, MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks, String paramString, ResultReceiver paramResultReceiver) {}
  
  public void run()
  {
    Object localObject = val$callbacks.asBinder();
    localObject = (MediaBrowserServiceCompat.ConnectionRecord)this$1.this$0.mConnections.get(localObject);
    if (localObject == null)
    {
      localObject = z2.t("getMediaItem for callback that isn't registered id=");
      ((StringBuilder)localObject).append(val$mediaId);
      Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
      return;
    }
    this$1.this$0.performLoadItem(val$mediaId, (MediaBrowserServiceCompat.ConnectionRecord)localObject, val$receiver);
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */