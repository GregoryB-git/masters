package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bf\030\000 \0132\0020\001:\001\013J%\020\002\032\002H\003\"\b\b\000\020\003*\0020\0042\f\020\005\032\b\022\004\022\002H\0030\006H\026¢\006\002\020\007J-\020\002\032\002H\003\"\b\b\000\020\003*\0020\0042\f\020\005\032\b\022\004\022\002H\0030\0062\006\020\b\032\0020\tH\026¢\006\002\020\nø\001\000\002\006\n\004\b!0\001¨\006\fÀ\006\001"}, d2={"Landroidx/lifecycle/ViewModelProvider$Factory;", "", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Companion", "lifecycle-viewmodel_release"}, k=1, mv={1, 6, 0}, xi=48)
public abstract interface ViewModelProvider$Factory
{
  @NotNull
  public static final Companion Companion = Companion.$$INSTANCE;
  
  @JvmStatic
  @NotNull
  public static Factory from(@NotNull ViewModelInitializer<?>... paramVarArgs)
  {
    return Companion.from(paramVarArgs);
  }
  
  @NotNull
  public <T extends ViewModel> T create(@NotNull Class<T> paramClass)
  {
    Intrinsics.checkNotNullParameter(paramClass, "modelClass");
    throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
  }
  
  @NotNull
  public <T extends ViewModel> T create(@NotNull Class<T> paramClass, @NotNull CreationExtras paramCreationExtras)
  {
    Intrinsics.checkNotNullParameter(paramClass, "modelClass");
    Intrinsics.checkNotNullParameter(paramCreationExtras, "extras");
    return create(paramClass);
  }
  
  @Metadata(d1={"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J)\020\003\032\0020\0042\032\020\005\032\016\022\n\b\001\022\006\022\002\b\0030\0070\006\"\006\022\002\b\0030\007H\007¢\006\002\020\b¨\006\t"}, d2={"Landroidx/lifecycle/ViewModelProvider$Factory$Companion;", "", "()V", "from", "Landroidx/lifecycle/ViewModelProvider$Factory;", "initializers", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "([Landroidx/lifecycle/viewmodel/ViewModelInitializer;)Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static final class Companion
  {
    @JvmStatic
    @NotNull
    public final ViewModelProvider.Factory from(@NotNull ViewModelInitializer<?>... paramVarArgs)
    {
      Intrinsics.checkNotNullParameter(paramVarArgs, "initializers");
      return new InitializerViewModelFactory((ViewModelInitializer[])Arrays.copyOf(paramVarArgs, paramVarArgs.length));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ViewModelProvider.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */