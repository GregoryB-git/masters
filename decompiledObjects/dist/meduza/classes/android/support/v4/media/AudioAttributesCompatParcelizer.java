package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import b2.c;

public final class AudioAttributesCompatParcelizer
  extends androidx.media.AudioAttributesCompatParcelizer
{
  public static AudioAttributesCompat read(c paramc)
  {
    return androidx.media.AudioAttributesCompatParcelizer.read(paramc);
  }
  
  public static void write(AudioAttributesCompat paramAudioAttributesCompat, c paramc)
  {
    androidx.media.AudioAttributesCompatParcelizer.write(paramAudioAttributesCompat, paramc);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.AudioAttributesCompatParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */