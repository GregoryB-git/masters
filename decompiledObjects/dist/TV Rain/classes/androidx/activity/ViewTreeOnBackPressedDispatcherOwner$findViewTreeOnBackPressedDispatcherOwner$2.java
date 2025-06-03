package androidx.activity;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2={"<anonymous>", "Landroidx/activity/OnBackPressedDispatcherOwner;", "it", "Landroid/view/View;", "invoke"}, k=3, mv={1, 6, 0}, xi=48)
final class ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2
  extends Lambda
  implements Function1<View, OnBackPressedDispatcherOwner>
{
  public static final 2 INSTANCE = new 2();
  
  public ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2()
  {
    super(1);
  }
  
  @Nullable
  public final OnBackPressedDispatcherOwner invoke(@NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramView, "it");
    paramView = paramView.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
    if ((paramView instanceof OnBackPressedDispatcherOwner)) {
      paramView = (OnBackPressedDispatcherOwner)paramView;
    } else {
      paramView = null;
    }
    return paramView;
  }
}

/* Location:
 * Qualified Name:     androidx.activity.ViewTreeOnBackPressedDispatcherOwner.findViewTreeOnBackPressedDispatcherOwner.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */