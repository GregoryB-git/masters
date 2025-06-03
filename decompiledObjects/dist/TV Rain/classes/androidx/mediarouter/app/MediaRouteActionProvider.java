package androidx.mediarouter.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ActionProvider;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouter.Callback;
import androidx.mediarouter.media.MediaRouter.ProviderInfo;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import androidx.mediarouter.media.MediaRouterParams;
import androidx.mediarouter.media.MediaRouterParams.Builder;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class MediaRouteActionProvider
  extends ActionProvider
{
  private static final String TAG = "MRActionProvider";
  private boolean mAlwaysVisible;
  private MediaRouteButton mButton;
  private final MediaRouterCallback mCallback;
  private MediaRouteDialogFactory mDialogFactory = MediaRouteDialogFactory.getDefault();
  private final MediaRouter mRouter;
  private MediaRouteSelector mSelector = MediaRouteSelector.EMPTY;
  
  public MediaRouteActionProvider(@NonNull Context paramContext)
  {
    super(paramContext);
    mRouter = MediaRouter.getInstance(paramContext);
    mCallback = new MediaRouterCallback(this);
  }
  
  @Deprecated
  public void enableDynamicGroup()
  {
    Object localObject = mRouter.getRouterParams();
    if (localObject == null) {
      localObject = new MediaRouterParams.Builder();
    } else {
      localObject = new MediaRouterParams.Builder((MediaRouterParams)localObject);
    }
    ((MediaRouterParams.Builder)localObject).setDialogType(2);
    mRouter.setRouterParams(((MediaRouterParams.Builder)localObject).build());
  }
  
  @NonNull
  public MediaRouteDialogFactory getDialogFactory()
  {
    return mDialogFactory;
  }
  
  @Nullable
  public MediaRouteButton getMediaRouteButton()
  {
    return mButton;
  }
  
  @NonNull
  public MediaRouteSelector getRouteSelector()
  {
    return mSelector;
  }
  
  public boolean isVisible()
  {
    boolean bool1 = mAlwaysVisible;
    boolean bool2 = true;
    boolean bool3 = bool2;
    if (!bool1) {
      if (mRouter.isRouteAvailable(mSelector, 1)) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
    }
    return bool3;
  }
  
  @NonNull
  public View onCreateActionView()
  {
    if (mButton != null) {
      Log.e("MRActionProvider", "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
    }
    MediaRouteButton localMediaRouteButton = onCreateMediaRouteButton();
    mButton = localMediaRouteButton;
    localMediaRouteButton.setCheatSheetEnabled(true);
    mButton.setRouteSelector(mSelector);
    mButton.setAlwaysVisible(mAlwaysVisible);
    mButton.setDialogFactory(mDialogFactory);
    mButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
    return mButton;
  }
  
  @NonNull
  public MediaRouteButton onCreateMediaRouteButton()
  {
    return new MediaRouteButton(getContext());
  }
  
  public boolean onPerformDefaultAction()
  {
    MediaRouteButton localMediaRouteButton = mButton;
    if (localMediaRouteButton != null) {
      return localMediaRouteButton.showDialog();
    }
    return false;
  }
  
  public boolean overridesItemVisibility()
  {
    return true;
  }
  
  public void refreshRoute()
  {
    refreshVisibility();
  }
  
  public void setAlwaysVisible(boolean paramBoolean)
  {
    if (mAlwaysVisible != paramBoolean)
    {
      mAlwaysVisible = paramBoolean;
      refreshVisibility();
      MediaRouteButton localMediaRouteButton = mButton;
      if (localMediaRouteButton != null) {
        localMediaRouteButton.setAlwaysVisible(mAlwaysVisible);
      }
    }
  }
  
  public void setDialogFactory(@NonNull MediaRouteDialogFactory paramMediaRouteDialogFactory)
  {
    if (paramMediaRouteDialogFactory != null)
    {
      if (mDialogFactory != paramMediaRouteDialogFactory)
      {
        mDialogFactory = paramMediaRouteDialogFactory;
        MediaRouteButton localMediaRouteButton = mButton;
        if (localMediaRouteButton != null) {
          localMediaRouteButton.setDialogFactory(paramMediaRouteDialogFactory);
        }
      }
      return;
    }
    throw new IllegalArgumentException("factory must not be null");
  }
  
  public void setRouteSelector(@NonNull MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector != null)
    {
      if (!mSelector.equals(paramMediaRouteSelector))
      {
        if (!mSelector.isEmpty()) {
          mRouter.removeCallback(mCallback);
        }
        if (!paramMediaRouteSelector.isEmpty()) {
          mRouter.addCallback(paramMediaRouteSelector, mCallback);
        }
        mSelector = paramMediaRouteSelector;
        refreshRoute();
        MediaRouteButton localMediaRouteButton = mButton;
        if (localMediaRouteButton != null) {
          localMediaRouteButton.setRouteSelector(paramMediaRouteSelector);
        }
      }
      return;
    }
    throw new IllegalArgumentException("selector must not be null");
  }
  
  public static final class MediaRouterCallback
    extends MediaRouter.Callback
  {
    private final WeakReference<MediaRouteActionProvider> mProviderWeak;
    
    public MediaRouterCallback(MediaRouteActionProvider paramMediaRouteActionProvider)
    {
      mProviderWeak = new WeakReference(paramMediaRouteActionProvider);
    }
    
    private void refreshRoute(MediaRouter paramMediaRouter)
    {
      MediaRouteActionProvider localMediaRouteActionProvider = (MediaRouteActionProvider)mProviderWeak.get();
      if (localMediaRouteActionProvider != null) {
        localMediaRouteActionProvider.refreshRoute();
      } else {
        paramMediaRouter.removeCallback(this);
      }
    }
    
    public void onProviderAdded(MediaRouter paramMediaRouter, MediaRouter.ProviderInfo paramProviderInfo)
    {
      refreshRoute(paramMediaRouter);
    }
    
    public void onProviderChanged(MediaRouter paramMediaRouter, MediaRouter.ProviderInfo paramProviderInfo)
    {
      refreshRoute(paramMediaRouter);
    }
    
    public void onProviderRemoved(MediaRouter paramMediaRouter, MediaRouter.ProviderInfo paramProviderInfo)
    {
      refreshRoute(paramMediaRouter);
    }
    
    public void onRouteAdded(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      refreshRoute(paramMediaRouter);
    }
    
    public void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      refreshRoute(paramMediaRouter);
    }
    
    public void onRouteRemoved(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      refreshRoute(paramMediaRouter);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteActionProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */