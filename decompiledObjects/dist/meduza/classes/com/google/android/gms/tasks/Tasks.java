package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.tasks.zza;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m6.j;

public final class Tasks
{
  public static <TResult> TResult await(Task<TResult> paramTask)
  {
    j.h("Must not be called on the main application thread");
    j.g();
    if (paramTask != null)
    {
      if (paramTask.isComplete()) {
        return (TResult)zza(paramTask);
      }
      zzad localzzad = new zzad(null);
      zzb(paramTask, localzzad);
      localzzad.zza();
      return (TResult)zza(paramTask);
    }
    throw new NullPointerException("Task must not be null");
  }
  
  public static <TResult> TResult await(Task<TResult> paramTask, long paramLong, TimeUnit paramTimeUnit)
  {
    j.h("Must not be called on the main application thread");
    j.g();
    if (paramTask != null)
    {
      if (paramTimeUnit != null)
      {
        if (paramTask.isComplete()) {
          return (TResult)zza(paramTask);
        }
        zzad localzzad = new zzad(null);
        zzb(paramTask, localzzad);
        if (localzzad.zzb(paramLong, paramTimeUnit)) {
          return (TResult)zza(paramTask);
        }
        throw new TimeoutException("Timed out waiting for Task");
      }
      throw new NullPointerException("TimeUnit must not be null");
    }
    throw new NullPointerException("Task must not be null");
  }
  
  @Deprecated
  public static <TResult> Task<TResult> call(Callable<TResult> paramCallable)
  {
    return call(TaskExecutors.MAIN_THREAD, paramCallable);
  }
  
  @Deprecated
  public static <TResult> Task<TResult> call(Executor paramExecutor, Callable<TResult> paramCallable)
  {
    if (paramExecutor != null)
    {
      if (paramCallable != null)
      {
        zzw localzzw = new zzw();
        paramExecutor.execute(new zzz(localzzw, paramCallable));
        return localzzw;
      }
      throw new NullPointerException("Callback must not be null");
    }
    throw new NullPointerException("Executor must not be null");
  }
  
  public static <TResult> Task<TResult> forCanceled()
  {
    zzw localzzw = new zzw();
    localzzw.zzc();
    return localzzw;
  }
  
  public static <TResult> Task<TResult> forException(Exception paramException)
  {
    zzw localzzw = new zzw();
    localzzw.zza(paramException);
    return localzzw;
  }
  
  public static <TResult> Task<TResult> forResult(TResult paramTResult)
  {
    zzw localzzw = new zzw();
    localzzw.zzb(paramTResult);
    return localzzw;
  }
  
  public static Task<Void> whenAll(Collection<? extends Task<?>> paramCollection)
  {
    if ((paramCollection != null) && (!paramCollection.isEmpty()))
    {
      Object localObject = paramCollection.iterator();
      while (((Iterator)localObject).hasNext()) {
        if ((Task)((Iterator)localObject).next() == null) {
          throw new NullPointerException("null tasks are not accepted");
        }
      }
      zzw localzzw = new zzw();
      localObject = new zzaf(paramCollection.size(), localzzw);
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        zzb((Task)paramCollection.next(), (zzae)localObject);
      }
      return localzzw;
    }
    return forResult(null);
  }
  
  public static Task<Void> whenAll(Task<?>... paramVarArgs)
  {
    if ((paramVarArgs != null) && (paramVarArgs.length != 0)) {
      return whenAll(Arrays.asList(paramVarArgs));
    }
    return forResult(null);
  }
  
  public static Task<List<Task<?>>> whenAllComplete(Collection<? extends Task<?>> paramCollection)
  {
    return whenAllComplete(TaskExecutors.MAIN_THREAD, paramCollection);
  }
  
  public static Task<List<Task<?>>> whenAllComplete(Executor paramExecutor, Collection<? extends Task<?>> paramCollection)
  {
    if ((paramCollection != null) && (!paramCollection.isEmpty())) {
      return whenAll(paramCollection).continueWithTask(paramExecutor, new zzab(paramCollection));
    }
    return forResult(Collections.emptyList());
  }
  
  public static Task<List<Task<?>>> whenAllComplete(Executor paramExecutor, Task<?>... paramVarArgs)
  {
    if ((paramVarArgs != null) && (paramVarArgs.length != 0)) {
      return whenAllComplete(paramExecutor, Arrays.asList(paramVarArgs));
    }
    return forResult(Collections.emptyList());
  }
  
  public static Task<List<Task<?>>> whenAllComplete(Task<?>... paramVarArgs)
  {
    if ((paramVarArgs != null) && (paramVarArgs.length != 0)) {
      return whenAllComplete(Arrays.asList(paramVarArgs));
    }
    return forResult(Collections.emptyList());
  }
  
  public static <TResult> Task<List<TResult>> whenAllSuccess(Collection<? extends Task> paramCollection)
  {
    return whenAllSuccess(TaskExecutors.MAIN_THREAD, paramCollection);
  }
  
  public static <TResult> Task<List<TResult>> whenAllSuccess(Executor paramExecutor, Collection<? extends Task> paramCollection)
  {
    if ((paramCollection != null) && (!paramCollection.isEmpty())) {
      return whenAll(paramCollection).continueWith(paramExecutor, new zzaa(paramCollection));
    }
    return forResult(Collections.emptyList());
  }
  
  public static <TResult> Task<List<TResult>> whenAllSuccess(Executor paramExecutor, Task... paramVarArgs)
  {
    if ((paramVarArgs != null) && (paramVarArgs.length != 0)) {
      return whenAllSuccess(paramExecutor, Arrays.asList(paramVarArgs));
    }
    return forResult(Collections.emptyList());
  }
  
  public static <TResult> Task<List<TResult>> whenAllSuccess(Task... paramVarArgs)
  {
    if ((paramVarArgs != null) && (paramVarArgs.length != 0)) {
      return whenAllSuccess(Arrays.asList(paramVarArgs));
    }
    return forResult(Collections.emptyList());
  }
  
  public static <T> Task<T> withTimeout(Task<T> paramTask, long paramLong, TimeUnit paramTimeUnit)
  {
    if (paramTask != null)
    {
      boolean bool;
      if (paramLong > 0L) {
        bool = true;
      } else {
        bool = false;
      }
      j.a("Timeout must be positive", bool);
      if (paramTimeUnit != null)
      {
        zzb localzzb = new zzb();
        TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource(localzzb);
        zza localzza = new zza(Looper.getMainLooper());
        localzza.postDelayed(new zzx(localTaskCompletionSource), paramTimeUnit.toMillis(paramLong));
        paramTask.addOnCompleteListener(new zzy(localzza, localTaskCompletionSource, localzzb));
        return localTaskCompletionSource.getTask();
      }
      throw new NullPointerException("TimeUnit must not be null");
    }
    throw new NullPointerException("Task must not be null");
  }
  
  private static Object zza(Task paramTask)
  {
    if (paramTask.isSuccessful()) {
      return paramTask.getResult();
    }
    if (paramTask.isCanceled()) {
      throw new CancellationException("Task is already canceled");
    }
    throw new ExecutionException(paramTask.getException());
  }
  
  private static void zzb(Task paramTask, zzae paramzzae)
  {
    Executor localExecutor = TaskExecutors.zza;
    paramTask.addOnSuccessListener(localExecutor, paramzzae);
    paramTask.addOnFailureListener(localExecutor, paramzzae);
    paramTask.addOnCanceledListener(localExecutor, paramzzae);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.Tasks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */