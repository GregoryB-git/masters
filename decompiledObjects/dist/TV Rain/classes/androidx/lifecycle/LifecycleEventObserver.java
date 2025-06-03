package androidx.lifecycle;

import androidx.annotation.NonNull;

public abstract interface LifecycleEventObserver
  extends LifecycleObserver
{
  public abstract void onStateChanged(@NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.Event paramEvent);
}

/* Location:
 * Qualified Name:     androidx.lifecycle.LifecycleEventObserver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */