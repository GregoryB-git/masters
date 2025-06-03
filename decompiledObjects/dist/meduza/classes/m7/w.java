package m7;

import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class w
  implements Runnable
{
  private final TaskCompletionSource a;
  
  public w()
  {
    a = null;
  }
  
  public w(TaskCompletionSource paramTaskCompletionSource)
  {
    a = paramTaskCompletionSource;
  }
  
  public void a(Exception paramException)
  {
    TaskCompletionSource localTaskCompletionSource = a;
    if (localTaskCompletionSource != null) {
      localTaskCompletionSource.trySetException(paramException);
    }
  }
  
  public abstract void b();
  
  public final TaskCompletionSource c()
  {
    return a;
  }
  
  public final void run()
  {
    try
    {
      b();
      return;
    }
    catch (Exception localException)
    {
      a(localException);
    }
  }
}

/* Location:
 * Qualified Name:     m7.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */