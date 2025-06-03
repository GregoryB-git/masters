package androidx.core.app;

import android.app.Notification.BubbleMetadata;
import android.app.Notification.BubbleMetadata.Builder;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;
import d;

@RequiresApi(30)
class NotificationCompat$BubbleMetadata$Api30Impl
{
  @Nullable
  @RequiresApi(30)
  public static NotificationCompat.BubbleMetadata fromPlatform(@Nullable Notification.BubbleMetadata paramBubbleMetadata)
  {
    if (paramBubbleMetadata == null) {
      return null;
    }
    NotificationCompat.BubbleMetadata.Builder localBuilder;
    if (d.l(paramBubbleMetadata) != null) {
      localBuilder = new NotificationCompat.BubbleMetadata.Builder(d.l(paramBubbleMetadata));
    } else {
      localBuilder = new NotificationCompat.BubbleMetadata.Builder(paramBubbleMetadata.getIntent(), IconCompat.createFromIcon(paramBubbleMetadata.getIcon()));
    }
    localBuilder.setAutoExpandBubble(paramBubbleMetadata.getAutoExpandBubble()).setDeleteIntent(paramBubbleMetadata.getDeleteIntent()).setSuppressNotification(paramBubbleMetadata.isNotificationSuppressed());
    if (paramBubbleMetadata.getDesiredHeight() != 0) {
      localBuilder.setDesiredHeight(paramBubbleMetadata.getDesiredHeight());
    }
    if (paramBubbleMetadata.getDesiredHeightResId() != 0) {
      localBuilder.setDesiredHeightResId(paramBubbleMetadata.getDesiredHeightResId());
    }
    return localBuilder.build();
  }
  
  @Nullable
  @RequiresApi(30)
  public static Notification.BubbleMetadata toPlatform(@Nullable NotificationCompat.BubbleMetadata paramBubbleMetadata)
  {
    if (paramBubbleMetadata == null) {
      return null;
    }
    Notification.BubbleMetadata.Builder localBuilder;
    if (paramBubbleMetadata.getShortcutId() != null) {
      localBuilder = new Notification.BubbleMetadata.Builder(paramBubbleMetadata.getShortcutId());
    } else {
      localBuilder = new Notification.BubbleMetadata.Builder(paramBubbleMetadata.getIntent(), paramBubbleMetadata.getIcon().toIcon());
    }
    localBuilder.setDeleteIntent(paramBubbleMetadata.getDeleteIntent()).setAutoExpandBubble(paramBubbleMetadata.getAutoExpandBubble()).setSuppressNotification(paramBubbleMetadata.isNotificationSuppressed());
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
 * Qualified Name:     androidx.core.app.NotificationCompat.BubbleMetadata.Api30Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */