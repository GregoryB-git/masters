package androidx.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.os.ResultReceiver;
import androidx.annotation.Nullable;
import java.util.List;

class MediaBrowserServiceCompat$3
  extends MediaBrowserServiceCompat.Result<List<MediaBrowserCompat.MediaItem>>
{
  public MediaBrowserServiceCompat$3(MediaBrowserServiceCompat paramMediaBrowserServiceCompat, Object paramObject, ResultReceiver paramResultReceiver)
  {
    super(paramObject);
  }
  
  public void onResultSent(@Nullable List<MediaBrowserCompat.MediaItem> paramList)
  {
    if (((getFlags() & 0x4) == 0) && (paramList != null))
    {
      Bundle localBundle = new Bundle();
      localBundle.putParcelableArray("search_results", (Parcelable[])paramList.toArray(new MediaBrowserCompat.MediaItem[0]));
      val$receiver.send(0, localBundle);
      return;
    }
    val$receiver.send(-1, null);
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */