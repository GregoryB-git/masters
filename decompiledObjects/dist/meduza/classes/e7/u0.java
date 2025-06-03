package e7;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.internal.measurement.zzbw;

public final class u0
  extends zzbu
  implements s0
{
  public u0(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
  }
  
  public final void E(f6 paramf6)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramf6);
    zzc(2, localParcel);
  }
}

/* Location:
 * Qualified Name:     e7.u0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */