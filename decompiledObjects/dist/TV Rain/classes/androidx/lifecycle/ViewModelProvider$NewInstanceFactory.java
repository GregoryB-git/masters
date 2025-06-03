package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.CreationExtras.Key;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000\032\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\026\030\000 \t2\0020\001:\001\tB\005¢\006\002\020\002J%\020\003\032\002H\004\"\b\b\000\020\004*\0020\0052\f\020\006\032\b\022\004\022\002H\0040\007H\026¢\006\002\020\b¨\006\n"}, d2={"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Companion", "lifecycle-viewmodel_release"}, k=1, mv={1, 6, 0}, xi=48)
public class ViewModelProvider$NewInstanceFactory
  implements ViewModelProvider.Factory
{
  @NotNull
  public static final Companion Companion = new Companion(null);
  @JvmField
  @NotNull
  public static final CreationExtras.Key<String> VIEW_MODEL_KEY = ViewModelProvider.NewInstanceFactory.Companion.ViewModelKeyImpl.INSTANCE;
  @Nullable
  private static NewInstanceFactory sInstance;
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  @NotNull
  public static final NewInstanceFactory getInstance()
  {
    return Companion.getInstance();
  }
  
  @NotNull
  public <T extends ViewModel> T create(@NotNull Class<T> paramClass)
  {
    Intrinsics.checkNotNullParameter(paramClass, "modelClass");
    try
    {
      Object localObject = paramClass.newInstance();
      Intrinsics.checkNotNullExpressionValue(localObject, "{\n                modelC…wInstance()\n            }");
      localObject = (ViewModel)localObject;
      return (T)localObject;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      StringBuilder localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("Cannot create an instance of ");
      localStringBuilder2.append(paramClass);
      throw new RuntimeException(localStringBuilder2.toString(), localIllegalAccessException);
    }
    catch (InstantiationException localInstantiationException)
    {
      StringBuilder localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append("Cannot create an instance of ");
      localStringBuilder1.append(paramClass);
      throw new RuntimeException(localStringBuilder1.toString(), localInstantiationException);
    }
  }
  
  @Metadata(d1={"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\020\016\n\000\n\002\030\002\n\002\b\006\b\003\030\0002\0020\001:\001\fB\007\b\002¢\006\002\020\002R\026\020\003\032\b\022\004\022\0020\0050\0048\006X\004¢\006\002\n\000R\032\020\006\032\0020\0078GX\004¢\006\f\022\004\b\b\020\002\032\004\b\t\020\nR\020\020\013\032\004\030\0010\007X\016¢\006\002\n\000¨\006\r"}, d2={"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory$Companion;", "", "()V", "VIEW_MODEL_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "instance", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "getInstance$annotations", "getInstance", "()Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "sInstance", "ViewModelKeyImpl", "lifecycle-viewmodel_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static final class Companion
  {
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final ViewModelProvider.NewInstanceFactory getInstance()
    {
      if (ViewModelProvider.NewInstanceFactory.access$getSInstance$cp() == null) {
        ViewModelProvider.NewInstanceFactory.access$setSInstance$cp(new ViewModelProvider.NewInstanceFactory());
      }
      ViewModelProvider.NewInstanceFactory localNewInstanceFactory = ViewModelProvider.NewInstanceFactory.access$getSInstance$cp();
      Intrinsics.checkNotNull(localNewInstanceFactory);
      return localNewInstanceFactory;
    }
    
    @Metadata(d1={"\000\020\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\002\bÂ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2={"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory$Companion$ViewModelKeyImpl;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "()V", "lifecycle-viewmodel_release"}, k=1, mv={1, 6, 0}, xi=48)
    public static final class ViewModelKeyImpl
      implements CreationExtras.Key<String>
    {
      @NotNull
      public static final ViewModelKeyImpl INSTANCE = new ViewModelKeyImpl();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ViewModelProvider.NewInstanceFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */