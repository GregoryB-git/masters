package e7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class g
  implements Parcelable.Creator<e>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    long l1 = 0L;
    long l2 = l1;
    int j = 0;
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
            l2 = b.q(k, paramParcel);
          }
        }
        else {
          j = b.o(k, paramParcel);
        }
      }
      else {
        l1 = b.q(k, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new e(j, l1, l2);
  }
}

/* Location:
 * Qualified Name:     e7.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */