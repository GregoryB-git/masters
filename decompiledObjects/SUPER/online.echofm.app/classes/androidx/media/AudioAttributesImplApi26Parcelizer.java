package androidx.media;

import android.media.AudioAttributes;
import v1.b;

public class AudioAttributesImplApi26Parcelizer
{
  public static AudioAttributesImplApi26 read(b paramb)
  {
    AudioAttributesImplApi26 localAudioAttributesImplApi26 = new AudioAttributesImplApi26();
    a = ((AudioAttributes)paramb.r(a, 1));
    b = paramb.p(b, 2);
    return localAudioAttributesImplApi26;
  }
  
  public static void write(AudioAttributesImplApi26 paramAudioAttributesImplApi26, b paramb)
  {
    paramb.x(false, false);
    paramb.H(a, 1);
    paramb.F(b, 2);
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplApi26Parcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */