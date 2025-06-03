package com.google.android.gms.tasks;

import android.app.Activity;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import m6.j;

final class zzw<TResult>
  extends Task<TResult>
{
  private final Object zza = new Object();
  private final zzr zzb = new zzr();
  private boolean zzc;
  private volatile boolean zzd;
  private Object zze;
  private Exception zzf;
  
  private final void zzf()
  {
    j.k(zzc, "Task is not yet complete");
  }
  
  private final void zzg()
  {
    if (!zzd) {
      return;
    }
    throw new CancellationException("Task is already canceled.");
  }
  
  private final void zzh()
  {
    if (!zzc) {
      return;
    }
    throw DuplicateTaskCompletionException.of(this);
  }
  
  private final void zzi()
  {
    synchronized (zza)
    {
      if (!zzc) {
        return;
      }
      zzb.zzb(this);
      return;
    }
  }
  
  public final Task<TResult> addOnCanceledListener(Activity paramActivity, OnCanceledListener paramOnCanceledListener)
  {
    paramOnCanceledListener = new zzh(TaskExecutors.MAIN_THREAD, paramOnCanceledListener);
    zzb.zza(paramOnCanceledListener);
    zzv.zza(paramActivity).zzb(paramOnCanceledListener);
    zzi();
    return this;
  }
  
  public final Task<TResult> addOnCanceledListener(OnCanceledListener paramOnCanceledListener)
  {
    addOnCanceledListener(TaskExecutors.MAIN_THREAD, paramOnCanceledListener);
    return this;
  }
  
  public final Task<TResult> addOnCanceledListener(Executor paramExecutor, OnCanceledListener paramOnCanceledListener)
  {
    paramExecutor = new zzh(paramExecutor, paramOnCanceledListener);
    zzb.zza(paramExecutor);
    zzi();
    return this;
  }
  
  public final Task<TResult> addOnCompleteListener(Activity paramActivity, OnCompleteListener<TResult> paramOnCompleteListener)
  {
    paramOnCompleteListener = new zzj(TaskExecutors.MAIN_THREAD, paramOnCompleteListener);
    zzb.zza(paramOnCompleteListener);
    zzv.zza(paramActivity).zzb(paramOnCompleteListener);
    zzi();
    return this;
  }
  
  public final Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> paramOnCompleteListener)
  {
    paramOnCompleteListener = new zzj(TaskExecutors.MAIN_THREAD, paramOnCompleteListener);
    zzb.zza(paramOnCompleteListener);
    zzi();
    return this;
  }
  
  public final Task<TResult> addOnCompleteListener(Executor paramExecutor, OnCompleteListener<TResult> paramOnCompleteListener)
  {
    paramExecutor = new zzj(paramExecutor, paramOnCompleteListener);
    zzb.zza(paramExecutor);
    zzi();
    return this;
  }
  
  public final Task<TResult> addOnFailureListener(Activity paramActivity, OnFailureListener paramOnFailureListener)
  {
    paramOnFailureListener = new zzl(TaskExecutors.MAIN_THREAD, paramOnFailureListener);
    zzb.zza(paramOnFailureListener);
    zzv.zza(paramActivity).zzb(paramOnFailureListener);
    zzi();
    return this;
  }
  
  public final Task<TResult> addOnFailureListener(OnFailureListener paramOnFailureListener)
  {
    addOnFailureListener(TaskExecutors.MAIN_THREAD, paramOnFailureListener);
    return this;
  }
  
  public final Task<TResult> addOnFailureListener(Executor paramExecutor, OnFailureListener paramOnFailureListener)
  {
    paramExecutor = new zzl(paramExecutor, paramOnFailureListener);
    zzb.zza(paramExecutor);
    zzi();
    return this;
  }
  
  public final Task<TResult> addOnSuccessListener(Activity paramActivity, OnSuccessListener<? super TResult> paramOnSuccessListener)
  {
    paramOnSuccessListener = new zzn(TaskExecutors.MAIN_THREAD, paramOnSuccessListener);
    zzb.zza(paramOnSuccessListener);
    zzv.zza(paramActivity).zzb(paramOnSuccessListener);
    zzi();
    return this;
  }
  
  public final Task<TResult> addOnSuccessListener(OnSuccessListener<? super TResult> paramOnSuccessListener)
  {
    addOnSuccessListener(TaskExecutors.MAIN_THREAD, paramOnSuccessListener);
    return this;
  }
  
  public final Task<TResult> addOnSuccessListener(Executor paramExecutor, OnSuccessListener<? super TResult> paramOnSuccessListener)
  {
    paramExecutor = new zzn(paramExecutor, paramOnSuccessListener);
    zzb.zza(paramExecutor);
    zzi();
    return this;
  }
  
  public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> paramContinuation)
  {
    return continueWith(TaskExecutors.MAIN_THREAD, paramContinuation);
  }
  
  public final <TContinuationResult> Task<TContinuationResult> continueWith(Executor paramExecutor, Continuation<TResult, TContinuationResult> paramContinuation)
  {
    zzw localzzw = new zzw();
    paramExecutor = new zzd(paramExecutor, paramContinuation, localzzw);
    zzb.zza(paramExecutor);
    zzi();
    return localzzw;
  }
  
  public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> paramContinuation)
  {
    return continueWithTask(TaskExecutors.MAIN_THREAD, paramContinuation);
  }
  
  public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Executor paramExecutor, Continuation<TResult, Task<TContinuationResult>> paramContinuation)
  {
    zzw localzzw = new zzw();
    paramExecutor = new zzf(paramExecutor, paramContinuation, localzzw);
    zzb.zza(paramExecutor);
    zzi();
    return localzzw;
  }
  
  public final Exception getException()
  {
    synchronized (zza)
    {
      Exception localException = zzf;
      return localException;
    }
  }
  
  public final TResult getResult()
  {
    synchronized (zza)
    {
      zzf();
      zzg();
      Exception localException = zzf;
      if (localException == null)
      {
        localObject2 = zze;
        return (TResult)localObject2;
      }
      Object localObject2 = new com/google/android/gms/tasks/RuntimeExecutionException;
      ((RuntimeExecutionException)localObject2).<init>(localException);
      throw ((Throwable)localObject2);
    }
  }
  
  public final <X extends Throwable> TResult getResult(Class<X> paramClass)
  {
    synchronized (zza)
    {
      zzf();
      zzg();
      if (!paramClass.isInstance(zzf))
      {
        Exception localException = zzf;
        if (localException == null)
        {
          paramClass = zze;
          return paramClass;
        }
        paramClass = new com/google/android/gms/tasks/RuntimeExecutionException;
        paramClass.<init>(localException);
        throw paramClass;
      }
      throw ((Throwable)paramClass.cast(zzf));
    }
  }
  
  public final boolean isCanceled()
  {
    return zzd;
  }
  
  public final boolean isComplete()
  {
    synchronized (zza)
    {
      boolean bool = zzc;
      return bool;
    }
  }
  
  public final boolean isSuccessful()
  {
    synchronized (zza)
    {
      boolean bool1 = zzc;
      boolean bool2 = false;
      boolean bool3 = bool2;
      if (bool1)
      {
        bool3 = bool2;
        if (!zzd)
        {
          bool3 = bool2;
          if (zzf == null) {
            bool3 = true;
          }
        }
      }
      return bool3;
    }
  }
  
  public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(SuccessContinuation<TResult, TContinuationResult> paramSuccessContinuation)
  {
    Executor localExecutor = TaskExecutors.MAIN_THREAD;
    zzw localzzw = new zzw();
    paramSuccessContinuation = new zzp(localExecutor, paramSuccessContinuation, localzzw);
    zzb.zza(paramSuccessContinuation);
    zzi();
    return localzzw;
  }
  
  public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Executor paramExecutor, SuccessContinuation<TResult, TContinuationResult> paramSuccessContinuation)
  {
    zzw localzzw = new zzw();
    paramExecutor = new zzp(paramExecutor, paramSuccessContinuation, localzzw);
    zzb.zza(paramExecutor);
    zzi();
    return localzzw;
  }
  
  public final void zza(Exception paramException)
  {
    if (paramException != null) {
      synchronized (zza)
      {
        zzh();
        zzc = true;
        zzf = paramException;
        zzb.zzb(this);
        return;
      }
    }
    throw new NullPointerException("Exception must not be null");
  }
  
  public final void zzb(Object paramObject)
  {
    synchronized (zza)
    {
      zzh();
      zzc = true;
      zze = paramObject;
      zzb.zzb(this);
      return;
    }
  }
  
  public final boolean zzc()
  {
    synchronized (zza)
    {
      if (zzc) {
        return false;
      }
      zzc = true;
      zzd = true;
      zzb.zzb(this);
      return true;
    }
  }
  
  public final boolean zzd(Exception paramException)
  {
    if (paramException != null) {
      synchronized (zza)
      {
        if (zzc) {
          return false;
        }
        zzc = true;
        zzf = paramException;
        zzb.zzb(this);
        return true;
      }
    }
    throw new NullPointerException("Exception must not be null");
  }
  
  public final boolean zze(Object paramObject)
  {
    synchronized (zza)
    {
      if (zzc) {
        return false;
      }
      zzc = true;
      zze = paramObject;
      zzb.zzb(this);
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.zzw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */