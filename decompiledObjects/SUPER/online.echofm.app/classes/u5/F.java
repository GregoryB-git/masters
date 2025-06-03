package u5;

import D5.i;
import D5.i.b;
import android.view.KeyEvent;

public class F
  implements L.d
{
  public final i a;
  public final L.b b = new L.b();
  
  public F(i parami)
  {
    a = parami;
  }
  
  public void a(KeyEvent paramKeyEvent, L.d.a parama)
  {
    int i = paramKeyEvent.getAction();
    boolean bool = false;
    if ((i != 0) && (i != 1))
    {
      parama.a(false);
      return;
    }
    paramKeyEvent = new i.b(paramKeyEvent, b.a(paramKeyEvent.getUnicodeChar()));
    if (i != 0) {
      bool = true;
    }
    a.e(paramKeyEvent, bool, new E(parama));
  }
}

/* Location:
 * Qualified Name:     u5.F
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */