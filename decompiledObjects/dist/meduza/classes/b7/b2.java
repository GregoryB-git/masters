package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import n6.b;

public final class b2
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    ArrayList localArrayList = null;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      if ((char)j != '\001') {
        b.t(j, paramParcel);
      } else {
        localArrayList = b.i(paramParcel, j, y1.CREATOR);
      }
    }
    b.j(i, paramParcel);
    return new a2(localArrayList);
  }
}

/* Location:
 * Qualified Name:     b7.b2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */