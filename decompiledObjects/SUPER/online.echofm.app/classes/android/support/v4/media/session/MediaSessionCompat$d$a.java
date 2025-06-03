package android.support.v4.media.session;

import a0.f;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class MediaSessionCompat$d$a
  extends b.a
{
  public final AtomicReference b;
  
  public MediaSessionCompat$d$a(MediaSessionCompat.d paramd)
  {
    b = new AtomicReference(paramd);
  }
  
  public void A(a parama)
  {
    MediaSessionCompat.d locald = (MediaSessionCompat.d)b.get();
    if (locald == null) {
      return;
    }
    ??? = new f("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid());
    g.register(parama, ???);
    synchronized (d) {}
  }
  
  public void A0(String paramString, Bundle paramBundle)
  {
    throw new AssertionError();
  }
  
  public void B(RatingCompat paramRatingCompat, Bundle paramBundle)
  {
    throw new AssertionError();
  }
  
  public ParcelableVolumeInfo C0()
  {
    throw new AssertionError();
  }
  
  public void D(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
  {
    throw new AssertionError();
  }
  
  public void E0()
  {
    throw new AssertionError();
  }
  
  public void G0(Uri paramUri, Bundle paramBundle)
  {
    throw new AssertionError();
  }
  
  public boolean H()
  {
    return false;
  }
  
  public void H0(long paramLong)
  {
    throw new AssertionError();
  }
  
  public void I(RatingCompat paramRatingCompat)
  {
    throw new AssertionError();
  }
  
  public void J(int paramInt1, int paramInt2, String paramString)
  {
    throw new AssertionError();
  }
  
  public void M(Uri paramUri, Bundle paramBundle)
  {
    throw new AssertionError();
  }
  
  public String N0()
  {
    throw new AssertionError();
  }
  
  public void Q(MediaDescriptionCompat paramMediaDescriptionCompat)
  {
    throw new AssertionError();
  }
  
  public boolean R()
  {
    throw new AssertionError();
  }
  
  public void S(MediaDescriptionCompat paramMediaDescriptionCompat)
  {
    throw new AssertionError();
  }
  
  public PendingIntent T()
  {
    throw new AssertionError();
  }
  
  public int U()
  {
    MediaSessionCompat.d locald = (MediaSessionCompat.d)b.get();
    int i;
    if (locald != null) {
      i = n;
    } else {
      i = -1;
    }
    return i;
  }
  
  public void V(int paramInt)
  {
    throw new AssertionError();
  }
  
  public int X()
  {
    MediaSessionCompat.d locald = (MediaSessionCompat.d)b.get();
    int i;
    if (locald != null) {
      i = k;
    } else {
      i = 0;
    }
    return i;
  }
  
  public void Y(String paramString, Bundle paramBundle)
  {
    throw new AssertionError();
  }
  
  public boolean Y0(KeyEvent paramKeyEvent)
  {
    throw new AssertionError();
  }
  
  public boolean b0()
  {
    MediaSessionCompat.d locald = (MediaSessionCompat.d)b.get();
    boolean bool;
    if ((locald != null) && (l)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public String e()
  {
    throw new AssertionError();
  }
  
  public PlaybackStateCompat f()
  {
    MediaSessionCompat.d locald = (MediaSessionCompat.d)b.get();
    if (locald != null) {
      return MediaSessionCompat.d(h, j);
    }
    return null;
  }
  
  public void g()
  {
    throw new AssertionError();
  }
  
  public void i(int paramInt)
  {
    throw new AssertionError();
  }
  
  public void j()
  {
    throw new AssertionError();
  }
  
  public void j0(String paramString, Bundle paramBundle, MediaSessionCompat.ResultReceiverWrapper paramResultReceiverWrapper)
  {
    throw new AssertionError();
  }
  
  public void k(boolean paramBoolean)
  {
    throw new AssertionError();
  }
  
  public List k0()
  {
    return null;
  }
  
  public void next()
  {
    throw new AssertionError();
  }
  
  public void o()
  {
    b.set(null);
  }
  
  public void o0()
  {
    throw new AssertionError();
  }
  
  public void p()
  {
    throw new AssertionError();
  }
  
  public CharSequence p0()
  {
    throw new AssertionError();
  }
  
  public void previous()
  {
    throw new AssertionError();
  }
  
  public int q()
  {
    MediaSessionCompat.d locald = (MediaSessionCompat.d)b.get();
    int i;
    if (locald != null) {
      i = m;
    } else {
      i = -1;
    }
    return i;
  }
  
  public Bundle r()
  {
    throw new AssertionError();
  }
  
  public MediaMetadataCompat r0()
  {
    throw new AssertionError();
  }
  
  public void s(int paramInt)
  {
    throw new AssertionError();
  }
  
  public void s0(String paramString, Bundle paramBundle)
  {
    throw new AssertionError();
  }
  
  public void stop()
  {
    throw new AssertionError();
  }
  
  public Bundle t0()
  {
    Object localObject = (MediaSessionCompat.d)b.get();
    if (e == null) {
      localObject = null;
    } else {
      localObject = new Bundle(e);
    }
    return (Bundle)localObject;
  }
  
  public void u(float paramFloat)
  {
    throw new AssertionError();
  }
  
  public void u0(a arg1)
  {
    MediaSessionCompat.d locald = (MediaSessionCompat.d)b.get();
    if (locald == null) {
      return;
    }
    g.unregister(???);
    Binder.getCallingPid();
    Binder.getCallingUid();
    synchronized (d) {}
  }
  
  public void v0(String paramString, Bundle paramBundle)
  {
    throw new AssertionError();
  }
  
  public long w0()
  {
    throw new AssertionError();
  }
  
  public void y(String paramString, Bundle paramBundle)
  {
    throw new AssertionError();
  }
  
  public void y0(long paramLong)
  {
    throw new AssertionError();
  }
  
  public void z(int paramInt1, int paramInt2, String paramString)
  {
    throw new AssertionError();
  }
  
  public void z0(boolean paramBoolean) {}
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */