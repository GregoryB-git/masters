package g1;

import android.os.Parcel;
import android.service.media.MediaBrowserService.Result;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g
  extends c.i<List<MediaBrowserCompat.MediaItem>>
{
  public g(Object paramObject, c.j paramj)
  {
    super(paramObject);
  }
  
  public final void a()
  {
    f.a.detach();
  }
  
  public final void d(Object paramObject)
  {
    paramObject = (List)paramObject;
    if (paramObject != null)
    {
      ArrayList localArrayList = new ArrayList(((List)paramObject).size());
      Iterator localIterator = ((List)paramObject).iterator();
      for (;;)
      {
        paramObject = localArrayList;
        if (!localIterator.hasNext()) {
          break;
        }
        paramObject = (MediaBrowserCompat.MediaItem)localIterator.next();
        Parcel localParcel = Parcel.obtain();
        ((MediaBrowserCompat.MediaItem)paramObject).writeToParcel(localParcel, 0);
        localArrayList.add(localParcel);
      }
    }
    paramObject = null;
    f.a(paramObject);
  }
}

/* Location:
 * Qualified Name:     g1.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */