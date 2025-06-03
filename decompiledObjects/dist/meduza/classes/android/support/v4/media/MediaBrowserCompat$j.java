package android.support.v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.media.browse.MediaBrowser.SubscriptionCallback;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

public abstract class MediaBrowserCompat$j
{
  public MediaBrowserCompat$j()
  {
    new Binder();
    if (Build.VERSION.SDK_INT >= 26) {
      new b();
    } else {
      new a();
    }
  }
  
  public class a
    extends MediaBrowser.SubscriptionCallback
  {
    public a() {}
    
    public final void onChildrenLoaded(String paramString, List<MediaBrowser.MediaItem> paramList)
    {
      getClass();
      paramString = MediaBrowserCompat.j.this;
      MediaBrowserCompat.MediaItem.a(paramList);
      paramString.getClass();
    }
    
    public final void onError(String paramString)
    {
      getClass();
    }
  }
  
  public final class b
    extends MediaBrowserCompat.j.a
  {
    public b()
    {
      super();
    }
    
    public final void onChildrenLoaded(String paramString, List<MediaBrowser.MediaItem> paramList, Bundle paramBundle)
    {
      MediaSessionCompat.a(paramBundle);
      paramString = MediaBrowserCompat.j.this;
      MediaBrowserCompat.MediaItem.a(paramList);
      paramString.getClass();
    }
    
    public final void onError(String paramString, Bundle paramBundle)
    {
      MediaSessionCompat.a(paramBundle);
      getClass();
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */