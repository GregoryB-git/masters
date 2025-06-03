package android.support.v4.media.session;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media.MediaSessionManager.RemoteUserInfo;
import java.lang.ref.Reference;

class MediaSessionCompat$Callback$CallbackHandler
  extends Handler
{
  private static final int MSG_MEDIA_PLAY_PAUSE_KEY_DOUBLE_TAP_TIMEOUT = 1;
  
  public MediaSessionCompat$Callback$CallbackHandler(MediaSessionCompat.Callback paramCallback, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (what == 1) {
      synchronized (this$0.mLock)
      {
        MediaSessionCompat.MediaSessionImpl localMediaSessionImpl = (MediaSessionCompat.MediaSessionImpl)this$0.mSessionImpl.get();
        MediaSessionCompat.Callback localCallback = this$0;
        CallbackHandler localCallbackHandler = mCallbackHandler;
        if ((localMediaSessionImpl != null) && (localCallback == localMediaSessionImpl.getCallback()) && (localCallbackHandler != null))
        {
          localMediaSessionImpl.setCurrentControllerInfo((MediaSessionManager.RemoteUserInfo)obj);
          this$0.handleMediaPlayPauseIfPendingOnHandler(localMediaSessionImpl, localCallbackHandler);
          localMediaSessionImpl.setCurrentControllerInfo(null);
        }
        else {}
      }
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.Callback.CallbackHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */