package x3;

import android.os.Handler;
import v3.d0.b;
import x0.q0;
import z3.e;

public final class l$a
{
  public final Handler a;
  public final l b;
  
  public l$a(Handler paramHandler, d0.b paramb)
  {
    a = paramHandler;
    b = paramb;
  }
  
  public final void a(e parame)
  {
    Handler localHandler = a;
    if (localHandler != null) {
      localHandler.post(new q0(5, this, parame));
    }
  }
}

/* Location:
 * Qualified Name:     x3.l.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */