package j6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import x6.b;

public final class b0
  extends n6.a
{
  public static final Parcelable.Creator<b0> CREATOR = new c0();
  public final boolean a;
  public final String b;
  public final int c;
  public final int d;
  
  public b0(int paramInt1, int paramInt2, String paramString, boolean paramBoolean)
  {
    a = paramBoolean;
    b = paramString;
    c = (va.a.h(paramInt1) - 1);
    d = (b.E0(paramInt2) - 1);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.t(paramParcel, 1, a);
    z.F(paramParcel, 2, b, false);
    z.z(paramParcel, 3, c);
    z.z(paramParcel, 4, d);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     j6.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */