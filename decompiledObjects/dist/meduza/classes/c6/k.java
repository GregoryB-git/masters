package c6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class k
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    int j = 0;
    int k = j;
    int m = k;
    long l = 0L;
    boolean bool2;
    boolean bool1;
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
            if (i1 != 4) {
              b.t(n, paramParcel);
            } else {
              bool2 = b.k(n, paramParcel);
            }
          }
          else {
            l = b.q(n, paramParcel);
          }
        }
        else {
          bool1 = b.k(n, paramParcel);
        }
      }
      else {
        j = b.o(n, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new a(j, l, bool1, bool2);
  }
}

/* Location:
 * Qualified Name:     c6.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */