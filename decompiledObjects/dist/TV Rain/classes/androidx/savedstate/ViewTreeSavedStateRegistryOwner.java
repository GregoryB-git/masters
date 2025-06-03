package androidx.savedstate;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000\026\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\003\032\023\020\000\032\004\030\0010\001*\0020\002H\007¢\006\002\b\003\032\033\020\004\032\0020\005*\0020\0022\b\020\006\032\004\030\0010\001H\007¢\006\002\b\007¨\006\b"}, d2={"findViewTreeSavedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroid/view/View;", "get", "setViewTreeSavedStateRegistryOwner", "", "owner", "set", "savedstate_release"}, k=2, mv={1, 6, 0}, xi=48)
@JvmName(name="ViewTreeSavedStateRegistryOwner")
public final class ViewTreeSavedStateRegistryOwner
{
  @JvmName(name="get")
  @Nullable
  public static final SavedStateRegistryOwner get(@NotNull View paramView)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    return (SavedStateRegistryOwner)SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.generateSequence(paramView, findViewTreeSavedStateRegistryOwner.1.INSTANCE), findViewTreeSavedStateRegistryOwner.2.INSTANCE));
  }
  
  @JvmName(name="set")
  public static final void set(@NotNull View paramView, @Nullable SavedStateRegistryOwner paramSavedStateRegistryOwner)
  {
    Intrinsics.checkNotNullParameter(paramView, "<this>");
    paramView.setTag(R.id.view_tree_saved_state_registry_owner, paramSavedStateRegistryOwner);
  }
}

/* Location:
 * Qualified Name:     androidx.savedstate.ViewTreeSavedStateRegistryOwner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */