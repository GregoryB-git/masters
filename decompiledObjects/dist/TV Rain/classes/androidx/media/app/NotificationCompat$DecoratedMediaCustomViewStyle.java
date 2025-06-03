package androidx.media.app;

import android.content.Context;
import android.content.res.Resources;
import android.widget.RemoteViews;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;
import androidx.core.app.NotificationCompat.Builder;
import androidx.core.app.NotificationCompat.Style;
import androidx.media.R.color;
import androidx.media.R.id;
import androidx.media.R.layout;

public class NotificationCompat$DecoratedMediaCustomViewStyle
  extends NotificationCompat.MediaStyle
{
  private void setBackgroundColor(RemoteViews paramRemoteViews)
  {
    int i;
    if (mBuilder.getColor() != 0) {
      i = mBuilder.getColor();
    } else {
      i = mBuilder.mContext.getResources().getColor(R.color.notification_material_background_media_default_color);
    }
    paramRemoteViews.setInt(R.id.status_bar_latest_event_content, "setBackgroundColor", i);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public void apply(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
  {
    NotificationCompat.Api21Impl.setMediaStyle(paramNotificationBuilderWithBuilderAccessor.getBuilder(), NotificationCompat.Api21Impl.fillInMediaStyle(NotificationCompat.Api24Impl.createDecoratedMediaCustomViewStyle(), mActionsToShowInCompact, mToken));
  }
  
  public int getBigContentViewLayoutResource(int paramInt)
  {
    if (paramInt <= 3) {
      paramInt = R.layout.notification_template_big_media_narrow_custom;
    } else {
      paramInt = R.layout.notification_template_big_media_custom;
    }
    return paramInt;
  }
  
  public int getContentViewLayoutResource()
  {
    int i;
    if (mBuilder.getContentView() != null) {
      i = R.layout.notification_template_media_custom;
    } else {
      i = super.getContentViewLayoutResource();
    }
    return i;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
  {
    return null;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
  {
    return null;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     androidx.media.app.NotificationCompat.DecoratedMediaCustomViewStyle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */