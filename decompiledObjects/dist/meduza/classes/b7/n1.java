package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import n6.a;

public final class n1
  extends a
{
  public static final Parcelable.Creator<n1> CREATOR = new o1();
  public final byte[] a;
  public final byte[] b;
  
  public n1(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    a = paramArrayOfByte1;
    b = paramArrayOfByte2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof n1)) {
      return false;
    }
    paramObject = (n1)paramObject;
    return (Arrays.equals(a, a)) && (Arrays.equals(b, b));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.w(paramParcel, 1, a, false);
    z.w(paramParcel, 2, b, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.n1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */