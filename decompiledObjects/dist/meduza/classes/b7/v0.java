package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class v0
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str = null;
    Integer localInteger = null;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      int k = (char)j;
      if (k != 2)
      {
        if (k != 3) {
          b.t(j, paramParcel);
        } else {
          localInteger = b.p(j, paramParcel);
        }
      }
      else {
        str = b.f(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new w(str, localInteger.intValue());
  }
}

/* Location:
 * Qualified Name:     b7.v0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */