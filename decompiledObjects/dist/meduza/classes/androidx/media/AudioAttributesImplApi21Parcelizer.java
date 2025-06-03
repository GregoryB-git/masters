package androidx.media;

import android.media.AudioAttributes;
import b2.c;

public class AudioAttributesImplApi21Parcelizer
{
  public static AudioAttributesImplApi21 read(c paramc)
  {
    AudioAttributesImplApi21 localAudioAttributesImplApi21 = new AudioAttributesImplApi21();
    a = ((AudioAttributes)paramc.s(a, 1));
    b = paramc.o(b, 2);
    return localAudioAttributesImplApi21;
  }
  
  public static void write(AudioAttributesImplApi21 paramAudioAttributesImplApi21, c paramc)
  {
    paramc.getClass();
    paramc.M(a, 1);
    paramc.I(b, 2);
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplApi21Parcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */