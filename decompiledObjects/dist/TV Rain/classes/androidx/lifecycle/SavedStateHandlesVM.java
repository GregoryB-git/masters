package androidx.lifecycle;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\034\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020%\n\002\020\016\n\002\030\002\n\002\b\003\b\000\030\0002\0020\001B\005¢\006\002\020\002R\035\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0060\004¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2={"Landroidx/lifecycle/SavedStateHandlesVM;", "Landroidx/lifecycle/ViewModel;", "()V", "handles", "", "", "Landroidx/lifecycle/SavedStateHandle;", "getHandles", "()Ljava/util/Map;", "lifecycle-viewmodel-savedstate_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class SavedStateHandlesVM
  extends ViewModel
{
  @NotNull
  private final Map<String, SavedStateHandle> handles = new LinkedHashMap();
  
  @NotNull
  public final Map<String, SavedStateHandle> getHandles()
  {
    return handles;
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.SavedStateHandlesVM
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */