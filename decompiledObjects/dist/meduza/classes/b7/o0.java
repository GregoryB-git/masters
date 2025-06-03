package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import m6.j;
import n6.a;

public final class o0
  extends a
{
  public static final Parcelable.Creator<o0> CREATOR = new p0();
  public final String a;
  
  public o0(String paramString)
  {
    j.i(paramString);
    a = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof o0)) {
      return false;
    }
    paramObject = (o0)paramObject;
    return a.equals(a);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.o0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */