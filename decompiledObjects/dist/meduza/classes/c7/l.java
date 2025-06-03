package c7;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class l
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = n6.b.u(paramParcel);
    b localb = null;
    String str1 = null;
    String str2 = str1;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      int k = (char)j;
      if (k != 2)
      {
        if (k != 3)
        {
          if (k != 4) {
            n6.b.t(j, paramParcel);
          } else {
            str2 = n6.b.f(j, paramParcel);
          }
        }
        else {
          str1 = n6.b.f(j, paramParcel);
        }
      }
      else {
        localb = (b)n6.b.e(paramParcel, j, b.CREATOR);
      }
    }
    n6.b.j(i, paramParcel);
    return new e(localb, str1, str2);
  }
}

/* Location:
 * Qualified Name:     c7.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */