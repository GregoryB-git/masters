package androidx.savedstate;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bf\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005¨\006\006"}, d2={"Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/lifecycle/LifecycleOwner;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedstate_release"}, k=1, mv={1, 6, 0}, xi=48)
public abstract interface SavedStateRegistryOwner
  extends LifecycleOwner
{
  @NotNull
  public abstract SavedStateRegistry getSavedStateRegistry();
}

/* Location:
 * Qualified Name:     androidx.savedstate.SavedStateRegistryOwner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */