package androidx.lifecycle;

import androidx.annotation.NonNull;

@Deprecated
class ReflectiveGenericLifecycleObserver
  implements LifecycleEventObserver
{
  private final ClassesInfoCache.CallbackInfo mInfo;
  private final Object mWrapped;
  
  public ReflectiveGenericLifecycleObserver(Object paramObject)
  {
    mWrapped = paramObject;
    mInfo = ClassesInfoCache.sInstance.getInfo(paramObject.getClass());
  }
  
  public void onStateChanged(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.Event paramEvent)
  {
    mInfo.invokeCallbacks(paramLifecycleOwner, paramEvent, mWrapped);
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ReflectiveGenericLifecycleObserver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */