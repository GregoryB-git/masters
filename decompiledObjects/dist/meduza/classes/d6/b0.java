package d6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class b0
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    PendingIntent localPendingIntent = null;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      if ((char)j != '\001') {
        b.t(j, paramParcel);
      } else {
        localPendingIntent = (PendingIntent)b.e(paramParcel, j, PendingIntent.CREATOR);
      }
    }
    b.j(i, paramParcel);
    return new i(localPendingIntent);
  }
}

/* Location:
 * Qualified Name:     d6.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */