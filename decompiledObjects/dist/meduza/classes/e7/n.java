package e7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import n6.a;

public final class n
  extends a
{
  public static final Parcelable.Creator<n> CREATOR = new m();
  public final Bundle a;
  
  public n(Bundle paramBundle)
  {
    a = paramBundle;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.v(paramParcel, 1, a, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     e7.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */