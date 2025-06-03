package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class RatingCompat$a
  implements Parcelable.Creator
{
  public RatingCompat a(Parcel paramParcel)
  {
    return new RatingCompat(paramParcel.readInt(), paramParcel.readFloat());
  }
  
  public RatingCompat[] b(int paramInt)
  {
    return new RatingCompat[paramInt];
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.RatingCompat.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */