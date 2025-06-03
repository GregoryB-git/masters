package a0;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class d$h$b
  extends d.l
{
  public d$h$b(d.h paramh, Object paramObject, d.m paramm)
  {
    super(paramObject);
  }
  
  public void a()
  {
    f.a();
  }
  
  public void h(List paramList)
  {
    if (paramList == null)
    {
      if (Build.VERSION.SDK_INT >= 24) {
        paramList = null;
      } else {
        paramList = Collections.emptyList();
      }
    }
    else
    {
      ArrayList localArrayList = new ArrayList(paramList.size());
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        MediaBrowserCompat.MediaItem localMediaItem = (MediaBrowserCompat.MediaItem)localIterator.next();
        paramList = Parcel.obtain();
        localMediaItem.writeToParcel(paramList, 0);
        localArrayList.add(paramList);
      }
      paramList = localArrayList;
    }
    f.c(paramList);
  }
}

/* Location:
 * Qualified Name:     a0.d.h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */