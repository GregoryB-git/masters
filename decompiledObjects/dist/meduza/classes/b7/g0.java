package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import n6.a;

public final class g0
  extends a
{
  public static final Parcelable.Creator<g0> CREATOR = new j1();
  public final int a;
  public final short b;
  public final short c;
  
  public g0(int paramInt, short paramShort1, short paramShort2)
  {
    a = paramInt;
    b = ((short)paramShort1);
    c = ((short)paramShort2);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof g0)) {
      return false;
    }
    paramObject = (g0)paramObject;
    return (a == a) && (b == b) && (c == c);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(a), Short.valueOf(b), Short.valueOf(c) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 1, a);
    int i = b;
    paramParcel.writeInt(262146);
    paramParcel.writeInt(i);
    i = c;
    paramParcel.writeInt(262147);
    paramParcel.writeInt(i);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.g0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */