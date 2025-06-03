package R2;

import B2.a;
import B2.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class n
  extends a
{
  public static final Parcelable.Creator<n> CREATOR = new m();
  public final Bundle o;
  
  public n(Bundle paramBundle)
  {
    o = paramBundle;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.e(paramParcel, 1, o, false);
    c.b(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     R2.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */