package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2={"<anonymous>", "Landroidx/lifecycle/SavedStateHandlesVM;", "invoke"}, k=3, mv={1, 6, 0}, xi=48)
final class SavedStateHandlesProvider$viewModel$2
  extends Lambda
  implements Function0<SavedStateHandlesVM>
{
  public SavedStateHandlesProvider$viewModel$2(ViewModelStoreOwner paramViewModelStoreOwner)
  {
    super(0);
  }
  
  @NotNull
  public final SavedStateHandlesVM invoke()
  {
    return SavedStateHandleSupport.getSavedStateHandlesVM($viewModelStoreOwner);
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.SavedStateHandlesProvider.viewModel.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */