package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

public final class g$j
{
  public static OnBackInvokedDispatcher a(Activity paramActivity)
  {
    return paramActivity.getOnBackInvokedDispatcher();
  }
  
  public static OnBackInvokedCallback b(Object paramObject, g paramg)
  {
    Objects.requireNonNull(paramg);
    paramg = new l(paramg);
    ((OnBackInvokedDispatcher)paramObject).registerOnBackInvokedCallback(1000000, paramg);
    return paramg;
  }
  
  public static void c(Object paramObject1, Object paramObject2)
  {
    paramObject2 = (OnBackInvokedCallback)paramObject2;
    ((OnBackInvokedDispatcher)paramObject1).unregisterOnBackInvokedCallback((OnBackInvokedCallback)paramObject2);
  }
}

/* Location:
 * Qualified Name:     g.g.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */