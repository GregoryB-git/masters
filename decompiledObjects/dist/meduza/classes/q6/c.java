package q6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import n6.a;

public final class c
  extends a
{
  public static final Parcelable.Creator<c> CREATOR = new g();
  public final int a;
  public final boolean b;
  
  public c(int paramInt, boolean paramBoolean)
  {
    a = paramInt;
    b = paramBoolean;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 1, a);
    z.t(paramParcel, 2, b);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     q6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */