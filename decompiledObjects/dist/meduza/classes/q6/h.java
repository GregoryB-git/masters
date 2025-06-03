package q6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class h
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    Long localLong1 = null;
    Long localLong2 = localLong1;
    int j = 0;
    int k = j;
    int m = k;
    while (paramParcel.dataPosition() < i)
    {
      int n = paramParcel.readInt();
      int i1 = (char)n;
      if (i1 != 1)
      {
        if (i1 != 2)
        {
          if (i1 != 3)
          {
            if (i1 != 4)
            {
              if (i1 != 5) {
                b.t(n, paramParcel);
              } else {
                m = b.o(n, paramParcel);
              }
            }
            else {
              localLong2 = b.r(n, paramParcel);
            }
          }
          else {
            localLong1 = b.r(n, paramParcel);
          }
        }
        else {
          k = b.o(n, paramParcel);
        }
      }
      else {
        j = b.o(n, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new d(j, k, localLong1, localLong2, m);
  }
}

/* Location:
 * Qualified Name:     q6.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */