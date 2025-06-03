package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplBaseParcelizer
{
  public static AudioAttributesImplBase read(VersionedParcel paramVersionedParcel)
  {
    AudioAttributesImplBase localAudioAttributesImplBase = new AudioAttributesImplBase();
    mUsage = paramVersionedParcel.readInt(mUsage, 1);
    mContentType = paramVersionedParcel.readInt(mContentType, 2);
    mFlags = paramVersionedParcel.readInt(mFlags, 3);
    mLegacyStream = paramVersionedParcel.readInt(mLegacyStream, 4);
    return localAudioAttributesImplBase;
  }
  
  public static void write(AudioAttributesImplBase paramAudioAttributesImplBase, VersionedParcel paramVersionedParcel)
  {
    paramVersionedParcel.setSerializationFlags(false, false);
    paramVersionedParcel.writeInt(mUsage, 1);
    paramVersionedParcel.writeInt(mContentType, 2);
    paramVersionedParcel.writeInt(mFlags, 3);
    paramVersionedParcel.writeInt(mLegacyStream, 4);
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplBaseParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */