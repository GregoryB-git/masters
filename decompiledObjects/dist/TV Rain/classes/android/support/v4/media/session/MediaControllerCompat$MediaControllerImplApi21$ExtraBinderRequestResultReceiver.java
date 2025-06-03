package android.support.v4.media.session;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.core.app.BundleCompat;
import androidx.versionedparcelable.ParcelUtils;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
  extends ResultReceiver
{
  private WeakReference<MediaControllerCompat.MediaControllerImplApi21> mMediaControllerImpl;
  
  public MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(MediaControllerCompat.MediaControllerImplApi21 paramMediaControllerImplApi21)
  {
    super(null);
    mMediaControllerImpl = new WeakReference(paramMediaControllerImplApi21);
  }
  
  public void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    MediaControllerCompat.MediaControllerImplApi21 localMediaControllerImplApi21 = (MediaControllerCompat.MediaControllerImplApi21)mMediaControllerImpl.get();
    if ((localMediaControllerImplApi21 != null) && (paramBundle != null)) {
      synchronized (mLock)
      {
        mSessionToken.setExtraBinder(IMediaSession.Stub.asInterface(BundleCompat.getBinder(paramBundle, "android.support.v4.media.session.EXTRA_BINDER")));
        mSessionToken.setSession2Token(ParcelUtils.getVersionedParcelable(paramBundle, "android.support.v4.media.session.SESSION_TOKEN2"));
        localMediaControllerImplApi21.processPendingCallbacksLocked();
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