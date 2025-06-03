package O1;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.Intrinsics;

public final class B
{
  public Object a;
  public CountDownLatch b = new CountDownLatch(1);
  
  public B(Callable paramCallable)
  {
    x1.B.t().execute(new FutureTask(new A(this, paramCallable)));
  }
  
  public static final Void b(B paramB, Callable paramCallable)
  {
    Intrinsics.checkNotNullParameter(paramB, "this$0");
    Intrinsics.checkNotNullParameter(paramCallable, "$callable");
    try
    {
      a = paramCallable.call();
      return null;
    }
    finally
    {
      paramB = b;
      if (paramB != null) {
        paramB.countDown();
      }
    }
  }
}

/* Location:
 * Qualified Name:     O1.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */