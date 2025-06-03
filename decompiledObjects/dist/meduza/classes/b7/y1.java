package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import m6.j;
import n6.a;

public final class y1
  extends a
{
  public static final Parcelable.Creator<y1> CREATOR = new z1();
  public final long a;
  public final byte[] b;
  public final byte[] c;
  public final byte[] d;
  
  public y1(long paramLong, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    a = paramLong;
    j.i(paramArrayOfByte1);
    b = paramArrayOfByte1;
    j.i(paramArrayOfByte2);
    c = paramArrayOfByte2;
    j.i(paramArrayOfByte3);
    d = paramArrayOfByte3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof y1)) {
      return false;
    }
    paramObject = (y1)paramObject;
    return (a == a) && (Arrays.equals(b, b)) && (Arrays.equals(c, c)) && (Arrays.equals(d, d));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Long.valueOf(a), b, c, d });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.C(paramParcel, 1, a);
    z.w(paramParcel, 2, b, false);
    z.w(paramParcel, 3, c, false);
    z.w(paramParcel, 4, d, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.y1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */