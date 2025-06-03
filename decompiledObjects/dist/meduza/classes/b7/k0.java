package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class k0
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    long l = 0L;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      if ((char)j != '\001') {
        b.t(j, paramParcel);
      } else {
        l = b.q(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new j0(l);
  }
}

/* Location:
 * Qualified Name:     b7.k0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */