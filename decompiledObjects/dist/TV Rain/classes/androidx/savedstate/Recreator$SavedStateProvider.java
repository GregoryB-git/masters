package androidx.savedstate;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020#\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\b\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\016\020\b\032\0020\t2\006\020\n\032\0020\007J\b\020\013\032\0020\fH\026R\024\020\005\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000¨\006\r"}, d2={"Landroidx/savedstate/Recreator$SavedStateProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "registry", "Landroidx/savedstate/SavedStateRegistry;", "(Landroidx/savedstate/SavedStateRegistry;)V", "classes", "", "", "add", "", "className", "saveState", "Landroid/os/Bundle;", "savedstate_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class Recreator$SavedStateProvider
  implements SavedStateRegistry.SavedStateProvider
{
  @NotNull
  private final Set<String> classes = new LinkedHashSet();
  
  public Recreator$SavedStateProvider(@NotNull SavedStateRegistry paramSavedStateRegistry)
  {
    paramSavedStateRegistry.registerSavedStateProvider("androidx.savedstate.Restarter", this);
  }
  
  public final void add(@NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "className");
    classes.add(paramString);
  }
  
  @NotNull
  public Bundle saveState()
  {
    Bundle localBundle = new Bundle();
    localBundle.putStringArrayList("classes_to_restore", new ArrayList(classes));
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     androidx.savedstate.Recreator.SavedStateProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */