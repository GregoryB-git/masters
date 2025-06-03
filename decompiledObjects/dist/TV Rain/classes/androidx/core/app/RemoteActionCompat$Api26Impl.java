package androidx.core.app;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
class RemoteActionCompat$Api26Impl
{
  @DoNotInline
  public static RemoteAction createRemoteAction(Icon paramIcon, CharSequence paramCharSequence1, CharSequence paramCharSequence2, PendingIntent paramPendingIntent)
  {
    return new RemoteAction(paramIcon, paramCharSequence1, paramCharSequence2, paramPendingIntent);
  }
  
  @DoNotInline
  public static PendingIntent getActionIntent(RemoteAction paramRemoteAction)
  {
    return paramRemoteAction.getActionIntent();
  }
  
  @DoNotInline
  public static CharSequence getContentDescription(RemoteAction paramRemoteAction)
  {
    return paramRemoteAction.getContentDescription();
  }
  
  @DoNotInline
  public static Icon getIcon(RemoteAction paramRemoteAction)
  {
    return paramRemoteAction.getIcon();
  }
  
  @DoNotInline
  public static CharSequence getTitle(RemoteAction paramRemoteAction)
  {
    return paramRemoteAction.getTitle();
  }
  
  @DoNotInline
  public static boolean isEnabled(RemoteAction paramRemoteAction)
  {
    return paramRemoteAction.isEnabled();
  }
  
  @DoNotInline
  public static void setEnabled(RemoteAction paramRemoteAction, boolean paramBoolean)
  {
    paramRemoteAction.setEnabled(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.RemoteActionCompat.Api26Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */