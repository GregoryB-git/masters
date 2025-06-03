package b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public abstract class a$b
{
  public static Object c(Parcel paramParcel, Parcelable.Creator paramCreator)
  {
    if (paramParcel.readInt() != 0) {
      return paramCreator.createFromParcel(paramParcel);
    }
    return null;
  }
  
  public static void d(Parcel paramParcel, Parcelable paramParcelable, int paramInt)
  {
    if (paramParcelable != null)
    {
      paramParcel.writeInt(1);
      paramParcelable.writeToParcel(paramParcel, paramInt);
    }
    else
    {
      paramParcel.writeInt(0);
    }
  }
}

/* Location:
 * Qualified Name:     b.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */