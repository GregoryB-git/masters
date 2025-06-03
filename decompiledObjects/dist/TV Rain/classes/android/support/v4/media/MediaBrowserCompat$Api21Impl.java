package android.support.v4.media;

import android.media.MediaDescription;
import android.media.browse.MediaBrowser.MediaItem;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class MediaBrowserCompat$Api21Impl
{
  @DoNotInline
  public static MediaDescription getDescription(MediaBrowser.MediaItem paramMediaItem)
  {
    return paramMediaItem.getDescription();
  }
  
  @DoNotInline
  public static int getFlags(MediaBrowser.MediaItem paramMediaItem)
  {
    return paramMediaItem.getFlags();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */