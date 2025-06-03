package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class zzp<TResult, TContinuationResult>
  implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, zzq
{
  private final Executor zza;
  private final SuccessContinuation zzb;
  private final zzw zzc;
  
  public zzp(Executor paramExecutor, SuccessContinuation paramSuccessContinuation, zzw paramzzw)
  {
    zza = paramExecutor;
    zzb = paramSuccessContinuation;
    zzc = paramzzw;
  }
  
  public final void onCanceled()
  {
    zzc.zzc();
  }
  
  public final void onFailure(Exception paramException)
  {
    zzc.zza(paramException);
  }
  
  public final void onSuccess(TContinuationResult paramTContinuationResult)
  {
    zzc.zzb(paramTContinuationResult);
  }
  
  public final void zzc()
  {
    throw new UnsupportedOperationException();
  }
  
  public final void zzd(Task paramTask)
  {
    paramTask = new zzo(this, paramTask);
    zza.execute(paramTask);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.zzp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */