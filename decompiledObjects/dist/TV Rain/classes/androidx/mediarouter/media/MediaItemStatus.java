package androidx.mediarouter.media;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.TimeUtils;
import z2;

public final class MediaItemStatus
{
  public static final String EXTRA_HTTP_RESPONSE_HEADERS = "android.media.status.extra.HTTP_RESPONSE_HEADERS";
  public static final String EXTRA_HTTP_STATUS_CODE = "android.media.status.extra.HTTP_STATUS_CODE";
  public static final String KEY_CONTENT_DURATION = "contentDuration";
  public static final String KEY_CONTENT_POSITION = "contentPosition";
  public static final String KEY_EXTRAS = "extras";
  public static final String KEY_PLAYBACK_STATE = "playbackState";
  public static final String KEY_TIMESTAMP = "timestamp";
  public static final int PLAYBACK_STATE_BUFFERING = 3;
  public static final int PLAYBACK_STATE_CANCELED = 5;
  public static final int PLAYBACK_STATE_ERROR = 7;
  public static final int PLAYBACK_STATE_FINISHED = 4;
  public static final int PLAYBACK_STATE_INVALIDATED = 6;
  public static final int PLAYBACK_STATE_PAUSED = 2;
  public static final int PLAYBACK_STATE_PENDING = 0;
  public static final int PLAYBACK_STATE_PLAYING = 1;
  public final Bundle mBundle;
  
  public MediaItemStatus(Bundle paramBundle)
  {
    mBundle = paramBundle;
  }
  
  @Nullable
  public static MediaItemStatus fromBundle(@Nullable Bundle paramBundle)
  {
    if (paramBundle != null) {
      paramBundle = new MediaItemStatus(paramBundle);
    } else {
      paramBundle = null;
    }
    return paramBundle;
  }
  
  private static String playbackStateToString(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return Integer.toString(paramInt);
    case 7: 
      return "error";
    case 6: 
      return "invalidated";
    case 5: 
      return "canceled";
    case 4: 
      return "finished";
    case 3: 
      return "buffering";
    case 2: 
      return "paused";
    case 1: 
      return "playing";
    }
    return "pending";
  }
  
  @NonNull
  public Bundle asBundle()
  {
    return mBundle;
  }
  
  public long getContentDuration()
  {
    return mBundle.getLong("contentDuration", -1L);
  }
  
  public long getContentPosition()
  {
    return mBundle.getLong("contentPosition", -1L);
  }
  
  @Nullable
  public Bundle getExtras()
  {
    return mBundle.getBundle("extras");
  }
  
  public int getPlaybackState()
  {
    return mBundle.getInt("playbackState", 7);
  }
  
  public long getTimestamp()
  {
    return mBundle.getLong("timestamp");
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.u("MediaItemStatus{ ", "timestamp=");
    TimeUtils.formatDuration(SystemClock.elapsedRealtime() - getTimestamp(), localStringBuilder);
    localStringBuilder.append(" ms ago");
    localStringBuilder.append(", playbackState=");
    localStringBuilder.append(playbackStateToString(getPlaybackState()));
    localStringBuilder.append(", contentPosition=");
    localStringBuilder.append(getContentPosition());
    localStringBuilder.append(", contentDuration=");
    localStringBuilder.append(getContentDuration());
    localStringBuilder.append(", extras=");
    localStringBuilder.append(getExtras());
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
  
  public static final class Builder
  {
    private final Bundle mBundle;
    
    public Builder(int paramInt)
    {
      mBundle = new Bundle();
      setTimestamp(SystemClock.elapsedRealtime());
      setPlaybackState(paramInt);
    }
    
    public Builder(@NonNull MediaItemStatus paramMediaItemStatus)
    {
      if (paramMediaItemStatus != null)
      {
        mBundle = new Bundle(mBundle);
        return;
      }
      throw new IllegalArgumentException("status must not be null");
    }
    
    @NonNull
    public MediaItemStatus build()
    {
      return new MediaItemStatus(mBundle);
    }
    
    @NonNull
    public Builder setContentDuration(long paramLong)
    {
      mBundle.putLong("contentDuration", paramLong);
      return this;
    }
    
    @NonNull
    public Builder setContentPosition(long paramLong)
    {
      mBundle.putLong("contentPosition", paramLong);
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
    public Builder setPlaybackState(int paramInt)
    {
      mBundle.putInt("playbackState", paramInt);
      return this;
    }
    
    @NonNull
    public Builder setTimestamp(long paramLong)
    {
      mBundle.putLong("timestamp", paramLong);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaItemStatus
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */