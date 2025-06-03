package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class j1
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    int j = 0;
    int k = 0;
    int m = k;
    int n = m;
    int i1 = k;
    k = j;
    while (paramParcel.dataPosition() < i)
    {
      j = paramParcel.readInt();
      m = (char)j;
      if (m != 1)
      {
        if (m != 2)
        {
          if (m != 3)
          {
            b.t(j, paramParcel);
          }
          else
          {
            b.w(paramParcel, j, 4);
            m = (short)paramParcel.readInt();
            n = m;
          }
        }
        else
        {
          b.w(paramParcel, j, 4);
          m = (short)paramParcel.readInt();
          i1 = m;
        }
      }
      else {
        k = b.o(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new g0(k, i1, n);
  }
}

/* Location:
 * Qualified Name:     b7.j1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */