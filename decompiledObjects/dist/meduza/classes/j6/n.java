package j6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class n
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = n6.b.u(paramParcel);
    int j = 0;
    PendingIntent localPendingIntent = null;
    Object localObject = localPendingIntent;
    int k = 0;
    while (paramParcel.dataPosition() < i)
    {
      int m = paramParcel.readInt();
      int n = (char)m;
      if (n != 1)
      {
        if (n != 2)
        {
          if (n != 3)
          {
            if (n != 4) {
              n6.b.t(m, paramParcel);
            } else {
              localObject = n6.b.f(m, paramParcel);
            }
          }
          else {
            localPendingIntent = (PendingIntent)n6.b.e(paramParcel, m, PendingIntent.CREATOR);
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
    return new b(j, k, localPendingIntent, (String)localObject);
  }
}

/* Location:
 * Qualified Name:     j6.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */