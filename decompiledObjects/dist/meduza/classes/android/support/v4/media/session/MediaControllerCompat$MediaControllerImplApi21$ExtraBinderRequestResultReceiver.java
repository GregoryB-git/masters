package android.support.v4.media.session;

import android.os.Bundle;
import android.os.ResultReceiver;
import b2.a;
import b2.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
  extends ResultReceiver
{
  public WeakReference<MediaControllerCompat.MediaControllerImplApi21> a;
  
  public MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(MediaControllerCompat.MediaControllerImplApi21 paramMediaControllerImplApi21)
  {
    super(null);
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

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21.ExtraBinderRequestResultReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */