package d6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import m6.h;
import n6.a;

public final class g
  extends a
{
  public static final Parcelable.Creator<g> CREATOR = new z();
  public final PendingIntent a;
  
  public g(PendingIntent paramPendingIntent)
  {
    a = paramPendingIntent;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof g)) {
      return false;
    }
    paramObject = (g)paramObject;
    return h.a(a, a);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.z.J(20293, paramParcel);
    b.z.E(paramParcel, 1, a, paramInt, false);
    b.z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     d6.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */