package android.support.v4.media.session;

import a0.f;
import a0.o;
import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes.Builder;
import android.media.MediaMetadata;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.MediaSession.Callback;
import android.media.session.MediaSession.QueueItem;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import v1.d;

public abstract class MediaSessionCompat$d
  implements MediaSessionCompat.c
{
  public final MediaSession a;
  public final a b;
  public final MediaSessionCompat.Token c;
  public final Object d = new Object();
  public Bundle e;
  public boolean f = false;
  public final RemoteCallbackList g = new RemoteCallbackList();
  public PlaybackStateCompat h;
  public List i;
  public MediaMetadataCompat j;
  public int k;
  public boolean l;
  public int m;
  public int n;
  public MediaSessionCompat.b o;
  public f p;
  
  public MediaSessionCompat$d(Context paramContext, String paramString, d paramd, Bundle paramBundle)
  {
    paramContext = u(paramContext, paramString, paramBundle);
    a = paramContext;
    paramString = new a(this);
    b = paramString;
    c = new MediaSessionCompat.Token(paramContext.getSessionToken(), paramString, paramd);
    e = paramBundle;
    c(3);
  }
  
  public boolean a()
  {
    return a.isActive();
  }
  
  public MediaSessionCompat.Token b()
  {
    return c;
  }
  
  public void c(int paramInt)
  {
    a.setFlags(paramInt | 0x3);
  }
  
  public void d(f paramf)
  {
    synchronized (d)
    {
      p = paramf;
      return;
    }
  }
  
  public void e(List paramList)
  {
    i = paramList;
    Object localObject;
    if (paramList == null)
    {
      localObject = a;
      paramList = null;
    }
    for (;;)
    {
      ((MediaSession)localObject).setQueue(paramList);
      return;
      localObject = new ArrayList(paramList.size());
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        ((ArrayList)localObject).add((MediaSession.QueueItem)((MediaSessionCompat.QueueItem)paramList.next()).e());
      }
      MediaSession localMediaSession = a;
      paramList = (List)localObject;
      localObject = localMediaSession;
    }
  }
  
  public PlaybackStateCompat f()
  {
    return h;
  }
  
  public void g(boolean paramBoolean)
  {
    a.setActive(paramBoolean);
  }
  
  public String h()
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
  
  public void i(int paramInt)
  {
    if (m != paramInt)
    {
      m = paramInt;
      for (;;)
      {
        int i1;
        a locala;
        synchronized (d)
        {
          i1 = g.beginBroadcast() - 1;
          if (i1 < 0) {
            break;
          }
          locala = (a)g.getBroadcastItem(i1);
        }
        i1--;
      }
      g.finishBroadcast();
      break label86;
      throw ((Throwable)localObject2);
    }
    label86:
  }
  
  public void j(PendingIntent paramPendingIntent)
  {
    a.setSessionActivity(paramPendingIntent);
  }
  
  public void k(boolean paramBoolean)
  {
    if (l != paramBoolean)
    {
      l = paramBoolean;
      for (;;)
      {
        int i1;
        a locala;
        synchronized (d)
        {
          i1 = g.beginBroadcast() - 1;
          if (i1 < 0) {
            break;
          }
          locala = (a)g.getBroadcastItem(i1);
        }
        i1--;
      }
      g.finishBroadcast();
      break label86;
      throw ((Throwable)localObject2);
    }
    label86:
  }
  
  public void l(PlaybackStateCompat paramPlaybackStateCompat)
  {
    h = paramPlaybackStateCompat;
    for (;;)
    {
      int i1;
      a locala;
      synchronized (d)
      {
        i1 = g.beginBroadcast() - 1;
        if (i1 < 0) {
          break;
        }
        locala = (a)g.getBroadcastItem(i1);
      }
      i1--;
    }
    g.finishBroadcast();
    ??? = a;
    if (paramPlaybackStateCompat == null) {
      paramPlaybackStateCompat = null;
    } else {
      paramPlaybackStateCompat = (PlaybackState)paramPlaybackStateCompat.e();
    }
    ((MediaSession)???).setPlaybackState(paramPlaybackStateCompat);
    return;
    throw paramPlaybackStateCompat;
  }
  
  public void m(MediaSessionCompat.b paramb, Handler paramHandler)
  {
    synchronized (d)
    {
      o = paramb;
      MediaSession localMediaSession = a;
      MediaSession.Callback localCallback;
      if (paramb == null) {
        localCallback = null;
      } else {
        localCallback = b;
      }
      localMediaSession.setCallback(localCallback, paramHandler);
      if (paramb != null) {
        paramb.D(this, paramHandler);
      }
    }
  }
  
  public void n(int paramInt)
  {
    AudioAttributes.Builder localBuilder = new AudioAttributes.Builder();
    localBuilder.setLegacyStreamType(paramInt);
    a.setPlaybackToLocal(localBuilder.build());
  }
  
  public MediaSessionCompat.b o()
  {
    synchronized (d)
    {
      MediaSessionCompat.b localb = o;
      return localb;
    }
  }
  
  public void p(MediaMetadataCompat paramMediaMetadataCompat)
  {
    j = paramMediaMetadataCompat;
    MediaSession localMediaSession = a;
    if (paramMediaMetadataCompat == null) {
      paramMediaMetadataCompat = null;
    } else {
      paramMediaMetadataCompat = (MediaMetadata)paramMediaMetadataCompat.g();
    }
    localMediaSession.setMetadata(paramMediaMetadataCompat);
  }
  
  public void q(PendingIntent paramPendingIntent)
  {
    a.setMediaButtonReceiver(paramPendingIntent);
  }
  
  public void r(o paramo)
  {
    a.setPlaybackToRemote((VolumeProvider)paramo.c());
  }
  
  public void release()
  {
    f = true;
    g.kill();
    if (Build.VERSION.SDK_INT == 27) {
      try
      {
        Object localObject = a.getClass().getDeclaredField("mCallback");
        ((AccessibleObject)localObject).setAccessible(true);
        localObject = (Handler)((Field)localObject).get(a);
        if (localObject != null) {
          ((Handler)localObject).removeCallbacksAndMessages(null);
        }
      }
      catch (Exception localException)
      {
        Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", localException);
      }
    }
    a.setCallback(null);
    b.o();
    a.release();
  }
  
  public void s(int paramInt)
  {
    if (n != paramInt)
    {
      n = paramInt;
      for (;;)
      {
        int i1;
        a locala;
        synchronized (d)
        {
          i1 = g.beginBroadcast() - 1;
          if (i1 < 0) {
            break;
          }
          locala = (a)g.getBroadcastItem(i1);
        }
        i1--;
      }
      g.finishBroadcast();
      break label86;
      throw ((Throwable)localObject2);
    }
    label86:
  }
  
  public f t()
  {
    synchronized (d)
    {
      f localf = p;
      return localf;
    }
  }
  
  public MediaSession u(Context paramContext, String paramString, Bundle paramBundle)
  {
    return new MediaSession(paramContext, paramString);
  }
  
  public static class a
    extends b.a
  {
    public final AtomicReference b;
    
    public a(MediaSessionCompat.d paramd)
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
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */