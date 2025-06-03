package f6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class d
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = n6.b.u(paramParcel);
    int j = 0;
    int k = j;
    int m = k;
    PendingIntent localPendingIntent = null;
    Object localObject1 = localPendingIntent;
    Object localObject2 = localObject1;
    while (paramParcel.dataPosition() < i)
    {
      int n = paramParcel.readInt();
      int i1 = (char)n;
      if (i1 != 1)
      {
        if (i1 != 2)
        {
          if (i1 != 3)
          {
            if (i1 != 4)
            {
              if (i1 != 5)
              {
                if (i1 != 1000) {
                  n6.b.t(n, paramParcel);
                } else {
                  j = n6.b.o(n, paramParcel);
                }
              }
              else {
                localObject2 = n6.b.c(n, paramParcel);
              }
            }
            else {
              localObject1 = n6.b.b(n, paramParcel);
            }
          }
          else {
            m = n6.b.o(n, paramParcel);
          }
        }
        else {
          localPendingIntent = (PendingIntent)n6.b.e(paramParcel, n, PendingIntent.CREATOR);
        }
      }
      else {
        k = n6.b.o(n, paramParcel);
      }
    }
    n6.b.j(i, paramParcel);
    return new b(j, k, localPendingIntent, m, (Bundle)localObject1, (byte[])localObject2);
  }
}

/* Location:
 * Qualified Name:     f6.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */