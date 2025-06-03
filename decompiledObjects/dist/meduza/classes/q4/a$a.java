package q4;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class a$a
  implements Parcelable.Creator<a>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    str.getClass();
    return new a(paramParcel.readInt(), str);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new a[paramInt];
  }
}

/* Location:
 * Qualified Name:     q4.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */