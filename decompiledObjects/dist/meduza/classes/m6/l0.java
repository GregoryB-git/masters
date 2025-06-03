package m6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import j6.d;
import n6.a;

public final class l0
  extends a
{
  public static final Parcelable.Creator<l0> CREATOR = new m0();
  public Bundle a;
  public d[] b;
  public int c;
  public b d;
  
  public l0() {}
  
  public l0(Bundle paramBundle, d[] paramArrayOfd, int paramInt, b paramb)
  {
    a = paramBundle;
    b = paramArrayOfd;
    c = paramInt;
    d = paramb;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.v(paramParcel, 1, a, false);
    z.H(paramParcel, 2, b, paramInt);
    z.z(paramParcel, 3, c);
    z.E(paramParcel, 4, d, paramInt, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     m6.l0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */