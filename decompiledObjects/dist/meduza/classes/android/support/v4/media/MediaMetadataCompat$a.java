package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class MediaMetadataCompat$a
  implements Parcelable.Creator<MediaMetadataCompat>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    return new MediaMetadataCompat(paramParcel);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new MediaMetadataCompat[paramInt];
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaMetadataCompat.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */