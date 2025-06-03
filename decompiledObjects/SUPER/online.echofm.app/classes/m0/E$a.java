package m0;

import android.media.AudioAttributes;
import android.media.AudioFormat;

public abstract class E$a
{
  public static k a(AudioFormat paramAudioFormat, AudioAttributes paramAudioAttributes, boolean paramBoolean)
  {
    if (!D.a(paramAudioFormat, paramAudioAttributes)) {
      return k.d;
    }
    return new k.b().e(true).g(paramBoolean).d();
  }
}

/* Location:
 * Qualified Name:     m0.E.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */