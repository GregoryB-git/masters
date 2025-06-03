package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ParcelImpl$1
  implements Parcelable.Creator<ParcelImpl>
{
  public ParcelImpl createFromParcel(Parcel paramParcel)
  {
    return new ParcelImpl(paramParcel);
  }
  
  public ParcelImpl[] newArray(int paramInt)
  {
    return new ParcelImpl[paramInt];
  }
}

/* Location:
 * Qualified Name:     androidx.versionedparcelable.ParcelImpl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */