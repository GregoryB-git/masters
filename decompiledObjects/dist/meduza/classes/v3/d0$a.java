package v3;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import v5.m;
import w3.a;
import w3.a0;
import w3.y;

public final class d0$a
{
  public static a0 a(Context paramContext, d0 paramd0, boolean paramBoolean)
  {
    MediaMetricsManager localMediaMetricsManager = (MediaMetricsManager)paramContext.getSystemService("media_metrics");
    if (localMediaMetricsManager == null) {
      paramContext = null;
    } else {
      paramContext = new y(paramContext, localMediaMetricsManager.createPlaybackSession());
    }
    if (paramContext == null)
    {
      m.f("ExoPlayerImpl", "MediaMetricsService unavailable.");
      return new a0(LogSessionId.LOG_SESSION_ID_NONE);
    }
    if (paramBoolean) {
      r.g0(paramContext);
    }
    return new a0(c.getSessionId());
  }
}

/* Location:
 * Qualified Name:     v3.d0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */