package androidx.core.provider;

import android.os.Process;

class RequestExecutor$DefaultThreadFactory$ProcessPriorityThread
  extends Thread
{
  private final int mPriority;
  
  public RequestExecutor$DefaultThreadFactory$ProcessPriorityThread(Runnable paramRunnable, String paramString, int paramInt)
  {
    super(paramRunnable, paramString);
    mPriority = paramInt;
  }
  
  public void run()
  {
    Process.setThreadPriority(mPriority);
    super.run();
  }
}

/* Location:
 * Qualified Name:     androidx.core.provider.RequestExecutor.DefaultThreadFactory.ProcessPriorityThread
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */