package com.google.android.gms.tasks;

public class TaskCompletionSource<TResult>
{
  private final zzw zza = new zzw();
  
  public TaskCompletionSource() {}
  
  public TaskCompletionSource(CancellationToken paramCancellationToken)
  {
    paramCancellationToken.onCanceledRequested(new zzs(this));
  }
  
  public Task<TResult> getTask()
  {
    return zza;
  }
  
  public void setException(Exception paramException)
  {
    zza.zza(paramException);
  }
  
  public void setResult(TResult paramTResult)
  {
    zza.zzb(paramTResult);
  }
  
  public boolean trySetException(Exception paramException)
  {
    return zza.zzd(paramException);
  }
  
  public boolean trySetResult(TResult paramTResult)
  {
    return zza.zze(paramTResult);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.TaskCompletionSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */