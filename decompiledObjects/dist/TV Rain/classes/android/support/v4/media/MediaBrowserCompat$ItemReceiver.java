package android.support.v4.media;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;

class MediaBrowserCompat$ItemReceiver
  extends ResultReceiver
{
  private final MediaBrowserCompat.ItemCallback mCallback;
  private final String mMediaId;
  
  public MediaBrowserCompat$ItemReceiver(String paramString, MediaBrowserCompat.ItemCallback paramItemCallback, Handler paramHandler)
  {
    super(paramHandler);
    mMediaId = paramString;
    mCallback = paramItemCallback;
  }
  
  public void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    Bundle localBundle = paramBundle;
    if (paramBundle != null) {
      localBundle = MediaSessionCompat.unparcelWithClassLoader(paramBundle);
    }
    if ((paramInt == 0) && (localBundle != null) && (localBundle.containsKey("media_item")))
    {
      paramBundle = localBundle.getParcelable("media_item");
      if ((paramBundle != null) && (!(paramBundle instanceof MediaBrowserCompat.MediaItem))) {
        mCallback.onError(mMediaId);
      } else {
        mCallback.onItemLoaded((MediaBrowserCompat.MediaItem)paramBundle);
      }
      return;
    }
    mCallback.onError(mMediaId);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.ItemReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */