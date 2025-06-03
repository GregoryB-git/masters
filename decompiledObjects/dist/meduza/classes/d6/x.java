package d6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class x
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    boolean bool = false;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      if ((char)j != '\001') {
        b.t(j, paramParcel);
      } else {
        bool = b.k(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new b.d(bool);
  }
}

/* Location:
 * Qualified Name:     d6.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */