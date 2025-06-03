package m0;

import android.media.AudioTrack;

public abstract class N$b
{
  public static void a(AudioTrack paramAudioTrack, j paramj)
  {
    if (paramj == null) {
      paramj = null;
    } else {
      paramj = a;
    }
    paramAudioTrack.setPreferredDevice(paramj);
  }
}

/* Location:
 * Qualified Name:     m0.N.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */