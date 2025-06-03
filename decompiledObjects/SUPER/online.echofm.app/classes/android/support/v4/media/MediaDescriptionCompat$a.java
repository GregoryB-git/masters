package android.support.v4.media;

import android.media.MediaDescription;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class MediaDescriptionCompat$a
  implements Parcelable.Creator
{
  public MediaDescriptionCompat a(Parcel paramParcel)
  {
    return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(paramParcel));
  }
  
  public MediaDescriptionCompat[] b(int paramInt)
  {
    return new MediaDescriptionCompat[paramInt];
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaDescriptionCompat.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */