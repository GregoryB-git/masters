package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\030\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\013"}, d2={"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/LifecycleEventObserver;", "provider", "Landroidx/lifecycle/SavedStateHandlesProvider;", "(Landroidx/lifecycle/SavedStateHandlesProvider;)V", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "lifecycle-viewmodel-savedstate_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class SavedStateHandleAttacher
  implements LifecycleEventObserver
{
  @NotNull
  private final SavedStateHandlesProvider provider;
  
  public SavedStateHandleAttacher(@NotNull SavedStateHandlesProvider paramSavedStateHandlesProvider)
  {
    provider = paramSavedStateHandlesProvider;
  }
  
  public void onStateChanged(@NotNull LifecycleOwner paramLifecycleOwner, @NotNull Lifecycle.Event paramEvent)
  {
    Intrinsics.checkNotNullParameter(paramLifecycleOwner, "source");
    Intrinsics.checkNotNullParameter(paramEvent, "event");
    int i;
    if (paramEvent == Lifecycle.Event.ON_CREATE) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      paramLifecycleOwner.getLifecycle().removeObserver(this);
      provider.performRestore();
      return;
    }
    paramLifecycleOwner = new StringBuilder();
    paramLifecycleOwner.append("Next event must be ON_CREATE, it was ");
    paramLifecycleOwner.append(paramEvent);
    throw new IllegalStateException(paramLifecycleOwner.toString().toString());
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.SavedStateHandleAttacher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */