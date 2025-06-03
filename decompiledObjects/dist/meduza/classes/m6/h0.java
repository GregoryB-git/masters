package m6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class h0
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    int j = 0;
    int k = j;
    int m = k;
    int n = m;
    int i1 = n;
    boolean bool2;
    boolean bool1;
    while (paramParcel.dataPosition() < i)
    {
      int i2 = paramParcel.readInt();
      int i3 = (char)i2;
      if (i3 != 1)
      {
        if (i3 != 2)
        {
          if (i3 != 3)
          {
            if (i3 != 4)
            {
              if (i3 != 5) {
                b.t(i2, paramParcel);
              } else {
                i1 = b.o(i2, paramParcel);
              }
            }
            else {
              n = b.o(i2, paramParcel);
            }
          }
          else {
            bool2 = b.k(i2, paramParcel);
          }
        }
        else {
          bool1 = b.k(i2, paramParcel);
        }
      }
      else {
        j = b.o(i2, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new l(j, bool1, bool2, n, i1);
  }
}

/* Location:
 * Qualified Name:     m6.h0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */