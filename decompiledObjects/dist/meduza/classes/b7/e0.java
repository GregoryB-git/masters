package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import n6.a;

public final class e0
  extends a
{
  public static final Parcelable.Creator<e0> CREATOR = new d1();
  public final boolean a;
  
  public e0(boolean paramBoolean)
  {
    a = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof e0)) {
      return false;
    }
    paramObject = (e0)paramObject;
    return a == a;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Boolean.valueOf(a) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.t(paramParcel, 1, a);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */