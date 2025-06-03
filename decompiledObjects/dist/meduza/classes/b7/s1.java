package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class s1
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    byte[] arrayOfByte1 = null;
    byte[] arrayOfByte2 = arrayOfByte1;
    byte[] arrayOfByte3 = arrayOfByte2;
    Object localObject = arrayOfByte3;
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
              b.t(j, paramParcel);
            }
            else
            {
              k = b.s(j, paramParcel);
              j = paramParcel.dataPosition();
              if (k == 0)
              {
                localObject = null;
              }
              else
              {
                localObject = paramParcel.createStringArray();
                paramParcel.setDataPosition(j + k);
              }
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
    return new h(arrayOfByte1, arrayOfByte2, arrayOfByte3, (String[])localObject);
  }
}

/* Location:
 * Qualified Name:     b7.s1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */