package s6;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class c
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = n6.b.u(paramParcel);
    a locala = null;
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      int m = (char)k;
      if (m != 1)
      {
        if (m != 2) {
          n6.b.t(k, paramParcel);
        } else {
          locala = (a)n6.b.e(paramParcel, k, a.CREATOR);
        }
      }
      else {
        j = n6.b.o(k, paramParcel);
      }
    }
    n6.b.j(i, paramParcel);
    return new b(j, locala);
  }
}

/* Location:
 * Qualified Name:     s6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */