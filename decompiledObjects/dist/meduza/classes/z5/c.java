package z5;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.ArrayList;
import java.util.List;
import m6.j;
import n6.a;

public final class c
  extends a
{
  public static final Parcelable.Creator<c> CREATOR = new h();
  public final int a;
  public final List b;
  
  public c(int paramInt, ArrayList paramArrayList)
  {
    a = paramInt;
    j.i(paramArrayList);
    b = paramArrayList;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 1, a);
    z.I(paramParcel, 2, b, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     z5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */