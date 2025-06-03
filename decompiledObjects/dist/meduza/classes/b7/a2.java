package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import m6.j;
import n6.a;

public final class a2
  extends a
{
  public static final Parcelable.Creator<a2> CREATOR = new b2();
  public final List a;
  
  public a2(ArrayList paramArrayList)
  {
    j.i(paramArrayList);
    a = paramArrayList;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a2)) {
      return false;
    }
    paramObject = (a2)paramObject;
    return (a.containsAll(a)) && (a.containsAll(a));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { new HashSet(a) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.I(paramParcel, 1, a, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.a2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */