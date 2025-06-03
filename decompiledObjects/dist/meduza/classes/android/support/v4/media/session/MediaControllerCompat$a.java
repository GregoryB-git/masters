package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaSession.QueueItem;
import android.media.session.PlaybackState;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder.DeathRecipient;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaMetadataCompat;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;

public abstract class MediaControllerCompat$a
  implements IBinder.DeathRecipient
{
  public final a a = new a(this);
  public b b;
  public MediaControllerCompat.MediaControllerImplApi21.a c;
  
  public final void a(int paramInt, Object paramObject, Bundle paramBundle)
  {
    b localb = b;
    if (localb != null)
    {
      paramObject = localb.obtainMessage(paramInt, paramObject);
      ((Message)paramObject).setData(paramBundle);
      ((Message)paramObject).sendToTarget();
    }
  }
  
  public final void b(Handler paramHandler)
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
  
  public final void binderDied()
  {
    a(8, null, null);
  }
  
  public static final class a
    extends MediaController.Callback
  {
    public final WeakReference<MediaControllerCompat.a> a;
    
    public a(MediaControllerCompat.a parama)
    {
      a = new WeakReference(parama);
    }
    
    public final void onAudioInfoChanged(MediaController.PlaybackInfo paramPlaybackInfo)
    {
      if ((MediaControllerCompat.a)a.get() != null)
      {
        paramPlaybackInfo.getPlaybackType();
        paramPlaybackInfo.getAudioAttributes();
        int i = Build.VERSION.SDK_INT;
        AudioAttributesCompat localAudioAttributesCompat = new androidx/media/AudioAttributesCompat;
        paramPlaybackInfo.getVolumeControl();
        paramPlaybackInfo.getMaxVolume();
        paramPlaybackInfo.getCurrentVolume();
      }
    }
    
    public final void onExtrasChanged(Bundle paramBundle)
    {
      MediaSessionCompat.a(paramBundle);
      paramBundle = (MediaControllerCompat.a)a.get();
    }
    
    public final void onMetadataChanged(MediaMetadata paramMediaMetadata)
    {
      if ((MediaControllerCompat.a)a.get() != null)
      {
        Object localObject = MediaMetadataCompat.d;
        if (paramMediaMetadata != null)
        {
          localObject = Parcel.obtain();
          paramMediaMetadata.writeToParcel((Parcel)localObject, 0);
          ((Parcel)localObject).setDataPosition(0);
          MediaMetadataCompat localMediaMetadataCompat = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel((Parcel)localObject);
          ((Parcel)localObject).recycle();
          b = paramMediaMetadata;
        }
      }
    }
    
    public final void onPlaybackStateChanged(PlaybackState paramPlaybackState)
    {
      MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
      if ((locala != null) && (c == null)) {
        PlaybackStateCompat.a(paramPlaybackState);
      }
    }
    
    public final void onQueueChanged(List<MediaSession.QueueItem> paramList)
    {
      if ((MediaControllerCompat.a)a.get() != null) {
        MediaSessionCompat.QueueItem.a(paramList);
      }
    }
    
    public final void onQueueTitleChanged(CharSequence paramCharSequence)
    {
      paramCharSequence = (MediaControllerCompat.a)a.get();
    }
    
    public final void onSessionDestroyed()
    {
      MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
    }
    
    public final void onSessionEvent(String paramString, Bundle paramBundle)
    {
      MediaSessionCompat.a(paramBundle);
      paramString = (MediaControllerCompat.a)a.get();
    }
  }
  
  public final class b
    extends Handler
  {
    public boolean a = false;
    
    public b(Looper paramLooper)
    {
      super();
    }
    
    public final void handleMessage(Message paramMessage)
    {
      if (!a) {
        return;
      }
      MediaControllerCompat.a locala;
      switch (what)
      {
      case 10: 
      default: 
        break;
      case 11: 
        locala = MediaControllerCompat.a.this;
        ((Boolean)obj).booleanValue();
        paramMessage = locala;
        break;
      case 9: 
      case 12: 
        locala = MediaControllerCompat.a.this;
        ((Integer)obj).intValue();
        paramMessage = locala;
        break;
      case 7: 
        MediaSessionCompat.a((Bundle)obj);
      case 8: 
      case 13: 
        getClass();
        break;
      case 6: 
        locala = MediaControllerCompat.a.this;
        paramMessage = (CharSequence)obj;
        paramMessage = locala;
        break;
      case 5: 
        locala = MediaControllerCompat.a.this;
        paramMessage = (List)obj;
        paramMessage = locala;
        break;
      case 4: 
        locala = MediaControllerCompat.a.this;
        paramMessage = (MediaControllerCompat.c)obj;
        paramMessage = locala;
        break;
      case 3: 
        locala = MediaControllerCompat.a.this;
        paramMessage = (MediaMetadataCompat)obj;
        paramMessage = locala;
        break;
      case 2: 
        locala = MediaControllerCompat.a.this;
        paramMessage = (PlaybackStateCompat)obj;
        paramMessage = locala;
        break;
      case 1: 
        MediaSessionCompat.a(paramMessage.getData());
        locala = MediaControllerCompat.a.this;
        paramMessage = (String)obj;
        paramMessage = locala;
      }
      paramMessage.getClass();
    }
  }
  
  public static class c
    extends IMediaControllerCallback.Stub
  {
    public final WeakReference<MediaControllerCompat.a> a;
    
    public c(MediaControllerCompat.a parama)
    {
      a = new WeakReference(parama);
    }
    
    public final void X2(PlaybackStateCompat paramPlaybackStateCompat)
    {
      MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
      if (locala != null) {
        locala.a(2, paramPlaybackStateCompat, null);
      }
    }
    
    public final void f1(boolean paramBoolean)
    {
      MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
      if (locala != null) {
        locala.a(11, Boolean.valueOf(paramBoolean), null);
      }
    }
    
    public final void g2(int paramInt)
    {
      MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
      if (locala != null) {
        locala.a(12, Integer.valueOf(paramInt), null);
      }
    }
    
    public final void q(int paramInt)
    {
      MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
      if (locala != null) {
        locala.a(9, Integer.valueOf(paramInt), null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */