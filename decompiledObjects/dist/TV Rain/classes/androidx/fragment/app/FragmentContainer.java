package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class FragmentContainer
{
  @Deprecated
  @NonNull
  public Fragment instantiate(@NonNull Context paramContext, @NonNull String paramString, @Nullable Bundle paramBundle)
  {
    return Fragment.instantiate(paramContext, paramString, paramBundle);
  }
  
  @Nullable
  public abstract View onFindViewById(@IdRes int paramInt);
  
  public abstract boolean onHasView();
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentContainer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */