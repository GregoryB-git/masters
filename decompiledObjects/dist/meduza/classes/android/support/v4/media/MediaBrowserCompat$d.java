package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.util.Log;
import java.util.ArrayList;
import p2.m0;
import r.b;
import r.h;

public class MediaBrowserCompat$d
  implements MediaBrowserCompat.g, MediaBrowserCompat.c.b
{
  public final Context a;
  public final MediaBrowser b;
  public final Bundle c;
  public final MediaBrowserCompat.b d = new MediaBrowserCompat.b(this);
  public final b<String, MediaBrowserCompat.i> e = new b();
  public MediaBrowserCompat.h f;
  public Messenger g;
  public MediaSessionCompat.Token h;
  
  public MediaBrowserCompat$d(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.c paramc)
  {
    a = paramContext;
    Bundle localBundle = new Bundle();
    c = localBundle;
    localBundle.putInt("extra_client_version", 1);
    localBundle.putInt("extra_calling_pid", Process.myPid());
    b = this;
    b = new MediaBrowser(paramContext, paramComponentName, a, localBundle);
  }
  
  public final void a() {}
  
  public final void b() {}
  
  public final void c(Messenger paramMessenger, String paramString, Bundle paramBundle)
  {
    if (g != paramMessenger) {
      return;
    }
    paramMessenger = (MediaBrowserCompat.i)e.getOrDefault(paramString, null);
    if (paramMessenger == null)
    {
      if (MediaBrowserCompat.b)
      {
        paramMessenger = new StringBuilder();
        paramMessenger.append("onLoadChildren for id that isn't subscribed id=");
        paramMessenger.append(paramString);
        Log.d("MediaBrowserCompat", paramMessenger.toString());
      }
      return;
    }
    for (int i = 0; i < b.size(); i++) {
      if (m0.h((Bundle)b.get(i), paramBundle))
      {
        paramMessenger = (MediaBrowserCompat.j)a.get(i);
        break;
      }
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */