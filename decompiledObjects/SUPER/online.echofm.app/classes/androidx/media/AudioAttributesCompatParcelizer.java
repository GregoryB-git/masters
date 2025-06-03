package androidx.media;

import v1.b;

public class AudioAttributesCompatParcelizer
{
  public static AudioAttributesCompat read(b paramb)
  {
    AudioAttributesCompat localAudioAttributesCompat = new AudioAttributesCompat();
    a = ((AudioAttributesImpl)paramb.v(a, 1));
    return localAudioAttributesCompat;
  }
  
  public static void write(AudioAttributesCompat paramAudioAttributesCompat, b paramb)
  {
    paramb.x(false, false);
    paramb.M(a, 1);
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesCompatParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */