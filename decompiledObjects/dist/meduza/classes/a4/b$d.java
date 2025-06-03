package a4;

import android.os.Handler;
import b.m;
import v5.e0;

public final class b$d
  implements h.b
{
  public final g.a a;
  public e b;
  public boolean c;
  
  public b$d(b paramb, g.a parama)
  {
    a = parama;
  }
  
  public final void release()
  {
    Handler localHandler = d.u;
    localHandler.getClass();
    e0.M(localHandler, new m(this, 10));
  }
}

/* Location:
 * Qualified Name:     a4.b.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */