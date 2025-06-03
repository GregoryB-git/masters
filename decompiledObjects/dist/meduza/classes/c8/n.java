package c8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b8.h0;
import b8.l0;
import java.util.ArrayList;
import java.util.List;

public final class n
  extends b8.z
{
  public static final Parcelable.Creator<n> CREATOR = new q();
  public String a;
  public String b;
  public List<h0> c;
  public List<l0> d;
  public i e;
  
  public n() {}
  
  public n(String paramString1, String paramString2, ArrayList paramArrayList1, ArrayList paramArrayList2, i parami)
  {
    a = paramString1;
    b = paramString2;
    c = paramArrayList1;
    d = paramArrayList2;
    e = parami;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.z.J(20293, paramParcel);
    b.z.F(paramParcel, 1, a, false);
    b.z.F(paramParcel, 2, b, false);
    b.z.I(paramParcel, 3, c, false);
    b.z.I(paramParcel, 4, d, false);
    b.z.E(paramParcel, 5, e, paramInt, false);
    b.z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     c8.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */