package androidx.core.app;

import android.app.Notification.Builder;
import android.app.Notification.DecoratedCustomViewStyle;
import android.content.Context;
import android.content.res.Resources;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.R.color;
import androidx.core.R.id;
import androidx.core.R.layout;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NotificationCompat$DecoratedCustomViewStyle
  extends NotificationCompat.Style
{
  private static final int MAX_ACTION_BUTTONS = 3;
  private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
  
  private RemoteViews createRemoteViews(RemoteViews paramRemoteViews, boolean paramBoolean)
  {
    int i = R.layout.notification_template_custom_big;
    int j = 1;
    int k = 0;
    RemoteViews localRemoteViews1 = applyStandardTemplate(true, i, false);
    localRemoteViews1.removeAllViews(R.id.actions);
    List localList = getNonContextualActions(mBuilder.mActions);
    if ((paramBoolean) && (localList != null))
    {
      int m = Math.min(localList.size(), 3);
      if (m > 0) {
        for (i = 0;; i++)
        {
          n = j;
          if (i >= m) {
            break;
          }
          RemoteViews localRemoteViews2 = generateActionButton((NotificationCompat.Action)localList.get(i));
          localRemoteViews1.addView(R.id.actions, localRemoteViews2);
        }
      }
    }
    int n = 0;
    if (n != 0) {
      i = k;
    } else {
      i = 8;
    }
    localRemoteViews1.setViewVisibility(R.id.actions, i);
    localRemoteViews1.setViewVisibility(R.id.action_divider, i);
    buildIntoRemoteViews(localRemoteViews1, paramRemoteViews);
    return localRemoteViews1;
  }
  
  private RemoteViews generateActionButton(NotificationCompat.Action paramAction)
  {
    int i;
    if (actionIntent == null) {
      i = 1;
    } else {
      i = 0;
    }
    Object localObject = mBuilder.mContext.getPackageName();
    int j;
    if (i != 0) {
      j = R.layout.notification_action_tombstone;
    } else {
      j = R.layout.notification_action;
    }
    localObject = new RemoteViews((String)localObject, j);
    IconCompat localIconCompat = paramAction.getIconCompat();
    if (localIconCompat != null) {
      ((RemoteViews)localObject).setImageViewBitmap(R.id.action_image, createColoredBitmap(localIconCompat, mBuilder.mContext.getResources().getColor(R.color.notification_action_color_filter)));
    }
    ((RemoteViews)localObject).setTextViewText(R.id.action_text, title);
    if (i == 0) {
      ((RemoteViews)localObject).setOnClickPendingIntent(R.id.action_container, actionIntent);
    }
    ((RemoteViews)localObject).setContentDescription(R.id.action_container, title);
    return (RemoteViews)localObject;
  }
  
  private static List<NotificationCompat.Action> getNonContextualActions(List<NotificationCompat.Action> paramList)
  {
    if (paramList == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (NotificationCompat.Action)localIterator.next();
      if (!paramList.isContextual()) {
        localArrayList.add(paramList);
      }
    }
    return localArrayList;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void apply(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
  {
    paramNotificationBuilderWithBuilderAccessor.getBuilder().setStyle(new Notification.DecoratedCustomViewStyle());
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public boolean displayCustomViewInline()
  {
    return true;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public String getClassName()
  {
    return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
  {
    return null;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
  {
    return null;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompat.DecoratedCustomViewStyle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */