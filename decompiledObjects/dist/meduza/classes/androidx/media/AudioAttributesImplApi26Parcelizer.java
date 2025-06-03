package androidx.media;

import android.media.AudioAttributes;
import b2.c;

public class AudioAttributesImplApi26Parcelizer
{
  public static AudioAttributesImplApi26 read(c paramc)
  {
    AudioAttributesImplApi26 localAudioAttributesImplApi26 = new AudioAttributesImplApi26();
    a = ((AudioAttributes)paramc.s(a, 1));
    b = paramc.o(b, 2);
    return localAudioAttributesImplApi26;
  }
  
  public static void write(AudioAttributesImplApi26 paramAudioAttributesImplApi26, c paramc)
  {
    paramc.getClass();
    paramc.M(a, 1);
    paramc.I(b, 2);
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplApi26Parcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */