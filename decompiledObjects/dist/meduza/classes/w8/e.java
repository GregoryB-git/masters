package w8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import n6.b;

public final class e
  implements Parcelable.Creator<d>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    Uri localUri1 = null;
    Uri localUri2 = null;
    Object localObject = localUri2;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      int k = (char)j;
      if (k != 1)
      {
        if (k != 2)
        {
          if (k != 3) {
            b.t(j, paramParcel);
          } else {
            localObject = b.i(paramParcel, j, d.a.CREATOR);
          }
        }
        else {
          localUri2 = (Uri)b.e(paramParcel, j, Uri.CREATOR);
        }
      }
      else {
        localUri1 = (Uri)b.e(paramParcel, j, Uri.CREATOR);
      }
    }
    b.j(i, paramParcel);
    return new d(localUri1, localUri2, (ArrayList)localObject);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new d[paramInt];
  }
}

/* Location:
 * Qualified Name:     w8.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */