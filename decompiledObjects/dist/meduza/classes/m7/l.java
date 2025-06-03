package m7;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import f;

public final class l
{
  static
  {
    l.class.getClassLoader();
  }
  
  public static Parcelable a(Parcel paramParcel, Parcelable.Creator paramCreator)
  {
    if (paramParcel.readInt() == 0) {
      return null;
    }
    return (Parcelable)paramCreator.createFromParcel(paramParcel);
  }
  
  public static void b(Parcel paramParcel)
  {
    int i = paramParcel.dataAvail();
    if (i <= 0) {
      return;
    }
    throw new BadParcelableException(f.h("Parcel data not fully consumed, unread size: ", i));
  }
}

/* Location:
 * Qualified Name:     m7.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */