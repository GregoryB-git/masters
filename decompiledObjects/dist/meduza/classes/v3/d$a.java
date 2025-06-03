package v3;

import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;

public final class d$a
  implements AudioManager.OnAudioFocusChangeListener
{
  public final Handler a;
  
  public d$a(d paramd, Handler paramHandler)
  {
    a = paramHandler;
  }
  
  public final void onAudioFocusChange(int paramInt)
  {
    a.post(new c(this, paramInt));
  }
}

/* Location:
 * Qualified Name:     v3.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */