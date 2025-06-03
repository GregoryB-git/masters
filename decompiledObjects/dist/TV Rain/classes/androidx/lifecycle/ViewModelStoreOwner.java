package androidx.lifecycle;

import androidx.annotation.NonNull;

public abstract interface ViewModelStoreOwner
{
  @NonNull
  public abstract ViewModelStore getViewModelStore();
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ViewModelStoreOwner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */