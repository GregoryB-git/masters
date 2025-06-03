package androidx.lifecycle;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\032\f\020\000\032\004\030\0010\001*\0020\002¨\006\003"}, d2={"findViewTreeViewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroid/view/View;", "lifecycle-viewmodel_release"}, k=2, mv={1, 6, 0}, xi=48)
public final class ViewTreeViewModelKt
{
  @Nullable
  public static final ViewModelStoreOwner findViewTreeViewModelStoreOwner(@NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    return ViewTreeViewModelStoreOwner.get(paramView);
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ViewTreeViewModelKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */