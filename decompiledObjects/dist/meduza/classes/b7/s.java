package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import n6.a;

public final class s
  extends a
{
  public static final Parcelable.Creator<s> CREATOR = new n0();
  public final boolean a;
  
  public s(boolean paramBoolean)
  {
    a = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof s)) {
      return false;
    }
    paramObject = (s)paramObject;
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
 * Qualified Name:     b7.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */