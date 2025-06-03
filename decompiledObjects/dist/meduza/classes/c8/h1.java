package c8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class h1
  implements Parcelable.Creator<i1>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str1 = null;
    boolean bool = false;
    String str2 = null;
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
            bool = b.k(j, paramParcel);
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
    return new i1(str1, str2, bool);
  }
}

/* Location:
 * Qualified Name:     c8.h1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */