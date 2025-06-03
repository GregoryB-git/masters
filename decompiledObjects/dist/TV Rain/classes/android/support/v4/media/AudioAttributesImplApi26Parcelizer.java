package android.support.v4.media;

import androidx.annotation.RestrictTo;
import androidx.media.AudioAttributesImplApi26;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public final class AudioAttributesImplApi26Parcelizer
  extends androidx.media.AudioAttributesImplApi26Parcelizer
{
  public static AudioAttributesImplApi26 read(VersionedParcel paramVersionedParcel)
  {
    return androidx.media.AudioAttributesImplApi26Parcelizer.read(paramVersionedParcel);
  }
  
  public static void write(AudioAttributesImplApi26 paramAudioAttributesImplApi26, VersionedParcel paramVersionedParcel)
  {
    androidx.media.AudioAttributesImplApi26Parcelizer.write(paramAudioAttributesImplApi26, paramVersionedParcel);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.AudioAttributesImplApi26Parcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */