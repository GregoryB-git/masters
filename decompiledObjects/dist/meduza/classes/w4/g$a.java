package w4;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class g$a
  implements Parcelable.Creator<g>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    return new g(paramParcel.readLong(), paramParcel.readLong());
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new g[paramInt];
  }
}

/* Location:
 * Qualified Name:     w4.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */