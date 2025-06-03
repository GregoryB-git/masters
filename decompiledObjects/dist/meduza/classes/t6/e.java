package t6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class e
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str = null;
    int j = 0;
    a.a locala = null;
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
            locala = (a.a)b.e(paramParcel, k, a.a.CREATOR);
          }
        }
        else {
          str = b.f(k, paramParcel);
        }
      }
      else {
        j = b.o(k, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new g(locala, str, j);
  }
}

/* Location:
 * Qualified Name:     t6.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */