package androidx.mediarouter.app;

import android.content.Context;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaControllerCompat.TransportControls;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityRecord;
import androidx.appcompat.app.AppCompatDialog;
import androidx.mediarouter.R.id;
import androidx.mediarouter.R.string;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import java.util.List;

final class MediaRouteControllerDialog$ClickListener
  implements View.OnClickListener
{
  public MediaRouteControllerDialog$ClickListener(MediaRouteControllerDialog paramMediaRouteControllerDialog) {}
  
  public void onClick(View paramView)
  {
    int i = paramView.getId();
    int j = 1;
    int k = 1;
    if ((i != 16908313) && (i != 16908314))
    {
      if (i == R.id.mr_control_playback_ctrl)
      {
        paramView = this$0;
        if (mMediaController != null)
        {
          paramView = mState;
          if (paramView != null)
          {
            j = paramView.getState();
            i = 0;
            if (j != 3) {
              k = 0;
            }
            if ((k != 0) && (this$0.isPauseActionSupported()))
            {
              this$0.mMediaController.getTransportControls().pause();
              j = R.string.mr_controller_pause;
            }
            else if ((k != 0) && (this$0.isStopActionSupported()))
            {
              this$0.mMediaController.getTransportControls().stop();
              j = R.string.mr_controller_stop;
            }
            else
            {
              j = i;
              if (k == 0)
              {
                j = i;
                if (this$0.isPlayActionSupported())
                {
                  this$0.mMediaController.getTransportControls().play();
                  j = R.string.mr_controller_play;
                }
              }
            }
            paramView = this$0.mAccessibilityManager;
            if ((paramView != null) && (paramView.isEnabled()) && (j != 0))
            {
              paramView = AccessibilityEvent.obtain(16384);
              paramView.setPackageName(this$0.mContext.getPackageName());
              paramView.setClassName(ClickListener.class.getName());
              paramView.getText().add(this$0.mContext.getString(j));
              this$0.mAccessibilityManager.sendAccessibilityEvent(paramView);
            }
          }
        }
      }
      else if (i == R.id.mr_close)
      {
        this$0.dismiss();
      }
    }
    else
    {
      if (this$0.mRoute.isSelected())
      {
        paramView = this$0.mRouter;
        if (i == 16908313) {
          j = 2;
        }
        paramView.unselect(j);
      }
      this$0.dismiss();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteControllerDialog.ClickListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */