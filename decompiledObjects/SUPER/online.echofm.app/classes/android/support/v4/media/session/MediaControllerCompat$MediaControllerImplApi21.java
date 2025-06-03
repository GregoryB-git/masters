package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession.Token;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import v1.a;
import w.d;

public class MediaControllerCompat$MediaControllerImplApi21
  implements MediaControllerCompat.b
{
  public final MediaController a;
  public final Object b = new Object();
  public final List c = new ArrayList();
  public HashMap d = new HashMap();
  public final MediaSessionCompat.Token e;
  
  public MediaControllerCompat$MediaControllerImplApi21(Context paramContext, MediaSessionCompat.Token paramToken)
  {
    e = paramToken;
    a = new MediaController(paramContext, (MediaSession.Token)paramToken.e());
    if (paramToken.c() == null) {
      f();
    }
  }
  
  public static void h(Activity paramActivity, MediaControllerCompat paramMediaControllerCompat)
  {
    if (paramMediaControllerCompat != null) {
      paramMediaControllerCompat = new MediaController(paramActivity, (MediaSession.Token)paramMediaControllerCompat.c().e());
    } else {
      paramMediaControllerCompat = null;
    }
    paramActivity.setMediaController(paramMediaControllerCompat);
  }
  
  public PendingIntent a()
  {
    return a.getSessionActivity();
  }
  
  public final void b(MediaControllerCompat.a parama)
  {
    a.unregisterCallback(a);
    Object localObject2;
    synchronized (b)
    {
      localObject2 = e.c();
      if (localObject2 == null) {}
    }
    c.remove(parama);
    return;
    throw parama;
  }
  
  public boolean c(KeyEvent paramKeyEvent)
  {
    return a.dispatchMediaButtonEvent(paramKeyEvent);
  }
  
  public final void d(MediaControllerCompat.a parama, Handler arg2)
  {
    a.registerCallback(a, ???);
    a locala;
    synchronized (b)
    {
      if (e.c() == null) {
        break label94;
      }
      locala = new android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$a;
      locala.<init>(parama);
      d.put(parama, locala);
      c = locala;
    }
    try
    {
      e.c().A(locala);
      parama.m(13, null, null);
    }
    catch (RemoteException parama)
    {
      Log.e("MediaControllerCompat", "Dead object in registerCallback.", parama);
    }
    parama = finally;
    break label113;
    label94:
    c = null;
    c.add(parama);
    return;
    label113:
    throw parama;
  }
  
  public void e()
  {
    if (e.c() == null) {
      return;
    }
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      MediaControllerCompat.a locala = (MediaControllerCompat.a)localIterator.next();
      a locala1 = new a(locala);
      d.put(locala, locala1);
      c = locala1;
      try
      {
        e.c().A(locala1);
        locala.m(13, null, null);
      }
      catch (RemoteException localRemoteException)
      {
        Log.e("MediaControllerCompat", "Dead object in registerCallback.", localRemoteException);
      }
    }
    c.clear();
  }
  
  public final void f()
  {
    g("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
  }
  
  public void g(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver)
  {
    a.sendCommand(paramString, paramBundle, paramResultReceiver);
  }
  
  public static class ExtraBinderRequestResultReceiver
    extends ResultReceiver
  {
    public WeakReference o;
    
    public ExtraBinderRequestResultReceiver(MediaControllerCompat.MediaControllerImplApi21 paramMediaControllerImplApi21)
    {
      super();
      o = new WeakReference(paramMediaControllerImplApi21);
    }
    
    public void onReceiveResult(int paramInt, Bundle paramBundle)
    {
      MediaControllerCompat.MediaControllerImplApi21 localMediaControllerImplApi21 = (MediaControllerCompat.MediaControllerImplApi21)o.get();
      if ((localMediaControllerImplApi21 != null) && (paramBundle != null)) {
        synchronized (b)
        {
          e.f(b.a.n(d.a(paramBundle, "android.support.v4.media.session.EXTRA_BINDER")));
          e.g(a.b(paramBundle, "android.support.v4.media.session.SESSION_TOKEN2"));
          localMediaControllerImplApi21.e();
          return;
        }
      }
    }
  }
  
  public static class a
    extends MediaControllerCompat.a.c
  {
    public a(MediaControllerCompat.a parama)
    {
      super();
    }
    
    public void C()
    {
      throw new AssertionError();
    }
    
    public void E(MediaMetadataCompat paramMediaMetadataCompat)
    {
      throw new AssertionError();
    }
    
    public void X0(ParcelableVolumeInfo paramParcelableVolumeInfo)
    {
      throw new AssertionError();
    }
    
    public void g0(Bundle paramBundle)
    {
      throw new AssertionError();
    }
    
    public void l0(List paramList)
    {
      throw new AssertionError();
    }
    
    public void x(CharSequence paramCharSequence)
    {
      throw new AssertionError();
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */