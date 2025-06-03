package com.ryanheise.audioservice;

import E5.k.d;
import android.app.Activity;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.b;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import java.io.PrintStream;

public class a$b
  extends MediaBrowserCompat.b
{
  public a$b(a parama) {}
  
  public void a()
  {
    if (a.b(c) == null) {
      return;
    }
    Object localObject2;
    try
    {
      Object localObject1 = a.m().c();
      localObject2 = new android/support/v4/media/session/MediaControllerCompat;
      ((MediaControllerCompat)localObject2).<init>(a.b(c), (MediaSessionCompat.Token)localObject1);
      a.o((MediaControllerCompat)localObject2);
      if (a.p() != null) {
        localObject1 = a.d.a(a.p());
      }
    }
    catch (Exception localException)
    {
      break label110;
    }
    Activity localActivity = null;
    if (localActivity != null) {
      MediaControllerCompat.f(localActivity, a.n());
    }
    a.n().d(a.r());
    if (a.s() != null)
    {
      a.s().a(a.F(new Object[0]));
      a.t(null);
      return;
      label110:
      localObject2 = System.out;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("onConnected error: ");
      localStringBuilder.append(localActivity.getMessage());
      ((PrintStream)localObject2).println(localStringBuilder.toString());
      localActivity.printStackTrace();
      if (a.s() != null)
      {
        localObject2 = a.s();
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("onConnected error: ");
        localStringBuilder.append(localActivity.getMessage());
        ((k.d)localObject2).b(localStringBuilder.toString(), null, null);
      }
      else
      {
        a.u(c).f(true);
      }
    }
  }
  
  public void b()
  {
    if (a.s() != null) {
      a.s().b("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.", null, null);
    } else {
      a.u(c).f(true);
    }
  }
  
  public void c()
  {
    System.out.println("### UNHANDLED: onConnectionSuspended");
  }
}

/* Location:
 * Qualified Name:     com.ryanheise.audioservice.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */