package d6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class a0
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    l locall = null;
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
            j = b.o(k, paramParcel);
          }
        }
        else {
          str = b.f(k, paramParcel);
        }
      }
      else {
        locall = (l)b.e(paramParcel, k, l.CREATOR);
      }
    }
    b.j(i, paramParcel);
    return new h(locall, str, j);
  }
}

/* Location:
 * Qualified Name:     d6.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */