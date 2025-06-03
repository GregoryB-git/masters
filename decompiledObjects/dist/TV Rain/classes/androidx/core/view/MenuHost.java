package androidx.core.view;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleOwner;

public abstract interface MenuHost
{
  public abstract void addMenuProvider(@NonNull MenuProvider paramMenuProvider);
  
  public abstract void addMenuProvider(@NonNull MenuProvider paramMenuProvider, @NonNull LifecycleOwner paramLifecycleOwner);
  
  @SuppressLint({"LambdaLast"})
  public abstract void addMenuProvider(@NonNull MenuProvider paramMenuProvider, @NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.State paramState);
  
  public abstract void invalidateMenu();
  
  public abstract void removeMenuProvider(@NonNull MenuProvider paramMenuProvider);
}

/* Location:
 * Qualified Name:     androidx.core.view.MenuHost
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */