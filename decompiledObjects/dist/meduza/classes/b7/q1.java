package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class q1
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    byte[] arrayOfByte = null;
    boolean bool = false;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      int k = (char)j;
      if (k != 1)
      {
        if (k != 2) {
          b.t(j, paramParcel);
        } else {
          arrayOfByte = b.c(j, paramParcel);
        }
      }
      else {
        bool = b.k(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new p1(bool, arrayOfByte);
  }
}

/* Location:
 * Qualified Name:     b7.q1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */