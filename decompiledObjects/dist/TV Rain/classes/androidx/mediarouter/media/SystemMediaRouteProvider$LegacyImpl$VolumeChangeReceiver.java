package androidx.mediarouter.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class SystemMediaRouteProvider$LegacyImpl$VolumeChangeReceiver
  extends BroadcastReceiver
{
  public static final String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";
  public static final String EXTRA_VOLUME_STREAM_VALUE = "android.media.EXTRA_VOLUME_STREAM_VALUE";
  public static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
  
  public SystemMediaRouteProvider$LegacyImpl$VolumeChangeReceiver(SystemMediaRouteProvider.LegacyImpl paramLegacyImpl) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent.getAction().equals("android.media.VOLUME_CHANGED_ACTION")) && (paramIntent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3))
    {
      int i = paramIntent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
      if (i >= 0)
      {
        paramContext = this$0;
        if (i != mLastReportedVolume) {
          paramContext.publishRoutes();
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.SystemMediaRouteProvider.LegacyImpl.VolumeChangeReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */