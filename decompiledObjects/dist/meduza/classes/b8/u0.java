package b8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class u0
  implements Parcelable.Creator<t0>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str1 = null;
    String str2 = null;
    String str3 = str2;
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
    b.j(i, paramParcel);
    return new t0(str1, str2, str3);
  }
}

/* Location:
 * Qualified Name:     b8.u0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */