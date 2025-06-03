package androidx.core.provider;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import java.util.concurrent.Callable;

class RequestExecutor$ReplyRunnable<T>
  implements Runnable
{
  @NonNull
  private Callable<T> mCallable;
  @NonNull
  private Consumer<T> mConsumer;
  @NonNull
  private Handler mHandler;
  
  public RequestExecutor$ReplyRunnable(@NonNull Handler paramHandler, @NonNull Callable<T> paramCallable, @NonNull Consumer<T> paramConsumer)
  {
    mCallable = paramCallable;
    mConsumer = paramConsumer;
    mHandler = paramHandler;
  }
  
  public void run()
  {
    final Object localObject2;
    try
    {
      Object localObject1 = mCallable.call();
    }
    catch (Exception localException)
    {
      localObject2 = null;
    }
    final Consumer localConsumer = mConsumer;
    mHandler.post(new Runnable()
    {
      public void run()
      {
        localConsumer.accept(localObject2);
      }
    });
  }
}

/* Location:
 * Qualified Name:     androidx.core.provider.RequestExecutor.ReplyRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */