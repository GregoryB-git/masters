package t6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class k
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    int j = 0;
    Parcel localParcel = null;
    Object localObject = localParcel;
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
            localObject = (h)b.e(paramParcel, k, h.CREATOR);
          }
        }
        else
        {
          m = b.s(k, paramParcel);
          k = paramParcel.dataPosition();
          if (m == 0)
          {
            localParcel = null;
          }
          else
          {
            localParcel = Parcel.obtain();
            localParcel.appendFrom(paramParcel, k, m);
            paramParcel.setDataPosition(k + m);
          }
        }
      }
      else {
        j = b.o(k, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new c(j, localParcel, (h)localObject);
  }
}

/* Location:
 * Qualified Name:     t6.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */