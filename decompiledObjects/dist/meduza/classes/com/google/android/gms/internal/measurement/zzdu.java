package com.google.android.gms.internal.measurement;

import android.os.Parcel;

public abstract class zzdu
  extends zzbx
  implements zzdr
{
  public zzdu()
  {
    super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
  }
  
  public final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 2)
    {
      a_();
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzdu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */