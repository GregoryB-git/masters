package g1;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.os.a;
import java.util.List;

public final class e
  extends c.i<List<MediaBrowserCompat.MediaItem>>
{
  public e(String paramString, a parama)
  {
    super(paramString);
  }
  
  public final void d(Object paramObject)
  {
    List localList = (List)paramObject;
    if (((e & 0x4) == 0) && (localList != null))
    {
      paramObject = new Bundle();
      ((Bundle)paramObject).putParcelableArray("search_results", (Parcelable[])localList.toArray(new MediaBrowserCompat.MediaItem[0]));
      f.b(0, (Bundle)paramObject);
    }
    else
    {
      f.b(-1, null);
    }
  }
}

/* Location:
 * Qualified Name:     g1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */