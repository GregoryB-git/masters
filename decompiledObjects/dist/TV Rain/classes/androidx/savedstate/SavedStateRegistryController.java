package androidx.savedstate;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z2;

@Metadata(d1={"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\004\030\000 \0222\0020\001:\001\022B\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004J\b\020\013\032\0020\fH\007J\022\020\r\032\0020\f2\b\020\016\032\004\030\0010\017H\007J\020\020\020\032\0020\f2\006\020\021\032\0020\017H\007R\016\020\005\032\0020\006X\016¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\t\020\n¨\006\023"}, d2={"Landroidx/savedstate/SavedStateRegistryController;", "", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "attached", "", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "performAttach", "", "performRestore", "savedState", "Landroid/os/Bundle;", "performSave", "outBundle", "Companion", "savedstate_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class SavedStateRegistryController
{
  @NotNull
  public static final Companion Companion = new Companion(null);
  private boolean attached;
  @NotNull
  private final SavedStateRegistryOwner owner;
  @NotNull
  private final SavedStateRegistry savedStateRegistry;
  
  private SavedStateRegistryController(SavedStateRegistryOwner paramSavedStateRegistryOwner)
  {
    owner = paramSavedStateRegistryOwner;
    savedStateRegistry = new SavedStateRegistry();
  }
  
  @JvmStatic
  @NotNull
  public static final SavedStateRegistryController create(@NotNull SavedStateRegistryOwner paramSavedStateRegistryOwner)
  {
    return Companion.create(paramSavedStateRegistryOwner);
  }
  
  @NotNull
  public final SavedStateRegistry getSavedStateRegistry()
  {
    return savedStateRegistry;
  }
  
  @MainThread
  public final void performAttach()
  {
    Lifecycle localLifecycle = owner.getLifecycle();
    Intrinsics.checkNotNullExpressionValue(localLifecycle, "owner.lifecycle");
    int i;
    if (localLifecycle.getCurrentState() == Lifecycle.State.INITIALIZED) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      localLifecycle.addObserver(new Recreator(owner));
      savedStateRegistry.performAttach$savedstate_release(localLifecycle);
      attached = true;
      return;
    }
    throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
  }
  
  @MainThread
  public final void performRestore(@Nullable Bundle paramBundle)
  {
    if (!attached) {
      performAttach();
    }
    Lifecycle localLifecycle = owner.getLifecycle();
    Intrinsics.checkNotNullExpressionValue(localLifecycle, "owner.lifecycle");
    if ((localLifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED) ^ true))
    {
      savedStateRegistry.performRestore$savedstate_release(paramBundle);
      return;
    }
    paramBundle = z2.t("performRestore cannot be called when owner is ");
    paramBundle.append(localLifecycle.getCurrentState());
    throw new IllegalStateException(paramBundle.toString().toString());
  }
  
  @MainThread
  public final void performSave(@NotNull Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "outBundle");
    savedStateRegistry.performSave(paramBundle);
  }
  
  @Metadata(d1={"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\007¨\006\007"}, d2={"Landroidx/savedstate/SavedStateRegistryController$Companion;", "", "()V", "create", "Landroidx/savedstate/SavedStateRegistryController;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedstate_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static final class Companion
  {
    @JvmStatic
    @NotNull
    public final SavedStateRegistryController create(@NotNull SavedStateRegistryOwner paramSavedStateRegistryOwner)
    {
      Intrinsics.checkNotNullParameter(paramSavedStateRegistryOwner, "owner");
      return new SavedStateRegistryController(paramSavedStateRegistryOwner, null);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.savedstate.SavedStateRegistryController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */