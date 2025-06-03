package androidx.core.app;

import android.os.IBinder;

abstract interface JobIntentService$CompatJobEngine
{
  public abstract IBinder compatGetBinder();
  
  public abstract JobIntentService.GenericWorkItem dequeueWork();
}

/* Location:
 * Qualified Name:     androidx.core.app.JobIntentService.CompatJobEngine
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */