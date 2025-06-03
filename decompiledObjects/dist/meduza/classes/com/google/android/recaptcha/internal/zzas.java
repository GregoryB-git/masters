package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import nc.j0;
import nc.j1;

public final class zzas
{
  public static final Task zza(j0 paramj0)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
    paramj0.invokeOnCompletion(new zzar(localTaskCompletionSource, paramj0));
    return localTaskCompletionSource.getTask();
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzas
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */