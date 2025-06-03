package androidx.mediarouter.media;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.TimeUtils;
import z2;

public final class MediaSessionStatus
{
  public static final String KEY_EXTRAS = "extras";
  public static final String KEY_QUEUE_PAUSED = "queuePaused";
  public static final String KEY_SESSION_STATE = "sessionState";
  public static final String KEY_TIMESTAMP = "timestamp";
  public static final int SESSION_STATE_ACTIVE = 0;
  public static final int SESSION_STATE_ENDED = 1;
  public static final int SESSION_STATE_INVALIDATED = 2;
  public final Bundle mBundle;
  
  public MediaSessionStatus(Bundle paramBundle)
  {
    mBundle = paramBundle;
  }
  
  @Nullable
  public static MediaSessionStatus fromBundle(@Nullable Bundle paramBundle)
  {
    if (paramBundle != null) {
      paramBundle = new MediaSessionStatus(paramBundle);
    } else {
      paramBundle = null;
    }
    return paramBundle;
  }
  
  private static String sessionStateToString(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2) {
          return Integer.toString(paramInt);
        }
        return "invalidated";
      }
      return "ended";
    }
    return "active";
  }
  
  @NonNull
  public Bundle asBundle()
  {
    return mBundle;
  }
  
  @Nullable
  public Bundle getExtras()
  {
    return mBundle.getBundle("extras");
  }
  
  public int getSessionState()
  {
    return mBundle.getInt("sessionState", 2);
  }
  
  public long getTimestamp()
  {
    return mBundle.getLong("timestamp");
  }
  
  public boolean isQueuePaused()
  {
    return mBundle.getBoolean("queuePaused");
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.u("MediaSessionStatus{ ", "timestamp=");
    TimeUtils.formatDuration(SystemClock.elapsedRealtime() - getTimestamp(), localStringBuilder);
    localStringBuilder.append(" ms ago");
    localStringBuilder.append(", sessionState=");
    localStringBuilder.append(sessionStateToString(getSessionState()));
    localStringBuilder.append(", queuePaused=");
    localStringBuilder.append(isQueuePaused());
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
      setSessionState(paramInt);
    }
    
    public Builder(@NonNull MediaSessionStatus paramMediaSessionStatus)
    {
      if (paramMediaSessionStatus != null)
      {
        mBundle = new Bundle(mBundle);
        return;
      }
      throw new IllegalArgumentException("status must not be null");
    }
    
    @NonNull
    public MediaSessionStatus build()
    {
      return new MediaSessionStatus(mBundle);
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
    public Builder setQueuePaused(boolean paramBoolean)
    {
      mBundle.putBoolean("queuePaused", paramBoolean);
      return this;
    }
    
    @NonNull
    public Builder setSessionState(int paramInt)
    {
      mBundle.putInt("sessionState", paramInt);
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
 * Qualified Name:     androidx.mediarouter.media.MediaSessionStatus
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */