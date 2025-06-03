package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public abstract class a$b
{
  public static Object d(Parcel paramParcel, Parcelable.Creator paramCreator)
  {
    if (paramParcel.readInt() != 0) {
      return paramCreator.createFromParcel(paramParcel);
    }
    return null;
  }
  
  public static void e(Parcel paramParcel, List paramList, int paramInt)
  {
    if (paramList == null)
    {
      paramParcel.writeInt(-1);
    }
    else
    {
      int i = paramList.size();
      paramParcel.writeInt(i);
      for (int j = 0; j < i; j++) {
        f(paramParcel, (Parcelable)paramList.get(j), paramInt);
      }
    }
  }
  
  public static void f(Parcel paramParcel, Parcelable paramParcelable, int paramInt)
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
 * Qualified Name:     android.support.v4.media.session.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */