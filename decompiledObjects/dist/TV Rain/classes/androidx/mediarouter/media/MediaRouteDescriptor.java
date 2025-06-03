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
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import z2;

public final class MediaRouteDescriptor
{
  public static final String IS_DYNAMIC_GROUP_ROUTE = "isDynamicGroupRoute";
  public static final String KEY_CAN_DISCONNECT = "canDisconnect";
  public static final String KEY_CONNECTING = "connecting";
  public static final String KEY_CONNECTION_STATE = "connectionState";
  public static final String KEY_CONTROL_FILTERS = "controlFilters";
  public static final String KEY_DESCRIPTION = "status";
  public static final String KEY_DEVICE_TYPE = "deviceType";
  public static final String KEY_ENABLED = "enabled";
  public static final String KEY_EXTRAS = "extras";
  public static final String KEY_GROUP_MEMBER_IDS = "groupMemberIds";
  public static final String KEY_ICON_URI = "iconUri";
  public static final String KEY_ID = "id";
  public static final String KEY_MAX_CLIENT_VERSION = "maxClientVersion";
  public static final String KEY_MIN_CLIENT_VERSION = "minClientVersion";
  public static final String KEY_NAME = "name";
  public static final String KEY_PLAYBACK_STREAM = "playbackStream";
  public static final String KEY_PLAYBACK_TYPE = "playbackType";
  public static final String KEY_PRESENTATION_DISPLAY_ID = "presentationDisplayId";
  public static final String KEY_SETTINGS_INTENT = "settingsIntent";
  public static final String KEY_VOLUME = "volume";
  public static final String KEY_VOLUME_HANDLING = "volumeHandling";
  public static final String KEY_VOLUME_MAX = "volumeMax";
  public final Bundle mBundle;
  public List<IntentFilter> mControlFilters;
  public List<String> mGroupMemberIds;
  
  public MediaRouteDescriptor(Bundle paramBundle)
  {
    mBundle = paramBundle;
  }
  
  @Nullable
  public static MediaRouteDescriptor fromBundle(@Nullable Bundle paramBundle)
  {
    if (paramBundle != null) {
      paramBundle = new MediaRouteDescriptor(paramBundle);
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
  
  public boolean canDisconnectAndKeepPlaying()
  {
    return mBundle.getBoolean("canDisconnect", false);
  }
  
  public void ensureControlFilters()
  {
    if (mControlFilters == null)
    {
      ArrayList localArrayList = mBundle.getParcelableArrayList("controlFilters");
      mControlFilters = localArrayList;
      if (localArrayList == null) {
        mControlFilters = Collections.emptyList();
      }
    }
  }
  
  public void ensureGroupMemberIds()
  {
    if (mGroupMemberIds == null)
    {
      ArrayList localArrayList = mBundle.getStringArrayList("groupMemberIds");
      mGroupMemberIds = localArrayList;
      if (localArrayList == null) {
        mGroupMemberIds = Collections.emptyList();
      }
    }
  }
  
  public int getConnectionState()
  {
    return mBundle.getInt("connectionState", 0);
  }
  
  @NonNull
  public List<IntentFilter> getControlFilters()
  {
    ensureControlFilters();
    return mControlFilters;
  }
  
  @Nullable
  public String getDescription()
  {
    return mBundle.getString("status");
  }
  
  public int getDeviceType()
  {
    return mBundle.getInt("deviceType");
  }
  
  @Nullable
  public Bundle getExtras()
  {
    return mBundle.getBundle("extras");
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public List<String> getGroupMemberIds()
  {
    ensureGroupMemberIds();
    return mGroupMemberIds;
  }
  
  @Nullable
  public Uri getIconUri()
  {
    Object localObject = mBundle.getString("iconUri");
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = Uri.parse((String)localObject);
    }
    return (Uri)localObject;
  }
  
  @NonNull
  public String getId()
  {
    return mBundle.getString("id");
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public int getMaxClientVersion()
  {
    return mBundle.getInt("maxClientVersion", Integer.MAX_VALUE);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public int getMinClientVersion()
  {
    return mBundle.getInt("minClientVersion", 1);
  }
  
  @NonNull
  public String getName()
  {
    return mBundle.getString("name");
  }
  
  public int getPlaybackStream()
  {
    return mBundle.getInt("playbackStream", -1);
  }
  
  public int getPlaybackType()
  {
    return mBundle.getInt("playbackType", 1);
  }
  
  public int getPresentationDisplayId()
  {
    return mBundle.getInt("presentationDisplayId", -1);
  }
  
  @Nullable
  public IntentSender getSettingsActivity()
  {
    return (IntentSender)mBundle.getParcelable("settingsIntent");
  }
  
  public int getVolume()
  {
    return mBundle.getInt("volume");
  }
  
  public int getVolumeHandling()
  {
    return mBundle.getInt("volumeHandling", 0);
  }
  
  public int getVolumeMax()
  {
    return mBundle.getInt("volumeMax");
  }
  
  @Deprecated
  public boolean isConnecting()
  {
    return mBundle.getBoolean("connecting", false);
  }
  
  public boolean isDynamicGroupRoute()
  {
    return mBundle.getBoolean("isDynamicGroupRoute", false);
  }
  
  public boolean isEnabled()
  {
    return mBundle.getBoolean("enabled", true);
  }
  
  public boolean isValid()
  {
    ensureControlFilters();
    return (!TextUtils.isEmpty(getId())) && (!TextUtils.isEmpty(getName())) && (!mControlFilters.contains(null));
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.u("MediaRouteDescriptor{ ", "id=");
    localStringBuilder.append(getId());
    localStringBuilder.append(", groupMemberIds=");
    localStringBuilder.append(getGroupMemberIds());
    localStringBuilder.append(", name=");
    localStringBuilder.append(getName());
    localStringBuilder.append(", description=");
    localStringBuilder.append(getDescription());
    localStringBuilder.append(", iconUri=");
    localStringBuilder.append(getIconUri());
    localStringBuilder.append(", isEnabled=");
    localStringBuilder.append(isEnabled());
    localStringBuilder.append(", connectionState=");
    localStringBuilder.append(getConnectionState());
    localStringBuilder.append(", controlFilters=");
    localStringBuilder.append(Arrays.toString(getControlFilters().toArray()));
    localStringBuilder.append(", playbackType=");
    localStringBuilder.append(getPlaybackType());
    localStringBuilder.append(", playbackStream=");
    localStringBuilder.append(getPlaybackStream());
    localStringBuilder.append(", deviceType=");
    localStringBuilder.append(getDeviceType());
    localStringBuilder.append(", volume=");
    localStringBuilder.append(getVolume());
    localStringBuilder.append(", volumeMax=");
    localStringBuilder.append(getVolumeMax());
    localStringBuilder.append(", volumeHandling=");
    localStringBuilder.append(getVolumeHandling());
    localStringBuilder.append(", presentationDisplayId=");
    localStringBuilder.append(getPresentationDisplayId());
    localStringBuilder.append(", extras=");
    localStringBuilder.append(getExtras());
    localStringBuilder.append(", isValid=");
    localStringBuilder.append(isValid());
    localStringBuilder.append(", minClientVersion=");
    localStringBuilder.append(getMinClientVersion());
    localStringBuilder.append(", maxClientVersion=");
    localStringBuilder.append(getMaxClientVersion());
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
  
  public static final class Builder
  {
    private final Bundle mBundle;
    private ArrayList<IntentFilter> mControlFilters;
    private ArrayList<String> mGroupMemberIds;
    
    public Builder(@NonNull MediaRouteDescriptor paramMediaRouteDescriptor)
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
    
    public Builder(@NonNull String paramString1, @NonNull String paramString2)
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
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteDescriptor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */