package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras.Key;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000>\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\006\b\026\030\0002\0020\001:\004\026\027\030\031B\017\b\026\022\006\020\002\032\0020\003¢\006\002\020\004B\027\b\026\022\006\020\002\032\0020\003\022\006\020\005\032\0020\006¢\006\002\020\007B!\b\007\022\006\020\b\032\0020\t\022\006\020\005\032\0020\006\022\b\b\002\020\n\032\0020\013¢\006\002\020\fJ&\020\r\032\002H\016\"\b\b\000\020\016*\0020\0172\f\020\020\032\b\022\004\022\002H\0160\021H\002¢\006\002\020\022J.\020\r\032\002H\016\"\b\b\000\020\016*\0020\0172\006\020\023\032\0020\0242\f\020\020\032\b\022\004\022\002H\0160\021H\002¢\006\002\020\025R\016\020\n\032\0020\013X\004¢\006\002\n\000R\016\020\005\032\0020\006X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000¨\006\032"}, d2={"Landroidx/lifecycle/ViewModelProvider;", "", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "(Landroidx/lifecycle/ViewModelStoreOwner;)V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V", "store", "Landroidx/lifecycle/ViewModelStore;", "defaultCreationExtras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Landroidx/lifecycle/ViewModelStore;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "get", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "key", "", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "AndroidViewModelFactory", "Factory", "NewInstanceFactory", "OnRequeryFactory", "lifecycle-viewmodel_release"}, k=1, mv={1, 6, 0}, xi=48)
public class ViewModelProvider
{
  @NotNull
  private final CreationExtras defaultCreationExtras;
  @NotNull
  private final Factory factory;
  @NotNull
  private final ViewModelStore store;
  
  @JvmOverloads
  public ViewModelProvider(@NotNull ViewModelStore paramViewModelStore, @NotNull Factory paramFactory)
  {
    this(paramViewModelStore, paramFactory, null, 4, null);
  }
  
  @JvmOverloads
  public ViewModelProvider(@NotNull ViewModelStore paramViewModelStore, @NotNull Factory paramFactory, @NotNull CreationExtras paramCreationExtras)
  {
    store = paramViewModelStore;
    factory = paramFactory;
    defaultCreationExtras = paramCreationExtras;
  }
  
  public ViewModelProvider(@NotNull ViewModelStoreOwner paramViewModelStoreOwner)
  {
    this(localViewModelStore, AndroidViewModelFactory.Companion.defaultFactory$lifecycle_viewmodel_release(paramViewModelStoreOwner), ViewModelProviderGetKt.defaultCreationExtras(paramViewModelStoreOwner));
  }
  
  public ViewModelProvider(@NotNull ViewModelStoreOwner paramViewModelStoreOwner, @NotNull Factory paramFactory)
  {
    this(localViewModelStore, paramFactory, ViewModelProviderGetKt.defaultCreationExtras(paramViewModelStoreOwner));
  }
  
  @MainThread
  @NotNull
  public <T extends ViewModel> T get(@NotNull Class<T> paramClass)
  {
    Intrinsics.checkNotNullParameter(paramClass, "modelClass");
    String str = paramClass.getCanonicalName();
    if (str != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
      localStringBuilder.append(str);
      return get(localStringBuilder.toString(), paramClass);
    }
    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
  }
  
  @MainThread
  @NotNull
  public <T extends ViewModel> T get(@NotNull String paramString, @NotNull Class<T> paramClass)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    Intrinsics.checkNotNullParameter(paramClass, "modelClass");
    Object localObject = store.get(paramString);
    if (paramClass.isInstance(localObject))
    {
      paramString = factory;
      if ((paramString instanceof OnRequeryFactory)) {
        paramString = (OnRequeryFactory)paramString;
      } else {
        paramString = null;
      }
      if (paramString != null)
      {
        Intrinsics.checkNotNullExpressionValue(localObject, "viewModel");
        paramString.onRequery((ViewModel)localObject);
      }
      if (localObject != null) {
        return (T)localObject;
      }
      throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
    }
    localObject = new MutableCreationExtras(defaultCreationExtras);
    ((MutableCreationExtras)localObject).set(NewInstanceFactory.VIEW_MODEL_KEY, paramString);
    try
    {
      localObject = factory.create(paramClass, (CreationExtras)localObject);
      paramClass = (Class<T>)localObject;
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      paramClass = factory.create(paramClass);
    }
    store.put(paramString, paramClass);
    return paramClass;
  }
  
  @Metadata(d1={"\0002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\b\026\030\000 \0242\0020\001:\001\024B\007\b\026¢\006\002\020\002B\017\b\026\022\006\020\003\032\0020\004¢\006\002\020\005B\031\b\002\022\b\020\003\032\004\030\0010\004\022\006\020\006\032\0020\007¢\006\002\020\bJ%\020\t\032\002H\n\"\b\b\000\020\n*\0020\0132\f\020\f\032\b\022\004\022\002H\n0\rH\026¢\006\002\020\016J-\020\t\032\002H\n\"\b\b\000\020\n*\0020\0132\f\020\f\032\b\022\004\022\002H\n0\r2\006\020\017\032\0020\004H\002¢\006\002\020\020J-\020\t\032\002H\n\"\b\b\000\020\n*\0020\0132\f\020\f\032\b\022\004\022\002H\n0\r2\006\020\021\032\0020\022H\026¢\006\002\020\023R\020\020\003\032\004\030\0010\004X\004¢\006\002\n\000¨\006\025"}, d2={"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "()V", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "unused", "", "(Landroid/app/Application;I)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app", "(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/ViewModel;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Companion", "lifecycle-viewmodel_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static class AndroidViewModelFactory
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
    
    public AndroidViewModelFactory()
    {
      this(null, 0);
    }
    
    public AndroidViewModelFactory(@NotNull Application paramApplication)
    {
      this(paramApplication, 0);
    }
    
    private AndroidViewModelFactory(Application paramApplication, int paramInt)
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
  
  @Metadata(d1={"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bf\030\000 \0132\0020\001:\001\013J%\020\002\032\002H\003\"\b\b\000\020\003*\0020\0042\f\020\005\032\b\022\004\022\002H\0030\006H\026¢\006\002\020\007J-\020\002\032\002H\003\"\b\b\000\020\003*\0020\0042\f\020\005\032\b\022\004\022\002H\0030\0062\006\020\b\032\0020\tH\026¢\006\002\020\nø\001\000\002\006\n\004\b!0\001¨\006\fÀ\006\001"}, d2={"Landroidx/lifecycle/ViewModelProvider$Factory;", "", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Companion", "lifecycle-viewmodel_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static abstract interface Factory
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
  
  @Metadata(d1={"\000\032\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\026\030\000 \t2\0020\001:\001\tB\005¢\006\002\020\002J%\020\003\032\002H\004\"\b\b\000\020\004*\0020\0052\f\020\006\032\b\022\004\022\002H\0040\007H\026¢\006\002\020\b¨\006\n"}, d2={"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Companion", "lifecycle-viewmodel_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static class NewInstanceFactory
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
  
  @Metadata(d1={"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\b\027\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026¨\006\007"}, d2={"Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "", "()V", "onRequery", "", "viewModel", "Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, k=1, mv={1, 6, 0}, xi=48)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static class OnRequeryFactory
  {
    public void onRequery(@NotNull ViewModel paramViewModel)
    {
      Intrinsics.checkNotNullParameter(paramViewModel, "viewModel");
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ViewModelProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */