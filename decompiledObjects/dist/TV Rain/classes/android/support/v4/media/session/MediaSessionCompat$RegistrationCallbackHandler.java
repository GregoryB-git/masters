package android.support.v4.media.session;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;

final class MediaSessionCompat$RegistrationCallbackHandler
  extends Handler
{
  private static final int MSG_CALLBACK_REGISTERED = 1001;
  private static final int MSG_CALLBACK_UNREGISTERED = 1002;
  private final MediaSessionCompat.RegistrationCallback mCallback;
  
  public MediaSessionCompat$RegistrationCallbackHandler(@NonNull Looper paramLooper, @NonNull MediaSessionCompat.RegistrationCallback paramRegistrationCallback)
  {
    super(paramLooper);
    mCallback = paramRegistrationCallback;
  }
  
  public void handleMessage(@NonNull Message paramMessage)
  {
    super.handleMessage(paramMessage);
    int i = what;
    if (i != 1001)
    {
      if (i == 1002) {
        mCallback.onCallbackUnregistered(arg1, arg2);
      }
    }
    else {
      mCallback.onCallbackRegistered(arg1, arg2);
    }
  }
  
  public void postCallbackRegistered(int paramInt1, int paramInt2)
  {
    obtainMessage(1001, paramInt1, paramInt2).sendToTarget();
  }
  
  public void postCallbackUnregistered(int paramInt1, int paramInt2)
  {
    obtainMessage(1002, paramInt1, paramInt2).sendToTarget();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.RegistrationCallbackHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */