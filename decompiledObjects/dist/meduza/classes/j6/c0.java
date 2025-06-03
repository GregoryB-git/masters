package j6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class c0
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    boolean bool = false;
    int j = 0;
    String str = null;
    int k = j;
    while (paramParcel.dataPosition() < i)
    {
      int m = paramParcel.readInt();
      int n = (char)m;
      if (n != 1)
      {
        if (n != 2)
        {
          if (n != 3)
          {
            if (n != 4) {
              b.t(m, paramParcel);
            } else {
              j = b.o(m, paramParcel);
            }
          }
          else {
            k = b.o(m, paramParcel);
          }
        }
        else {
          str = b.f(m, paramParcel);
        }
      }
      else {
        bool = b.k(m, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new b0(k, j, str, bool);
  }
}

/* Location:
 * Qualified Name:     j6.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */