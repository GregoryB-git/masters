package android.support.v4.media.session;

import android.app.Activity;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaSession.QueueItem;
import android.media.session.MediaSession.Token;
import android.media.session.PlaybackState;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder.DeathRecipient;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.media.AudioAttributesCompat;
import b2.a;
import b2.e;
import com.ryanheise.audioservice.b.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class MediaControllerCompat
{
  public final MediaControllerImplApi21 a;
  public final MediaSessionCompat.Token b;
  public final ConcurrentHashMap<a, Boolean> c = new ConcurrentHashMap();
  
  public MediaControllerCompat(Context paramContext, MediaSessionCompat.Token paramToken)
  {
    if (paramToken != null)
    {
      b = paramToken;
      a = new MediaControllerImplApi21(paramContext, paramToken);
      return;
    }
    throw new IllegalArgumentException("sessionToken must not be null");
  }
  
  public MediaControllerCompat(Context paramContext, MediaSessionCompat paramMediaSessionCompat)
  {
    if (paramMediaSessionCompat != null)
    {
      paramMediaSessionCompat = a.b;
      b = paramMediaSessionCompat;
      if (Build.VERSION.SDK_INT >= 29) {
        paramContext = new b(paramContext, paramMediaSessionCompat);
      } else {
        paramContext = new MediaControllerImplApi21(paramContext, paramMediaSessionCompat);
      }
      a = paramContext;
      return;
    }
    throw new IllegalArgumentException("session must not be null");
  }
  
  public static void b(Activity paramActivity, MediaControllerCompat paramMediaControllerCompat)
  {
    paramActivity.getWindow().getDecorView().setTag(2131361976, paramMediaControllerCompat);
    if (paramMediaControllerCompat != null) {
      paramMediaControllerCompat = new MediaController(paramActivity, (MediaSession.Token)b.b);
    } else {
      paramMediaControllerCompat = null;
    }
    paramActivity.setMediaController(paramMediaControllerCompat);
  }
  
  public final void a(b.a parama)
  {
    if (parama != null)
    {
      MediaControllerImplApi21 localMediaControllerImplApi21;
      if (c.putIfAbsent(parama, Boolean.TRUE) != null)
      {
        Log.w("MediaControllerCompat", "the callback has already been registered");
      }
      else
      {
        ??? = new Handler();
        parama.b((Handler)???);
        localMediaControllerImplApi21 = a;
        a.registerCallback(a, (Handler)???);
      }
      synchronized (b)
      {
        if (e.a() != null)
        {
          MediaControllerCompat.MediaControllerImplApi21.a locala = new android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$a;
          locala.<init>(parama);
          d.put(parama, locala);
          c = locala;
          try
          {
            e.a().G(locala);
            parama.a(13, null, null);
          }
          catch (RemoteException parama)
          {
            Log.e("MediaControllerCompat", "Dead object in registerCallback.", parama);
          }
        }
        else
        {
          c = null;
          c.add(parama);
        }
        return;
      }
    }
    throw new IllegalArgumentException("callback must not be null");
  }
  
  public static class MediaControllerImplApi21
  {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public HashMap<MediaControllerCompat.a, a> d = new HashMap();
    public final MediaSessionCompat.Token e;
    
    public MediaControllerImplApi21(Context paramContext, MediaSessionCompat.Token paramToken)
    {
      e = paramToken;
      paramContext = new MediaController(paramContext, (MediaSession.Token)b);
      a = paramContext;
      if (paramToken.a() == null) {
        paramContext.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
      }
    }
    
    public final void a()
    {
      if (e.a() == null) {
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
          e.a().G(locala1);
          locala.a(13, null, null);
        }
        catch (RemoteException localRemoteException)
        {
          Log.e("MediaControllerCompat", "Dead object in registerCallback.", localRemoteException);
        }
      }
      c.clear();
    }
    
    public final void b(MediaControllerCompat.a parama)
    {
      a.unregisterCallback(a);
      synchronized (b)
      {
        Object localObject2 = e.a();
        if (localObject2 != null) {
          try
          {
            localObject2 = (a)d.remove(parama);
            if (localObject2 == null) {
              break label89;
            }
            c = null;
            e.a().J0((IMediaControllerCallback)localObject2);
          }
          catch (RemoteException parama)
          {
            Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", parama);
          }
        } else {
          c.remove(parama);
        }
        label89:
        return;
      }
    }
    
    public static class ExtraBinderRequestResultReceiver
      extends ResultReceiver
    {
      public WeakReference<MediaControllerCompat.MediaControllerImplApi21> a;
      
      public ExtraBinderRequestResultReceiver(MediaControllerCompat.MediaControllerImplApi21 paramMediaControllerImplApi21)
      {
        super();
        a = new WeakReference(paramMediaControllerImplApi21);
      }
      
      public final void onReceiveResult(int paramInt, Bundle arg2)
      {
        MediaControllerCompat.MediaControllerImplApi21 localMediaControllerImplApi21 = (MediaControllerCompat.MediaControllerImplApi21)a.get();
        if ((localMediaControllerImplApi21 != null) && (??? != null)) {
          synchronized (b)
          {
            MediaSessionCompat.Token localToken = e;
            Object localObject3 = IMediaSession.Stub.asInterface(???.getBinder("android.support.v4.media.session.EXTRA_BINDER"));
            synchronized (a)
            {
              c = ((IMediaSession)localObject3);
              ??? = e;
              localObject3 = a.b(???);
              synchronized (a)
              {
                d = ((e)localObject3);
                localMediaControllerImplApi21.a();
                return;
              }
            }
          }
        }
      }
    }
    
    public static final class a
      extends MediaControllerCompat.a.c
    {
      public a(MediaControllerCompat.a parama)
      {
        super();
      }
      
      public final void E1()
      {
        throw new AssertionError();
      }
      
      public final void G1(MediaMetadataCompat paramMediaMetadataCompat)
      {
        throw new AssertionError();
      }
      
      public final void c3(ParcelableVolumeInfo paramParcelableVolumeInfo)
      {
        throw new AssertionError();
      }
      
      public final void q0(Bundle paramBundle)
      {
        throw new AssertionError();
      }
      
      public final void x0(ArrayList paramArrayList)
      {
        throw new AssertionError();
      }
      
      public final void y1(CharSequence paramCharSequence)
      {
        throw new AssertionError();
      }
    }
  }
  
  public static abstract class a
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
  
  public static final class b
    extends MediaControllerCompat.MediaControllerImplApi21
  {
    public b(Context paramContext, MediaSessionCompat.Token paramToken)
    {
      super(paramToken);
    }
  }
  
  public static final class c {}
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */