package androidx.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.service.media.MediaBrowserService.Result;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RequiresApi(21)
class MediaBrowserServiceCompat$ResultWrapper<T>
{
  public MediaBrowserService.Result mResultFwk;
  
  public MediaBrowserServiceCompat$ResultWrapper(MediaBrowserService.Result paramResult)
  {
    mResultFwk = paramResult;
  }
  
  public void detach()
  {
    mResultFwk.detach();
  }
  
  public List<MediaBrowser.MediaItem> parcelListToItemList(List<Parcel> paramList)
  {
    if (paramList == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Parcel localParcel = (Parcel)paramList.next();
      localParcel.setDataPosition(0);
      localArrayList.add((MediaBrowser.MediaItem)MediaBrowser.MediaItem.CREATOR.createFromParcel(localParcel));
      localParcel.recycle();
    }
    return localArrayList;
  }
  
  public void sendResult(T paramT)
  {
    if ((paramT instanceof List))
    {
      mResultFwk.sendResult(parcelListToItemList((List)paramT));
    }
    else if ((paramT instanceof Parcel))
    {
      paramT = (Parcel)paramT;
      paramT.setDataPosition(0);
      mResultFwk.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(paramT));
      paramT.recycle();
    }
    else
    {
      mResultFwk.sendResult(null);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.ResultWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */