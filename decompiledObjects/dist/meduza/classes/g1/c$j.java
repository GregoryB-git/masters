package g1;

import android.media.browse.MediaBrowser.MediaItem;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.service.media.MediaBrowserService.Result;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c$j<T>
{
  public MediaBrowserService.Result a;
  
  public c$j(MediaBrowserService.Result paramResult)
  {
    a = paramResult;
  }
  
  public final void a(T paramT)
  {
    boolean bool = paramT instanceof List;
    ArrayList localArrayList = null;
    if (bool)
    {
      MediaBrowserService.Result localResult = a;
      paramT = (List)paramT;
      if (paramT == null)
      {
        paramT = localArrayList;
      }
      else
      {
        localArrayList = new ArrayList(paramT.size());
        Iterator localIterator = paramT.iterator();
        for (;;)
        {
          paramT = localArrayList;
          if (!localIterator.hasNext()) {
            break;
          }
          paramT = (Parcel)localIterator.next();
          paramT.setDataPosition(0);
          localArrayList.add((MediaBrowser.MediaItem)MediaBrowser.MediaItem.CREATOR.createFromParcel(paramT));
          paramT.recycle();
        }
      }
      localResult.sendResult(paramT);
    }
    else if ((paramT instanceof Parcel))
    {
      paramT = (Parcel)paramT;
      paramT.setDataPosition(0);
      a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(paramT));
      paramT.recycle();
    }
    else
    {
      a.sendResult(null);
    }
  }
}

/* Location:
 * Qualified Name:     g1.c.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */