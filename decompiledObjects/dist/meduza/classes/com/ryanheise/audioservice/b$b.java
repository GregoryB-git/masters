package com.ryanheise.audioservice;

import android.app.Activity;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession.Token;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.c;
import android.support.v4.media.MediaBrowserCompat.d;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import io.flutter.plugin.common.MethodChannel.Result;
import java.io.PrintStream;

public final class b$b
  extends MediaBrowserCompat.c
{
  public b$b(b paramb) {}
  
  public final void a()
  {
    try
    {
      Object localObject1 = ua;
      if (h == null)
      {
        MediaSession.Token localToken = b.getSessionToken();
        if (localToken != null)
        {
          localObject2 = new android/support/v4/media/session/MediaSessionCompat$Token;
          ((MediaSessionCompat.Token)localObject2).<init>(localToken, null, null);
        }
        else
        {
          localObject2 = null;
        }
        h = ((MediaSessionCompat.Token)localObject2);
      }
      Object localObject2 = h;
      localObject1 = new android/support/v4/media/session/MediaControllerCompat;
      ((MediaControllerCompat)localObject1).<init>(c.a, (MediaSessionCompat.Token)localObject2);
      b.v = (MediaControllerCompat)localObject1;
      localObject2 = b.p;
      if (localObject2 != null) {
        localObject2 = b;
      } else {
        localObject2 = null;
      }
      if (localObject2 != null) {
        MediaControllerCompat.b((Activity)localObject2, b.v);
      }
      b.v.a(b.w);
      localObject2 = b.s;
      if (localObject2 != null)
      {
        ((MethodChannel.Result)localObject2).success(b.k(new Object[0]));
        b.s = null;
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      throw new RuntimeException(localException);
    }
  }
  
  public final void b()
  {
    MethodChannel.Result localResult = b.s;
    if (localResult != null) {
      localResult.error("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.", null, null);
    } else {
      c.e.e = true;
    }
  }
  
  public final void c()
  {
    System.out.println("### UNHANDLED: onConnectionSuspended");
  }
}

/* Location:
 * Qualified Name:     com.ryanheise.audioservice.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */