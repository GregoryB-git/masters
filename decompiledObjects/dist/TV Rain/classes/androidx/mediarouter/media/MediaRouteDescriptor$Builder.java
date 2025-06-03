package androidx.mediarouter.media;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class MediaRouteDescriptor$Builder
{
  private final Bundle mBundle;
  private ArrayList<IntentFilter> mControlFilters;
  private ArrayList<String> mGroupMemberIds;
  
  public MediaRouteDescriptor$Builder(@NonNull MediaRouteDescriptor paramMediaRouteDescriptor)
  {
    if (paramMediaRouteDescriptor != null)
    {
      mBundle = new Bundle(mBundle);
      if (!paramMediaRouteDescriptor.getGroupMemberIds().isEmpty()) {
        mGroupMemberIds = new ArrayList(paramMediaRouteDescriptor.getGroupMemberIds());
      }
      if (!paramMediaRouteDescriptor.getControlFilters().isEmpty()) {
        mControlFilters = new ArrayList(mControlFilters);
      }
      return;
    }
    throw new IllegalArgumentException("descriptor must not be null");
  }
  
  public MediaRouteDescriptor$Builder(@NonNull String paramString1, @NonNull String paramString2)
  {
    mBundle = new Bundle();
    setId(paramString1);
    setName(paramString2);
  }
  
  @NonNull
  public Builder addControlFilter(@NonNull IntentFilter paramIntentFilter)
  {
    if (paramIntentFilter != null)
    {
      if (mControlFilters == null) {
        mControlFilters = new ArrayList();
      }
      if (!mControlFilters.contains(paramIntentFilter)) {
        mControlFilters.add(paramIntentFilter);
      }
      return this;
    }
    throw new IllegalArgumentException("filter must not be null");
  }
  
  @NonNull
  public Builder addControlFilters(@NonNull Collection<IntentFilter> paramCollection)
  {
    if (paramCollection != null)
    {
      if (!paramCollection.isEmpty())
      {
        paramCollection = paramCollection.iterator();
        while (paramCollection.hasNext())
        {
          IntentFilter localIntentFilter = (IntentFilter)paramCollection.next();
          if (localIntentFilter != null) {
            addControlFilter(localIntentFilter);
          }
        }
      }
      return this;
    }
    throw new IllegalArgumentException("filters must not be null");
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public Builder addGroupMemberId(@NonNull String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      if (mGroupMemberIds == null) {
        mGroupMemberIds = new ArrayList();
      }
      if (!mGroupMemberIds.contains(paramString)) {
        mGroupMemberIds.add(paramString);
      }
      return this;
    }
    throw new IllegalArgumentException("groupMemberId must not be empty");
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public Builder addGroupMemberIds(@NonNull Collection<String> paramCollection)
  {
    if (paramCollection != null)
    {
      if (!paramCollection.isEmpty())
      {
        paramCollection = paramCollection.iterator();
        while (paramCollection.hasNext()) {
          addGroupMemberId((String)paramCollection.next());
        }
      }
      return this;
    }
    throw new IllegalArgumentException("groupMemberIds must not be null");
  }
  
  @NonNull
  public MediaRouteDescriptor build()
  {
    ArrayList localArrayList = mControlFilters;
    if (localArrayList != null) {
      mBundle.putParcelableArrayList("controlFilters", localArrayList);
    }
    localArrayList = mGroupMemberIds;
    if (localArrayList != null) {
      mBundle.putStringArrayList("groupMemberIds", localArrayList);
    }
    return new MediaRouteDescriptor(mBundle);
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public Builder clearGroupMemberIds()
  {
    ArrayList localArrayList = mGroupMemberIds;
    if (localArrayList == null) {
      mGroupMemberIds = new ArrayList();
    } else {
      localArrayList.clear();
    }
    return this;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public Builder removeGroupMemberId(@NonNull String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      ArrayList localArrayList = mGroupMemberIds;
      if (localArrayList != null) {
        localArrayList.remove(paramString);
      }
      return this;
    }
    throw new IllegalArgumentException("memberRouteId must not be empty");
  }
  
  @NonNull
  public Builder setCanDisconnect(boolean paramBoolean)
  {
    mBundle.putBoolean("canDisconnect", paramBoolean);
    return this;
  }
  
  @Deprecated
  @NonNull
  public Builder setConnecting(boolean paramBoolean)
  {
    mBundle.putBoolean("connecting", paramBoolean);
    return this;
  }
  
  @NonNull
  public Builder setConnectionState(int paramInt)
  {
    mBundle.putInt("connectionState", paramInt);
    return this;
  }
  
  @NonNull
  public Builder setDescription(@Nullable String paramString)
  {
    mBundle.putString("status", paramString);
    return this;
  }
  
  @NonNull
  public Builder setDeviceType(int paramInt)
  {
    mBundle.putInt("deviceType", paramInt);
    return this;
  }
  
  @NonNull
  public Builder setEnabled(boolean paramBoolean)
  {
    mBundle.putBoolean("enabled", paramBoolean);
    return this;
  }
  
  @NonNull
  public Builder setExtras(@Nullable Bundle paramBundle)
  {
    if (paramBundle == null) {
      mBundle.putBundle("extras", null);
    } else {
      mBundle.putBundle("extras", new Bundle(paramBundle));
    }
    return this;
  }
  
  @NonNull
  public Builder setIconUri(@NonNull Uri paramUri)
  {
    if (paramUri != null)
    {
      mBundle.putString("iconUri", paramUri.toString());
      return this;
    }
    throw new IllegalArgumentException("iconUri must not be null");
  }
  
  @NonNull
  public Builder setId(@NonNull String paramString)
  {
    if (paramString != null)
    {
      mBundle.putString("id", paramString);
      return this;
    }
    throw new NullPointerException("id must not be null");
  }
  
  @NonNull
  public Builder setIsDynamicGroupRoute(boolean paramBoolean)
  {
    mBundle.putBoolean("isDynamicGroupRoute", paramBoolean);
    return this;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public Builder setMaxClientVersion(int paramInt)
  {
    mBundle.putInt("maxClientVersion", paramInt);
    return this;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public Builder setMinClientVersion(int paramInt)
  {
    mBundle.putInt("minClientVersion", paramInt);
    return this;
  }
  
  @NonNull
  public Builder setName(@NonNull String paramString)
  {
    if (paramString != null)
    {
      mBundle.putString("name", paramString);
      return this;
    }
    throw new NullPointerException("name must not be null");
  }
  
  @NonNull
  public Builder setPlaybackStream(int paramInt)
  {
    mBundle.putInt("playbackStream", paramInt);
    return this;
  }
  
  @NonNull
  public Builder setPlaybackType(int paramInt)
  {
    mBundle.putInt("playbackType", paramInt);
    return this;
  }
  
  @NonNull
  public Builder setPresentationDisplayId(int paramInt)
  {
    mBundle.putInt("presentationDisplayId", paramInt);
    return this;
  }
  
  @NonNull
  public Builder setSettingsActivity(@Nullable IntentSender paramIntentSender)
  {
    mBundle.putParcelable("settingsIntent", paramIntentSender);
    return this;
  }
  
  @NonNull
  public Builder setVolume(int paramInt)
  {
    mBundle.putInt("volume", paramInt);
    return this;
  }
  
  @NonNull
  public Builder setVolumeHandling(int paramInt)
  {
    mBundle.putInt("volumeHandling", paramInt);
    return this;
  }
  
  @NonNull
  public Builder setVolumeMax(int paramInt)
  {
    mBundle.putInt("volumeMax", paramInt);
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteDescriptor.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */