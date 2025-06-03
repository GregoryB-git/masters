package a0;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import b.b;

public class d$b
  extends d.l
{
  public d$b(d paramd, Object paramObject, b paramb)
  {
    super(paramObject);
  }
  
  public void h(MediaBrowserCompat.MediaItem paramMediaItem)
  {
    if ((b() & 0x2) != 0)
    {
      f.b(-1, null);
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("media_item", paramMediaItem);
    f.b(0, localBundle);
  }
}

/* Location:
 * Qualified Name:     a0.d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */