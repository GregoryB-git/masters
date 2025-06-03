package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder.DeathRecipient;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;

public abstract class MediaControllerCompat$a
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

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */