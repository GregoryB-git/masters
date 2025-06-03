package h6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;

public final class a
  extends n6.a
{
  public static final Parcelable.Creator<a> CREATOR = new c();
  public final int a;
  public int b;
  public Bundle c;
  
  public a(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramBundle;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 1, a);
    z.z(paramParcel, 2, b);
    z.v(paramParcel, 3, c, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     h6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */