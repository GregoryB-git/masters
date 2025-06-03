package com.google.android.gms.internal.measurement;

import m6.j;

final class zzet
  extends zzed.zzb
{
  public zzet(zzed paramzzed, Runnable paramRunnable)
  {
    super(paramzzed);
  }
  
  public final void zza()
  {
    zzdl localzzdl = zzed.zza(zzd);
    j.i(localzzdl);
    localzzdl.retrieveAndUploadBatches(new zzew(this, zzc));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */