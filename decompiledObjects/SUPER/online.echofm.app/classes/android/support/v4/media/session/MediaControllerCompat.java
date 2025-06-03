package android.support.v4.media.session;

import a0.n;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaSession.Token;
import android.media.session.PlaybackState;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder.DeathRecipient;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import w.d;

public final class MediaControllerCompat
{
  public final b a;
  public final MediaSessionCompat.Token b;
  public final Set c;
  
  public MediaControllerCompat(Context paramContext, MediaSessionCompat.Token paramToken)
  {
    if (paramToken != null)
    {
      c = Collections.synchronizedSet(new HashSet());
      b = paramToken;
      if (Build.VERSION.SDK_INT >= 29) {}
      for (paramContext = new c(paramContext, paramToken);; paramContext = new MediaControllerImplApi21(paramContext, paramToken))
      {
        a = paramContext;
        break;
      }
      return;
    }
    throw new IllegalArgumentException("sessionToken must not be null");
  }
  
  public MediaControllerCompat(Context paramContext, MediaSessionCompat paramMediaSessionCompat)
  {
    this(paramContext, paramMediaSessionCompat.c());
  }
  
  public static void f(Activity paramActivity, MediaControllerCompat paramMediaControllerCompat)
  {
    paramActivity.getWindow().getDecorView().setTag(n.a, paramMediaControllerCompat);
    MediaControllerImplApi21.h(paramActivity, paramMediaControllerCompat);
  }
  
  public boolean a(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent != null) {
      return a.c(paramKeyEvent);
    }
    throw new IllegalArgumentException("KeyEvent may not be null");
  }
  
  public PendingIntent b()
  {
    return a.a();
  }
  
  public MediaSessionCompat.Token c()
  {
    return b;
  }
  
  public void d(a parama)
  {
    e(parama, null);
  }
  
  public void e(a parama, Handler paramHandler)
  {
    if (parama != null)
    {
      if (!c.add(parama))
      {
        Log.w("MediaControllerCompat", "the callback has already been registered");
        return;
      }
      Handler localHandler = paramHandler;
      if (paramHandler == null) {
        localHandler = new Handler();
      }
      parama.n(localHandler);
      a.d(parama, localHandler);
      return;
    }
    throw new IllegalArgumentException("callback must not be null");
  }
  
  public void g(a parama)
  {
    if (parama != null)
    {
      if (!c.remove(parama))
      {
        Log.w("MediaControllerCompat", "the callback has never been registered");
        return;
      }
      try
      {
        a.b(parama);
        return;
      }
      finally
      {
        parama.n(null);
      }
    }
    throw new IllegalArgumentException("callback must not be null");
  }
  
  public static class MediaControllerImplApi21
    implements MediaControllerCompat.b
  {
    public final MediaController a;
    public final Object b = new Object();
    public final List c = new ArrayList();
    public HashMap d = new HashMap();
    public final MediaSessionCompat.Token e;
    
    public MediaControllerImplApi21(Context paramContext, MediaSessionCompat.Token paramToken)
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
            e.g(v1.a.b(paramBundle, "android.support.v4.media.session.SESSION_TOKEN2"));
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
  
  public static abstract class a
    implements IBinder.DeathRecipient
  {
    public final MediaController.Callback a = new a(this);
    public b b;
    public a c;
    
    public void a(MediaControllerCompat.d paramd) {}
    
    public void b(boolean paramBoolean) {}
    
    public void binderDied()
    {
      m(8, null, null);
    }
    
    public void c(Bundle paramBundle) {}
    
    public void d(MediaMetadataCompat paramMediaMetadataCompat) {}
    
    public void e(PlaybackStateCompat paramPlaybackStateCompat) {}
    
    public void f(List paramList) {}
    
    public void g(CharSequence paramCharSequence) {}
    
    public void h(int paramInt) {}
    
    public void i() {}
    
    public void j(String paramString, Bundle paramBundle) {}
    
    public void k() {}
    
    public void l(int paramInt) {}
    
    public void m(int paramInt, Object paramObject, Bundle paramBundle)
    {
      b localb = b;
      if (localb != null)
      {
        paramObject = localb.obtainMessage(paramInt, paramObject);
        ((Message)paramObject).setData(paramBundle);
        ((Message)paramObject).sendToTarget();
      }
    }
    
    public void n(Handler paramHandler)
    {
      if (paramHandler == null)
      {
        paramHandler = b;
        if (paramHandler != null)
        {
          a = false;
          paramHandler.removeCallbacksAndMessages(null);
          b = null;
        }
      }
      else
      {
        paramHandler = new b(paramHandler.getLooper());
        b = paramHandler;
        a = true;
      }
    }
    
    public static class a
      extends MediaController.Callback
    {
      public final WeakReference a;
      
      public a(MediaControllerCompat.a parama)
      {
        a = new WeakReference(parama);
      }
      
      public void onAudioInfoChanged(MediaController.PlaybackInfo paramPlaybackInfo)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
        if (locala != null) {
          locala.a(new MediaControllerCompat.d(paramPlaybackInfo.getPlaybackType(), AudioAttributesCompat.f(paramPlaybackInfo.getAudioAttributes()), paramPlaybackInfo.getVolumeControl(), paramPlaybackInfo.getMaxVolume(), paramPlaybackInfo.getCurrentVolume()));
        }
      }
      
      public void onExtrasChanged(Bundle paramBundle)
      {
        MediaSessionCompat.a(paramBundle);
        MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
        if (locala != null) {
          locala.c(paramBundle);
        }
      }
      
      public void onMetadataChanged(MediaMetadata paramMediaMetadata)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
        if (locala != null) {
          locala.d(MediaMetadataCompat.b(paramMediaMetadata));
        }
      }
      
      public void onPlaybackStateChanged(PlaybackState paramPlaybackState)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
        if ((locala != null) && (c == null)) {
          locala.e(PlaybackStateCompat.a(paramPlaybackState));
        }
      }
      
      public void onQueueChanged(List paramList)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
        if (locala != null) {
          locala.f(MediaSessionCompat.QueueItem.b(paramList));
        }
      }
      
      public void onQueueTitleChanged(CharSequence paramCharSequence)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
        if (locala != null) {
          locala.g(paramCharSequence);
        }
      }
      
      public void onSessionDestroyed()
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
        if (locala != null) {
          locala.i();
        }
      }
      
      public void onSessionEvent(String paramString, Bundle paramBundle)
      {
        MediaSessionCompat.a(paramBundle);
        MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
        if (locala != null) {
          locala.j(paramString, paramBundle);
        }
      }
    }
    
    public class b
      extends Handler
    {
      public boolean a = false;
      
      public b(Looper paramLooper)
      {
        super();
      }
      
      public void handleMessage(Message paramMessage)
      {
        if (!a) {
          return;
        }
        switch (what)
        {
        case 10: 
        default: 
          break;
        case 13: 
          k();
          break;
        case 12: 
          l(((Integer)obj).intValue());
          break;
        case 11: 
          b(((Boolean)obj).booleanValue());
          break;
        case 9: 
          h(((Integer)obj).intValue());
          break;
        case 8: 
          i();
          break;
        case 7: 
          paramMessage = (Bundle)obj;
          MediaSessionCompat.a(paramMessage);
          c(paramMessage);
          break;
        case 6: 
          g((CharSequence)obj);
          break;
        case 5: 
          f((List)obj);
          break;
        case 4: 
          a((MediaControllerCompat.d)obj);
          break;
        case 3: 
          d((MediaMetadataCompat)obj);
          break;
        case 2: 
          e((PlaybackStateCompat)obj);
          break;
        case 1: 
          Bundle localBundle = paramMessage.getData();
          MediaSessionCompat.a(localBundle);
          j((String)obj, localBundle);
        }
      }
    }
    
    public static abstract class c
      extends a.a
    {
      public final WeakReference b;
      
      public c(MediaControllerCompat.a parama)
      {
        b = new WeakReference(parama);
      }
      
      public void J0(boolean paramBoolean)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)b.get();
        if (locala != null) {
          locala.m(11, Boolean.valueOf(paramBoolean), null);
        }
      }
      
      public void Q0(PlaybackStateCompat paramPlaybackStateCompat)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)b.get();
        if (locala != null) {
          locala.m(2, paramPlaybackStateCompat, null);
        }
      }
      
      public void d0(int paramInt)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)b.get();
        if (locala != null) {
          locala.m(12, Integer.valueOf(paramInt), null);
        }
      }
      
      public void f0()
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)b.get();
        if (locala != null) {
          locala.m(13, null, null);
        }
      }
      
      public void m(int paramInt)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)b.get();
        if (locala != null) {
          locala.m(9, Integer.valueOf(paramInt), null);
        }
      }
      
      public void t(String paramString, Bundle paramBundle)
      {
        MediaControllerCompat.a locala = (MediaControllerCompat.a)b.get();
        if (locala != null) {
          locala.m(1, paramString, paramBundle);
        }
      }
      
      public void w(boolean paramBoolean) {}
    }
  }
  
  public static abstract interface b
  {
    public abstract PendingIntent a();
    
    public abstract void b(MediaControllerCompat.a parama);
    
    public abstract boolean c(KeyEvent paramKeyEvent);
    
    public abstract void d(MediaControllerCompat.a parama, Handler paramHandler);
  }
  
  public static class c
    extends MediaControllerCompat.MediaControllerImplApi21
  {
    public c(Context paramContext, MediaSessionCompat.Token paramToken)
    {
      super(paramToken);
    }
  }
  
  public static final class d
  {
    public final int a;
    public final AudioAttributesCompat b;
    public final int c;
    public final int d;
    public final int e;
    
    public d(int paramInt1, AudioAttributesCompat paramAudioAttributesCompat, int paramInt2, int paramInt3, int paramInt4)
    {
      a = paramInt1;
      b = paramAudioAttributesCompat;
      c = paramInt2;
      d = paramInt3;
      e = paramInt4;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */