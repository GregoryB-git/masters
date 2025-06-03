package m0;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import g0.M;

public abstract class E$b
{
  public static k a(AudioFormat paramAudioFormat, AudioAttributes paramAudioAttributes, boolean paramBoolean)
  {
    int i = F.a(paramAudioFormat, paramAudioAttributes);
    if (i == 0) {
      return k.d;
    }
    paramAudioFormat = new k.b();
    boolean bool;
    if ((M.a > 32) && (i == 2)) {
      bool = true;
    } else {
      bool = false;
    }
    return paramAudioFormat.e(true).f(bool).g(paramBoolean).d();
  }
}

/* Location:
 * Qualified Name:     m0.E.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */