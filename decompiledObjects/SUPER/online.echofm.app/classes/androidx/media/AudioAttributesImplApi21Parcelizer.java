package androidx.media;

import android.media.AudioAttributes;
import v1.b;

public class AudioAttributesImplApi21Parcelizer
{
  public static AudioAttributesImplApi21 read(b paramb)
  {
    AudioAttributesImplApi21 localAudioAttributesImplApi21 = new AudioAttributesImplApi21();
    a = ((AudioAttributes)paramb.r(a, 1));
    b = paramb.p(b, 2);
    return localAudioAttributesImplApi21;
  }
  
  public static void write(AudioAttributesImplApi21 paramAudioAttributesImplApi21, b paramb)
  {
    paramb.x(false, false);
    paramb.H(a, 1);
    paramb.F(b, 2);
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplApi21Parcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */