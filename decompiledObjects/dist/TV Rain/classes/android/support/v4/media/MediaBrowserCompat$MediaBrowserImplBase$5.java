package android.support.v4.media;

import android.os.Bundle;

class MediaBrowserCompat$MediaBrowserImplBase$5
  implements Runnable
{
  public MediaBrowserCompat$MediaBrowserImplBase$5(MediaBrowserCompat.MediaBrowserImplBase paramMediaBrowserImplBase, MediaBrowserCompat.SearchCallback paramSearchCallback, String paramString, Bundle paramBundle) {}
  
  public void run()
  {
    val$callback.onError(val$query, val$extras);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */