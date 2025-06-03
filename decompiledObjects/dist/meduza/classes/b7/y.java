package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import m6.h;
import m6.j;
import n6.a;

public final class y
  extends a
{
  public static final Parcelable.Creator<y> CREATOR = new x0();
  public final String a;
  public final String b;
  public final String c;
  
  public y(String paramString1, String paramString2, String paramString3)
  {
    j.i(paramString1);
    a = paramString1;
    j.i(paramString2);
    b = paramString2;
    c = paramString3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof y)) {
      return false;
    }
    paramObject = (y)paramObject;
    return (h.a(a, a)) && (h.a(b, b)) && (h.a(c, c));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, c });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 2, a, false);
    z.F(paramParcel, 3, b, false);
    z.F(paramParcel, 4, c, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */