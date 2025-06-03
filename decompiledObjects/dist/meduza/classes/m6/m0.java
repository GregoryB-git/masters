package m6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import j6.d;

public final class m0
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = n6.b.u(paramParcel);
    Bundle localBundle = null;
    b localb = null;
    int j = 0;
    Object localObject = localb;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      int m = (char)k;
      if (m != 1)
      {
        if (m != 2)
        {
          if (m != 3)
          {
            if (m != 4) {
              n6.b.t(k, paramParcel);
            } else {
              localb = (b)n6.b.e(paramParcel, k, b.CREATOR);
            }
          }
          else {
            j = n6.b.o(k, paramParcel);
          }
        }
        else {
          localObject = (d[])n6.b.h(paramParcel, k, d.CREATOR);
        }
      }
      else {
        localBundle = n6.b.b(k, paramParcel);
      }
    }
    n6.b.j(i, paramParcel);
    return new l0(localBundle, (d[])localObject, j, localb);
  }
}

/* Location:
 * Qualified Name:     m6.m0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */