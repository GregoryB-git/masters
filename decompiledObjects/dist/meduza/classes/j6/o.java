package j6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class o
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    long l = -1L;
    int j = 0;
    String str = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      int m = (char)k;
      if (m != 1)
      {
        if (m != 2)
        {
          if (m != 3) {
            b.t(k, paramParcel);
          } else {
            l = b.q(k, paramParcel);
          }
        }
        else {
          j = b.o(k, paramParcel);
        }
      }
      else {
        str = b.f(k, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new d(str, j, l);
  }
}

/* Location:
 * Qualified Name:     j6.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */