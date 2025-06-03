package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser.MediaItem;
import android.service.media.MediaBrowserService.Result;

class MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23
  extends MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.MediaBrowserServiceApi21
{
  public MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi23(MediaBrowserServiceCompat.MediaBrowserServiceImplApi23 paramMediaBrowserServiceImplApi23, Context paramContext)
  {
    super(paramMediaBrowserServiceImplApi23, paramContext);
  }
  
  public void onLoadItem(String paramString, MediaBrowserService.Result<MediaBrowser.MediaItem> paramResult)
  {
    this$1.onLoadItem(paramString, new MediaBrowserServiceCompat.ResultWrapper(paramResult));
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.MediaBrowserServiceApi23
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */