package androidx.lifecycle;

import android.app.Application;
import androidx.lifecycle.viewmodel.CreationExtras.Key;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\0000\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001:\001\021B\007\b\002¢\006\002\020\002J\025\020\n\032\0020\0132\006\020\f\032\0020\rH\000¢\006\002\b\016J\020\020\017\032\0020\t2\006\020\020\032\0020\005H\007R\026\020\003\032\b\022\004\022\0020\0050\0048\006X\004¢\006\002\n\000R\016\020\006\032\0020\007XT¢\006\002\n\000R\020\020\b\032\004\030\0010\tX\016¢\006\002\n\000¨\006\022"}, d2={"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion;", "", "()V", "APPLICATION_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/app/Application;", "DEFAULT_KEY", "", "sInstance", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "defaultFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "defaultFactory$lifecycle_viewmodel_release", "getInstance", "application", "ApplicationKeyImpl", "lifecycle-viewmodel_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class ViewModelProvider$AndroidViewModelFactory$Companion
{
  @NotNull
  public final ViewModelProvider.Factory defaultFactory$lifecycle_viewmodel_release(@NotNull ViewModelStoreOwner paramViewModelStoreOwner)
  {
    Intrinsics.checkNotNullParameter(paramViewModelStoreOwner, "owner");
    if ((paramViewModelStoreOwner instanceof HasDefaultViewModelProviderFactory))
    {
      paramViewModelStoreOwner = ((HasDefaultViewModelProviderFactory)paramViewModelStoreOwner).getDefaultViewModelProviderFactory();
      Intrinsics.checkNotNullExpressionValue(paramViewModelStoreOwner, "owner.defaultViewModelProviderFactory");
    }
    else
    {
      paramViewModelStoreOwner = ViewModelProvider.NewInstanceFactory.Companion.getInstance();
    }
    return paramViewModelStoreOwner;
  }
  
  @JvmStatic
  @NotNull
  public final ViewModelProvider.AndroidViewModelFactory getInstance(@NotNull Application paramApplication)
  {
    Intrinsics.checkNotNullParameter(paramApplication, "application");
    if (ViewModelProvider.AndroidViewModelFactory.access$getSInstance$cp() == null) {
      ViewModelProvider.AndroidViewModelFactory.access$setSInstance$cp(new ViewModelProvider.AndroidViewModelFactory(paramApplication));
    }
    paramApplication = ViewModelProvider.AndroidViewModelFactory.access$getSInstance$cp();
    Intrinsics.checkNotNull(paramApplication);
    return paramApplication;
  }
  
  @Metadata(d1={"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bÂ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2={"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion$ApplicationKeyImpl;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/app/Application;", "()V", "lifecycle-viewmodel_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static final class ApplicationKeyImpl
    implements CreationExtras.Key<Application>
  {
    @NotNull
    public static final ApplicationKeyImpl INSTANCE = new ApplicationKeyImpl();
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */