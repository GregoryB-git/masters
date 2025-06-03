package e7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import n6.b;

public final class e6
  implements Parcelable.Creator<f6>
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
        localArrayList = b.i(paramParcel, j, b6.CREATOR);
      }
    }
    b.j(i, paramParcel);
    return new f6(localArrayList);
  }
}

/* Location:
 * Qualified Name:     e7.e6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */