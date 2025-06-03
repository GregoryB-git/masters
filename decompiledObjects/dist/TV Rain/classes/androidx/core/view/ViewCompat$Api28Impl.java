package androidx.core.view;

import a3;
import android.view.View;
import android.view.View.OnUnhandledKeyEventListener;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import androidx.core.R.id;
import java.util.Objects;
import m5;
import n5;

@RequiresApi(28)
class ViewCompat$Api28Impl
{
  @DoNotInline
  public static void addOnUnhandledKeyEventListener(@NonNull View paramView, @NonNull ViewCompat.OnUnhandledKeyEventListenerCompat paramOnUnhandledKeyEventListenerCompat)
  {
    int i = R.id.tag_unhandled_key_listeners;
    Object localObject1 = (SimpleArrayMap)paramView.getTag(i);
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new SimpleArrayMap();
      paramView.setTag(i, localObject2);
    }
    Objects.requireNonNull(paramOnUnhandledKeyEventListenerCompat);
    localObject1 = new n5(paramOnUnhandledKeyEventListenerCompat);
    ((SimpleArrayMap)localObject2).put(paramOnUnhandledKeyEventListenerCompat, localObject1);
    a3.v(paramView, (n5)localObject1);
  }
  
  @DoNotInline
  public static CharSequence getAccessibilityPaneTitle(View paramView)
  {
    return m5.h(paramView);
  }
  
  @DoNotInline
  public static boolean isAccessibilityHeading(View paramView)
  {
    return m5.m(paramView);
  }
  
  @DoNotInline
  public static boolean isScreenReaderFocusable(View paramView)
  {
    return a3.B(paramView);
  }
  
  @DoNotInline
  public static void removeOnUnhandledKeyEventListener(@NonNull View paramView, @NonNull ViewCompat.OnUnhandledKeyEventListenerCompat paramOnUnhandledKeyEventListenerCompat)
  {
    SimpleArrayMap localSimpleArrayMap = (SimpleArrayMap)paramView.getTag(R.id.tag_unhandled_key_listeners);
    if (localSimpleArrayMap == null) {
      return;
    }
    paramOnUnhandledKeyEventListenerCompat = (View.OnUnhandledKeyEventListener)localSimpleArrayMap.get(paramOnUnhandledKeyEventListenerCompat);
    if (paramOnUnhandledKeyEventListenerCompat != null) {
      m5.i(paramView, paramOnUnhandledKeyEventListenerCompat);
    }
  }
  
  @DoNotInline
  public static <T> T requireViewById(View paramView, int paramInt)
  {
    return m5.e(paramInt, paramView);
  }
  
  @DoNotInline
  public static void setAccessibilityHeading(View paramView, boolean paramBoolean)
  {
    m5.k(paramView, paramBoolean);
  }
  
  @DoNotInline
  public static void setAccessibilityPaneTitle(View paramView, CharSequence paramCharSequence)
  {
    m5.j(paramView, paramCharSequence);
  }
  
  @DoNotInline
  public static void setScreenReaderFocusable(View paramView, boolean paramBoolean)
  {
    a3.w(paramView, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewCompat.Api28Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */