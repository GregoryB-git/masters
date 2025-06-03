package a0;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat.MediaItem;

public class d$i$a
  extends d.l
{
  public d$i$a(d.i parami, Object paramObject, d.m paramm)
  {
    super(paramObject);
  }
  
  public void a()
  {
    f.a();
  }
  
  public void h(MediaBrowserCompat.MediaItem paramMediaItem)
  {
    Object localObject;
    if (paramMediaItem == null)
    {
      localObject = f;
      paramMediaItem = null;
    }
    for (;;)
    {
      ((d.m)localObject).c(paramMediaItem);
      break;
      localObject = Parcel.obtain();
      paramMediaItem.writeToParcel((Parcel)localObject, 0);
      d.m localm = f;
      paramMediaItem = (MediaBrowserCompat.MediaItem)localObject;
      localObject = localm;
    }
  }
}

/* Location:
 * Qualified Name:     a0.d.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */