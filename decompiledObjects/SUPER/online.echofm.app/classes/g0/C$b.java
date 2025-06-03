package g0;

import android.os.Handler;
import android.os.Message;

public final class C$b
  implements k.a
{
  public Message a;
  public C b;
  
  public void a()
  {
    ((Message)a.e(a)).sendToTarget();
    b();
  }
  
  public final void b()
  {
    a = null;
    b = null;
    C.l(this);
  }
  
  public boolean c(Handler paramHandler)
  {
    boolean bool = paramHandler.sendMessageAtFrontOfQueue((Message)a.e(a));
    b();
    return bool;
  }
  
  public b d(Message paramMessage, C paramC)
  {
    a = paramMessage;
    b = paramC;
    return this;
  }
}

/* Location:
 * Qualified Name:     g0.C.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */