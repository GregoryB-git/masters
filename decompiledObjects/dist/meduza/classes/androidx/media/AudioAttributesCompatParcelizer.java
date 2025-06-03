package androidx.media;

import b2.c;

public class AudioAttributesCompatParcelizer
{
  public static AudioAttributesCompat read(c paramc)
  {
    AudioAttributesCompat localAudioAttributesCompat = new AudioAttributesCompat();
    a = ((AudioAttributesImpl)paramc.x(a, 1));
    return localAudioAttributesCompat;
  }
  
  public static void write(AudioAttributesCompat paramAudioAttributesCompat, c paramc)
  {
    paramc.getClass();
    paramc.R(a, 1);
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesCompatParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */