package m6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import n6.b;

public final class o
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    ArrayList localArrayList = null;
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      int m = (char)k;
      if (m != 1)
      {
        if (m != 2) {
          b.t(k, paramParcel);
        } else {
          localArrayList = b.i(paramParcel, k, g.CREATOR);
        }
      }
      else {
        j = b.o(k, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new m(j, localArrayList);
  }
}

/* Location:
 * Qualified Name:     m6.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */