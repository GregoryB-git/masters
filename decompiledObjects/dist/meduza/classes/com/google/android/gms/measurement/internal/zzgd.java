package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzbx;
import e7.a5;
import e7.p0;
import e7.w5;

public abstract class zzgd
  extends zzbx
  implements p0
{
  public zzgd()
  {
    super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
  }
  
  public final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 2)
    {
      paramParcel2 = paramParcel1.createTypedArrayList(w5.CREATOR);
      zzbw.zzb(paramParcel1);
      ((a5)this).zza(paramParcel2);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzgd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */