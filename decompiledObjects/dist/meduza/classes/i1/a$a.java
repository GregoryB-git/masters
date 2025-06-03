package i1;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaController;
import android.media.session.MediaSession.Token;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.c;
import android.support.v4.media.MediaBrowserCompat.d;
import android.support.v4.media.MediaBrowserCompat.e;
import android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.view.KeyEvent;
import java.util.concurrent.ConcurrentHashMap;

public final class a$a
  extends MediaBrowserCompat.c
{
  public final Context c;
  public final Intent d;
  public final BroadcastReceiver.PendingResult e;
  public MediaBrowserCompat f;
  
  public a$a(Context paramContext, Intent paramIntent, BroadcastReceiver.PendingResult paramPendingResult)
  {
    c = paramContext;
    d = paramIntent;
    e = paramPendingResult;
  }
  
  public final void a()
  {
    Object localObject1 = c;
    MediaBrowserCompat.e locale = f.a;
    if (h == null)
    {
      MediaSession.Token localToken = b.getSessionToken();
      localObject2 = null;
      if (localToken != null) {
        localObject2 = new MediaSessionCompat.Token(localToken, null, null);
      }
      h = ((MediaSessionCompat.Token)localObject2);
    }
    Object localObject2 = h;
    new ConcurrentHashMap();
    if (localObject2 != null)
    {
      localObject1 = new MediaControllerCompat.MediaControllerImplApi21((Context)localObject1, (MediaSessionCompat.Token)localObject2);
      localObject2 = (KeyEvent)d.getParcelableExtra("android.intent.extra.KEY_EVENT");
      if (localObject2 != null)
      {
        a.dispatchMediaButtonEvent((KeyEvent)localObject2);
        f.a();
        e.finish();
        return;
      }
      throw new IllegalArgumentException("KeyEvent may not be null");
    }
    throw new IllegalArgumentException("sessionToken must not be null");
  }
  
  public final void b()
  {
    f.a();
    e.finish();
  }
  
  public final void c()
  {
    f.a();
    e.finish();
  }
}

/* Location:
 * Qualified Name:     i1.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */