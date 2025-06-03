package android.support.customtabs;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ICustomTabsCallback$a
{
  public static Object a(Parcel paramParcel, Parcelable.Creator paramCreator)
  {
    if (paramParcel.readInt() != 0) {
      paramParcel = paramCreator.createFromParcel(paramParcel);
    } else {
      paramParcel = null;
    }
    return paramParcel;
  }
}

/* Location:
 * Qualified Name:     android.support.customtabs.ICustomTabsCallback.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */