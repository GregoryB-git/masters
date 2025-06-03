package e7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import n6.a;

public final class w5
  extends a
{
  public static final Parcelable.Creator<w5> CREATOR = new y5();
  public final String a;
  public final long b;
  public final int c;
  
  public w5(String paramString, long paramLong, int paramInt)
  {
    a = paramString;
    b = paramLong;
    c = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.C(paramParcel, 2, b);
    z.z(paramParcel, 3, c);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     e7.w5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */