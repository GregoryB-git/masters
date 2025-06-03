package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import m6.h;
import m6.j;
import n6.a;

public final class a0
  extends a
{
  public static final Parcelable.Creator<a0> CREATOR = new z0();
  public final byte[] a;
  public final String b;
  public final String c;
  public final String d;
  
  public a0(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte)
  {
    j.i(paramArrayOfByte);
    a = paramArrayOfByte;
    j.i(paramString1);
    b = paramString1;
    c = paramString2;
    j.i(paramString3);
    d = paramString3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a0)) {
      return false;
    }
    paramObject = (a0)paramObject;
    return (Arrays.equals(a, a)) && (h.a(b, b)) && (h.a(c, c)) && (h.a(d, d));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, c, d });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.w(paramParcel, 2, a, false);
    z.F(paramParcel, 3, b, false);
    z.F(paramParcel, 4, c, false);
    z.F(paramParcel, 5, d, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */