package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class r1
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    byte[] arrayOfByte1 = null;
    byte[] arrayOfByte2 = arrayOfByte1;
    byte[] arrayOfByte3 = arrayOfByte2;
    byte[] arrayOfByte4 = arrayOfByte3;
    byte[] arrayOfByte5 = arrayOfByte4;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      int k = (char)j;
      if (k != 2)
      {
        if (k != 3)
        {
          if (k != 4)
          {
            if (k != 5)
            {
              if (k != 6) {
                b.t(j, paramParcel);
              } else {
                arrayOfByte5 = b.c(j, paramParcel);
              }
            }
            else {
              arrayOfByte4 = b.c(j, paramParcel);
            }
          }
          else {
            arrayOfByte3 = b.c(j, paramParcel);
          }
        }
        else {
          arrayOfByte2 = b.c(j, paramParcel);
        }
      }
      else {
        arrayOfByte1 = b.c(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new g(arrayOfByte1, arrayOfByte2, arrayOfByte3, arrayOfByte4, arrayOfByte5);
  }
}

/* Location:
 * Qualified Name:     b7.r1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */