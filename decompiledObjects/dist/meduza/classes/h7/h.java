package h7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import m6.x;
import n6.a;

public final class h
  extends a
{
  public static final Parcelable.Creator<h> CREATOR = new i();
  public final int a;
  public final x b;
  
  public h(int paramInt, x paramx)
  {
    a = paramInt;
    b = paramx;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.z(paramParcel, 1, a);
    z.E(paramParcel, 2, b, paramInt, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     h7.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */