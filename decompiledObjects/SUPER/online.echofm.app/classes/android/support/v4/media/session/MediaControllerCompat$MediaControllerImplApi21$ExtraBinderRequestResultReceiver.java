package android.support.v4.media.session;

import android.os.Bundle;
import android.os.ResultReceiver;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import v1.a;
import w.d;

class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
  extends ResultReceiver
{
  public WeakReference o;
  
  public MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(MediaControllerCompat.MediaControllerImplApi21 paramMediaControllerImplApi21)
  {
    super(null);
    o = new WeakReference(paramMediaControllerImplApi21);
  }
  
  public void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    MediaControllerCompat.MediaControllerImplApi21 localMediaControllerImplApi21 = (MediaControllerCompat.MediaControllerImplApi21)o.get();
    if ((localMediaControllerImplApi21 != null) && (paramBundle != null)) {
      synchronized (b)
      {
        e.f(b.a.n(d.a(paramBundle, "android.support.v4.media.session.EXTRA_BINDER")));
        e.g(a.b(paramBundle, "android.support.v4.media.session.SESSION_TOKEN2"));
        localMediaControllerImplApi21.e();
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21.ExtraBinderRequestResultReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */