package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession.Token;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import b2.a;
import b2.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MediaControllerCompat$MediaControllerImplApi21
{
  public final MediaController a;
  public final Object b = new Object();
  public final ArrayList c = new ArrayList();
  public HashMap<MediaControllerCompat.a, a> d = new HashMap();
  public final MediaSessionCompat.Token e;
  
  public MediaControllerCompat$MediaControllerImplApi21(Context paramContext, MediaSessionCompat.Token paramToken)
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

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */