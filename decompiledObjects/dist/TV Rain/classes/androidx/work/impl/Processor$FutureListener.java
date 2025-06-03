package androidx.work.impl;

import androidx.annotation.NonNull;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class Processor$FutureListener
  implements Runnable
{
  @NonNull
  private ExecutionListener mExecutionListener;
  @NonNull
  private ListenableFuture<Boolean> mFuture;
  @NonNull
  private String mWorkSpecId;
  
  public Processor$FutureListener(@NonNull ExecutionListener paramExecutionListener, @NonNull String paramString, @NonNull ListenableFuture<Boolean> paramListenableFuture)
  {
    mExecutionListener = paramExecutionListener;
    mWorkSpecId = paramString;
    mFuture = paramListenableFuture;
  }
  
  public void run()
  {
    boolean bool;
    try
    {
      bool = ((Boolean)mFuture.get()).booleanValue();
    }
    catch (InterruptedException|ExecutionException localInterruptedException)
    {
      bool = true;
    }
    mExecutionListener.onExecuted(mWorkSpecId, bool);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.Processor.FutureListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */