package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class x0
  implements Parcelable.Creator
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
      if (k != 2)
      {
        if (k != 3)
        {
          if (k != 4) {
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
    return new y(str1, str2, str3);
  }
}

/* Location:
 * Qualified Name:     b7.x0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */