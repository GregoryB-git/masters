package C2;

import A2.r;
import K2.c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class a
  extends K2.a
  implements IInterface
{
  public a(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
  }
  
  public final void Z0(r paramr)
  {
    Parcel localParcel = n();
    c.c(localParcel, paramr);
    v(1, localParcel);
  }
}

/* Location:
 * Qualified Name:     C2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */