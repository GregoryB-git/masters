package v4;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class c$b$a
  implements Parcelable.Creator<c.b>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    long l1 = paramParcel.readLong();
    long l2 = paramParcel.readLong();
    return new c.b(paramParcel.readInt(), l1, l2);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new c.b[paramInt];
  }
}

/* Location:
 * Qualified Name:     v4.c.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */