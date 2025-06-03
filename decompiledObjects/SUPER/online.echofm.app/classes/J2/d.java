package J2;

import android.os.IBinder;
import android.os.Parcel;

public final class d
  extends a
  implements f
{
  public d(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
  }
  
  public final boolean a0(boolean paramBoolean)
  {
    Parcel localParcel = n();
    c.a(localParcel, true);
    localParcel = o(2, localParcel);
    paramBoolean = c.b(localParcel);
    localParcel.recycle();
    return paramBoolean;
  }
  
  public final String c()
  {
    Parcel localParcel = o(1, n());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
}

/* Location:
 * Qualified Name:     J2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */