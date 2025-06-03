package e7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import n6.a;

public final class b6
  extends a
{
  public static final Parcelable.Creator<b6> CREATOR = new a6();
  public final long a;
  public byte[] b;
  public final String c;
  public final Bundle d;
  public final int e;
  public final long f;
  public String o;
  
  public b6(long paramLong1, byte[] paramArrayOfByte, String paramString1, Bundle paramBundle, int paramInt, long paramLong2, String paramString2)
  {
    a = paramLong1;
    b = paramArrayOfByte;
    c = paramString1;
    d = paramBundle;
    e = paramInt;
    f = paramLong2;
    o = paramString2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.C(paramParcel, 1, a);
    z.w(paramParcel, 2, b, false);
    z.F(paramParcel, 3, c, false);
    z.v(paramParcel, 4, d, false);
    z.z(paramParcel, 5, e);
    z.C(paramParcel, 6, f);
    z.F(paramParcel, 7, o, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     e7.b6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */