package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class f2
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str = null;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      if ((char)j != '\002') {
        b.t(j, paramParcel);
      } else {
        str = b.f(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new r(str);
  }
}

/* Location:
 * Qualified Name:     b7.f2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */