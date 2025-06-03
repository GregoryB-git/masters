package R2;

import B2.a;
import B2.c;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Iterator;

public final class D
  extends a
  implements Iterable
{
  public static final Parcelable.Creator<D> CREATOR = new F();
  public final Bundle o;
  
  public D(Bundle paramBundle)
  {
    o = paramBundle;
  }
  
  public final int a()
  {
    return o.size();
  }
  
  public final Double f(String paramString)
  {
    return Double.valueOf(o.getDouble(paramString));
  }
  
  public final Bundle g()
  {
    return new Bundle(o);
  }
  
  public final Long i(String paramString)
  {
    return Long.valueOf(o.getLong(paramString));
  }
  
  public final Iterator iterator()
  {
    return new G(this);
  }
  
  public final Object k(String paramString)
  {
    return o.get(paramString);
  }
  
  public final String q(String paramString)
  {
    return o.getString(paramString);
  }
  
  public final String toString()
  {
    return o.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.e(paramParcel, 2, g(), false);
    c.b(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     R2.D
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */