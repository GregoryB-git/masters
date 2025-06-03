package d6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class v
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str = null;
    boolean bool = false;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      int k = (char)j;
      if (k != 1)
      {
        if (k != 2) {
          b.t(j, paramParcel);
        } else {
          str = b.f(j, paramParcel);
        }
      }
      else {
        bool = b.k(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new b.b(str, bool);
  }
}

/* Location:
 * Qualified Name:     d6.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */