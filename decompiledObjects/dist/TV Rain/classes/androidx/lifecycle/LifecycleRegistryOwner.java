package androidx.lifecycle;

import androidx.annotation.NonNull;

@Deprecated
public abstract interface LifecycleRegistryOwner
  extends LifecycleOwner
{
  @NonNull
  public abstract LifecycleRegistry getLifecycle();
}

/* Location:
 * Qualified Name:     androidx.lifecycle.LifecycleRegistryOwner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */