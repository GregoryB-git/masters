package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000Z\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\020\002\n\002\b\002\030\0002\0020\0012\0020\002B\007\b\026¢\006\002\020\003B\031\b\026\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\007¢\006\002\020\bB#\b\027\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\007\022\b\020\t\032\004\030\0010\n¢\006\002\020\013J%\020\021\032\002H\022\"\b\b\000\020\022*\0020\0232\f\020\024\032\b\022\004\022\002H\0220\025H\026¢\006\002\020\026J-\020\021\032\002H\022\"\b\b\000\020\022*\0020\0232\f\020\024\032\b\022\004\022\002H\0220\0252\006\020\027\032\0020\030H\026¢\006\002\020\031J+\020\021\032\002H\022\"\b\b\000\020\022*\0020\0232\006\020\032\032\0020\0332\f\020\024\032\b\022\004\022\002H\0220\025¢\006\002\020\034J\020\020\035\032\0020\0362\006\020\037\032\0020\023H\027R\020\020\004\032\004\030\0010\005X\016¢\006\002\n\000R\020\020\t\032\004\030\0010\nX\016¢\006\002\n\000R\016\020\f\032\0020\002X\004¢\006\002\n\000R\020\020\r\032\004\030\0010\016X\016¢\006\002\n\000R\020\020\017\032\004\030\0010\020X\016¢\006\002\n\000¨\006 "}, d2={"Landroidx/lifecycle/SavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "application", "Landroid/app/Application;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroid/app/Application;Landroidx/savedstate/SavedStateRegistryOwner;)V", "defaultArgs", "Landroid/os/Bundle;", "(Landroid/app/Application;Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V", "factory", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "key", "", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "onRequery", "", "viewModel", "lifecycle-viewmodel-savedstate_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class SavedStateViewModelFactory
  extends ViewModelProvider.OnRequeryFactory
  implements ViewModelProvider.Factory
{
  @Nullable
  private Application application;
  @Nullable
  private Bundle defaultArgs;
  @NotNull
  private final ViewModelProvider.Factory factory;
  @Nullable
  private Lifecycle lifecycle;
  @Nullable
  private SavedStateRegistry savedStateRegistry;
  
  public SavedStateViewModelFactory()
  {
    factory = new ViewModelProvider.AndroidViewModelFactory();
  }
  
  public SavedStateViewModelFactory(@Nullable Application paramApplication, @NotNull SavedStateRegistryOwner paramSavedStateRegistryOwner)
  {
    this(paramApplication, paramSavedStateRegistryOwner, null);
  }
  
  @SuppressLint({"LambdaLast"})
  public SavedStateViewModelFactory(@Nullable Application paramApplication, @NotNull SavedStateRegistryOwner paramSavedStateRegistryOwner, @Nullable Bundle paramBundle)
  {
    savedStateRegistry = paramSavedStateRegistryOwner.getSavedStateRegistry();
    lifecycle = paramSavedStateRegistryOwner.getLifecycle();
    defaultArgs = paramBundle;
    application = paramApplication;
    if (paramApplication != null) {
      paramApplication = ViewModelProvider.AndroidViewModelFactory.Companion.getInstance(paramApplication);
    } else {
      paramApplication = new ViewModelProvider.AndroidViewModelFactory();
    }
    factory = paramApplication;
  }
  
  @NotNull
  public <T extends ViewModel> T create(@NotNull Class<T> paramClass)
  {
    Intrinsics.checkNotNullParameter(paramClass, "modelClass");
    String str = paramClass.getCanonicalName();
    if (str != null) {
      return create(str, paramClass);
    }
    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
  }
  
  @NotNull
  public <T extends ViewModel> T create(@NotNull Class<T> paramClass, @NotNull CreationExtras paramCreationExtras)
  {
    Intrinsics.checkNotNullParameter(paramClass, "modelClass");
    Intrinsics.checkNotNullParameter(paramCreationExtras, "extras");
    Object localObject = (String)paramCreationExtras.get(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
    if (localObject != null)
    {
      if ((paramCreationExtras.get(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY) != null) && (paramCreationExtras.get(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY) != null))
      {
        Application localApplication = (Application)paramCreationExtras.get(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY);
        boolean bool = AndroidViewModel.class.isAssignableFrom(paramClass);
        if ((bool) && (localApplication != null)) {
          localObject = SavedStateViewModelFactoryKt.findMatchingConstructor(paramClass, SavedStateViewModelFactoryKt.access$getANDROID_VIEWMODEL_SIGNATURE$p());
        } else {
          localObject = SavedStateViewModelFactoryKt.findMatchingConstructor(paramClass, SavedStateViewModelFactoryKt.access$getVIEWMODEL_SIGNATURE$p());
        }
        if (localObject == null) {
          return factory.create(paramClass, paramCreationExtras);
        }
        if ((bool) && (localApplication != null)) {
          paramClass = SavedStateViewModelFactoryKt.newInstance(paramClass, (Constructor)localObject, new Object[] { localApplication, SavedStateHandleSupport.createSavedStateHandle(paramCreationExtras) });
        } else {
          paramClass = SavedStateViewModelFactoryKt.newInstance(paramClass, (Constructor)localObject, new Object[] { SavedStateHandleSupport.createSavedStateHandle(paramCreationExtras) });
        }
      }
      else
      {
        if (lifecycle == null) {
          break label183;
        }
        paramClass = create((String)localObject, paramClass);
      }
      return paramClass;
      label183:
      throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
    }
    throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
  }
  
  @NotNull
  public final <T extends ViewModel> T create(@NotNull String paramString, @NotNull Class<T> paramClass)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    Intrinsics.checkNotNullParameter(paramClass, "modelClass");
    if (lifecycle != null)
    {
      boolean bool = AndroidViewModel.class.isAssignableFrom(paramClass);
      Constructor localConstructor;
      if ((bool) && (application != null)) {
        localConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(paramClass, SavedStateViewModelFactoryKt.access$getANDROID_VIEWMODEL_SIGNATURE$p());
      } else {
        localConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(paramClass, SavedStateViewModelFactoryKt.access$getVIEWMODEL_SIGNATURE$p());
      }
      if (localConstructor == null)
      {
        if (application != null) {
          paramString = factory.create(paramClass);
        } else {
          paramString = ViewModelProvider.NewInstanceFactory.Companion.getInstance().create(paramClass);
        }
        return paramString;
      }
      SavedStateHandleController localSavedStateHandleController = LegacySavedStateHandleController.create(savedStateRegistry, lifecycle, paramString, defaultArgs);
      if (bool)
      {
        paramString = application;
        if (paramString != null)
        {
          Intrinsics.checkNotNull(paramString);
          SavedStateHandle localSavedStateHandle = localSavedStateHandleController.getHandle();
          Intrinsics.checkNotNullExpressionValue(localSavedStateHandle, "controller.handle");
          paramString = SavedStateViewModelFactoryKt.newInstance(paramClass, localConstructor, new Object[] { paramString, localSavedStateHandle });
          break label196;
        }
      }
      paramString = localSavedStateHandleController.getHandle();
      Intrinsics.checkNotNullExpressionValue(paramString, "controller.handle");
      paramString = SavedStateViewModelFactoryKt.newInstance(paramClass, localConstructor, new Object[] { paramString });
      label196:
      paramString.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", localSavedStateHandleController);
      return paramString;
    }
    throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public void onRequery(@NotNull ViewModel paramViewModel)
  {
    Intrinsics.checkNotNullParameter(paramViewModel, "viewModel");
    Lifecycle localLifecycle = lifecycle;
    if (localLifecycle != null) {
      LegacySavedStateHandleController.attachHandleIfNeeded(paramViewModel, savedStateRegistry, localLifecycle);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.SavedStateViewModelFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */