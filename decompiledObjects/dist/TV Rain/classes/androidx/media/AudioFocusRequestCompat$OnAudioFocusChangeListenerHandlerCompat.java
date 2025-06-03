package androidx.media;

import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import androidx.annotation.NonNull;

class AudioFocusRequestCompat$OnAudioFocusChangeListenerHandlerCompat
  implements Handler.Callback, AudioManager.OnAudioFocusChangeListener
{
  private static final int FOCUS_CHANGE = 2782386;
  private final Handler mHandler;
  private final AudioManager.OnAudioFocusChangeListener mListener;
  
  public AudioFocusRequestCompat$OnAudioFocusChangeListenerHandlerCompat(@NonNull AudioManager.OnAudioFocusChangeListener paramOnAudioFocusChangeListener, @NonNull Handler paramHandler)
  {
    mListener = paramOnAudioFocusChangeListener;
    mHandler = new Handler(paramHandler.getLooper(), this);
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (what == 2782386)
    {
      mListener.onAudioFocusChange(arg1);
      return true;
    }
    return false;
  }
  
  public void onAudioFocusChange(int paramInt)
  {
    Handler localHandler = mHandler;
    localHandler.sendMessage(Message.obtain(localHandler, 2782386, paramInt, 0));
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioFocusRequestCompat.OnAudioFocusChangeListenerHandlerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */