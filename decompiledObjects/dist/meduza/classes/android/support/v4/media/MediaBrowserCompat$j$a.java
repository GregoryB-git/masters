package android.support.v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.media.browse.MediaBrowser.SubscriptionCallback;
import java.util.List;

public class MediaBrowserCompat$j$a
  extends MediaBrowser.SubscriptionCallback
{
  public MediaBrowserCompat$j$a(MediaBrowserCompat.j paramj) {}
  
  public final void onChildrenLoaded(String paramString, List<MediaBrowser.MediaItem> paramList)
  {
    a.getClass();
    paramString = a;
    MediaBrowserCompat.MediaItem.a(paramList);
    paramString.getClass();
  }
  
  public final void onError(String paramString)
  {
    a.getClass();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */