package d6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import m6.j;
import n6.a;

public final class c
  extends a
{
  public static final Parcelable.Creator<c> CREATOR = new q();
  public final PendingIntent a;
  
  public c(PendingIntent paramPendingIntent)
  {
    j.i(paramPendingIntent);
    a = paramPendingIntent;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.E(paramParcel, 1, a, paramInt, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     d6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */