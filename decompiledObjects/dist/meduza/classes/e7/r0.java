package e7;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbu;
import java.util.List;

public final class r0
  extends zzbu
  implements p0
{
  public r0(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
  }
  
  public final void zza(List<w5> paramList)
  {
    Parcel localParcel = b_();
    localParcel.writeTypedList(paramList);
    zzc(2, localParcel);
  }
}

/* Location:
 * Qualified Name:     e7.r0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */