package b8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class a1
  implements Parcelable.Creator<p0>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    boolean bool1 = false;
    String str1 = null;
    String str2 = str1;
    boolean bool2 = false;
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
              bool2 = b.k(j, paramParcel);
            }
          }
          else {
            bool1 = b.k(j, paramParcel);
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
    return new p0(str1, str2, bool1, bool2);
  }
}

/* Location:
 * Qualified Name:     b8.a1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */