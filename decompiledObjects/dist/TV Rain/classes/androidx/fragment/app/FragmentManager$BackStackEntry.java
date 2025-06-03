package androidx.fragment.app;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;

public abstract interface FragmentManager$BackStackEntry
{
  @Deprecated
  @Nullable
  public abstract CharSequence getBreadCrumbShortTitle();
  
  @Deprecated
  @StringRes
  public abstract int getBreadCrumbShortTitleRes();
  
  @Deprecated
  @Nullable
  public abstract CharSequence getBreadCrumbTitle();
  
  @Deprecated
  @StringRes
  public abstract int getBreadCrumbTitleRes();
  
  public abstract int getId();
  
  @Nullable
  public abstract String getName();
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentManager.BackStackEntry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */