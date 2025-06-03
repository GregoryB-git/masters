package io.flutter.plugins.firebase.messaging;

import android.os.IBinder;

abstract interface JobIntentService$CompatJobEngine
{
  public abstract IBinder compatGetBinder();
  
  public abstract JobIntentService.GenericWorkItem dequeueWork();
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.JobIntentService.CompatJobEngine
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */