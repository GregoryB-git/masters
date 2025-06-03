package androidx.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.os.ResultReceiver;
import androidx.annotation.Nullable;

class MediaBrowserServiceCompat$2
  extends MediaBrowserServiceCompat.Result<MediaBrowserCompat.MediaItem>
{
  public MediaBrowserServiceCompat$2(MediaBrowserServiceCompat paramMediaBrowserServiceCompat, Object paramObject, ResultReceiver paramResultReceiver)
  {
    super(paramObject);
  }
  
  public void onResultSent(@Nullable MediaBrowserCompat.MediaItem paramMediaItem)
  {
    if ((getFlags() & 0x2) != 0)
    {
      val$receiver.send(-1, null);
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("media_item", paramMediaItem);
    val$receiver.send(0, localBundle);
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */