package androidx.core.app;

import android.app.Notification.BubbleMetadata;
import android.app.Notification.BubbleMetadata.Builder;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;

@RequiresApi(29)
class NotificationCompat$BubbleMetadata$Api29Impl
{
  @Nullable
  @RequiresApi(29)
  public static NotificationCompat.BubbleMetadata fromPlatform(@Nullable Notification.BubbleMetadata paramBubbleMetadata)
  {
    if (paramBubbleMetadata == null) {
      return null;
    }
    if (paramBubbleMetadata.getIntent() == null) {
      return null;
    }
    NotificationCompat.BubbleMetadata.Builder localBuilder = new NotificationCompat.BubbleMetadata.Builder(paramBubbleMetadata.getIntent(), IconCompat.createFromIcon(paramBubbleMetadata.getIcon())).setAutoExpandBubble(paramBubbleMetadata.getAutoExpandBubble()).setDeleteIntent(paramBubbleMetadata.getDeleteIntent()).setSuppressNotification(paramBubbleMetadata.isNotificationSuppressed());
    if (paramBubbleMetadata.getDesiredHeight() != 0) {
      localBuilder.setDesiredHeight(paramBubbleMetadata.getDesiredHeight());
    }
    if (paramBubbleMetadata.getDesiredHeightResId() != 0) {
      localBuilder.setDesiredHeightResId(paramBubbleMetadata.getDesiredHeightResId());
    }
    return localBuilder.build();
  }
  
  @Nullable
  @RequiresApi(29)
  public static Notification.BubbleMetadata toPlatform(@Nullable NotificationCompat.BubbleMetadata paramBubbleMetadata)
  {
    if (paramBubbleMetadata == null) {
      return null;
    }
    if (paramBubbleMetadata.getIntent() == null) {
      return null;
    }
    Notification.BubbleMetadata.Builder localBuilder = new Notification.BubbleMetadata.Builder().setIcon(paramBubbleMetadata.getIcon().toIcon()).setIntent(paramBubbleMetadata.getIntent()).setDeleteIntent(paramBubbleMetadata.getDeleteIntent()).setAutoExpandBubble(paramBubbleMetadata.getAutoExpandBubble()).setSuppressNotification(paramBubbleMetadata.isNotificationSuppressed());
    if (paramBubbleMetadata.getDesiredHeight() != 0) {
      localBuilder.setDesiredHeight(paramBubbleMetadata.getDesiredHeight());
    }
    if (paramBubbleMetadata.getDesiredHeightResId() != 0) {
      localBuilder.setDesiredHeightResId(paramBubbleMetadata.getDesiredHeightResId());
    }
    return localBuilder.build();
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompat.BubbleMetadata.Api29Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */