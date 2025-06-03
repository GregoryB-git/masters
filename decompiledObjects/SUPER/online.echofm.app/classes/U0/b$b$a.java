package U0;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class b$b$a
  implements Parcelable.Creator
{
  public b.b a(Parcel paramParcel)
  {
    return new b.b(paramParcel.readLong(), paramParcel.readLong(), paramParcel.readInt());
  }
  
  public b.b[] b(int paramInt)
  {
    return new b.b[paramInt];
  }
}

/* Location:
 * Qualified Name:     U0.b.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */