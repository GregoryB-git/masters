package androidx.media;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import androidx.annotation.Nullable;

class MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$1
  extends MediaBrowserServiceCompat.Result<MediaBrowserCompat.MediaItem>
{
  public MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$1(MediaBrowserServiceCompat.MediaBrowserServiceImplApi23 paramMediaBrowserServiceImplApi23, Object paramObject, MediaBrowserServiceCompat.ResultWrapper paramResultWrapper)
  {
    super(paramObject);
  }
  
  public void detach()
  {
    val$resultWrapper.detach();
  }
  
  public void onResultSent(@Nullable MediaBrowserCompat.MediaItem paramMediaItem)
  {
    if (paramMediaItem == null)
    {
      val$resultWrapper.sendResult(null);
    }
    else
    {
      Parcel localParcel = Parcel.obtain();
      paramMediaItem.writeToParcel(localParcel, 0);
      val$resultWrapper.sendResult(localParcel);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */