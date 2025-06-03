package android.support.v4.media;

import a;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.util.Log;

class MediaBrowserCompat$CustomActionResultReceiver
  extends ResultReceiver
{
  private final String mAction;
  private final MediaBrowserCompat.CustomActionCallback mCallback;
  private final Bundle mExtras;
  
  public MediaBrowserCompat$CustomActionResultReceiver(String paramString, Bundle paramBundle, MediaBrowserCompat.CustomActionCallback paramCustomActionCallback, Handler paramHandler)
  {
    super(paramHandler);
    mAction = paramString;
    mExtras = paramBundle;
    mCallback = paramCustomActionCallback;
  }
  
  public void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    if (mCallback == null) {
      return;
    }
    MediaSessionCompat.ensureClassLoader(paramBundle);
    if (paramInt != -1)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          StringBuilder localStringBuilder = a.r("Unknown result code: ", paramInt, " (extras=");
          localStringBuilder.append(mExtras);
          localStringBuilder.append(", resultData=");
          localStringBuilder.append(paramBundle);
          localStringBuilder.append(")");
          Log.w("MediaBrowserCompat", localStringBuilder.toString());
        }
        else
        {
          mCallback.onProgressUpdate(mAction, mExtras, paramBundle);
        }
      }
      else {
        mCallback.onResult(mAction, mExtras, paramBundle);
      }
    }
    else {
      mCallback.onError(mAction, mExtras, paramBundle);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.CustomActionResultReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */