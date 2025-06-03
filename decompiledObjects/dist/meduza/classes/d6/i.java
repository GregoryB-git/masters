package d6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import m6.h;
import m6.j;
import n6.a;

public final class i
  extends a
{
  public static final Parcelable.Creator<i> CREATOR = new b0();
  public final PendingIntent a;
  
  public i(PendingIntent paramPendingIntent)
  {
    j.i(paramPendingIntent);
    a = paramPendingIntent;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof i)) {
      return false;
    }
    paramObject = (i)paramObject;
    return h.a(a, a);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.E(paramParcel, 1, a, paramInt, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     d6.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */