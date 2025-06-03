package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import m6.j;
import n6.a;

public final class c2
  extends a
{
  public static final Parcelable.Creator<c2> CREATOR = new d2();
  public final boolean a;
  
  public c2(boolean paramBoolean)
  {
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    j.i(localBoolean);
    a = localBoolean.booleanValue();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof c2)) {
      return false;
    }
    paramObject = (c2)paramObject;
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
 * Qualified Name:     b7.c2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */