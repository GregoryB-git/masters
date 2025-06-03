package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import g1.t;
import java.util.List;

public final class MediaSessionCompat$c$a
  extends IMediaSession.Stub
{
  public MediaSessionCompat$c$a(MediaSessionCompat.d paramd) {}
  
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
    if (a.e) {
      return;
    }
    t localt = new t("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid());
    a.f.register(???, localt);
    synchronized (a.c)
    {
      a.getClass();
      return;
    }
  }
  
  public final MediaMetadataCompat H0()
  {
    throw new AssertionError();
  }
  
  public final void J0(IMediaControllerCallback arg1)
  {
    a.f.unregister(???);
    Binder.getCallingPid();
    Binder.getCallingUid();
    synchronized (a.c)
    {
      a.getClass();
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
    return a.l;
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
    MediaSessionCompat.c localc = a;
    return MediaSessionCompat.b(g, i);
  }
  
  public final PendingIntent d0()
  {
    throw new AssertionError();
  }
  
  public final boolean e2()
  {
    return a.j;
  }
  
  public final Bundle getExtras()
  {
    throw new AssertionError();
  }
  
  public final void i0()
  {
    a.getClass();
  }
  
  public final Bundle j()
  {
    Bundle localBundle;
    if (a.d == null) {
      localBundle = null;
    } else {
      localBundle = new Bundle(a.d);
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
    return a.k;
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

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */