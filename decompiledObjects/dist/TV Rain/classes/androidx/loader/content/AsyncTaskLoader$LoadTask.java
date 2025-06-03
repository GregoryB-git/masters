package androidx.loader.content;

import androidx.core.os.OperationCanceledException;
import java.util.concurrent.CountDownLatch;

final class AsyncTaskLoader$LoadTask
  extends ModernAsyncTask<Void, Void, D>
  implements Runnable
{
  private final CountDownLatch mDone = new CountDownLatch(1);
  public boolean waiting;
  
  public AsyncTaskLoader$LoadTask(AsyncTaskLoader paramAsyncTaskLoader) {}
  
  public D doInBackground(Void... paramVarArgs)
  {
    try
    {
      paramVarArgs = this$0.onLoadInBackground();
      return paramVarArgs;
    }
    catch (OperationCanceledException paramVarArgs)
    {
      if (isCancelled()) {
        return null;
      }
      throw paramVarArgs;
    }
  }
  
  public void onCancelled(D paramD)
  {
    try
    {
      this$0.dispatchOnCancelled(this, paramD);
      return;
    }
    finally
    {
      mDone.countDown();
    }
  }
  
  public void onPostExecute(D paramD)
  {
    try
    {
      this$0.dispatchOnLoadComplete(this, paramD);
      return;
    }
    finally
    {
      mDone.countDown();
    }
  }
  
  public void run()
  {
    waiting = false;
    this$0.executePendingTask();
  }
  
  public void waitForLoader()
  {
    try
    {
      mDone.await();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     androidx.loader.content.AsyncTaskLoader.LoadTask
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */