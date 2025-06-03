package androidx.core.provider;

import android.os.Process;
import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;

class RequestExecutor$DefaultThreadFactory
  implements ThreadFactory
{
  private int mPriority;
  private String mThreadName;
  
  public RequestExecutor$DefaultThreadFactory(@NonNull String paramString, int paramInt)
  {
    mThreadName = paramString;
    mPriority = paramInt;
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    return new ProcessPriorityThread(paramRunnable, mThreadName, mPriority);
  }
  
  public static class ProcessPriorityThread
    extends Thread
  {
    private final int mPriority;
    
    public ProcessPriorityThread(Runnable paramRunnable, String paramString, int paramInt)
    {
      super(paramString);
      mPriority = paramInt;
    }
    
    public void run()
    {
      Process.setThreadPriority(mPriority);
      super.run();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.provider.RequestExecutor.DefaultThreadFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */