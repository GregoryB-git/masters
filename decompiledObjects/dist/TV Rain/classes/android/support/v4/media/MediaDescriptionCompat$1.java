package android.support.v4.media;

import android.media.MediaDescription;
import android.os.Parcel;
import android.os.Parcelable.Creator;

class MediaDescriptionCompat$1
  implements Parcelable.Creator<MediaDescriptionCompat>
{
  public MediaDescriptionCompat createFromParcel(Parcel paramParcel)
  {
    return MediaDescriptionCompat.fromMediaDescription(MediaDescription.CREATOR.createFromParcel(paramParcel));
  }
  
  public MediaDescriptionCompat[] newArray(int paramInt)
  {
    return new MediaDescriptionCompat[paramInt];
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaDescriptionCompat.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */