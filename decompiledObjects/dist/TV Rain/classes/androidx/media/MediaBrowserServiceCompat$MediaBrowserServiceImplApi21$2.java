package androidx.media;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$2
  extends MediaBrowserServiceCompat.Result<List<MediaBrowserCompat.MediaItem>>
{
  public MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$2(MediaBrowserServiceCompat.MediaBrowserServiceImplApi21 paramMediaBrowserServiceImplApi21, Object paramObject, MediaBrowserServiceCompat.ResultWrapper paramResultWrapper)
  {
    super(paramObject);
  }
  
  public void detach()
  {
    val$resultWrapper.detach();
  }
  
  public void onResultSent(@Nullable List<MediaBrowserCompat.MediaItem> paramList)
  {
    if (paramList != null)
    {
      ArrayList localArrayList = new ArrayList(paramList.size());
      Iterator localIterator = paramList.iterator();
      for (;;)
      {
        paramList = localArrayList;
        if (!localIterator.hasNext()) {
          break;
        }
        paramList = (MediaBrowserCompat.MediaItem)localIterator.next();
        Parcel localParcel = Parcel.obtain();
        paramList.writeToParcel(localParcel, 0);
        localArrayList.add(localParcel);
      }
    }
    paramList = null;
    val$resultWrapper.sendResult(paramList);
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */