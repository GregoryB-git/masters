package g1;

import android.media.browse.MediaBrowser.MediaItem;
import android.service.media.MediaBrowserService.Result;

public class c$f$a
  extends c.e.a
{
  public c$f$a(c.f paramf, c paramc)
  {
    super(paramf, paramc);
  }
  
  public final void onLoadItem(String paramString, MediaBrowserService.Result<MediaBrowser.MediaItem> paramResult)
  {
    c.f localf = b;
    paramResult = new c.j(paramResult);
    localf.getClass();
    paramResult = new i(paramString, paramResult);
    c localc = e;
    c.c localc1 = b;
    localc.e(paramString, paramResult);
    e.getClass();
  }
}

/* Location:
 * Qualified Name:     g1.c.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */