package q6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class f
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = n6.b.u(paramParcel);
    PendingIntent localPendingIntent = null;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      if ((char)j != '\001') {
        n6.b.t(j, paramParcel);
      } else {
        localPendingIntent = (PendingIntent)n6.b.e(paramParcel, j, PendingIntent.CREATOR);
      }
    }
    n6.b.j(i, paramParcel);
    return new b(localPendingIntent);
  }
}

/* Location:
 * Qualified Name:     q6.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */