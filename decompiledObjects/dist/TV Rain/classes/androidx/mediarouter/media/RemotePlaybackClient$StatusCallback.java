package androidx.mediarouter.media;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class RemotePlaybackClient$StatusCallback
{
  public void onItemStatusChanged(@Nullable Bundle paramBundle, @NonNull String paramString1, @Nullable MediaSessionStatus paramMediaSessionStatus, @NonNull String paramString2, @NonNull MediaItemStatus paramMediaItemStatus) {}
  
  public void onSessionChanged(@Nullable String paramString) {}
  
  public void onSessionStatusChanged(@Nullable Bundle paramBundle, @NonNull String paramString, @Nullable MediaSessionStatus paramMediaSessionStatus) {}
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.RemotePlaybackClient.StatusCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */