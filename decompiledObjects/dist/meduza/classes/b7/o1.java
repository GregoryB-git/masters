package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class o1
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    byte[] arrayOfByte1 = null;
    byte[] arrayOfByte2 = null;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      int k = (char)j;
      if (k != 1)
      {
        if (k != 2) {
          b.t(j, paramParcel);
        } else {
          arrayOfByte2 = b.c(j, paramParcel);
        }
      }
      else {
        arrayOfByte1 = b.c(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new n1(arrayOfByte1, arrayOfByte2);
  }
}

/* Location:
 * Qualified Name:     b7.o1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */