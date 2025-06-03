package a0;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import b.b;
import java.util.List;

public class d$c
  extends d.l
{
  public d$c(d paramd, Object paramObject, b paramb)
  {
    super(paramObject);
  }
  
  public void h(List paramList)
  {
    if (((b() & 0x4) == 0) && (paramList != null))
    {
      Bundle localBundle = new Bundle();
      localBundle.putParcelableArray("search_results", (Parcelable[])paramList.toArray(new MediaBrowserCompat.MediaItem[0]));
      f.b(0, localBundle);
      return;
    }
    f.b(-1, null);
  }
}

/* Location:
 * Qualified Name:     a0.d.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */