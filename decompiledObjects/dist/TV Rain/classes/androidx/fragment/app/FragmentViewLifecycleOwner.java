package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;

class FragmentViewLifecycleOwner
  implements HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ViewModelStoreOwner
{
  private ViewModelProvider.Factory mDefaultFactory;
  private final Fragment mFragment;
  private LifecycleRegistry mLifecycleRegistry = null;
  private SavedStateRegistryController mSavedStateRegistryController = null;
  private final ViewModelStore mViewModelStore;
  
  public FragmentViewLifecycleOwner(@NonNull Fragment paramFragment, @NonNull ViewModelStore paramViewModelStore)
  {
    mFragment = paramFragment;
    mViewModelStore = paramViewModelStore;
  }
  
  @NonNull
  public ViewModelProvider.Factory getDefaultViewModelProviderFactory()
  {
    Object localObject1 = mFragment.getDefaultViewModelProviderFactory();
    if (!localObject1.equals(mFragment.mDefaultFactory))
    {
      mDefaultFactory = ((ViewModelProvider.Factory)localObject1);
      return (ViewModelProvider.Factory)localObject1;
    }
    if (mDefaultFactory == null)
    {
      Object localObject2 = null;
      Object localObject3;
      for (localObject1 = mFragment.requireContext().getApplicationContext();; localObject1 = ((ContextWrapper)localObject1).getBaseContext())
      {
        localObject3 = localObject2;
        if (!(localObject1 instanceof ContextWrapper)) {
          break;
        }
        if ((localObject1 instanceof Application))
        {
          localObject3 = (Application)localObject1;
          break;
        }
      }
      mDefaultFactory = new SavedStateViewModelFactory((Application)localObject3, this, mFragment.getArguments());
    }
    return mDefaultFactory;
  }
  
  @NonNull
  public Lifecycle getLifecycle()
  {
    initialize();
    return mLifecycleRegistry;
  }
  
  @NonNull
  public SavedStateRegistry getSavedStateRegistry()
  {
    initialize();
    return mSavedStateRegistryController.getSavedStateRegistry();
  }
  
  @NonNull
  public ViewModelStore getViewModelStore()
  {
    initialize();
    return mViewModelStore;
  }
  
  public void handleLifecycleEvent(@NonNull Lifecycle.Event paramEvent)
  {
    mLifecycleRegistry.handleLifecycleEvent(paramEvent);
  }
  
  public void initialize()
  {
    if (mLifecycleRegistry == null)
    {
      mLifecycleRegistry = new LifecycleRegistry(this);
      mSavedStateRegistryController = SavedStateRegistryController.create(this);
    }
  }
  
  public boolean isInitialized()
  {
    boolean bool;
    if (mLifecycleRegistry != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void performRestore(@Nullable Bundle paramBundle)
  {
    mSavedStateRegistryController.performRestore(paramBundle);
  }
  
  public void performSave(@NonNull Bundle paramBundle)
  {
    mSavedStateRegistryController.performSave(paramBundle);
  }
  
  public void setCurrentState(@NonNull Lifecycle.State paramState)
  {
    mLifecycleRegistry.setCurrentState(paramState);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentViewLifecycleOwner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */