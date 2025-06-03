package android.support.v4.media;

import android.media.MediaDescription;
import android.media.browse.MediaBrowser.MediaItem;

public final class MediaBrowserCompat$a
{
  public static MediaDescription a(MediaBrowser.MediaItem paramMediaItem)
  {
    return paramMediaItem.getDescription();
  }
  
  public static int b(MediaBrowser.MediaItem paramMediaItem)
  {
    return paramMediaItem.getFlags();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */