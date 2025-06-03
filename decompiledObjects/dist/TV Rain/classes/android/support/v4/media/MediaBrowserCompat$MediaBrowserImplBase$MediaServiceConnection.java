package android.support.v4.media;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import z2;

class MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection
  implements ServiceConnection
{
  public MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection(MediaBrowserCompat.MediaBrowserImplBase paramMediaBrowserImplBase) {}
  
  private void postOrRun(Runnable paramRunnable)
  {
    if (Thread.currentThread() == this$0.mHandler.getLooper().getThread()) {
      paramRunnable.run();
    } else {
      this$0.mHandler.post(paramRunnable);
    }
  }
  
  public boolean isCurrent(String paramString)
  {
    MediaBrowserCompat.MediaBrowserImplBase localMediaBrowserImplBase = this$0;
    if (mServiceConnection == this)
    {
      i = mState;
      if ((i != 0) && (i != 1)) {
        return true;
      }
    }
    int i = mState;
    if ((i != 0) && (i != 1))
    {
      paramString = z2.u(paramString, " for ");
      paramString.append(this$0.mServiceComponent);
      paramString.append(" with mServiceConnection=");
      paramString.append(this$0.mServiceConnection);
      paramString.append(" this=");
      paramString.append(this);
      Log.i("MediaBrowserCompat", paramString.toString());
    }
    return false;
  }
  
  public void onServiceConnected(final ComponentName paramComponentName, final IBinder paramIBinder)
  {
    postOrRun(new Runnable()
    {
      public void run()
      {
        boolean bool = MediaBrowserCompat.DEBUG;
        if (bool)
        {
          localObject = z2.t("MediaServiceConnection.onServiceConnected name=");
          ((StringBuilder)localObject).append(paramComponentName);
          ((StringBuilder)localObject).append(" binder=");
          ((StringBuilder)localObject).append(paramIBinder);
          Log.d("MediaBrowserCompat", ((StringBuilder)localObject).toString());
          this$0.dump();
        }
        if (!isCurrent("onServiceConnected")) {
          return;
        }
        Object localObject = this$0;
        mServiceBinderWrapper = new MediaBrowserCompat.ServiceBinderWrapper(paramIBinder, mRootHints);
        this$0.mCallbacksMessenger = new Messenger(this$0.mHandler);
        localObject = this$0;
        mHandler.setCallbacksMessenger(mCallbacksMessenger);
        this$0.mState = 2;
        if (bool) {}
        try
        {
          Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
          this$0.dump();
          localObject = this$0;
          mServiceBinderWrapper.connect(mContext, mCallbacksMessenger);
        }
        catch (RemoteException localRemoteException)
        {
          StringBuilder localStringBuilder = z2.t("RemoteException during connect for ");
          localStringBuilder.append(this$0.mServiceComponent);
          Log.w("MediaBrowserCompat", localStringBuilder.toString());
          if (MediaBrowserCompat.DEBUG)
          {
            Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
            this$0.dump();
          }
        }
      }
    });
  }
  
  public void onServiceDisconnected(final ComponentName paramComponentName)
  {
    postOrRun(new Runnable()
    {
      public void run()
      {
        if (MediaBrowserCompat.DEBUG)
        {
          localObject = z2.t("MediaServiceConnection.onServiceDisconnected name=");
          ((StringBuilder)localObject).append(paramComponentName);
          ((StringBuilder)localObject).append(" this=");
          ((StringBuilder)localObject).append(this);
          ((StringBuilder)localObject).append(" mServiceConnection=");
          ((StringBuilder)localObject).append(this$0.mServiceConnection);
          Log.d("MediaBrowserCompat", ((StringBuilder)localObject).toString());
          this$0.dump();
        }
        if (!isCurrent("onServiceDisconnected")) {
          return;
        }
        Object localObject = this$0;
        mServiceBinderWrapper = null;
        mCallbacksMessenger = null;
        mHandler.setCallbacksMessenger(null);
        localObject = this$0;
        mState = 4;
        mCallback.onConnectionSuspended();
      }
    });
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */