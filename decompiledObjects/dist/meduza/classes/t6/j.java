package t6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import n6.b;

public final class j
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str = null;
    int j = 0;
    ArrayList localArrayList = null;
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
            localArrayList = b.i(paramParcel, k, g.CREATOR);
          }
        }
        else {
          str = b.f(k, paramParcel);
        }
      }
      else {
        j = b.o(k, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new f(j, str, localArrayList);
  }
}

/* Location:
 * Qualified Name:     t6.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */