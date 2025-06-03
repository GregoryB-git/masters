package android.support.v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

public final class MediaBrowserCompat$j$b
  extends MediaBrowserCompat.j.a
{
  public MediaBrowserCompat$j$b(MediaBrowserCompat.j paramj)
  {
    super(paramj);
  }
  
  public final void onChildrenLoaded(String paramString, List<MediaBrowser.MediaItem> paramList, Bundle paramBundle)
  {
    MediaSessionCompat.a(paramBundle);
    paramString = b;
    MediaBrowserCompat.MediaItem.a(paramList);
    paramString.getClass();
  }
  
  public final void onError(String paramString, Bundle paramBundle)
  {
    MediaSessionCompat.a(paramBundle);
    b.getClass();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.j.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */