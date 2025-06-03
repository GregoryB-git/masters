package androidx.activity;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;

public abstract interface OnBackPressedDispatcherOwner
  extends LifecycleOwner
{
  @NonNull
  public abstract OnBackPressedDispatcher getOnBackPressedDispatcher();
}

/* Location:
 * Qualified Name:     androidx.activity.OnBackPressedDispatcherOwner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */