package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.tasks.zza;
import java.util.concurrent.Executor;

final class zzu
  implements Executor
{
  private final Handler zza = new zza(Looper.getMainLooper());
  
  public final void execute(Runnable paramRunnable)
  {
    zza.post(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.zzu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */