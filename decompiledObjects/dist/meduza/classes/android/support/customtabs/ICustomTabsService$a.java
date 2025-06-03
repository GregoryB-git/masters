package android.support.customtabs;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class ICustomTabsService$a
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
  
  public static <T extends Parcelable> void b(Parcel paramParcel, T paramT, int paramInt)
  {
    if (paramT != null)
    {
      paramParcel.writeInt(1);
      paramT.writeToParcel(paramParcel, paramInt);
    }
    else
    {
      paramParcel.writeInt(0);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.customtabs.ICustomTabsService.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */