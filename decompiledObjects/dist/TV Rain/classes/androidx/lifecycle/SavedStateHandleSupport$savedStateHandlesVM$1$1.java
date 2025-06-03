package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2={"<anonymous>", "Landroidx/lifecycle/SavedStateHandlesVM;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke"}, k=3, mv={1, 6, 0}, xi=48)
final class SavedStateHandleSupport$savedStateHandlesVM$1$1
  extends Lambda
  implements Function1<CreationExtras, SavedStateHandlesVM>
{
  public static final 1 INSTANCE = new 1();
  
  public SavedStateHandleSupport$savedStateHandlesVM$1$1()
  {
    super(1);
  }
  
  @NotNull
  public final SavedStateHandlesVM invoke(@NotNull CreationExtras paramCreationExtras)
  {
    Intrinsics.checkNotNullParameter(paramCreationExtras, "$this$initializer");
    return new SavedStateHandlesVM();
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.SavedStateHandleSupport.savedStateHandlesVM.1.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */