package b0;

import android.annotation.SuppressLint;
import android.app.Notification.MediaStyle;
import android.app.PendingIntent;
import androidx.annotation.NonNull;

public abstract class b
{
  @SuppressLint({"MissingPermission"})
  public static Notification.MediaStyle a(Notification.MediaStyle paramMediaStyle, @NonNull CharSequence paramCharSequence, int paramInt, PendingIntent paramPendingIntent, Boolean paramBoolean)
  {
    if (paramBoolean.booleanValue()) {
      paramMediaStyle.setRemotePlaybackInfo(paramCharSequence, paramInt, paramPendingIntent);
    }
    return paramMediaStyle;
  }
}

/* Location:
 * Qualified Name:     b0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */