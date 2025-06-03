package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class z0
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    byte[] arrayOfByte = null;
    String str1 = null;
    String str2 = str1;
    String str3 = str2;
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
            if (k != 5) {
              b.t(j, paramParcel);
            } else {
              str3 = b.f(j, paramParcel);
            }
          }
          else {
            str2 = b.f(j, paramParcel);
          }
        }
        else {
          str1 = b.f(j, paramParcel);
        }
      }
      else {
        arrayOfByte = b.c(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new a0(str1, str2, str3, arrayOfByte);
  }
}

/* Location:
 * Qualified Name:     b7.z0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */