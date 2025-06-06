package android.support.v4.media;

import androidx.annotation.RestrictTo;
import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public final class AudioAttributesCompatParcelizer
  extends androidx.media.AudioAttributesCompatParcelizer
{
  public static AudioAttributesCompat read(VersionedParcel paramVersionedParcel)
  {
    return androidx.media.AudioAttributesCompatParcelizer.read(paramVersionedParcel);
  }
  
  public static void write(AudioAttributesCompat paramAudioAttributesCompat, VersionedParcel paramVersionedParcel)
  {
    androidx.media.AudioAttributesCompatParcelizer.write(paramAudioAttributesCompat, paramVersionedParcel);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.AudioAttributesCompatParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */