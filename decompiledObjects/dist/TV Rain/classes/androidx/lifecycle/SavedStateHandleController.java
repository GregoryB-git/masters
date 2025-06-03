package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.savedstate.SavedStateRegistry;

final class SavedStateHandleController
  implements LifecycleEventObserver
{
  private final SavedStateHandle mHandle;
  private boolean mIsAttached = false;
  private final String mKey;
  
  public SavedStateHandleController(String paramString, SavedStateHandle paramSavedStateHandle)
  {
    mKey = paramString;
    mHandle = paramSavedStateHandle;
  }
  
  public void attachToLifecycle(SavedStateRegistry paramSavedStateRegistry, Lifecycle paramLifecycle)
  {
    if (!mIsAttached)
    {
      mIsAttached = true;
      paramLifecycle.addObserver(this);
      paramSavedStateRegistry.registerSavedStateProvider(mKey, mHandle.savedStateProvider());
      return;
    }
    throw new IllegalStateException("Already attached to lifecycleOwner");
  }
  
  public SavedStateHandle getHandle()
  {
    return mHandle;
  }
  
  public boolean isAttached()
  {
    return mIsAttached;
  }
  
  public void onStateChanged(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.Event paramEvent)
  {
    if (paramEvent == Lifecycle.Event.ON_DESTROY)
    {
      mIsAttached = false;
      paramLifecycleOwner.getLifecycle().removeObserver(this);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.SavedStateHandleController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */