package h7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class c
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = n6.b.u(paramParcel);
    int j = 0;
    Intent localIntent = null;
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
            n6.b.t(m, paramParcel);
          } else {
            localIntent = (Intent)n6.b.e(paramParcel, m, Intent.CREATOR);
          }
        }
        else {
          k = n6.b.o(m, paramParcel);
        }
      }
      else {
        j = n6.b.o(m, paramParcel);
      }
    }
    n6.b.j(i, paramParcel);
    return new b(j, k, localIntent);
  }
}

/* Location:
 * Qualified Name:     h7.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */