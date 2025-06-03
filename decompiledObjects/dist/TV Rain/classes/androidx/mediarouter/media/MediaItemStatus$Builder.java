package androidx.mediarouter.media;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class MediaItemStatus$Builder
{
  private final Bundle mBundle;
  
  public MediaItemStatus$Builder(int paramInt)
  {
    mBundle = new Bundle();
    setTimestamp(SystemClock.elapsedRealtime());
    setPlaybackState(paramInt);
  }
  
  public MediaItemStatus$Builder(@NonNull MediaItemStatus paramMediaItemStatus)
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

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaItemStatus.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */