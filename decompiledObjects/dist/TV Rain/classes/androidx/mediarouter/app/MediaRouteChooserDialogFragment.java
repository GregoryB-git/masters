package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.mediarouter.media.MediaRouteSelector;

public class MediaRouteChooserDialogFragment
  extends DialogFragment
{
  private static final String ARGUMENT_SELECTOR = "selector";
  private Dialog mDialog;
  private MediaRouteSelector mSelector;
  private boolean mUseDynamicGroup = false;
  
  public MediaRouteChooserDialogFragment()
  {
    setCancelable(true);
  }
  
  private void ensureRouteSelector()
  {
    if (mSelector == null)
    {
      Bundle localBundle = getArguments();
      if (localBundle != null) {
        mSelector = MediaRouteSelector.fromBundle(localBundle.getBundle("selector"));
      }
      if (mSelector == null) {
        mSelector = MediaRouteSelector.EMPTY;
      }
    }
  }
  
  @NonNull
  public MediaRouteSelector getRouteSelector()
  {
    ensureRouteSelector();
    return mSelector;
  }
  
  public void onConfigurationChanged(@NonNull Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    paramConfiguration = mDialog;
    if (paramConfiguration == null) {
      return;
    }
    if (mUseDynamicGroup) {
      ((MediaRouteDynamicChooserDialog)paramConfiguration).updateLayout();
    } else {
      ((MediaRouteChooserDialog)paramConfiguration).updateLayout();
    }
  }
  
  @NonNull
  public MediaRouteChooserDialog onCreateChooserDialog(@NonNull Context paramContext, @Nullable Bundle paramBundle)
  {
    return new MediaRouteChooserDialog(paramContext);
  }
  
  @NonNull
  public Dialog onCreateDialog(@Nullable Bundle paramBundle)
  {
    Object localObject;
    if (mUseDynamicGroup)
    {
      paramBundle = onCreateDynamicChooserDialog(getContext());
      mDialog = paramBundle;
      localObject = (MediaRouteDynamicChooserDialog)paramBundle;
      paramBundle.setRouteSelector(getRouteSelector());
    }
    else
    {
      paramBundle = onCreateChooserDialog(getContext(), paramBundle);
      mDialog = paramBundle;
      localObject = (MediaRouteChooserDialog)paramBundle;
      paramBundle.setRouteSelector(getRouteSelector());
    }
    return mDialog;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public MediaRouteDynamicChooserDialog onCreateDynamicChooserDialog(@NonNull Context paramContext)
  {
    return new MediaRouteDynamicChooserDialog(paramContext);
  }
  
  public void setRouteSelector(@NonNull MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector != null)
    {
      ensureRouteSelector();
      if (!mSelector.equals(paramMediaRouteSelector))
      {
        mSelector = paramMediaRouteSelector;
        Bundle localBundle = getArguments();
        Object localObject = localBundle;
        if (localBundle == null) {
          localObject = new Bundle();
        }
        ((Bundle)localObject).putBundle("selector", paramMediaRouteSelector.asBundle());
        setArguments((Bundle)localObject);
        localObject = mDialog;
        if (localObject != null) {
          if (mUseDynamicGroup) {
            ((MediaRouteDynamicChooserDialog)localObject).setRouteSelector(paramMediaRouteSelector);
          } else {
            ((MediaRouteChooserDialog)localObject).setRouteSelector(paramMediaRouteSelector);
          }
        }
      }
      return;
    }
    throw new IllegalArgumentException("selector must not be null");
  }
  
  public void setUseDynamicGroup(boolean paramBoolean)
  {
    if (mDialog == null)
    {
      mUseDynamicGroup = paramBoolean;
      return;
    }
    throw new IllegalStateException("This must be called before creating dialog");
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteChooserDialogFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */