package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class RatingCompat$a
  implements Parcelable.Creator<RatingCompat>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    return new RatingCompat(paramParcel.readFloat(), i);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new RatingCompat[paramInt];
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.RatingCompat.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */