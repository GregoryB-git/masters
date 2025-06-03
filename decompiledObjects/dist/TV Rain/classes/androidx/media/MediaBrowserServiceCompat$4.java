package androidx.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import androidx.annotation.Nullable;

class MediaBrowserServiceCompat$4
  extends MediaBrowserServiceCompat.Result<Bundle>
{
  public MediaBrowserServiceCompat$4(MediaBrowserServiceCompat paramMediaBrowserServiceCompat, Object paramObject, ResultReceiver paramResultReceiver)
  {
    super(paramObject);
  }
  
  public void onErrorSent(@Nullable Bundle paramBundle)
  {
    val$receiver.send(-1, paramBundle);
  }
  
  public void onProgressUpdateSent(@Nullable Bundle paramBundle)
  {
    val$receiver.send(1, paramBundle);
  }
  
  public void onResultSent(@Nullable Bundle paramBundle)
  {
    val$receiver.send(0, paramBundle);
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */