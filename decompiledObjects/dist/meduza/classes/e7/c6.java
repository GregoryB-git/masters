package e7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import n6.b;

public final class c6
  implements Parcelable.Creator<d6>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    ArrayList localArrayList = null;
    for (;;)
    {
      if (paramParcel.dataPosition() >= i) {
        break label113;
      }
      int j = paramParcel.readInt();
      if ((char)j != '\001')
      {
        b.t(j, paramParcel);
      }
      else
      {
        int k = b.s(j, paramParcel);
        int m = paramParcel.dataPosition();
        if (k == 0) {
          break;
        }
        localArrayList = new ArrayList();
        int n = paramParcel.readInt();
        for (j = 0; j < n; j++) {
          localArrayList.add(Integer.valueOf(paramParcel.readInt()));
        }
        paramParcel.setDataPosition(m + k);
      }
    }
    label113:
    b.j(i, paramParcel);
    return new d6(localArrayList);
  }
}

/* Location:
 * Qualified Name:     e7.c6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */