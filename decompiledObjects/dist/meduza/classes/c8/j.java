package c8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class j
  implements Parcelable.Creator<k>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    long l1 = 0L;
    long l2 = 0L;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      int k = (char)j;
      if (k != 1)
      {
        if (k != 2) {
          b.t(j, paramParcel);
        } else {
          l2 = b.q(j, paramParcel);
        }
      }
      else {
        l1 = b.q(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new k(l1, l2);
  }
}

/* Location:
 * Qualified Name:     c8.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */