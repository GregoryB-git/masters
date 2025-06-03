package A2;

import M2.c;
import android.os.IBinder;
import android.os.Parcel;
import x2.F;
import x2.H;
import x2.J;

public final class N
  extends M2.a
  implements P
{
  public N(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
  }
  
  public final H B0(F paramF)
  {
    Parcel localParcel = o();
    c.d(localParcel, paramF);
    localParcel = n(6, localParcel);
    paramF = (H)c.a(localParcel, H.CREATOR);
    localParcel.recycle();
    return paramF;
  }
  
  public final boolean e0(J paramJ, H2.a parama)
  {
    Parcel localParcel = o();
    c.d(localParcel, paramJ);
    c.e(localParcel, parama);
    paramJ = n(5, localParcel);
    boolean bool = c.f(paramJ);
    paramJ.recycle();
    return bool;
  }
  
  public final boolean h()
  {
    Parcel localParcel = n(7, o());
    boolean bool = c.f(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final H i0(F paramF)
  {
    Parcel localParcel = o();
    c.d(localParcel, paramF);
    localParcel = n(8, localParcel);
    paramF = (H)c.a(localParcel, H.CREATOR);
    localParcel.recycle();
    return paramF;
  }
}

/* Location:
 * Qualified Name:     A2.N
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */