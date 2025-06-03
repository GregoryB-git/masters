package b8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class d1
  implements Parcelable.Creator<e0>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    while (paramParcel.dataPosition() < i) {
      b.t(paramParcel.readInt(), paramParcel);
    }
    b.j(i, paramParcel);
    return new e0();
  }
}

/* Location:
 * Qualified Name:     b8.d1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */