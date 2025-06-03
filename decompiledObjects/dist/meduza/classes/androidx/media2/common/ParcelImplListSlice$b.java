package androidx.media2.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ParcelImplListSlice$b
  implements Parcelable.Creator<ParcelImplListSlice>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    return new ParcelImplListSlice(paramParcel);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new ParcelImplListSlice[paramInt];
  }
}

/* Location:
 * Qualified Name:     androidx.media2.common.ParcelImplListSlice.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */