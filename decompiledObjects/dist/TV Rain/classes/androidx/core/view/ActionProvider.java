package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import z2;

public abstract class ActionProvider
{
  private static final String TAG = "ActionProvider(support)";
  private final Context mContext;
  private SubUiVisibilityListener mSubUiVisibilityListener;
  private VisibilityListener mVisibilityListener;
  
  public ActionProvider(@NonNull Context paramContext)
  {
    mContext = paramContext;
  }
  
  @NonNull
  public Context getContext()
  {
    return mContext;
  }
  
  public boolean hasSubMenu()
  {
    return false;
  }
  
  public boolean isVisible()
  {
    return true;
  }
  
  @NonNull
  public abstract View onCreateActionView();
  
  @NonNull
  public View onCreateActionView(@NonNull MenuItem paramMenuItem)
  {
    return onCreateActionView();
  }
  
  public boolean onPerformDefaultAction()
  {
    return false;
  }
  
  public void onPrepareSubMenu(@NonNull SubMenu paramSubMenu) {}
  
  public boolean overridesItemVisibility()
  {
    return false;
  }
  
  public void refreshVisibility()
  {
    if ((mVisibilityListener != null) && (overridesItemVisibility())) {
      mVisibilityListener.onActionProviderVisibilityChanged(isVisible());
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void reset()
  {
    mVisibilityListener = null;
    mSubUiVisibilityListener = null;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setSubUiVisibilityListener(@Nullable SubUiVisibilityListener paramSubUiVisibilityListener)
  {
    mSubUiVisibilityListener = paramSubUiVisibilityListener;
  }
  
  public void setVisibilityListener(@Nullable VisibilityListener paramVisibilityListener)
  {
    if ((mVisibilityListener != null) && (paramVisibilityListener != null))
    {
      StringBuilder localStringBuilder = z2.t("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
      localStringBuilder.append(getClass().getSimpleName());
      localStringBuilder.append(" instance while it is still in use somewhere else?");
      Log.w("ActionProvider(support)", localStringBuilder.toString());
    }
    mVisibilityListener = paramVisibilityListener;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void subUiVisibilityChanged(boolean paramBoolean)
  {
    SubUiVisibilityListener localSubUiVisibilityListener = mSubUiVisibilityListener;
    if (localSubUiVisibilityListener != null) {
      localSubUiVisibilityListener.onSubUiVisibilityChanged(paramBoolean);
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static abstract interface SubUiVisibilityListener
  {
    public abstract void onSubUiVisibilityChanged(boolean paramBoolean);
  }
  
  public static abstract interface VisibilityListener
  {
    public abstract void onActionProviderVisibilityChanged(boolean paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ActionProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */