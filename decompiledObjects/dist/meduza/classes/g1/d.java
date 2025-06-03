package g1;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.os.a;

public final class d
  extends c.i<MediaBrowserCompat.MediaItem>
{
  public d(String paramString, a parama)
  {
    super(paramString);
  }
  
  public final void d(Object paramObject)
  {
    MediaBrowserCompat.MediaItem localMediaItem = (MediaBrowserCompat.MediaItem)paramObject;
    if ((e & 0x2) != 0)
    {
      f.b(-1, null);
    }
    else
    {
      paramObject = new Bundle();
      ((Bundle)paramObject).putParcelable("media_item", localMediaItem);
      f.b(0, (Bundle)paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     g1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */