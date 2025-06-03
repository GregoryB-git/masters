package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import m6.j;
import n6.a;

public final class j0
  extends a
{
  public static final Parcelable.Creator<j0> CREATOR = new k0();
  public final long a;
  
  public j0(long paramLong)
  {
    Long localLong = Long.valueOf(paramLong);
    j.i(localLong);
    a = localLong.longValue();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof j0)) {
      return false;
    }
    paramObject = (j0)paramObject;
    return a == a;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Long.valueOf(a) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.C(paramParcel, 1, a);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.j0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */