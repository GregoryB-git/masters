package m6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import n6.a;

public final class l
  extends a
{
  public static final Parcelable.Creator<l> CREATOR = new h0();
  public final int a;
  public final boolean b;
  public final boolean c;
  public final int d;
  public final int e;
  
  public l(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2, int paramInt3)
  {
    a = paramInt1;
    b = paramBoolean1;
    c = paramBoolean2;
    d = paramInt2;
    e = paramInt3;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 1, a);
    z.t(paramParcel, 2, b);
    z.t(paramParcel, 3, c);
    z.z(paramParcel, 4, d);
    z.z(paramParcel, 5, e);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     m6.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */