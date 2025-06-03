package v5;

import android.os.Message;
import java.util.ArrayList;

public final class a0$a
  implements k.a
{
  public Message a;
  
  public final void a()
  {
    ??? = a;
    ???.getClass();
    ((Message)???).sendToTarget();
    a = null;
    synchronized (a0.b)
    {
      if (((ArrayList)???).size() < 50) {
        ((ArrayList)???).add(this);
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     v5.a0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */