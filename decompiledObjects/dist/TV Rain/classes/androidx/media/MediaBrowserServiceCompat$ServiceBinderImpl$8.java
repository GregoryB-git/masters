package androidx.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import z2;

class MediaBrowserServiceCompat$ServiceBinderImpl$8
  implements Runnable
{
  public MediaBrowserServiceCompat$ServiceBinderImpl$8(MediaBrowserServiceCompat.ServiceBinderImpl paramServiceBinderImpl, MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks, String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver) {}
  
  public void run()
  {
    Object localObject = val$callbacks.asBinder();
    localObject = (MediaBrowserServiceCompat.ConnectionRecord)this$1.this$0.mConnections.get(localObject);
    if (localObject == null)
    {
      localObject = z2.t("search for callback that isn't registered query=");
      ((StringBuilder)localObject).append(val$query);
      Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
      return;
    }
    this$1.this$0.performSearch(val$query, val$extras, (MediaBrowserServiceCompat.ConnectionRecord)localObject, val$receiver);
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.8
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */