package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzbx;
import e7.c5;
import e7.f6;
import e7.s0;

public abstract class zzge
  extends zzbx
  implements s0
{
  public zzge()
  {
    super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
  }
  
  public final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 2)
    {
      paramParcel2 = (f6)zzbw.zza(paramParcel1, f6.CREATOR);
      zzbw.zzb(paramParcel1);
      ((c5)this).E(paramParcel2);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzge
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */