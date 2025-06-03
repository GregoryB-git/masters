package b;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import dc.a;
import dc.l;
import ec.i;
import rb.h;

public final class w$b
{
  public static final b a = new b();
  
  public final OnBackInvokedCallback a(l<? super b, h> paraml1, final l<? super b, h> paraml2, final a<h> parama1, final a<h> parama2)
  {
    i.e(paraml1, "onBackStarted");
    i.e(paraml2, "onBackProgressed");
    i.e(parama1, "onBackInvoked");
    i.e(parama2, "onBackCancelled");
    return new a(paraml1, paraml2, parama1, parama2);
  }
  
  public static final class a
    implements OnBackAnimationCallback
  {
    public a(l<? super b, h> paraml1, l<? super b, h> paraml2, a<h> parama1, a<h> parama2) {}
    
    public final void onBackCancelled()
    {
      parama2.invoke();
    }
    
    public final void onBackInvoked()
    {
      parama1.invoke();
    }
    
    public final void onBackProgressed(BackEvent paramBackEvent)
    {
      i.e(paramBackEvent, "backEvent");
      paraml2.invoke(new b(paramBackEvent));
    }
    
    public final void onBackStarted(BackEvent paramBackEvent)
    {
      i.e(paramBackEvent, "backEvent");
      a.invoke(new b(paramBackEvent));
    }
  }
}

/* Location:
 * Qualified Name:     b.w.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */