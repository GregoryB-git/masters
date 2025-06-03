package R2;

import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class v5
  extends a
{
  public static final Parcelable.Creator<v5> CREATOR = new y5();
  public final String o;
  public final long p;
  public final int q;
  
  public v5(String paramString, long paramLong, int paramInt)
  {
    o = paramString;
    p = paramLong;
    q = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.n(paramParcel, 1, o, false);
    c.k(paramParcel, 2, p);
    c.i(paramParcel, 3, q);
    c.b(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     R2.v5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */