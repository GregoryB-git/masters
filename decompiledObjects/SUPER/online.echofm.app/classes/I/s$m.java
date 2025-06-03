package I;

import android.view.View;
import android.view.View.OnUnhandledKeyEventListener;
import androidx.annotation.NonNull;
import java.util.Objects;
import t.h;
import v.c;

public abstract class s$m
{
  public static void a(@NonNull View paramView, @NonNull s.p paramp)
  {
    Object localObject1 = (h)paramView.getTag(c.P);
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new h();
      paramView.setTag(c.P, localObject2);
    }
    Objects.requireNonNull(paramp);
    localObject1 = new t(paramp);
    ((h)localObject2).put(paramp, localObject1);
    paramView.addOnUnhandledKeyEventListener((View.OnUnhandledKeyEventListener)localObject1);
  }
  
  public static CharSequence b(View paramView)
  {
    return paramView.getAccessibilityPaneTitle();
  }
  
  public static boolean c(View paramView)
  {
    return paramView.isAccessibilityHeading();
  }
  
  public static boolean d(View paramView)
  {
    return paramView.isScreenReaderFocusable();
  }
  
  public static void e(@NonNull View paramView, @NonNull s.p paramp)
  {
    h localh = (h)paramView.getTag(c.P);
    if (localh == null) {
      return;
    }
    paramp = (View.OnUnhandledKeyEventListener)localh.get(paramp);
    if (paramp != null) {
      paramView.removeOnUnhandledKeyEventListener(paramp);
    }
  }
  
  public static <T> T f(View paramView, int paramInt)
  {
    return paramView.requireViewById(paramInt);
  }
  
  public static void g(View paramView, boolean paramBoolean)
  {
    paramView.setAccessibilityHeading(paramBoolean);
  }
  
  public static void h(View paramView, CharSequence paramCharSequence)
  {
    paramView.setAccessibilityPaneTitle(paramCharSequence);
  }
  
  public static void i(View paramView, boolean paramBoolean)
  {
    paramView.setScreenReaderFocusable(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     I.s.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */