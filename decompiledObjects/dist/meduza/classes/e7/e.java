package e7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import n6.a;

public final class e
  extends a
{
  public static final Parcelable.Creator<e> CREATOR = new g();
  public final long a;
  public final int b;
  public final long c;
  
  public e(int paramInt, long paramLong1, long paramLong2)
  {
    a = paramLong1;
    b = paramInt;
    c = paramLong2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.C(paramParcel, 1, a);
    z.z(paramParcel, 2, b);
    z.C(paramParcel, 3, c);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     e7.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */