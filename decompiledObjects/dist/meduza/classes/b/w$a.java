package b;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import dc.a;
import ec.i;
import rb.h;

public final class w$a
{
  public static final a a = new a();
  
  public final OnBackInvokedCallback a(a<h> parama)
  {
    i.e(parama, "onBackInvoked");
    return new v(parama, 0);
  }
  
  public final void b(Object paramObject1, int paramInt, Object paramObject2)
  {
    i.e(paramObject1, "dispatcher");
    i.e(paramObject2, "callback");
    ((OnBackInvokedDispatcher)paramObject1).registerOnBackInvokedCallback(paramInt, (OnBackInvokedCallback)paramObject2);
  }
  
  public final void c(Object paramObject1, Object paramObject2)
  {
    i.e(paramObject1, "dispatcher");
    i.e(paramObject2, "callback");
    ((OnBackInvokedDispatcher)paramObject1).unregisterOnBackInvokedCallback((OnBackInvokedCallback)paramObject2);
  }
}

/* Location:
 * Qualified Name:     b.w.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */