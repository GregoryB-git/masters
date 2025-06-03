package d6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class w
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    byte[] arrayOfByte = null;
    boolean bool = false;
    String str = null;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      int k = (char)j;
      if (k != 1)
      {
        if (k != 2)
        {
          if (k != 3) {
            b.t(j, paramParcel);
          } else {
            str = b.f(j, paramParcel);
          }
        }
        else {
          arrayOfByte = b.c(j, paramParcel);
        }
      }
      else {
        bool = b.k(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new b.c(bool, arrayOfByte, str);
  }
}

/* Location:
 * Qualified Name:     d6.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */