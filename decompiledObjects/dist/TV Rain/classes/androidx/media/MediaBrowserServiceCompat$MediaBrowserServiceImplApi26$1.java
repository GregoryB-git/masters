package androidx.media;

import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$1
  extends MediaBrowserServiceCompat.Result<List<MediaBrowserCompat.MediaItem>>
{
  public MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$1(MediaBrowserServiceCompat.MediaBrowserServiceImplApi26 paramMediaBrowserServiceImplApi26, Object paramObject, MediaBrowserServiceCompat.ResultWrapper paramResultWrapper, Bundle paramBundle)
  {
    super(paramObject);
  }
  
  public void detach()
  {
    val$resultWrapper.detach();
  }
  
  public void onResultSent(@Nullable List<MediaBrowserCompat.MediaItem> paramList)
  {
    if (paramList == null)
    {
      val$resultWrapper.sendResult(null);
      return;
    }
    Object localObject = paramList;
    if ((getFlags() & 0x1) != 0) {
      localObject = this$1.this$0.applyOptions(paramList, val$options);
    }
    paramList = new ArrayList(((List)localObject).size());
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      MediaBrowserCompat.MediaItem localMediaItem = (MediaBrowserCompat.MediaItem)((Iterator)localObject).next();
      Parcel localParcel = Parcel.obtain();
      localMediaItem.writeToParcel(localParcel, 0);
      paramList.add(localParcel);
    }
    val$resultWrapper.sendResult(paramList);
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */