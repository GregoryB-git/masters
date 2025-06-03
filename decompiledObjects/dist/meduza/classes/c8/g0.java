package c8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b8.h0;
import b8.l0;
import java.util.ArrayList;
import n6.b;

public final class g0
  implements Parcelable.Creator<e0>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    ArrayList localArrayList1 = null;
    ArrayList localArrayList2 = null;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      int k = (char)j;
      if (k != 1)
      {
        if (k != 2) {
          b.t(j, paramParcel);
        } else {
          localArrayList2 = b.i(paramParcel, j, l0.CREATOR);
        }
      }
      else {
        localArrayList1 = b.i(paramParcel, j, h0.CREATOR);
      }
    }
    b.j(i, paramParcel);
    return new e0(localArrayList1, localArrayList2);
  }
}

/* Location:
 * Qualified Name:     c8.g0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */