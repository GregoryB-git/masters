package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;

public abstract interface HasDefaultViewModelProviderFactory
{
  @NonNull
  public CreationExtras getDefaultViewModelCreationExtras()
  {
    return CreationExtras.Empty.INSTANCE;
  }
  
  @NonNull
  public abstract ViewModelProvider.Factory getDefaultViewModelProviderFactory();
}

/* Location:
 * Qualified Name:     androidx.lifecycle.HasDefaultViewModelProviderFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */