package c6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;

public final class a
  extends n6.a
{
  public static final Parcelable.Creator<a> CREATOR = new k();
  public final int a;
  public final boolean b;
  public final long c;
  public final boolean d;
  
  public a(int paramInt, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramInt;
    b = paramBoolean1;
    c = paramLong;
    d = paramBoolean2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 1, a);
    z.t(paramParcel, 2, b);
    z.C(paramParcel, 3, c);
    z.t(paramParcel, 4, d);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     c6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */