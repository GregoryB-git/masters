package k7;

import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class e
  implements Runnable
{
  public final TaskCompletionSource a;
  
  public e()
  {
    a = null;
  }
  
  public e(TaskCompletionSource paramTaskCompletionSource)
  {
    a = paramTaskCompletionSource;
  }
  
  public abstract void a();
  
  public final void run()
  {
    try
    {
      a();
      return;
    }
    catch (Exception localException)
    {
      TaskCompletionSource localTaskCompletionSource = a;
      if (localTaskCompletionSource != null) {
        localTaskCompletionSource.trySetException(localException);
      }
    }
  }
}

/* Location:
 * Qualified Name:     k7.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */