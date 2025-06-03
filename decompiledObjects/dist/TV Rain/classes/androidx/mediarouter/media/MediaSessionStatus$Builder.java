package androidx.mediarouter.media;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class MediaSessionStatus$Builder
{
  private final Bundle mBundle;
  
  public MediaSessionStatus$Builder(int paramInt)
  {
    mBundle = new Bundle();
    setTimestamp(SystemClock.elapsedRealtime());
    setSessionState(paramInt);
  }
  
  public MediaSessionStatus$Builder(@NonNull MediaSessionStatus paramMediaSessionStatus)
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

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaSessionStatus.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */