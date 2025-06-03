package android.support.v4.media;

import android.media.browse.MediaBrowser.ItemCallback;
import android.media.browse.MediaBrowser.MediaItem;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public abstract class MediaBrowserCompat$ItemCallback
{
  public final MediaBrowser.ItemCallback mItemCallbackFwk = new ItemCallbackApi23();
  
  public void onError(@NonNull String paramString) {}
  
  public void onItemLoaded(MediaBrowserCompat.MediaItem paramMediaItem) {}
  
  @RequiresApi(23)
  public class ItemCallbackApi23
    extends MediaBrowser.ItemCallback
  {
    public ItemCallbackApi23() {}
    
    public void onError(@NonNull String paramString)
    {
      MediaBrowserCompat.ItemCallback.this.onError(paramString);
    }
    
    public void onItemLoaded(MediaBrowser.MediaItem paramMediaItem)
    {
      onItemLoaded(MediaBrowserCompat.MediaItem.fromMediaItem(paramMediaItem));
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.ItemCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */