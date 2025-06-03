package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistry.AutoRecreated;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.Iterator;
import java.util.Set;

class LegacySavedStateHandleController
{
  public static final String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";
  
  public static void attachHandleIfNeeded(ViewModel paramViewModel, SavedStateRegistry paramSavedStateRegistry, Lifecycle paramLifecycle)
  {
    paramViewModel = (SavedStateHandleController)paramViewModel.getTag("androidx.lifecycle.savedstate.vm.tag");
    if ((paramViewModel != null) && (!paramViewModel.isAttached()))
    {
      paramViewModel.attachToLifecycle(paramSavedStateRegistry, paramLifecycle);
      tryToAddRecreator(paramSavedStateRegistry, paramLifecycle);
    }
  }
  
  public static SavedStateHandleController create(SavedStateRegistry paramSavedStateRegistry, Lifecycle paramLifecycle, String paramString, Bundle paramBundle)
  {
    paramString = new SavedStateHandleController(paramString, SavedStateHandle.createHandle(paramSavedStateRegistry.consumeRestoredStateForKey(paramString), paramBundle));
    paramString.attachToLifecycle(paramSavedStateRegistry, paramLifecycle);
    tryToAddRecreator(paramSavedStateRegistry, paramLifecycle);
    return paramString;
  }
  
  private static void tryToAddRecreator(final SavedStateRegistry paramSavedStateRegistry, Lifecycle paramLifecycle)
  {
    Lifecycle.State localState = paramLifecycle.getCurrentState();
    if ((localState != Lifecycle.State.INITIALIZED) && (!localState.isAtLeast(Lifecycle.State.STARTED))) {
      paramLifecycle.addObserver(new LifecycleEventObserver()
      {
        public void onStateChanged(@NonNull LifecycleOwner paramAnonymousLifecycleOwner, @NonNull Lifecycle.Event paramAnonymousEvent)
        {
          if (paramAnonymousEvent == Lifecycle.Event.ON_START)
          {
            removeObserver(this);
            paramSavedStateRegistry.runOnNextRecreation(LegacySavedStateHandleController.OnRecreation.class);
          }
        }
      });
    } else {
      paramSavedStateRegistry.runOnNextRecreation(OnRecreation.class);
    }
  }
  
  public static final class OnRecreation
    implements SavedStateRegistry.AutoRecreated
  {
    public void onRecreated(@NonNull SavedStateRegistryOwner paramSavedStateRegistryOwner)
    {
      if ((paramSavedStateRegistryOwner instanceof ViewModelStoreOwner))
      {
        ViewModelStore localViewModelStore = ((ViewModelStoreOwner)paramSavedStateRegistryOwner).getViewModelStore();
        SavedStateRegistry localSavedStateRegistry = paramSavedStateRegistryOwner.getSavedStateRegistry();
        Iterator localIterator = localViewModelStore.keys().iterator();
        while (localIterator.hasNext()) {
          LegacySavedStateHandleController.attachHandleIfNeeded(localViewModelStore.get((String)localIterator.next()), localSavedStateRegistry, paramSavedStateRegistryOwner.getLifecycle());
        }
        if (!localViewModelStore.keys().isEmpty()) {
          localSavedStateRegistry.runOnNextRecreation(OnRecreation.class);
        }
        return;
      }
      throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.LegacySavedStateHandleController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */