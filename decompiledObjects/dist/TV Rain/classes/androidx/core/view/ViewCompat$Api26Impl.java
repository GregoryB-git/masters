package androidx.core.view;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Collection;
import l5;
import p3;

@RequiresApi(26)
class ViewCompat$Api26Impl
{
  @DoNotInline
  public static void addKeyboardNavigationClusters(@NonNull View paramView, Collection<View> paramCollection, int paramInt)
  {
    l5.f(paramView, paramCollection, paramInt);
  }
  
  @DoNotInline
  public static int getImportantForAutofill(View paramView)
  {
    return p3.a(paramView);
  }
  
  @DoNotInline
  public static int getNextClusterForwardId(@NonNull View paramView)
  {
    return p3.y(paramView);
  }
  
  @DoNotInline
  public static boolean hasExplicitFocusable(@NonNull View paramView)
  {
    return l5.m(paramView);
  }
  
  @DoNotInline
  public static boolean isFocusedByDefault(@NonNull View paramView)
  {
    return l5.i(paramView);
  }
  
  @DoNotInline
  public static boolean isImportantForAutofill(View paramView)
  {
    return p3.C(paramView);
  }
  
  @DoNotInline
  public static boolean isKeyboardNavigationCluster(@NonNull View paramView)
  {
    return l5.o(paramView);
  }
  
  @DoNotInline
  public static View keyboardNavigationClusterSearch(@NonNull View paramView1, View paramView2, int paramInt)
  {
    return p3.f(paramView1, paramView2, paramInt);
  }
  
  @DoNotInline
  public static boolean restoreDefaultFocus(@NonNull View paramView)
  {
    return p3.v(paramView);
  }
  
  @DoNotInline
  public static void setAutofillHints(@NonNull View paramView, String... paramVarArgs)
  {
    l5.g(paramView, paramVarArgs);
  }
  
  @DoNotInline
  public static void setFocusedByDefault(@NonNull View paramView, boolean paramBoolean)
  {
    p3.B(paramView, paramBoolean);
  }
  
  @DoNotInline
  public static void setImportantForAutofill(View paramView, int paramInt)
  {
    l5.l(paramInt, paramView);
  }
  
  @DoNotInline
  public static void setKeyboardNavigationCluster(@NonNull View paramView, boolean paramBoolean)
  {
    p3.q(paramView, paramBoolean);
  }
  
  @DoNotInline
  public static void setNextClusterForwardId(View paramView, int paramInt)
  {
    l5.d(paramInt, paramView);
  }
  
  @DoNotInline
  public static void setTooltipText(@NonNull View paramView, CharSequence paramCharSequence)
  {
    p3.p(paramView, paramCharSequence);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewCompat.Api26Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */