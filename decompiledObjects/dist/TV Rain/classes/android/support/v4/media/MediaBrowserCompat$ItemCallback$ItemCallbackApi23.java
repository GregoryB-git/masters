package android.support.v4.media;

import android.media.browse.MediaBrowser.ItemCallback;
import android.media.browse.MediaBrowser.MediaItem;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class MediaBrowserCompat$ItemCallback$ItemCallbackApi23
  extends MediaBrowser.ItemCallback
{
  public MediaBrowserCompat$ItemCallback$ItemCallbackApi23(MediaBrowserCompat.ItemCallback paramItemCallback) {}
  
  public void onError(@NonNull String paramString)
  {
    this$0.onError(paramString);
  }
  
  public void onItemLoaded(MediaBrowser.MediaItem paramMediaItem)
  {
    this$0.onItemLoaded(MediaBrowserCompat.MediaItem.fromMediaItem(paramMediaItem));
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.ItemCallback.ItemCallbackApi23
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */