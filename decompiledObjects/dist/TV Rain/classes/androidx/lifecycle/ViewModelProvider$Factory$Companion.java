package androidx.lifecycle;

import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J)\020\003\032\0020\0042\032\020\005\032\016\022\n\b\001\022\006\022\002\b\0030\0070\006\"\006\022\002\b\0030\007H\007¢\006\002\020\b¨\006\t"}, d2={"Landroidx/lifecycle/ViewModelProvider$Factory$Companion;", "", "()V", "from", "Landroidx/lifecycle/ViewModelProvider$Factory;", "initializers", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "([Landroidx/lifecycle/viewmodel/ViewModelInitializer;)Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class ViewModelProvider$Factory$Companion
{
  @JvmStatic
  @NotNull
  public final ViewModelProvider.Factory from(@NotNull ViewModelInitializer<?>... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramVarArgs, "initializers");
    return new InitializerViewModelFactory((ViewModelInitializer[])Arrays.copyOf(paramVarArgs, paramVarArgs.length));
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ViewModelProvider.Factory.Companion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */