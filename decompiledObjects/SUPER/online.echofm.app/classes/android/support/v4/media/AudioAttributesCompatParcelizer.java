package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import v1.b;

public final class AudioAttributesCompatParcelizer
  extends androidx.media.AudioAttributesCompatParcelizer
{
  public static AudioAttributesCompat read(b paramb)
  {
    return androidx.media.AudioAttributesCompatParcelizer.read(paramb);
  }
  
  public static void write(AudioAttributesCompat paramAudioAttributesCompat, b paramb)
  {
    androidx.media.AudioAttributesCompatParcelizer.write(paramAudioAttributesCompat, paramb);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.AudioAttributesCompatParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */