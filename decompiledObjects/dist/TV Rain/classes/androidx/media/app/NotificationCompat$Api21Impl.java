package androidx.media.app;

import android.app.Notification.Builder;
import android.app.Notification.MediaStyle;
import android.media.session.MediaSession.Token;
import android.support.v4.media.session.MediaSessionCompat.Token;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class NotificationCompat$Api21Impl
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

/* Location:
 * Qualified Name:     androidx.media.app.NotificationCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */