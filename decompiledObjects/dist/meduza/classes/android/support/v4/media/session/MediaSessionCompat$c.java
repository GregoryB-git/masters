package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.util.Log;
import android.view.KeyEvent;
import g1.t;
import java.lang.reflect.Method;
import java.util.List;

public class MediaSessionCompat$c
  implements MediaSessionCompat.b
{
  public final MediaSession a;
  public final MediaSessionCompat.Token b;
  public final Object c = new Object();
  public Bundle d;
  public boolean e = false;
  public final RemoteCallbackList<IMediaControllerCallback> f = new RemoteCallbackList();
  public PlaybackStateCompat g;
  public List<MediaSessionCompat.QueueItem> h;
  public MediaMetadataCompat i;
  public boolean j;
  public int k;
  public int l;
  public MediaSessionCompat.a m;
  public t n;
  
  public MediaSessionCompat$c(Context paramContext, String paramString)
  {
    paramContext = e(paramContext, paramString);
    a = paramContext;
    b = new MediaSessionCompat.Token(paramContext.getSessionToken(), new a((MediaSessionCompat.d)this), null);
    d = null;
    paramContext.setFlags(3);
  }
  
  public final MediaSessionCompat.a a()
  {
    synchronized (c)
    {
      MediaSessionCompat.a locala = m;
      return locala;
    }
  }
  
  public void b(t paramt)
  {
    synchronized (c)
    {
      n = paramt;
      return;
    }
  }
  
  public t c()
  {
    synchronized (c)
    {
      t localt = n;
      return localt;
    }
  }
  
  public final PlaybackStateCompat d()
  {
    return g;
  }
  
  public MediaSession e(Context paramContext, String paramString)
  {
    return new MediaSession(paramContext, paramString);
  }
  
  public final String f()
  {
    if (Build.VERSION.SDK_INT < 24) {
      return null;
    }
    try
    {
      String str = (String)a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(a, new Object[0]);
      return str;
    }
    catch (Exception localException)
    {
      Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", localException);
    }
    return null;
  }
  
  public final void g(MediaSessionCompat.a parama, Handler paramHandler)
  {
    synchronized (c)
    {
      m = parama;
      MediaSession localMediaSession = a;
      MediaSessionCompat.a.b localb;
      if (parama == null) {
        localb = null;
      } else {
        localb = b;
      }
      localMediaSession.setCallback(localb, paramHandler);
      if (parama != null) {
        parama.F0(this, paramHandler);
      }
      return;
    }
  }
  
  public final class a
    extends IMediaSession.Stub
  {
    public a() {}
    
    public final void B2(long paramLong)
    {
      throw new AssertionError();
    }
    
    public final CharSequence C0()
    {
      throw new AssertionError();
    }
    
    public final void C1(RatingCompat paramRatingCompat, Bundle paramBundle)
    {
      throw new AssertionError();
    }
    
    public final ParcelableVolumeInfo E2()
    {
      throw new AssertionError();
    }
    
    public final void F0(Bundle paramBundle, String paramString)
    {
      throw new AssertionError();
    }
    
    public final void F1(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
    {
      throw new AssertionError();
    }
    
    public final void G(IMediaControllerCallback arg1)
    {
      if (e) {
        return;
      }
      t localt = new t("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid());
      f.register(???, localt);
      synchronized (c)
      {
        getClass();
        return;
      }
    }
    
    public final MediaMetadataCompat H0()
    {
      throw new AssertionError();
    }
    
    public final void J0(IMediaControllerCallback arg1)
    {
      f.unregister(???);
      Binder.getCallingPid();
      Binder.getCallingUid();
      synchronized (c)
      {
        getClass();
        return;
      }
    }
    
    public final void J1(boolean paramBoolean)
    {
      throw new AssertionError();
    }
    
    public final void L2(int paramInt)
    {
      throw new AssertionError();
    }
    
    public final void M() {}
    
    public final void N(RatingCompat paramRatingCompat)
    {
      throw new AssertionError();
    }
    
    public final void O(Bundle paramBundle, String paramString)
    {
      throw new AssertionError();
    }
    
    public final String Q2()
    {
      throw new AssertionError();
    }
    
    public final void R(Uri paramUri, Bundle paramBundle)
    {
      throw new AssertionError();
    }
    
    public final void R0(int paramInt1, int paramInt2)
    {
      throw new AssertionError();
    }
    
    public final void V0(Uri paramUri, Bundle paramBundle)
    {
      throw new AssertionError();
    }
    
    public final void W2(Bundle paramBundle, String paramString)
    {
      throw new AssertionError();
    }
    
    public final void Y(MediaDescriptionCompat paramMediaDescriptionCompat)
    {
      throw new AssertionError();
    }
    
    public final boolean Z()
    {
      throw new AssertionError();
    }
    
    public final void a()
    {
      throw new AssertionError();
    }
    
    public final void a0() {}
    
    public final int a2()
    {
      return l;
    }
    
    public final void b()
    {
      throw new AssertionError();
    }
    
    public final void b0(MediaDescriptionCompat paramMediaDescriptionCompat)
    {
      throw new AssertionError();
    }
    
    public final void b2(int paramInt)
    {
      throw new AssertionError();
    }
    
    public final void c1(long paramLong)
    {
      throw new AssertionError();
    }
    
    public final PlaybackStateCompat d()
    {
      MediaSessionCompat.c localc = MediaSessionCompat.c.this;
      return MediaSessionCompat.b(g, i);
    }
    
    public final PendingIntent d0()
    {
      throw new AssertionError();
    }
    
    public final boolean e2()
    {
      return j;
    }
    
    public final Bundle getExtras()
    {
      throw new AssertionError();
    }
    
    public final void i0()
    {
      getClass();
    }
    
    public final Bundle j()
    {
      Bundle localBundle;
      if (d == null) {
        localBundle = null;
      } else {
        localBundle = new Bundle(d);
      }
      return localBundle;
    }
    
    public final void k2(Bundle paramBundle, String paramString)
    {
      throw new AssertionError();
    }
    
    public final void l()
    {
      throw new AssertionError();
    }
    
    public final void n2(String paramString, Bundle paramBundle, MediaSessionCompat.ResultReceiverWrapper paramResultReceiverWrapper)
    {
      throw new AssertionError();
    }
    
    public final void next()
    {
      throw new AssertionError();
    }
    
    public final List<MediaSessionCompat.QueueItem> o2()
    {
      return null;
    }
    
    public final String p()
    {
      throw new AssertionError();
    }
    
    public final void pause()
    {
      throw new AssertionError();
    }
    
    public final void previous()
    {
      throw new AssertionError();
    }
    
    public final void r1(float paramFloat)
    {
      throw new AssertionError();
    }
    
    public final void stop()
    {
      throw new AssertionError();
    }
    
    public final void u(int paramInt)
    {
      throw new AssertionError();
    }
    
    public final boolean u1(KeyEvent paramKeyEvent)
    {
      throw new AssertionError();
    }
    
    public final void v()
    {
      throw new AssertionError();
    }
    
    public final long w()
    {
      throw new AssertionError();
    }
    
    public final int x()
    {
      return k;
    }
    
    public final void x2(Bundle paramBundle, String paramString)
    {
      throw new AssertionError();
    }
    
    public final void y0(int paramInt1, int paramInt2)
    {
      throw new AssertionError();
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */