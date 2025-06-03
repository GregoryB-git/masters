package x3;

import android.media.AudioTrack;

public final class s$a
{
  public static void a(AudioTrack paramAudioTrack, s.c paramc)
  {
    if (paramc == null) {
      paramc = null;
    } else {
      paramc = a;
    }
    paramAudioTrack.setPreferredDevice(paramc);
  }
}

/* Location:
 * Qualified Name:     x3.s.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */