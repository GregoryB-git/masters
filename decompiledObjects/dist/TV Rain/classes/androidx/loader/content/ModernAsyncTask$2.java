package androidx.loader.content;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

class ModernAsyncTask$2
  extends ModernAsyncTask.WorkerRunnable<Params, Result>
{
  public ModernAsyncTask$2(ModernAsyncTask paramModernAsyncTask) {}
  
  public Result call()
    throws Exception
  {
    this$0.mTaskInvoked.set(true);
    Object localObject1 = null;
    Object localObject4 = localObject1;
    try
    {
      Process.setThreadPriority(10);
      localObject4 = localObject1;
      localObject1 = this$0.doInBackground(mParams);
      localObject4 = localObject1;
      Binder.flushPendingCommands();
      this$0.postResult(localObject1);
      return (Result)localObject1;
    }
    finally
    {
      try
      {
        this$0.mCancelled.set(true);
        throw ((Throwable)localObject2);
      }
      finally
      {
        this$0.postResult(localObject4);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.loader.content.ModernAsyncTask.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */