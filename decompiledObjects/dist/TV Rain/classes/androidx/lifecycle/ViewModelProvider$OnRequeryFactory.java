package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\b\027\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026¨\006\007"}, d2={"Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "", "()V", "onRequery", "", "viewModel", "Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, k=1, mv={1, 6, 0}, xi=48)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class ViewModelProvider$OnRequeryFactory
{
  public void onRequery(@NotNull ViewModel paramViewModel)
  {
    Intrinsics.checkNotNullParameter(paramViewModel, "viewModel");
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ViewModelProvider.OnRequeryFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */