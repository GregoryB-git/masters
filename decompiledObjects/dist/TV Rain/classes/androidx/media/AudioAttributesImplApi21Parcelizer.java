package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplApi21Parcelizer
{
  public static AudioAttributesImplApi21 read(VersionedParcel paramVersionedParcel)
  {
    AudioAttributesImplApi21 localAudioAttributesImplApi21 = new AudioAttributesImplApi21();
    mAudioAttributes = ((AudioAttributes)paramVersionedParcel.readParcelable(mAudioAttributes, 1));
    mLegacyStreamType = paramVersionedParcel.readInt(mLegacyStreamType, 2);
    return localAudioAttributesImplApi21;
  }
  
  public static void write(AudioAttributesImplApi21 paramAudioAttributesImplApi21, VersionedParcel paramVersionedParcel)
  {
    paramVersionedParcel.setSerializationFlags(false, false);
    paramVersionedParcel.writeParcelable(mAudioAttributes, 1);
    paramVersionedParcel.writeInt(mLegacyStreamType, 2);
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplApi21Parcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */