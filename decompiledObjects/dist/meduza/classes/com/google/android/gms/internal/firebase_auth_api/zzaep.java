package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzado;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

public class zzaep
{
  public zzado zza;
  public Executor zzb;
  
  public final <ResultT> Task<ResultT> zza(zzaer<ResultT> paramzzaer)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    zzb.execute(new zzaes(this, paramzzaer, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaep
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */