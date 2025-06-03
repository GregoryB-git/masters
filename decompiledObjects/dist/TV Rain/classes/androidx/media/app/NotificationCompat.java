package androidx.media.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.Notification.DecoratedMediaCustomViewStyle;
import android.app.Notification.MediaStyle;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.media.session.MediaSession.Token;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;
import androidx.core.app.NotificationCompat.Action;
import androidx.core.app.NotificationCompat.Builder;
import androidx.core.app.NotificationCompat.Style;
import androidx.media.R.color;
import androidx.media.R.id;
import androidx.media.R.integer;
import androidx.media.R.layout;
import java.util.ArrayList;

public class NotificationCompat
{
  @RequiresApi(15)
  public static class Api15Impl
  {
    @DoNotInline
    public static void setContentDescription(RemoteViews paramRemoteViews, int paramInt, CharSequence paramCharSequence)
    {
      paramRemoteViews.setContentDescription(paramInt, paramCharSequence);
    }
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static Notification.MediaStyle createMediaStyle()
    {
      return new Notification.MediaStyle();
    }
    
    @DoNotInline
    public static Notification.MediaStyle fillInMediaStyle(Notification.MediaStyle paramMediaStyle, int[] paramArrayOfInt, MediaSessionCompat.Token paramToken)
    {
      if (paramArrayOfInt != null) {
        setShowActionsInCompactView(paramMediaStyle, paramArrayOfInt);
      }
      if (paramToken != null) {
        setMediaSession(paramMediaStyle, (MediaSession.Token)paramToken.getToken());
      }
      return paramMediaStyle;
    }
    
    @DoNotInline
    public static void setMediaSession(Notification.MediaStyle paramMediaStyle, MediaSession.Token paramToken)
    {
      paramMediaStyle.setMediaSession(paramToken);
    }
    
    @DoNotInline
    public static void setMediaStyle(Notification.Builder paramBuilder, Notification.MediaStyle paramMediaStyle)
    {
      paramBuilder.setStyle(paramMediaStyle);
    }
    
    @DoNotInline
    public static void setShowActionsInCompactView(Notification.MediaStyle paramMediaStyle, int... paramVarArgs)
    {
      paramMediaStyle.setShowActionsInCompactView(paramVarArgs);
    }
  }
  
  @RequiresApi(24)
  public static class Api24Impl
  {
    @DoNotInline
    public static Notification.DecoratedMediaCustomViewStyle createDecoratedMediaCustomViewStyle()
    {
      return new Notification.DecoratedMediaCustomViewStyle();
    }
  }
  
  public static class DecoratedMediaCustomViewStyle
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
  
  public static class MediaStyle
    extends NotificationCompat.Style
  {
    private static final int MAX_MEDIA_BUTTONS = 5;
    private static final int MAX_MEDIA_BUTTONS_IN_COMPACT = 3;
    public int[] mActionsToShowInCompact = null;
    public PendingIntent mCancelButtonIntent;
    public boolean mShowCancelButton;
    public MediaSessionCompat.Token mToken;
    
    public MediaStyle() {}
    
    public MediaStyle(NotificationCompat.Builder paramBuilder)
    {
      setBuilder(paramBuilder);
    }
    
    private RemoteViews generateMediaActionButton(NotificationCompat.Action paramAction)
    {
      int i;
      if (paramAction.getActionIntent() == null) {
        i = 1;
      } else {
        i = 0;
      }
      RemoteViews localRemoteViews = new RemoteViews(mBuilder.mContext.getPackageName(), R.layout.notification_media_action);
      int j = R.id.action0;
      localRemoteViews.setImageViewResource(j, paramAction.getIcon());
      if (i == 0) {
        localRemoteViews.setOnClickPendingIntent(j, paramAction.getActionIntent());
      }
      NotificationCompat.Api15Impl.setContentDescription(localRemoteViews, j, paramAction.getTitle());
      return localRemoteViews;
    }
    
    public static MediaSessionCompat.Token getMediaSession(Notification paramNotification)
    {
      paramNotification = androidx.core.app.NotificationCompat.getExtras(paramNotification);
      if (paramNotification != null)
      {
        paramNotification = paramNotification.getParcelable("android.mediaSession");
        if (paramNotification != null) {
          return MediaSessionCompat.Token.fromToken(paramNotification);
        }
      }
      return null;
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public void apply(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
    {
      NotificationCompat.Api21Impl.setMediaStyle(paramNotificationBuilderWithBuilderAccessor.getBuilder(), NotificationCompat.Api21Impl.fillInMediaStyle(NotificationCompat.Api21Impl.createMediaStyle(), mActionsToShowInCompact, mToken));
    }
    
    public RemoteViews generateBigContentView()
    {
      int i = Math.min(mBuilder.mActions.size(), 5);
      RemoteViews localRemoteViews1 = applyStandardTemplate(false, getBigContentViewLayoutResource(i), false);
      localRemoteViews1.removeAllViews(R.id.media_actions);
      int j;
      if (i > 0) {
        for (j = 0; j < i; j++)
        {
          RemoteViews localRemoteViews2 = generateMediaActionButton((NotificationCompat.Action)mBuilder.mActions.get(j));
          localRemoteViews1.addView(R.id.media_actions, localRemoteViews2);
        }
      }
      if (mShowCancelButton)
      {
        j = R.id.cancel_action;
        localRemoteViews1.setViewVisibility(j, 0);
        localRemoteViews1.setInt(j, "setAlpha", mBuilder.mContext.getResources().getInteger(R.integer.cancel_button_image_alpha));
        localRemoteViews1.setOnClickPendingIntent(j, mCancelButtonIntent);
      }
      else
      {
        localRemoteViews1.setViewVisibility(R.id.cancel_action, 8);
      }
      return localRemoteViews1;
    }
    
    public RemoteViews generateContentView()
    {
      RemoteViews localRemoteViews = applyStandardTemplate(false, getContentViewLayoutResource(), true);
      int i = mBuilder.mActions.size();
      Object localObject = mActionsToShowInCompact;
      int j;
      if (localObject == null) {
        j = 0;
      } else {
        j = Math.min(localObject.length, 3);
      }
      localRemoteViews.removeAllViews(R.id.media_actions);
      if (j > 0)
      {
        int k = 0;
        while (k < j) {
          if (k < i)
          {
            localObject = generateMediaActionButton((NotificationCompat.Action)mBuilder.mActions.get(mActionsToShowInCompact[k]));
            localRemoteViews.addView(R.id.media_actions, (RemoteViews)localObject);
            k++;
          }
          else
          {
            throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[] { Integer.valueOf(k), Integer.valueOf(i - 1) }));
          }
        }
      }
      if (mShowCancelButton)
      {
        localRemoteViews.setViewVisibility(R.id.end_padder, 8);
        j = R.id.cancel_action;
        localRemoteViews.setViewVisibility(j, 0);
        localRemoteViews.setOnClickPendingIntent(j, mCancelButtonIntent);
        localRemoteViews.setInt(j, "setAlpha", mBuilder.mContext.getResources().getInteger(R.integer.cancel_button_image_alpha));
      }
      else
      {
        localRemoteViews.setViewVisibility(R.id.end_padder, 0);
        localRemoteViews.setViewVisibility(R.id.cancel_action, 8);
      }
      return localRemoteViews;
    }
    
    public int getBigContentViewLayoutResource(int paramInt)
    {
      if (paramInt <= 3) {
        paramInt = R.layout.notification_template_big_media_narrow;
      } else {
        paramInt = R.layout.notification_template_big_media;
      }
      return paramInt;
    }
    
    public int getContentViewLayoutResource()
    {
      return R.layout.notification_template_media;
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
    
    public MediaStyle setCancelButtonIntent(PendingIntent paramPendingIntent)
    {
      mCancelButtonIntent = paramPendingIntent;
      return this;
    }
    
    public MediaStyle setMediaSession(MediaSessionCompat.Token paramToken)
    {
      mToken = paramToken;
      return this;
    }
    
    public MediaStyle setShowActionsInCompactView(int... paramVarArgs)
    {
      mActionsToShowInCompact = paramVarArgs;
      return this;
    }
    
    public MediaStyle setShowCancelButton(boolean paramBoolean)
    {
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.app.NotificationCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */