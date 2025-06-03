package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistry.AutoRecreated;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.Iterator;
import java.util.Set;

final class LegacySavedStateHandleController$OnRecreation
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

/* Location:
 * Qualified Name:     androidx.lifecycle.LegacySavedStateHandleController.OnRecreation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */