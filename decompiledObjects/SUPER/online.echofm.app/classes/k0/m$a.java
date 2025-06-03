package k0;

import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;

public class m$a
  implements AudioManager.OnAudioFocusChangeListener
{
  public final Handler o;
  
  public m$a(m paramm, Handler paramHandler)
  {
    o = paramHandler;
  }
  
  public void onAudioFocusChange(int paramInt)
  {
    o.post(new l(this, paramInt));
  }
}

/* Location:
 * Qualified Name:     k0.m.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */