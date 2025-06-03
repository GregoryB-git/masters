package androidx.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.BrowserRoot;
import android.service.media.MediaBrowserService.Result;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(21)
class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21
  extends MediaBrowserService
{
  public MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi21(MediaBrowserServiceCompat.MediaBrowserServiceImplApi21 paramMediaBrowserServiceImplApi21, Context paramContext)
  {
    attachBaseContext(paramContext);
  }
  
  @SuppressLint({"SyntheticAccessor"})
  public MediaBrowserService.BrowserRoot onGetRoot(String paramString, int paramInt, Bundle paramBundle)
  {
    MediaSessionCompat.ensureClassLoader(paramBundle);
    MediaBrowserServiceCompat.MediaBrowserServiceImplApi21 localMediaBrowserServiceImplApi21 = this$1;
    Object localObject = null;
    if (paramBundle == null) {
      paramBundle = null;
    } else {
      paramBundle = new Bundle(paramBundle);
    }
    paramString = localMediaBrowserServiceImplApi21.onGetRoot(paramString, paramInt, paramBundle);
    if (paramString == null) {
      paramString = (String)localObject;
    } else {
      paramString = new MediaBrowserService.BrowserRoot(MediaBrowserServiceCompat.BrowserRoot.access$000(paramString), MediaBrowserServiceCompat.BrowserRoot.access$100(paramString));
    }
    return paramString;
  }
  
  public void onLoadChildren(String paramString, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> paramResult)
  {
    this$1.onLoadChildren(paramString, new MediaBrowserServiceCompat.ResultWrapper(paramResult));
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.MediaBrowserServiceApi21
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */