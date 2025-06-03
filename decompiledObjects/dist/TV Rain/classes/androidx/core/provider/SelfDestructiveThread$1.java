package androidx.core.provider;

import android.os.Handler.Callback;
import android.os.Message;

class SelfDestructiveThread$1
  implements Handler.Callback
{
  public SelfDestructiveThread$1(SelfDestructiveThread paramSelfDestructiveThread) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    int i = what;
    if (i != 0)
    {
      if (i != 1) {
        return true;
      }
      this$0.onInvokeRunnable((Runnable)obj);
      return true;
    }
    this$0.onDestruction();
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.core.provider.SelfDestructiveThread.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */