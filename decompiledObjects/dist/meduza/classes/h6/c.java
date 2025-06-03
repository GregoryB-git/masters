package h6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class c
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    int j = 0;
    Bundle localBundle = null;
    int k = 0;
    while (paramParcel.dataPosition() < i)
    {
      int m = paramParcel.readInt();
      int n = (char)m;
      if (n != 1)
      {
        if (n != 2)
        {
          if (n != 3) {
            b.t(m, paramParcel);
          } else {
            localBundle = b.b(m, paramParcel);
          }
        }
        else {
          k = b.o(m, paramParcel);
        }
      }
      else {
        j = b.o(m, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new a(j, k, localBundle);
  }
}

/* Location:
 * Qualified Name:     h6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */