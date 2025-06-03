package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class INotificationSideChannel$_Parcel
{
  private static <T> T readTypedObject(Parcel paramParcel, Parcelable.Creator<T> paramCreator)
  {
    if (paramParcel.readInt() != 0) {
      return (T)paramCreator.createFromParcel(paramParcel);
    }
    return null;
  }
  
  private static <T extends Parcelable> void writeTypedObject(Parcel paramParcel, T paramT, int paramInt)
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
 * Qualified Name:     android.support.v4.app.INotificationSideChannel._Parcel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */