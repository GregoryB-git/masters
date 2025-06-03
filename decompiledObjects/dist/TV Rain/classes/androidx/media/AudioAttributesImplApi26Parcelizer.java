package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplApi26Parcelizer
{
  public static AudioAttributesImplApi26 read(VersionedParcel paramVersionedParcel)
  {
    AudioAttributesImplApi26 localAudioAttributesImplApi26 = new AudioAttributesImplApi26();
    mAudioAttributes = ((AudioAttributes)paramVersionedParcel.readParcelable(mAudioAttributes, 1));
    mLegacyStreamType = paramVersionedParcel.readInt(mLegacyStreamType, 2);
    return localAudioAttributesImplApi26;
  }
  
  public static void write(AudioAttributesImplApi26 paramAudioAttributesImplApi26, VersionedParcel paramVersionedParcel)
  {
    paramVersionedParcel.setSerializationFlags(false, false);
    paramVersionedParcel.writeParcelable(mAudioAttributes, 1);
    paramVersionedParcel.writeInt(mLegacyStreamType, 2);
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplApi26Parcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */