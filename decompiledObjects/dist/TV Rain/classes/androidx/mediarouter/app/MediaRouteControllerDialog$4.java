package androidx.mediarouter.app;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.app.AppCompatDialog;

class MediaRouteControllerDialog$4
  implements View.OnClickListener
{
  public MediaRouteControllerDialog$4(MediaRouteControllerDialog paramMediaRouteControllerDialog) {}
  
  public void onClick(View paramView)
  {
    paramView = this$0.mMediaController;
    if (paramView != null)
    {
      paramView = paramView.getSessionActivity();
      if (paramView != null) {
        try
        {
          paramView.send();
          this$0.dismiss();
        }
        catch (PendingIntent.CanceledException localCanceledException)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(paramView);
          localStringBuilder.append(" was not sent, it had been canceled.");
          Log.e("MediaRouteCtrlDialog", localStringBuilder.toString());
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteControllerDialog.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */