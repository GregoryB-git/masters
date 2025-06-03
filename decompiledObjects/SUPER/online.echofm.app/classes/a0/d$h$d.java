package a0;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.BrowserRoot;
import android.service.media.MediaBrowserService.Result;
import android.support.v4.media.session.MediaSessionCompat;

public abstract class d$h$d
  extends MediaBrowserService
{
  public d$h$d(d.h paramh, Context paramContext)
  {
    attachBaseContext(paramContext);
  }
  
  public MediaBrowserService.BrowserRoot onGetRoot(String paramString, int paramInt, Bundle paramBundle)
  {
    MediaSessionCompat.a(paramBundle);
    d.h localh = o;
    Object localObject = null;
    if (paramBundle == null) {
      paramBundle = null;
    } else {
      paramBundle = new Bundle(paramBundle);
    }
    paramString = localh.h(paramString, paramInt, paramBundle);
    if (paramString == null) {
      paramString = (String)localObject;
    } else {
      paramString = new MediaBrowserService.BrowserRoot(d.e.a(paramString), d.e.b(paramString));
    }
    return paramString;
  }
  
  public void onLoadChildren(String paramString, MediaBrowserService.Result paramResult)
  {
    o.i(paramString, new d.m(paramResult));
  }
}

/* Location:
 * Qualified Name:     a0.d.h.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */