package k6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;

public final class r
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = n6.b.u(paramParcel);
    String str = null;
    j6.b localb = null;
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
              localb = (j6.b)n6.b.e(paramParcel, k, j6.b.CREATOR);
            }
          }
          else {
            localObject = (PendingIntent)n6.b.e(paramParcel, k, PendingIntent.CREATOR);
          }
        }
        else {
          str = n6.b.f(k, paramParcel);
        }
      }
      else {
        j = n6.b.o(k, paramParcel);
      }
    }
    n6.b.j(i, paramParcel);
    return new Status(j, str, (PendingIntent)localObject, localb);
  }
}

/* Location:
 * Qualified Name:     k6.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */