package androidx.media.app;

import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(15)
class NotificationCompat$Api15Impl
{
  @DoNotInline
  public static void setContentDescription(RemoteViews paramRemoteViews, int paramInt, CharSequence paramCharSequence)
  {
    paramRemoteViews.setContentDescription(paramInt, paramCharSequence);
  }
}

/* Location:
 * Qualified Name:     androidx.media.app.NotificationCompat.Api15Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */