package h7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import m6.x;
import n6.b;

public final class i
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    x localx = null;
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      int m = (char)k;
      if (m != 1)
      {
        if (m != 2) {
          b.t(k, paramParcel);
        } else {
          localx = (x)b.e(paramParcel, k, x.CREATOR);
        }
      }
      else {
        j = b.o(k, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new h(j, localx);
  }
}

/* Location:
 * Qualified Name:     h7.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */