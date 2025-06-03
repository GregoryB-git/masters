package androidx.savedstate;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2={"<anonymous>", "Landroidx/savedstate/SavedStateRegistryOwner;", "view", "Landroid/view/View;", "invoke"}, k=3, mv={1, 6, 0}, xi=48)
final class ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2
  extends Lambda
  implements Function1<View, SavedStateRegistryOwner>
{
  public static final 2 INSTANCE = new 2();
  
  public ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2()
  {
    super(1);
  }
  
  @Nullable
  public final SavedStateRegistryOwner invoke(@NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramView, "view");
    paramView = paramView.getTag(R.id.view_tree_saved_state_registry_owner);
    if ((paramView instanceof SavedStateRegistryOwner)) {
      paramView = (SavedStateRegistryOwner)paramView;
    } else {
      paramView = null;
    }
    return paramView;
  }
}

/* Location:
 * Qualified Name:     androidx.savedstate.ViewTreeSavedStateRegistryOwner.findViewTreeSavedStateRegistryOwner.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */