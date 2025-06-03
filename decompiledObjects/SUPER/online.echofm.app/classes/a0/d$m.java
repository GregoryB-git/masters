package a0;

import android.media.browse.MediaBrowser.MediaItem;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.service.media.MediaBrowserService.Result;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d$m
{
  public MediaBrowserService.Result a;
  
  public d$m(MediaBrowserService.Result paramResult)
  {
    a = paramResult;
  }
  
  public void a()
  {
    a.detach();
  }
  
  public List b(List paramList)
  {
    if (paramList == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (Parcel)localIterator.next();
      paramList.setDataPosition(0);
      localArrayList.add((MediaBrowser.MediaItem)MediaBrowser.MediaItem.CREATOR.createFromParcel(paramList));
      paramList.recycle();
    }
    return localArrayList;
  }
  
  public void c(Object paramObject)
  {
    if ((paramObject instanceof List))
    {
      a.sendResult(b((List)paramObject));
    }
    else if ((paramObject instanceof Parcel))
    {
      paramObject = (Parcel)paramObject;
      ((Parcel)paramObject).setDataPosition(0);
      a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel((Parcel)paramObject));
      ((Parcel)paramObject).recycle();
    }
    else
    {
      a.sendResult(null);
    }
  }
}

/* Location:
 * Qualified Name:     a0.d.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */