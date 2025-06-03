package android.support.v4.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.browse.MediaBrowser.ConnectionCallback;
import android.media.session.MediaSession.Token;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.IMediaSession.Stub;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.util.Log;
import java.lang.ref.WeakReference;

public class MediaBrowserCompat$c
{
  public final a a = new a();
  public b b;
  
  public void a()
  {
    throw null;
  }
  
  public void b()
  {
    throw null;
  }
  
  public void c()
  {
    throw null;
  }
  
  public final class a
    extends MediaBrowser.ConnectionCallback
  {
    public a() {}
    
    public final void onConnected()
    {
      Object localObject1 = b;
      if (localObject1 != null)
      {
        MediaBrowserCompat.d locald = (MediaBrowserCompat.d)localObject1;
        try
        {
          localObject1 = b.getExtras();
          if (localObject1 != null)
          {
            ((BaseBundle)localObject1).getInt("extra_service_version", 0);
            Object localObject2 = ((Bundle)localObject1).getBinder("extra_messenger");
            if (localObject2 != null)
            {
              f = new MediaBrowserCompat.h((IBinder)localObject2, c);
              localObject3 = new Messenger(d);
              g = ((Messenger)localObject3);
              localObject2 = d;
              localObject2.getClass();
              b = new WeakReference(localObject3);
              try
              {
                localObject2 = f;
                localObject3 = a;
                Messenger localMessenger = g;
                localObject2.getClass();
                Bundle localBundle = new android/os/Bundle;
                localBundle.<init>();
                localBundle.putString("data_package_name", ((Context)localObject3).getPackageName());
                localBundle.putInt("data_calling_pid", Process.myPid());
                localBundle.putBundle("data_root_hints", b);
                ((MediaBrowserCompat.h)localObject2).a(6, localBundle, localMessenger);
              }
              catch (RemoteException localRemoteException)
              {
                Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
              }
            }
            Object localObject3 = IMediaSession.Stub.asInterface(((Bundle)localObject1).getBinder("extra_session_binder"));
            if (localObject3 != null)
            {
              MediaSession.Token localToken = b.getSessionToken();
              localObject1 = null;
              if (localToken != null) {
                localObject1 = new MediaSessionCompat.Token(localToken, (IMediaSession)localObject3, null);
              }
              h = ((MediaSessionCompat.Token)localObject1);
            }
          }
        }
        catch (IllegalStateException localIllegalStateException)
        {
          Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", localIllegalStateException);
        }
      }
      a();
    }
    
    public final void onConnectionFailed()
    {
      MediaBrowserCompat.c.b localb = b;
      if (localb != null) {
        localb.getClass();
      }
      b();
    }
    
    public final void onConnectionSuspended()
    {
      Object localObject = b;
      if (localObject != null)
      {
        localObject = (MediaBrowserCompat.d)localObject;
        f = null;
        g = null;
        h = null;
        localObject = d;
        localObject.getClass();
        b = new WeakReference(null);
      }
      c();
    }
  }
  
  public static abstract interface b {}
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */