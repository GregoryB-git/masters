package androidx.mediarouter.app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouter.Callback;

public class MediaRouteDiscoveryFragment
  extends Fragment
{
  private static final String ARGUMENT_SELECTOR = "selector";
  private MediaRouter.Callback mCallback;
  private MediaRouter mRouter;
  private MediaRouteSelector mSelector;
  
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
  
  private void ensureRouter()
  {
    if (mRouter == null) {
      mRouter = MediaRouter.getInstance(getContext());
    }
  }
  
  @NonNull
  public MediaRouter getMediaRouter()
  {
    ensureRouter();
    return mRouter;
  }
  
  @NonNull
  public MediaRouteSelector getRouteSelector()
  {
    ensureRouteSelector();
    return mSelector;
  }
  
  public void onCreate(@Nullable Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ensureRouteSelector();
    ensureRouter();
    paramBundle = onCreateCallback();
    mCallback = paramBundle;
    if (paramBundle != null) {
      mRouter.addCallback(mSelector, paramBundle, 0);
    }
  }
  
  @Nullable
  public MediaRouter.Callback onCreateCallback()
  {
    new MediaRouter.Callback() {};
  }
  
  public void onDestroy()
  {
    MediaRouter.Callback localCallback = mCallback;
    if (localCallback != null) {
      mRouter.removeCallback(localCallback);
    }
    super.onDestroy();
  }
  
  public int onPrepareCallbackFlags()
  {
    return 4;
  }
  
  public void onStart()
  {
    super.onStart();
    MediaRouter.Callback localCallback = mCallback;
    if (localCallback != null) {
      mRouter.addCallback(mSelector, localCallback, onPrepareCallbackFlags());
    }
  }
  
  public void onStop()
  {
    MediaRouter.Callback localCallback = mCallback;
    if (localCallback != null) {
      mRouter.addCallback(mSelector, localCallback, 0);
    }
    super.onStop();
  }
  
  public void setRouteSelector(@NonNull MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector != null)
    {
      ensureRouteSelector();
      if (!mSelector.equals(paramMediaRouteSelector))
      {
        mSelector = paramMediaRouteSelector;
        Bundle localBundle1 = getArguments();
        Bundle localBundle2 = localBundle1;
        if (localBundle1 == null) {
          localBundle2 = new Bundle();
        }
        localBundle2.putBundle("selector", paramMediaRouteSelector.asBundle());
        setArguments(localBundle2);
        paramMediaRouteSelector = mCallback;
        if (paramMediaRouteSelector != null)
        {
          mRouter.removeCallback(paramMediaRouteSelector);
          mRouter.addCallback(mSelector, mCallback, onPrepareCallbackFlags());
        }
      }
      return;
    }
    throw new IllegalArgumentException("selector must not be null");
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDiscoveryFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */