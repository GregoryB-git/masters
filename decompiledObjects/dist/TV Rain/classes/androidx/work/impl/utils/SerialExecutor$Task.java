package androidx.work.impl.utils;

import androidx.annotation.NonNull;

class SerialExecutor$Task
  implements Runnable
{
  public final Runnable mRunnable;
  public final SerialExecutor mSerialExecutor;
  
  public SerialExecutor$Task(@NonNull SerialExecutor paramSerialExecutor, @NonNull Runnable paramRunnable)
  {
    mSerialExecutor = paramSerialExecutor;
    mRunnable = paramRunnable;
  }
  
  public void run()
  {
    try
    {
      mRunnable.run();
      return;
    }
    finally
    {
      mSerialExecutor.scheduleNext();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.SerialExecutor.Task
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */