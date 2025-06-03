package g1;

import android.media.browse.MediaBrowser.MediaItem;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.Result;

public class c$f
  extends c.e
{
  public c$f(c paramc)
  {
    super(paramc);
  }
  
  public void onCreate()
  {
    a locala = new a(e);
    b = locala;
    locala.onCreate();
  }
  
  public class a
    extends c.e.a
  {
    public a(c paramc)
    {
      super(paramc);
    }
    
    public final void onLoadItem(String paramString, MediaBrowserService.Result<MediaBrowser.MediaItem> paramResult)
    {
      c.f localf = c.f.this;
      paramResult = new c.j(paramResult);
      localf.getClass();
      paramResult = new i(paramString, paramResult);
      c localc = e;
      c.c localc1 = b;
      localc.e(paramString, paramResult);
      e.getClass();
    }
  }
}

/* Location:
 * Qualified Name:     g1.c.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */