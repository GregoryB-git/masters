package androidx.core.provider;

import android.os.Handler;
import java.util.concurrent.Callable;

class SelfDestructiveThread$2
  implements Runnable
{
  public SelfDestructiveThread$2(SelfDestructiveThread paramSelfDestructiveThread, Callable paramCallable, Handler paramHandler, SelfDestructiveThread.ReplyCallback paramReplyCallback) {}
  
  public void run()
  {
    final Object localObject2;
    try
    {
      Object localObject1 = val$callable.call();
    }
    catch (Exception localException)
    {
      localObject2 = null;
    }
    val$calleeHandler.post(new Runnable()
    {
      public void run()
      {
        val$reply.onReply(localObject2);
      }
    });
  }
}

/* Location:
 * Qualified Name:     androidx.core.provider.SelfDestructiveThread.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */