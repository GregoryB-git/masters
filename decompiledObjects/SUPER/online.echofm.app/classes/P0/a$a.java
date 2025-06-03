package P0;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class a$a
  implements Parcelable.Creator
{
  public a a(Parcel paramParcel)
  {
    String str = (String)g0.a.e(paramParcel.readString());
    return new a(paramParcel.readInt(), str);
  }
  
  public a[] b(int paramInt)
  {
    return new a[paramInt];
  }
}

/* Location:
 * Qualified Name:     P0.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */