package c8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import b8.h0;
import b8.l0;
import java.util.ArrayList;
import java.util.List;
import n6.a;

public final class e0
  extends a
{
  public static final Parcelable.Creator<e0> CREATOR = new g0();
  public final List<h0> a;
  public final List<l0> b;
  
  public e0(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    ArrayList localArrayList = paramArrayList1;
    if (paramArrayList1 == null) {
      localArrayList = new ArrayList();
    }
    a = localArrayList;
    paramArrayList1 = paramArrayList2;
    if (paramArrayList2 == null) {
      paramArrayList1 = new ArrayList();
    }
    b = paramArrayList1;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.I(paramParcel, 1, a, false);
    z.I(paramParcel, 2, b, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     c8.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */