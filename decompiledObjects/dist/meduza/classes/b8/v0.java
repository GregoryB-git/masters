package b8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class v0
  implements Parcelable.Creator<c0>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str1 = null;
    String str2 = str1;
    String str3 = str2;
    String str4 = str3;
    boolean bool = false;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      int k = (char)j;
      if (k != 1)
      {
        if (k != 2)
        {
          if (k != 4)
          {
            if (k != 5)
            {
              if (k != 6) {
                b.t(j, paramParcel);
              } else {
                str4 = b.f(j, paramParcel);
              }
            }
            else {
              bool = b.k(j, paramParcel);
            }
          }
          else {
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
    return new c0(str1, str2, str3, str4, bool);
  }
}

/* Location:
 * Qualified Name:     b8.v0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */