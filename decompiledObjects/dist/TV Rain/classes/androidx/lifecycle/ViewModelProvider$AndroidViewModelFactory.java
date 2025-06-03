package androidx.lifecycle;

import android.app.Application;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras.Key;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\0002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\b\026\030\000 \0242\0020\001:\001\024B\007\b\026¢\006\002\020\002B\017\b\026\022\006\020\003\032\0020\004¢\006\002\020\005B\031\b\002\022\b\020\003\032\004\030\0010\004\022\006\020\006\032\0020\007¢\006\002\020\bJ%\020\t\032\002H\n\"\b\b\000\020\n*\0020\0132\f\020\f\032\b\022\004\022\002H\n0\rH\026¢\006\002\020\016J-\020\t\032\002H\n\"\b\b\000\020\n*\0020\0132\f\020\f\032\b\022\004\022\002H\n0\r2\006\020\017\032\0020\004H\002¢\006\002\020\020J-\020\t\032\002H\n\"\b\b\000\020\n*\0020\0132\f\020\f\032\b\022\004\022\002H\n0\r2\006\020\021\032\0020\022H\026¢\006\002\020\023R\020\020\003\032\004\030\0010\004X\004¢\006\002\n\000¨\006\025"}, d2={"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "()V", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "unused", "", "(Landroid/app/Application;I)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app", "(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/ViewModel;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Companion", "lifecycle-viewmodel_release"}, k=1, mv={1, 6, 0}, xi=48)
public class ViewModelProvider$AndroidViewModelFactory
  extends ViewModelProvider.NewInstanceFactory
{
  @JvmField
  @NotNull
  public static final CreationExtras.Key<Application> APPLICATION_KEY = ViewModelProvider.AndroidViewModelFactory.Companion.ApplicationKeyImpl.INSTANCE;
  @NotNull
  public static final Companion Companion = new Companion(null);
  @NotNull
  public static final String DEFAULT_KEY = "androidx.lifecycle.ViewModelProvider.DefaultKey";
  @Nullable
  private static AndroidViewModelFactory sInstance;
  @Nullable
  private final Application application;
  
  public ViewModelProvider$AndroidViewModelFactory()
  {
    this(null, 0);
  }
  
  public ViewModelProvider$AndroidViewModelFactory(@NotNull Application paramApplication)
  {
    this(paramApplication, 0);
  }
  
  private ViewModelProvider$AndroidViewModelFactory(Application paramApplication, int paramInt)
  {
    application = paramApplication;
  }
  
  private final <T extends ViewModel> T create(Class<T> paramClass, Application paramApplication)
  {
    if (AndroidViewModel.class.isAssignableFrom(paramClass)) {
      try
      {
        paramApplication = (ViewModel)paramClass.getConstructor(new Class[] { Application.class }).newInstance(new Object[] { paramApplication });
        Intrinsics.checkNotNullExpressionValue(paramApplication, "{\n                try {\n…          }\n            }");
        paramClass = paramApplication;
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        paramApplication = new StringBuilder();
        paramApplication.append("Cannot create an instance of ");
        paramApplication.append(paramClass);
        throw new RuntimeException(paramApplication.toString(), localInvocationTargetException);
      }
      catch (InstantiationException localInstantiationException)
      {
        paramApplication = new StringBuilder();
        paramApplication.append("Cannot create an instance of ");
        paramApplication.append(paramClass);
        throw new RuntimeException(paramApplication.toString(), localInstantiationException);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        paramApplication = new StringBuilder();
        paramApplication.append("Cannot create an instance of ");
        paramApplication.append(paramClass);
        throw new RuntimeException(paramApplication.toString(), localIllegalAccessException);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        paramApplication = new StringBuilder();
        paramApplication.append("Cannot create an instance of ");
        paramApplication.append(paramClass);
        throw new RuntimeException(paramApplication.toString(), localNoSuchMethodException);
      }
    } else {
      paramClass = super.create(paramClass);
    }
    return paramClass;
  }
  
  @JvmStatic
  @NotNull
  public static final AndroidViewModelFactory getInstance(@NotNull Application paramApplication)
  {
    return Companion.getInstance(paramApplication);
  }
  
  @NotNull
  public <T extends ViewModel> T create(@NotNull Class<T> paramClass)
  {
    Intrinsics.checkNotNullParameter(paramClass, "modelClass");
    Application localApplication = application;
    if (localApplication != null) {
      return create(paramClass, localApplication);
    }
    throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
  }
  
  @NotNull
  public <T extends ViewModel> T create(@NotNull Class<T> paramClass, @NotNull CreationExtras paramCreationExtras)
  {
    Intrinsics.checkNotNullParameter(paramClass, "modelClass");
    Intrinsics.checkNotNullParameter(paramCreationExtras, "extras");
    if (application != null)
    {
      paramClass = create(paramClass);
    }
    else
    {
      paramCreationExtras = (Application)paramCreationExtras.get(APPLICATION_KEY);
      if (paramCreationExtras != null)
      {
        paramClass = create(paramClass, paramCreationExtras);
      }
      else
      {
        if (AndroidViewModel.class.isAssignableFrom(paramClass)) {
          break label70;
        }
        paramClass = super.create(paramClass);
      }
    }
    return paramClass;
    label70:
    throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
  }
  
  @Metadata(d1={"\0000\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001:\001\021B\007\b\002¢\006\002\020\002J\025\020\n\032\0020\0132\006\020\f\032\0020\rH\000¢\006\002\b\016J\020\020\017\032\0020\t2\006\020\020\032\0020\005H\007R\026\020\003\032\b\022\004\022\0020\0050\0048\006X\004¢\006\002\n\000R\016\020\006\032\0020\007XT¢\006\002\n\000R\020\020\b\032\004\030\0010\tX\016¢\006\002\n\000¨\006\022"}, d2={"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion;", "", "()V", "APPLICATION_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/app/Application;", "DEFAULT_KEY", "", "sInstance", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "defaultFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "defaultFactory$lifecycle_viewmodel_release", "getInstance", "application", "ApplicationKeyImpl", "lifecycle-viewmodel_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static final class Companion
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
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */