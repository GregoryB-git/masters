package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import java.util.Iterator;

class MediaBrowserServiceCompat$ServiceBinderImpl$6
  implements Runnable
{
  public MediaBrowserServiceCompat$ServiceBinderImpl$6(MediaBrowserServiceCompat.ServiceBinderImpl paramServiceBinderImpl, MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks, int paramInt1, String paramString, int paramInt2, Bundle paramBundle) {}
  
  public void run()
  {
    IBinder localIBinder = val$callbacks.asBinder();
    this$1.this$0.mConnections.remove(localIBinder);
    Iterator localIterator = this$1.this$0.mPendingConnections.iterator();
    Object localObject1;
    MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord;
    do
    {
      boolean bool = localIterator.hasNext();
      localObject1 = null;
      localObject2 = null;
      if (!bool) {
        break;
      }
      localConnectionRecord = (MediaBrowserServiceCompat.ConnectionRecord)localIterator.next();
    } while (uid != val$uid);
    if (!TextUtils.isEmpty(val$pkg))
    {
      localObject1 = localObject2;
      if (val$pid > 0) {}
    }
    else
    {
      localObject1 = new MediaBrowserServiceCompat.ConnectionRecord(this$1.this$0, pkg, pid, uid, val$rootHints, val$callbacks);
    }
    localIterator.remove();
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new MediaBrowserServiceCompat.ConnectionRecord(this$1.this$0, val$pkg, val$pid, val$uid, val$rootHints, val$callbacks);
    }
    this$1.this$0.mConnections.put(localIBinder, localObject2);
    try
    {
      localIBinder.linkToDeath((IBinder.DeathRecipient)localObject2, 0);
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("MBServiceCompat", "IBinder is already dead.");
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */