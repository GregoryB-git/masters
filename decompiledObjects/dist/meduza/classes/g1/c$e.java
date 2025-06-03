package g1;

import android.content.ContextWrapper;
import android.media.browse.MediaBrowser.MediaItem;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.BrowserRoot;
import android.service.media.MediaBrowserService.Result;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import java.util.ArrayList;
import java.util.List;

public class c$e
  implements c.d
{
  public final ArrayList a = new ArrayList();
  public a b;
  public Messenger c;
  
  public c$e(c paramc) {}
  
  public void a(Bundle paramBundle, String paramString)
  {
    b.notifyChildrenChanged(paramString);
  }
  
  public class a
    extends MediaBrowserService
  {
    public a(c paramc)
    {
      attachBaseContext(paramc);
    }
    
    public final MediaBrowserService.BrowserRoot onGetRoot(String paramString, int paramInt, Bundle paramBundle)
    {
      MediaSessionCompat.a(paramBundle);
      c.e locale = c.e.this;
      Object localObject1 = null;
      if (paramBundle == null) {
        localObject2 = null;
      } else {
        localObject2 = new Bundle(paramBundle);
      }
      Bundle localBundle;
      if (localObject2 != null)
      {
        locale.getClass();
        if (((BaseBundle)localObject2).getInt("extra_client_version", 0) != 0)
        {
          ((Bundle)localObject2).remove("extra_client_version");
          c = new Messenger(d.e);
          localBundle = new Bundle();
          localBundle.putInt("extra_service_version", 2);
          localBundle.putBinder("extra_messenger", c.getBinder());
          paramBundle = d.f;
          if (paramBundle != null)
          {
            paramBundle = paramBundle.a();
            if (paramBundle == null) {
              paramBundle = null;
            } else {
              paramBundle = paramBundle.asBinder();
            }
            localBundle.putBinder("extra_session_binder", paramBundle);
          }
          else
          {
            a.add(localBundle);
          }
          i = ((BaseBundle)localObject2).getInt("extra_calling_pid", -1);
          ((Bundle)localObject2).remove("extra_calling_pid");
          paramBundle = localBundle;
          break label198;
        }
      }
      int i = -1;
      paramBundle = null;
      label198:
      paramString = new c.c(d, paramString, i, paramInt, null);
      d.getClass();
      Object localObject2 = d.b((Bundle)localObject2);
      d.getClass();
      if (localObject2 == null)
      {
        paramString = null;
      }
      else
      {
        if (c != null) {
          d.c.add(paramString);
        }
        if (paramBundle == null)
        {
          paramString = b;
        }
        else
        {
          localBundle = b;
          paramString = paramBundle;
          if (localBundle != null)
          {
            paramBundle.putAll(localBundle);
            paramString = paramBundle;
          }
        }
        paramString = new c.b(paramString, a);
      }
      if (paramString == null) {
        paramString = (String)localObject1;
      } else {
        paramString = new MediaBrowserService.BrowserRoot(a, b);
      }
      return paramString;
    }
    
    public final void onLoadChildren(String paramString, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> paramResult)
    {
      c.e locale = c.e.this;
      paramResult = new c.j(paramResult);
      locale.getClass();
      paramResult = new g(paramString, paramResult);
      c localc = d;
      c.c localc1 = b;
      localc.d(paramString, paramResult);
      d.getClass();
    }
  }
}

/* Location:
 * Qualified Name:     g1.c.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */