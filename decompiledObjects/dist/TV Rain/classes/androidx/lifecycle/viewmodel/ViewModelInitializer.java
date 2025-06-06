package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000&\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\006\030\000*\b\b\000\020\001*\0020\0022\0020\003B,\022\f\020\004\032\b\022\004\022\0028\0000\005\022\027\020\006\032\023\022\004\022\0020\b\022\004\022\0028\0000\007¢\006\002\b\t¢\006\002\020\nR\032\020\004\032\b\022\004\022\0028\0000\005X\004¢\006\b\n\000\032\004\b\013\020\fR%\020\006\032\023\022\004\022\0020\b\022\004\022\0028\0000\007¢\006\002\b\tX\004¢\006\b\n\000\032\004\b\r\020\016¨\006\017"}, d2={"Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "T", "Landroidx/lifecycle/ViewModel;", "", "clazz", "Ljava/lang/Class;", "initializer", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)V", "getClazz$lifecycle_viewmodel_release", "()Ljava/lang/Class;", "getInitializer$lifecycle_viewmodel_release", "()Lkotlin/jvm/functions/Function1;", "lifecycle-viewmodel_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class ViewModelInitializer<T extends ViewModel>
{
  @NotNull
  private final Class<T> clazz;
  @NotNull
  private final Function1<CreationExtras, T> initializer;
  
  public ViewModelInitializer(@NotNull Class<T> paramClass, @NotNull Function1<? super CreationExtras, ? extends T> paramFunction1)
  {
    clazz = paramClass;
    initializer = paramFunction1;
  }
  
  @NotNull
  public final Class<T> getClazz$lifecycle_viewmodel_release()
  {
    return clazz;
  }
  
  @NotNull
  public final Function1<CreationExtras, T> getInitializer$lifecycle_viewmodel_release()
  {
    return initializer;
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.viewmodel.ViewModelInitializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */