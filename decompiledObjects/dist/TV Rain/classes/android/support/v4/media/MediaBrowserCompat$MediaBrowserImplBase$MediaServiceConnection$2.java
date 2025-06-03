package android.support.v4.media;

import android.content.ComponentName;
import android.util.Log;
import z2;

class MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2
  implements Runnable
{
  public MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2(MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection paramMediaServiceConnection, ComponentName paramComponentName) {}
  
  public void run()
  {
    if (MediaBrowserCompat.DEBUG)
    {
      localObject = z2.t("MediaServiceConnection.onServiceDisconnected name=");
      ((StringBuilder)localObject).append(val$name);
      ((StringBuilder)localObject).append(" this=");
      ((StringBuilder)localObject).append(this);
      ((StringBuilder)localObject).append(" mServiceConnection=");
      ((StringBuilder)localObject).append(this$1.this$0.mServiceConnection);
      Log.d("MediaBrowserCompat", ((StringBuilder)localObject).toString());
      this$1.this$0.dump();
    }
    if (!this$1.isCurrent("onServiceDisconnected")) {
      return;
    }
    Object localObject = this$1.this$0;
    mServiceBinderWrapper = null;
    mCallbacksMessenger = null;
    mHandler.setCallbacksMessenger(null);
    localObject = this$1.this$0;
    mState = 4;
    mCallback.onConnectionSuspended();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */