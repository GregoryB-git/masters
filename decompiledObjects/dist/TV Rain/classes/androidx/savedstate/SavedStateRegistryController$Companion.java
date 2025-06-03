package androidx.savedstate;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\007¨\006\007"}, d2={"Landroidx/savedstate/SavedStateRegistryController$Companion;", "", "()V", "create", "Landroidx/savedstate/SavedStateRegistryController;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedstate_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class SavedStateRegistryController$Companion
{
  @JvmStatic
  @NotNull
  public final SavedStateRegistryController create(@NotNull SavedStateRegistryOwner paramSavedStateRegistryOwner)
  {
    Intrinsics.checkNotNullParameter(paramSavedStateRegistryOwner, "owner");
    return new SavedStateRegistryController(paramSavedStateRegistryOwner, null);
  }
}

/* Location:
 * Qualified Name:     androidx.savedstate.SavedStateRegistryController.Companion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */