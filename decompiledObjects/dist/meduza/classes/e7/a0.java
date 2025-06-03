package e7;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Iterator;
import n6.a;

public final class a0
  extends a
  implements Iterable<String>
{
  public static final Parcelable.Creator<a0> CREATOR = new c0();
  public final Bundle a;
  
  public a0(Bundle paramBundle)
  {
    a = paramBundle;
  }
  
  public final Double D()
  {
    return Double.valueOf(a.getDouble("value"));
  }
  
  public final Bundle E()
  {
    return new Bundle(a);
  }
  
  public final Iterator<String> iterator()
  {
    return new d0(this);
  }
  
  public final String toString()
  {
    return a.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.v(paramParcel, 2, E(), false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     e7.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */