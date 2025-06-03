package q6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class e
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    boolean bool = false;
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      int m = (char)k;
      if (m != 1)
      {
        if (m != 2) {
          b.t(k, paramParcel);
        } else {
          j = b.o(k, paramParcel);
        }
      }
      else {
        bool = b.k(k, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new a(j, bool);
  }
}

/* Location:
 * Qualified Name:     q6.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */