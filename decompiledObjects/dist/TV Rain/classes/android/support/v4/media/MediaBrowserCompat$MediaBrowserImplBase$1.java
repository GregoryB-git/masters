package android.support.v4.media;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import z2;

class MediaBrowserCompat$MediaBrowserImplBase$1
  implements Runnable
{
  public MediaBrowserCompat$MediaBrowserImplBase$1(MediaBrowserCompat.MediaBrowserImplBase paramMediaBrowserImplBase) {}
  
  public void run()
  {
    Object localObject = this$0;
    if (mState == 0) {
      return;
    }
    mState = 2;
    if ((MediaBrowserCompat.DEBUG) && (mServiceConnection != null))
    {
      localObject = z2.t("mServiceConnection should be null. Instead it is ");
      ((StringBuilder)localObject).append(this$0.mServiceConnection);
      throw new RuntimeException(((StringBuilder)localObject).toString());
    }
    if (mServiceBinderWrapper == null)
    {
      if (mCallbacksMessenger == null)
      {
        localObject = new Intent("android.media.browse.MediaBrowserService");
        ((Intent)localObject).setComponent(this$0.mServiceComponent);
        MediaBrowserCompat.MediaBrowserImplBase localMediaBrowserImplBase = this$0;
        mServiceConnection = new MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection(localMediaBrowserImplBase);
        boolean bool1 = false;
        boolean bool2;
        try
        {
          localMediaBrowserImplBase = this$0;
          bool2 = mContext.bindService((Intent)localObject, mServiceConnection, 1);
        }
        catch (Exception localException)
        {
          localStringBuilder = z2.t("Failed binding to service ");
          localStringBuilder.append(this$0.mServiceComponent);
          Log.e("MediaBrowserCompat", localStringBuilder.toString());
          bool2 = bool1;
        }
        if (!bool2)
        {
          this$0.forceCloseConnection();
          this$0.mCallback.onConnectionFailed();
        }
        if (MediaBrowserCompat.DEBUG)
        {
          Log.d("MediaBrowserCompat", "connect...");
          this$0.dump();
        }
        return;
      }
      localStringBuilder = z2.t("mCallbacksMessenger should be null. Instead it is ");
      localStringBuilder.append(this$0.mCallbacksMessenger);
      throw new RuntimeException(localStringBuilder.toString());
    }
    StringBuilder localStringBuilder = z2.t("mServiceBinderWrapper should be null. Instead it is ");
    localStringBuilder.append(this$0.mServiceBinderWrapper);
    throw new RuntimeException(localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */