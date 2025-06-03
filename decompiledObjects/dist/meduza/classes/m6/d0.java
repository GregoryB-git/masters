package m6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import j6.b0;
import j6.z;

public final class d0
  extends zza
  implements e0
{
  public d0(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
  }
  
  public final boolean H2(j6.d0 paramd0, IObjectWrapper paramIObjectWrapper)
  {
    Parcel localParcel = zza();
    zzc.zzc(localParcel, paramd0);
    zzc.zze(localParcel, paramIObjectWrapper);
    paramd0 = zzB(5, localParcel);
    boolean bool = zzc.zzf(paramd0);
    paramd0.recycle();
    return bool;
  }
  
  public final b0 N0(z paramz)
  {
    Object localObject = zza();
    zzc.zzc((Parcel)localObject, paramz);
    paramz = zzB(6, (Parcel)localObject);
    localObject = (b0)zzc.zza(paramz, b0.CREATOR);
    paramz.recycle();
    return (b0)localObject;
  }
  
  public final boolean zzi()
  {
    Parcel localParcel = zzB(7, zza());
    boolean bool = zzc.zzf(localParcel);
    localParcel.recycle();
    return bool;
  }
}

/* Location:
 * Qualified Name:     m6.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */