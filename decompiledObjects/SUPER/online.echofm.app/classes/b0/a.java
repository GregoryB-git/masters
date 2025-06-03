package b0;

import android.app.Notification.Builder;
import android.app.Notification.MediaStyle;
import android.media.session.MediaSession.Token;
import android.support.v4.media.session.MediaSessionCompat.Token;

public abstract class a
{
  public static Notification.MediaStyle a()
  {
    return new Notification.MediaStyle();
  }
  
  public static Notification.MediaStyle b(Notification.MediaStyle paramMediaStyle, int[] paramArrayOfInt, MediaSessionCompat.Token paramToken)
  {
    if (paramArrayOfInt != null) {
      e(paramMediaStyle, paramArrayOfInt);
    }
    if (paramToken != null) {
      c(paramMediaStyle, (MediaSession.Token)paramToken.e());
    }
    return paramMediaStyle;
  }
  
  public static void c(Notification.MediaStyle paramMediaStyle, MediaSession.Token paramToken)
  {
    paramMediaStyle.setMediaSession(paramToken);
  }
  
  public static void d(Notification.Builder paramBuilder, Notification.MediaStyle paramMediaStyle)
  {
    paramBuilder.setStyle(paramMediaStyle);
  }
  
  public static void e(Notification.MediaStyle paramMediaStyle, int... paramVarArgs)
  {
    paramMediaStyle.setShowActionsInCompactView(paramVarArgs);
  }
}

/* Location:
 * Qualified Name:     b0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */