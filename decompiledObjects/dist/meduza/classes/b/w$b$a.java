package b;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import dc.a;
import dc.l;
import ec.i;
import rb.h;

public final class w$b$a
  implements OnBackAnimationCallback
{
  public w$b$a(l<? super b, h> paraml1, l<? super b, h> paraml2, a<h> parama1, a<h> parama2) {}
  
  public final void onBackCancelled()
  {
    d.invoke();
  }
  
  public final void onBackInvoked()
  {
    c.invoke();
  }
  
  public final void onBackProgressed(BackEvent paramBackEvent)
  {
    i.e(paramBackEvent, "backEvent");
    b.invoke(new b(paramBackEvent));
  }
  
  public final void onBackStarted(BackEvent paramBackEvent)
  {
    i.e(paramBackEvent, "backEvent");
    a.invoke(new b(paramBackEvent));
  }
}

/* Location:
 * Qualified Name:     b.w.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */