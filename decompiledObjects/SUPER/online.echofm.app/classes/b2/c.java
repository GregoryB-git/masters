package b2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public abstract class c
{
  static
  {
    c.class.getClassLoader();
  }
  
  public static Parcelable a(Parcel paramParcel, Parcelable.Creator paramCreator)
  {
    if (paramParcel.readInt() == 0) {
      return null;
    }
    return (Parcelable)paramCreator.createFromParcel(paramParcel);
  }
  
  public static void b(Parcel paramParcel, Parcelable paramParcelable)
  {
    paramParcel.writeInt(1);
    paramParcelable.writeToParcel(paramParcel, 0);
  }
}

/* Location:
 * Qualified Name:     b2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */