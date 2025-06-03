package android.support.v4.media;

import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import z2;

class MediaBrowserCompat$MediaBrowserImplBase$2
  implements Runnable
{
  public MediaBrowserCompat$MediaBrowserImplBase$2(MediaBrowserCompat.MediaBrowserImplBase paramMediaBrowserImplBase) {}
  
  public void run()
  {
    MediaBrowserCompat.MediaBrowserImplBase localMediaBrowserImplBase = this$0;
    Messenger localMessenger = mCallbacksMessenger;
    if (localMessenger != null) {
      try
      {
        mServiceBinderWrapper.disconnect(localMessenger);
      }
      catch (RemoteException localRemoteException)
      {
        localObject = z2.t("RemoteException during connect for ");
        ((StringBuilder)localObject).append(this$0.mServiceComponent);
        Log.w("MediaBrowserCompat", ((StringBuilder)localObject).toString());
      }
    }
    Object localObject = this$0;
    int i = mState;
    ((MediaBrowserCompat.MediaBrowserImplBase)localObject).forceCloseConnection();
    if (i != 0) {
      this$0.mState = i;
    }
    if (MediaBrowserCompat.DEBUG)
    {
      Log.d("MediaBrowserCompat", "disconnect...");
      this$0.dump();
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */