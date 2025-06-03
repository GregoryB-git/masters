package h7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import n6.b;

public final class g
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str = null;
    ArrayList localArrayList = null;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      int k = (char)j;
      if (k != 1)
      {
        if (k != 2) {
          b.t(j, paramParcel);
        } else {
          str = b.f(j, paramParcel);
        }
      }
      else {
        localArrayList = b.g(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new f(str, localArrayList);
  }
}

/* Location:
 * Qualified Name:     h7.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */