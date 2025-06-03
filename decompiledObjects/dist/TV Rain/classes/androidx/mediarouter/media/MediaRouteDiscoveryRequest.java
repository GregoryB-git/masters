package androidx.mediarouter.media;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import z2;

public final class MediaRouteDiscoveryRequest
{
  private static final String KEY_ACTIVE_SCAN = "activeScan";
  private static final String KEY_SELECTOR = "selector";
  private final Bundle mBundle;
  private MediaRouteSelector mSelector;
  
  private MediaRouteDiscoveryRequest(Bundle paramBundle)
  {
    mBundle = paramBundle;
  }
  
  public MediaRouteDiscoveryRequest(@NonNull MediaRouteSelector paramMediaRouteSelector, boolean paramBoolean)
  {
    if (paramMediaRouteSelector != null)
    {
      Bundle localBundle = new Bundle();
      mBundle = localBundle;
      mSelector = paramMediaRouteSelector;
      localBundle.putBundle("selector", paramMediaRouteSelector.asBundle());
      localBundle.putBoolean("activeScan", paramBoolean);
      return;
    }
    throw new IllegalArgumentException("selector must not be null");
  }
  
  private void ensureSelector()
  {
    if (mSelector == null)
    {
      MediaRouteSelector localMediaRouteSelector = MediaRouteSelector.fromBundle(mBundle.getBundle("selector"));
      mSelector = localMediaRouteSelector;
      if (localMediaRouteSelector == null) {
        mSelector = MediaRouteSelector.EMPTY;
      }
    }
  }
  
  @Nullable
  public static MediaRouteDiscoveryRequest fromBundle(@Nullable Bundle paramBundle)
  {
    if (paramBundle != null) {
      paramBundle = new MediaRouteDiscoveryRequest(paramBundle);
    } else {
      paramBundle = null;
    }
    return paramBundle;
  }
  
  @NonNull
  public Bundle asBundle()
  {
    return mBundle;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof MediaRouteDiscoveryRequest;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (MediaRouteDiscoveryRequest)paramObject;
      bool3 = bool2;
      if (getSelector().equals(((MediaRouteDiscoveryRequest)paramObject).getSelector()))
      {
        bool3 = bool2;
        if (isActiveScan() == ((MediaRouteDiscoveryRequest)paramObject).isActiveScan()) {
          bool3 = true;
        }
      }
    }
    return bool3;
  }
  
  @NonNull
  public MediaRouteSelector getSelector()
  {
    ensureSelector();
    return mSelector;
  }
  
  public int hashCode()
  {
    return getSelector().hashCode() ^ isActiveScan();
  }
  
  public boolean isActiveScan()
  {
    return mBundle.getBoolean("activeScan");
  }
  
  public boolean isValid()
  {
    ensureSelector();
    return mSelector.isValid();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("DiscoveryRequest{ selector=");
    localStringBuilder.append(getSelector());
    localStringBuilder.append(", activeScan=");
    localStringBuilder.append(isActiveScan());
    localStringBuilder.append(", isValid=");
    localStringBuilder.append(isValid());
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteDiscoveryRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */