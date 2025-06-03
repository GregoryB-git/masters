package u7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import ec.i;

public final class m$a
  implements Parcelable.Creator<m>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    i.e(paramParcel, "source");
    long l = paramParcel.readLong();
    return new m(paramParcel.readInt(), l);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new m[paramInt];
  }
}

/* Location:
 * Qualified Name:     u7.m.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */