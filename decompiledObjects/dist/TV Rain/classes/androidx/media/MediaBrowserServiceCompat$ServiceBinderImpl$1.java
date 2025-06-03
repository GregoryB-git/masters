package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import z2;

class MediaBrowserServiceCompat$ServiceBinderImpl$1
  implements Runnable
{
  public MediaBrowserServiceCompat$ServiceBinderImpl$1(MediaBrowserServiceCompat.ServiceBinderImpl paramServiceBinderImpl, MediaBrowserServiceCompat.ServiceCallbacks paramServiceCallbacks, String paramString, int paramInt1, int paramInt2, Bundle paramBundle) {}
  
  public void run()
  {
    Object localObject1 = val$callbacks.asBinder();
    this$1.this$0.mConnections.remove(localObject1);
    MediaBrowserServiceCompat.ConnectionRecord localConnectionRecord = new MediaBrowserServiceCompat.ConnectionRecord(this$1.this$0, val$pkg, val$pid, val$uid, val$rootHints, val$callbacks);
    Object localObject2 = this$1.this$0;
    mCurConnection = localConnectionRecord;
    localObject2 = ((MediaBrowserServiceCompat)localObject2).onGetRoot(val$pkg, val$uid, val$rootHints);
    root = ((MediaBrowserServiceCompat.BrowserRoot)localObject2);
    MediaBrowserServiceCompat localMediaBrowserServiceCompat = this$1.this$0;
    mCurConnection = null;
    StringBuilder localStringBuilder1;
    if (localObject2 == null)
    {
      localObject1 = z2.t("No root for client ");
      ((StringBuilder)localObject1).append(val$pkg);
      ((StringBuilder)localObject1).append(" from service ");
      ((StringBuilder)localObject1).append(getClass().getName());
      Log.i("MBServiceCompat", ((StringBuilder)localObject1).toString());
      try
      {
        val$callbacks.onConnectFailed();
      }
      catch (RemoteException localRemoteException1)
      {
        localStringBuilder1 = z2.t("Calling onConnectFailed() failed. Ignoring. pkg=");
        localStringBuilder1.append(val$pkg);
        Log.w("MBServiceCompat", localStringBuilder1.toString());
      }
    }
    else
    {
      try
      {
        mConnections.put(localStringBuilder1, localConnectionRecord);
        localStringBuilder1.linkToDeath(localConnectionRecord, 0);
        if (this$1.this$0.mSession != null) {
          val$callbacks.onConnect(root.getRootId(), this$1.this$0.mSession, root.getExtras());
        }
      }
      catch (RemoteException localRemoteException2)
      {
        StringBuilder localStringBuilder2 = z2.t("Calling onConnect() failed. Dropping client. pkg=");
        localStringBuilder2.append(val$pkg);
        Log.w("MBServiceCompat", localStringBuilder2.toString());
        this$1.this$0.mConnections.remove(localStringBuilder1);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */