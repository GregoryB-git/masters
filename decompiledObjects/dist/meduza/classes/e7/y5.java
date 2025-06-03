package e7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class y5
  implements Parcelable.Creator<w5>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str = null;
    long l = 0L;
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      int m = (char)k;
      if (m != 1)
      {
        if (m != 2)
        {
          if (m != 3) {
            b.t(k, paramParcel);
          } else {
            j = b.o(k, paramParcel);
          }
        }
        else {
          l = b.q(k, paramParcel);
        }
      }
      else {
        str = b.f(k, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new w5(str, l, j);
  }
}

/* Location:
 * Qualified Name:     e7.y5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */