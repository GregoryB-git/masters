package m6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import n6.a;

@Deprecated
public final class i0
  extends a
{
  public static final Parcelable.Creator<i0> CREATOR = new j0();
  public final int a;
  
  public i0(int paramInt)
  {
    a = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = a;
    int i = z.J(20293, paramParcel);
    z.z(paramParcel, 1, paramInt);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     m6.i0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */