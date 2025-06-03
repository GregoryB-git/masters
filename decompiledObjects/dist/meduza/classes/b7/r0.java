package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class r0
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    byte[][] arrayOfByte = null;
    for (;;)
    {
      if (paramParcel.dataPosition() >= i) {
        break label107;
      }
      int j = paramParcel.readInt();
      if ((char)j != '\001')
      {
        b.t(j, paramParcel);
      }
      else
      {
        int k = b.s(j, paramParcel);
        int m = paramParcel.dataPosition();
        if (k == 0) {
          break;
        }
        int n = paramParcel.readInt();
        arrayOfByte = new byte[n][];
        for (j = 0; j < n; j++) {
          arrayOfByte[j] = paramParcel.createByteArray();
        }
        paramParcel.setDataPosition(m + k);
      }
    }
    label107:
    b.j(i, paramParcel);
    return new q0(arrayOfByte);
  }
}

/* Location:
 * Qualified Name:     b7.r0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */