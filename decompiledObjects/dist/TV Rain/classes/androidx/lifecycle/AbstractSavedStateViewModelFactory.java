package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;

public abstract class AbstractSavedStateViewModelFactory
  extends ViewModelProvider.OnRequeryFactory
  implements ViewModelProvider.Factory
{
  public static final String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";
  private Bundle mDefaultArgs;
  private Lifecycle mLifecycle;
  private SavedStateRegistry mSavedStateRegistry;
  
  public AbstractSavedStateViewModelFactory() {}
  
  @SuppressLint({"LambdaLast"})
  public AbstractSavedStateViewModelFactory(@NonNull SavedStateRegistryOwner paramSavedStateRegistryOwner, @Nullable Bundle paramBundle)
  {
    mSavedStateRegistry = paramSavedStateRegistryOwner.getSavedStateRegistry();
    mLifecycle = paramSavedStateRegistryOwner.getLifecycle();
    mDefaultArgs = paramBundle;
  }
  
  @NonNull
  private <T extends ViewModel> T create(@NonNull String paramString, @NonNull Class<T> paramClass)
  {
    SavedStateHandleController localSavedStateHandleController = LegacySavedStateHandleController.create(mSavedStateRegistry, mLifecycle, paramString, mDefaultArgs);
    paramString = create(paramString, paramClass, localSavedStateHandleController.getHandle());
    paramString.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", localSavedStateHandleController);
    return paramString;
  }
  
  @NonNull
  public final <T extends ViewModel> T create(@NonNull Class<T> paramClass)
  {
    String str = paramClass.getCanonicalName();
    if (str != null)
    {
      if (mLifecycle != null) {
        return create(str, paramClass);
      }
      throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
  }
  
  @NonNull
  public final <T extends ViewModel> T create(@NonNull Class<T> paramClass, @NonNull CreationExtras paramCreationExtras)
  {
    String str = (String)paramCreationExtras.get(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
    if (str != null)
    {
      if (mSavedStateRegistry != null) {
        return create(str, paramClass);
      }
      return create(str, paramClass, SavedStateHandleSupport.createSavedStateHandle(paramCreationExtras));
    }
    throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
  }
  
  @NonNull
  public abstract <T extends ViewModel> T create(@NonNull String paramString, @NonNull Class<T> paramClass, @NonNull SavedStateHandle paramSavedStateHandle);
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public void onRequery(@NonNull ViewModel paramViewModel)
  {
    SavedStateRegistry localSavedStateRegistry = mSavedStateRegistry;
    if (localSavedStateRegistry != null) {
      LegacySavedStateHandleController.attachHandleIfNeeded(paramViewModel, localSavedStateRegistry, mLifecycle);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.AbstractSavedStateViewModelFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */