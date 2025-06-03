package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.b;
import android.support.v4.media.session.b.a;
import android.util.Log;
import java.util.List;
import t.h;
import w.d;

public abstract class MediaBrowserCompat$d
  implements MediaBrowserCompat.c, MediaBrowserCompat.g, MediaBrowserCompat.b.b
{
  public final Context a;
  public final MediaBrowser b;
  public final Bundle c;
  public final MediaBrowserCompat.a d = new MediaBrowserCompat.a(this);
  public final t.a e = new t.a();
  public int f;
  public MediaBrowserCompat.h g;
  public Messenger h;
  public MediaSessionCompat.Token i;
  
  public MediaBrowserCompat$d(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.b paramb, Bundle paramBundle)
  {
    a = paramContext;
    Bundle localBundle = new android/os/Bundle;
    if (paramBundle != null) {
      localBundle.<init>(paramBundle);
    } else {
      localBundle.<init>();
    }
    c = localBundle;
    localBundle.putInt("extra_client_version", 1);
    localBundle.putInt("extra_calling_pid", Process.myPid());
    paramb.d(this);
    b = new MediaBrowser(paramContext, paramComponentName, a, localBundle);
  }
  
  public void a()
  {
    b.connect();
  }
  
  public MediaSessionCompat.Token b()
  {
    if (i == null) {
      i = MediaSessionCompat.Token.a(b.getSessionToken());
    }
    return i;
  }
  
  public void c()
  {
    MediaBrowserCompat.h localh = g;
    if (localh != null)
    {
      Messenger localMessenger = h;
      if (localMessenger != null) {
        try
        {
          localh.c(localMessenger);
        }
        catch (RemoteException localRemoteException)
        {
          Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
        }
      }
    }
    b.disconnect();
  }
  
  public void d(Messenger paramMessenger) {}
  
  public void e(Messenger paramMessenger, String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle) {}
  
  public void f()
  {
    try
    {
      Object localObject1 = b.getExtras();
      if (localObject1 == null) {
        return;
      }
      f = ((BaseBundle)localObject1).getInt("extra_service_version", 0);
      Object localObject2 = d.a((Bundle)localObject1, "extra_messenger");
      if (localObject2 != null)
      {
        g = new MediaBrowserCompat.h((IBinder)localObject2, c);
        localObject2 = new Messenger(d);
        h = ((Messenger)localObject2);
        d.a((Messenger)localObject2);
        try
        {
          g.a(a, h);
        }
        catch (RemoteException localRemoteException)
        {
          Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
        }
      }
      localObject1 = b.a.n(d.a((Bundle)localObject1, "extra_session_binder"));
      if (localObject1 != null) {
        i = MediaSessionCompat.Token.b(b.getSessionToken(), (b)localObject1);
      }
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", localIllegalStateException);
    }
  }
  
  public void g() {}
  
  public void h(Messenger paramMessenger, String paramString, List paramList, Bundle paramBundle1, Bundle paramBundle2)
  {
    if (h != paramMessenger) {
      return;
    }
    a.a(e.get(paramString));
    if (MediaBrowserCompat.b)
    {
      paramMessenger = new StringBuilder();
      paramMessenger.append("onLoadChildren for id that isn't subscribed id=");
      paramMessenger.append(paramString);
      Log.d("MediaBrowserCompat", paramMessenger.toString());
    }
  }
  
  public void i()
  {
    g = null;
    h = null;
    i = null;
    d.a(null);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */