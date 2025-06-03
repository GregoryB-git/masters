package android.support.v4.media;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import z2;

class MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1
  implements Runnable
{
  public MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1(MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection paramMediaServiceConnection, ComponentName paramComponentName, IBinder paramIBinder) {}
  
  public void run()
  {
    boolean bool = MediaBrowserCompat.DEBUG;
    if (bool)
    {
      localObject = z2.t("MediaServiceConnection.onServiceConnected name=");
      ((StringBuilder)localObject).append(val$name);
      ((StringBuilder)localObject).append(" binder=");
      ((StringBuilder)localObject).append(val$binder);
      Log.d("MediaBrowserCompat", ((StringBuilder)localObject).toString());
      this$1.this$0.dump();
    }
    if (!this$1.isCurrent("onServiceConnected")) {
      return;
    }
    Object localObject = this$1.this$0;
    mServiceBinderWrapper = new MediaBrowserCompat.ServiceBinderWrapper(val$binder, mRootHints);
    this$1.this$0.mCallbacksMessenger = new Messenger(this$1.this$0.mHandler);
    localObject = this$1.this$0;
    mHandler.setCallbacksMessenger(mCallbacksMessenger);
    this$1.this$0.mState = 2;
    if (bool) {}
    try
    {
      Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
      this$1.this$0.dump();
      localObject = this$1.this$0;
      mServiceBinderWrapper.connect(mContext, mCallbacksMessenger);
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = z2.t("RemoteException during connect for ");
      localStringBuilder.append(this$1.this$0.mServiceComponent);
      Log.w("MediaBrowserCompat", localStringBuilder.toString());
      if (MediaBrowserCompat.DEBUG)
      {
        Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
        this$1.this$0.dump();
      }
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */