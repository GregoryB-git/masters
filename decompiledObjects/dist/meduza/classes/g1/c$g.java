package g1;

import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.Result;
import android.support.v4.media.session.MediaSessionCompat;
import b0.f;
import java.util.List;

public class c$g
  extends c.f
{
  public c$g(c paramc)
  {
    super(paramc);
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    f.j(b, paramString, paramBundle);
  }
  
  public final void onCreate()
  {
    a locala = new a(f);
    b = locala;
    locala.onCreate();
  }
  
  public final class a
    extends c.f.a
  {
    public a(c paramc)
    {
      super(paramc);
    }
    
    public final void onLoadChildren(String paramString, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> paramResult, Bundle paramBundle)
    {
      MediaSessionCompat.a(paramBundle);
      Object localObject1 = f;
      Object localObject2 = b;
      localObject1.getClass();
      localObject1 = c.g.this;
      paramResult = new c.j(paramResult);
      localObject1.getClass();
      j localj = new j((c.g)localObject1, paramString, paramResult, paramBundle);
      localObject2 = f;
      paramResult = b;
      ((c)localObject2).c(paramBundle, localj, paramString);
      f.getClass();
      f.getClass();
    }
  }
}

/* Location:
 * Qualified Name:     g1.c.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */