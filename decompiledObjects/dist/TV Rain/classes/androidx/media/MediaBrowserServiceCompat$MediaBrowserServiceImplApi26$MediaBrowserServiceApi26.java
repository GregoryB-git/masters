package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import android.service.media.MediaBrowserService.Result;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

class MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$MediaBrowserServiceApi26
  extends MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.MediaBrowserServiceApi23
{
  public MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$MediaBrowserServiceApi26(MediaBrowserServiceCompat.MediaBrowserServiceImplApi26 paramMediaBrowserServiceImplApi26, Context paramContext)
  {
    super(paramMediaBrowserServiceImplApi26, paramContext);
  }
  
  public void onLoadChildren(String paramString, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> paramResult, Bundle paramBundle)
  {
    MediaSessionCompat.ensureClassLoader(paramBundle);
    MediaBrowserServiceCompat.MediaBrowserServiceImplApi26 localMediaBrowserServiceImplApi26 = this$1;
    MediaBrowserServiceCompat localMediaBrowserServiceCompat = this$0;
    mCurConnection = mConnectionFromFwk;
    localMediaBrowserServiceImplApi26.onLoadChildren(paramString, new MediaBrowserServiceCompat.ResultWrapper(paramResult), paramBundle);
    this$1.this$0.mCurConnection = null;
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.MediaBrowserServiceApi26
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */