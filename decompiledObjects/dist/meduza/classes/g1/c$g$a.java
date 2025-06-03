package g1;

import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import android.service.media.MediaBrowserService.Result;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

public final class c$g$a
  extends c.f.a
{
  public c$g$a(c.g paramg, c paramc)
  {
    super(paramg, paramc);
  }
  
  public final void onLoadChildren(String paramString, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> paramResult, Bundle paramBundle)
  {
    MediaSessionCompat.a(paramBundle);
    Object localObject1 = c.f;
    Object localObject2 = b;
    localObject1.getClass();
    localObject1 = c;
    paramResult = new c.j(paramResult);
    localObject1.getClass();
    j localj = new j((c.g)localObject1, paramString, paramResult, paramBundle);
    localObject2 = f;
    paramResult = b;
    ((c)localObject2).c(paramBundle, localj, paramString);
    f.getClass();
    c.f.getClass();
  }
}

/* Location:
 * Qualified Name:     g1.c.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */