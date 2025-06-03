package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import n6.a;

public final class f0
  extends a
{
  public static final Parcelable.Creator<f0> CREATOR = new h1();
  public final List a;
  
  public f0(ArrayList paramArrayList)
  {
    a = paramArrayList;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof f0;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (f0)paramObject;
    List localList1 = a;
    if ((localList1 == null) && (a == null)) {}
    do
    {
      bool1 = true;
      break;
      bool1 = bool2;
      if (localList1 == null) {
        break;
      }
      List localList2 = a;
      bool1 = bool2;
      if (localList2 == null) {
        break;
      }
      bool1 = bool2;
      if (!localList1.containsAll(localList2)) {
        break;
      }
      bool1 = bool2;
    } while (a.containsAll(a));
    return bool1;
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
 * Qualified Name:     b7.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */