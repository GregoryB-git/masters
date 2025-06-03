package g1;

import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService.Result;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class j
  extends c.i<List<MediaBrowserCompat.MediaItem>>
{
  public j(c.g paramg, Object paramObject, c.j paramj, Bundle paramBundle)
  {
    super(paramObject);
  }
  
  public final void a()
  {
    f.a.detach();
  }
  
  public final void d(Object paramObject)
  {
    Object localObject1 = (List)paramObject;
    if (localObject1 == null)
    {
      localObject1 = f;
      paramObject = null;
    }
    else
    {
      paramObject = localObject1;
      if ((e & 0x1) != 0)
      {
        paramObject = h.f;
        localObject2 = g;
        paramObject.getClass();
        paramObject = c.a((List)localObject1, (Bundle)localObject2);
      }
      Object localObject2 = new ArrayList(((List)paramObject).size());
      Iterator localIterator = ((List)paramObject).iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (MediaBrowserCompat.MediaItem)localIterator.next();
        paramObject = Parcel.obtain();
        ((MediaBrowserCompat.MediaItem)localObject1).writeToParcel((Parcel)paramObject, 0);
        ((ArrayList)localObject2).add(paramObject);
      }
      localObject1 = f;
      paramObject = localObject2;
    }
    ((c.j)localObject1).a(paramObject);
  }
}

/* Location:
 * Qualified Name:     g1.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */