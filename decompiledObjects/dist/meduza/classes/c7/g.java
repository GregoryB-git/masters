package c7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class g
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str1 = null;
    int j = 0;
    String str2 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      int m = (char)k;
      if (m != 2)
      {
        if (m != 3)
        {
          if (m != 4) {
            b.t(k, paramParcel);
          } else {
            str2 = b.f(k, paramParcel);
          }
        }
        else {
          str1 = b.f(k, paramParcel);
        }
      }
      else {
        j = b.o(k, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new a(j, str1, str2);
  }
}

/* Location:
 * Qualified Name:     c7.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */