package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import n6.a;

public final class p1
  extends a
{
  public static final Parcelable.Creator<p1> CREATOR = new q1();
  public final boolean a;
  public final byte[] b;
  
  public p1(boolean paramBoolean, byte[] paramArrayOfByte)
  {
    a = paramBoolean;
    b = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof p1)) {
      return false;
    }
    paramObject = (p1)paramObject;
    return (a == a) && (Arrays.equals(b, b));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Boolean.valueOf(a), b });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.t(paramParcel, 1, a);
    z.w(paramParcel, 2, b, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.p1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */