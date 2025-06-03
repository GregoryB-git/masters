package s6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class f
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    int j = 0;
    String str = null;
    int k = 0;
    while (paramParcel.dataPosition() < i)
    {
      int m = paramParcel.readInt();
      int n = (char)m;
      if (n != 1)
      {
        if (n != 2)
        {
          if (n != 3) {
            b.t(m, paramParcel);
          } else {
            k = b.o(m, paramParcel);
          }
        }
        else {
          str = b.f(m, paramParcel);
        }
      }
      else {
        j = b.o(m, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new d(j, str, k);
  }
}

/* Location:
 * Qualified Name:     s6.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */