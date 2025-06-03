package c8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b8.c1;
import n6.b;

public final class j1
  implements Parcelable.Creator<k1>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    i locali = null;
    i1 locali1 = null;
    Object localObject = locali1;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      int k = (char)j;
      if (k != 1)
      {
        if (k != 2)
        {
          if (k != 3) {
            b.t(j, paramParcel);
          } else {
            localObject = (c1)b.e(paramParcel, j, c1.CREATOR);
          }
        }
        else {
          locali1 = (i1)b.e(paramParcel, j, i1.CREATOR);
        }
      }
      else {
        locali = (i)b.e(paramParcel, j, i.CREATOR);
      }
    }
    b.j(i, paramParcel);
    return new k1(locali, locali1, (c1)localObject);
  }
}

/* Location:
 * Qualified Name:     c8.j1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */