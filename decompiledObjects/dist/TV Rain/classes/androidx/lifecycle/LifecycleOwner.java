package androidx.lifecycle;

import androidx.annotation.NonNull;

public abstract interface LifecycleOwner
{
  @NonNull
  public abstract Lifecycle getLifecycle();
}

/* Location:
 * Qualified Name:     androidx.lifecycle.LifecycleOwner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */