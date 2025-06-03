package androidx.core.view;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\b*\001\000\b\n\030\0002\0020\001JP\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\0072\006\020\n\032\0020\0072\006\020\013\032\0020\0072\006\020\f\032\0020\0072\006\020\r\032\0020\0072\006\020\016\032\0020\007H\026¨\006\017"}, d2={"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", "view", "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "core-ktx_release"}, k=1, mv={1, 7, 1}, xi=176)
public final class ViewKt$doOnNextLayout$1
  implements View.OnLayoutChangeListener
{
  public ViewKt$doOnNextLayout$1(Function1<? super View, Unit> paramFunction1) {}
  
  public void onLayoutChange(@NotNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    Intrinsics.checkNotNullParameter(paramView, "view");
    paramView.removeOnLayoutChangeListener(this);
    $action.invoke(paramView);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewKt.doOnNextLayout.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */