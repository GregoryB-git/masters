package androidx.savedstate;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000\n\n\000\n\002\030\002\n\002\b\002\020\000\032\004\030\0010\0012\006\020\002\032\0020\001H\n¢\006\002\b\003"}, d2={"<anonymous>", "Landroid/view/View;", "view", "invoke"}, k=3, mv={1, 6, 0}, xi=48)
final class ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1
  extends Lambda
  implements Function1<View, View>
{
  public static final 1 INSTANCE = new 1();
  
  public ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1()
  {
    super(1);
  }
  
  @Nullable
  public final View invoke(@NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramView, "view");
    paramView = paramView.getParent();
    if ((paramView instanceof View)) {
      paramView = (View)paramView;
    } else {
      paramView = null;
    }
    return paramView;
  }
}

/* Location:
 * Qualified Name:     androidx.savedstate.ViewTreeSavedStateRegistryOwner.findViewTreeSavedStateRegistryOwner.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */