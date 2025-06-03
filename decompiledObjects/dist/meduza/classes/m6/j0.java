package m6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class j0
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      if ((char)k != '\001') {
        b.t(k, paramParcel);
      } else {
        j = b.o(k, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new i0(j);
  }
}

/* Location:
 * Qualified Name:     m6.j0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */