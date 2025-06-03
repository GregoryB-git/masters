package androidx.work.impl.foreground;

import android.app.Notification;
import androidx.annotation.NonNull;

abstract interface SystemForegroundDispatcher$Callback
{
  public abstract void cancelNotification(int paramInt);
  
  public abstract void notify(int paramInt, @NonNull Notification paramNotification);
  
  public abstract void startForeground(int paramInt1, int paramInt2, @NonNull Notification paramNotification);
  
  public abstract void stop();
}

/* Location:
 * Qualified Name:     androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */