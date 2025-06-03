package com.google.android.gms.tasks;

final class zzb
  extends CancellationToken
{
  private final zzw zza = new zzw();
  
  public final boolean isCancellationRequested()
  {
    return zza.isComplete();
  }
  
  public final CancellationToken onCanceledRequested(OnTokenCanceledListener paramOnTokenCanceledListener)
  {
    paramOnTokenCanceledListener = new zza(this, paramOnTokenCanceledListener);
    zza.addOnSuccessListener(TaskExecutors.MAIN_THREAD, paramOnTokenCanceledListener);
    return this;
  }
  
  public final void zza()
  {
    zza.zze(null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */