package x0;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class c
  implements Parcelable
{
  public static final Parcelable.Creator<c> CREATOR = new a();
  public final ArrayList a;
  public final ArrayList b;
  
  public c(Parcel paramParcel)
  {
    a = paramParcel.createStringArrayList();
    b = paramParcel.createTypedArrayList(b.CREATOR);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeStringList(a);
    paramParcel.writeTypedList(b);
  }
  
  public final class a
    implements Parcelable.Creator<c>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new c(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new c[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     x0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */