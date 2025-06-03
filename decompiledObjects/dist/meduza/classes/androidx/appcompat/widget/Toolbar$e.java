package androidx.appcompat.widget;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import b.v;
import java.util.Objects;

public final class Toolbar$e
{
  public static OnBackInvokedDispatcher a(View paramView)
  {
    return paramView.findOnBackInvokedDispatcher();
  }
  
  public static OnBackInvokedCallback b(Runnable paramRunnable)
  {
    Objects.requireNonNull(paramRunnable);
    return new v(paramRunnable, 1);
  }
  
  public static void c(Object paramObject1, Object paramObject2)
  {
    ((OnBackInvokedDispatcher)paramObject1).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback)paramObject2);
  }
  
  public static void d(Object paramObject1, Object paramObject2)
  {
    ((OnBackInvokedDispatcher)paramObject1).unregisterOnBackInvokedCallback((OnBackInvokedCallback)paramObject2);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.Toolbar.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */