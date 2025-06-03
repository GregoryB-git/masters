package c8;

import android.os.Handler;
import l6.b.a;

public final class q0
  implements b.a
{
  public q0(r0 paramr0) {}
  
  public final void a(boolean paramBoolean)
  {
    int i = 1;
    if (paramBoolean)
    {
      a.c = true;
      localObject = a.b;
      e.removeCallbacks(f);
      return;
    }
    a.c = false;
    Object localObject = a;
    if ((a <= 0) || (c)) {
      i = 0;
    }
    if (i != 0) {
      a.b.a();
    }
  }
}

/* Location:
 * Qualified Name:     c8.q0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */