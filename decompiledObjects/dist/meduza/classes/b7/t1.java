package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class t1
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
      if (n != 2)
      {
        if (n != 3)
        {
          if (n != 4) {
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
    return new i(j, str, k);
  }
}

/* Location:
 * Qualified Name:     b7.t1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */