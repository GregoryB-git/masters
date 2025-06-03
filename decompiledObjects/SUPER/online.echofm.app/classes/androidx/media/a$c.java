package androidx.media;

import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

public class a$c
  implements Handler.Callback, AudioManager.OnAudioFocusChangeListener
{
  public final Handler o;
  public final AudioManager.OnAudioFocusChangeListener p;
  
  public a$c(AudioManager.OnAudioFocusChangeListener paramOnAudioFocusChangeListener, Handler paramHandler)
  {
    p = paramOnAudioFocusChangeListener;
    o = new Handler(paramHandler.getLooper(), this);
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (what == 2782386)
    {
      p.onAudioFocusChange(arg1);
      return true;
    }
    return false;
  }
  
  public void onAudioFocusChange(int paramInt)
  {
    Handler localHandler = o;
    localHandler.sendMessage(Message.obtain(localHandler, 2782386, paramInt, 0));
  }
}

/* Location:
 * Qualified Name:     androidx.media.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */