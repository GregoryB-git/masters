package androidx.core.view;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026¨\006\007"}, d2={"androidx/core/view/ViewKt$doOnDetach$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "view", "Landroid/view/View;", "onViewDetachedFromWindow", "core-ktx_release"}, k=1, mv={1, 7, 1}, xi=176)
public final class ViewKt$doOnDetach$1
  implements View.OnAttachStateChangeListener
{
  public ViewKt$doOnDetach$1(View paramView, Function1<? super View, Unit> paramFunction1) {}
  
  public void onViewAttachedToWindow(@NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramView, "view");
  }
  
  public void onViewDetachedFromWindow(@NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramView, "view");
    $this_doOnDetach.removeOnAttachStateChangeListener(this);
    $action.invoke(paramView);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewKt.doOnDetach.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */