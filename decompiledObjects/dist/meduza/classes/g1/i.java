package g1;

import android.os.Parcel;
import android.service.media.MediaBrowserService.Result;
import android.support.v4.media.MediaBrowserCompat.MediaItem;

public final class i
  extends c.i<MediaBrowserCompat.MediaItem>
{
  public i(Object paramObject, c.j paramj)
  {
    super(paramObject);
  }
  
  public final void a()
  {
    f.a.detach();
  }
  
  public final void d(Object paramObject)
  {
    Object localObject = (MediaBrowserCompat.MediaItem)paramObject;
    if (localObject == null)
    {
      localObject = f;
      paramObject = null;
    }
    else
    {
      paramObject = Parcel.obtain();
      ((MediaBrowserCompat.MediaItem)localObject).writeToParcel((Parcel)paramObject, 0);
      localObject = f;
    }
    ((c.j)localObject).a(paramObject);
  }
}

/* Location:
 * Qualified Name:     g1.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */