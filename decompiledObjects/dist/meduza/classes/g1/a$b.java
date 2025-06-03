package g1;

import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

public final class a$b
  implements Handler.Callback, AudioManager.OnAudioFocusChangeListener
{
  public final Handler a;
  public final AudioManager.OnAudioFocusChangeListener b;
  
  public a$b(AudioManager.OnAudioFocusChangeListener paramOnAudioFocusChangeListener, Handler paramHandler)
  {
    b = paramOnAudioFocusChangeListener;
    a = new Handler(paramHandler.getLooper(), this);
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    if (what == 2782386)
    {
      b.onAudioFocusChange(arg1);
      return true;
    }
    return false;
  }
  
  public final void onAudioFocusChange(int paramInt)
  {
    Handler localHandler = a;
    localHandler.sendMessage(Message.obtain(localHandler, 2782386, paramInt, 0));
  }
}

/* Location:
 * Qualified Name:     g1.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */