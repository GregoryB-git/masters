package a0;

import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d$j$a
  extends d.l
{
  public d$j$a(d.j paramj, Object paramObject, d.m paramm, Bundle paramBundle)
  {
    super(paramObject);
  }
  
  public void a()
  {
    f.a();
  }
  
  public void h(List paramList)
  {
    Object localObject1;
    if (paramList == null)
    {
      paramList = f;
      localObject1 = null;
    }
    for (;;)
    {
      paramList.c(localObject1);
      return;
      localObject1 = paramList;
      if ((b() & 0x1) != 0) {
        localObject1 = h.f.b(paramList, g);
      }
      paramList = new ArrayList(((List)localObject1).size());
      Object localObject2 = ((List)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (MediaBrowserCompat.MediaItem)((Iterator)localObject2).next();
        Parcel localParcel = Parcel.obtain();
        ((MediaBrowserCompat.MediaItem)localObject1).writeToParcel(localParcel, 0);
        paramList.add(localParcel);
      }
      localObject2 = f;
      localObject1 = paramList;
      paramList = (List)localObject2;
    }
  }
}

/* Location:
 * Qualified Name:     a0.d.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */