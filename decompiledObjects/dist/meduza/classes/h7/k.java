package h7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.f;

public final class k
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = n6.b.u(paramParcel);
    j6.b localb = null;
    int j = 0;
    f localf = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      int m = (char)k;
      if (m != 1)
      {
        if (m != 2)
        {
          if (m != 3) {
            n6.b.t(k, paramParcel);
          } else {
            localf = (f)n6.b.e(paramParcel, k, f.CREATOR);
          }
        }
        else {
          localb = (j6.b)n6.b.e(paramParcel, k, j6.b.CREATOR);
        }
      }
      else {
        j = n6.b.o(k, paramParcel);
      }
    }
    n6.b.j(i, paramParcel);
    return new j(j, localb, localf);
  }
}

/* Location:
 * Qualified Name:     h7.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */