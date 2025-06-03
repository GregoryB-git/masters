package q6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import n6.a;

public final class b
  extends a
{
  public static final Parcelable.Creator<b> CREATOR = new f();
  public final PendingIntent a;
  
  public b(PendingIntent paramPendingIntent)
  {
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
 * Qualified Name:     q6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */