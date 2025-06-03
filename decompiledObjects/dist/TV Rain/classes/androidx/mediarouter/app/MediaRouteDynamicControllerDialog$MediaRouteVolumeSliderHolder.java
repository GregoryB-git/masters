package androidx.mediarouter.app;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import androidx.annotation.CallSuper;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.Map;

abstract class MediaRouteDynamicControllerDialog$MediaRouteVolumeSliderHolder
  extends RecyclerView.ViewHolder
{
  public final ImageButton mMuteButton;
  public MediaRouter.RouteInfo mRoute;
  public final MediaRouteVolumeSlider mVolumeSlider;
  
  public MediaRouteDynamicControllerDialog$MediaRouteVolumeSliderHolder(MediaRouteDynamicControllerDialog paramMediaRouteDynamicControllerDialog, View paramView, ImageButton paramImageButton, MediaRouteVolumeSlider paramMediaRouteVolumeSlider)
  {
    super(paramView);
    mMuteButton = paramImageButton;
    mVolumeSlider = paramMediaRouteVolumeSlider;
    paramImageButton.setImageDrawable(MediaRouterThemeHelper.getMuteButtonDrawableIcon(mContext));
    MediaRouterThemeHelper.setVolumeSliderColor(mContext, paramMediaRouteVolumeSlider);
  }
  
  @CallSuper
  public void bindRouteVolumeSliderHolder(MediaRouter.RouteInfo paramRouteInfo)
  {
    mRoute = paramRouteInfo;
    int i = paramRouteInfo.getVolume();
    boolean bool;
    if (i == 0) {
      bool = true;
    } else {
      bool = false;
    }
    mMuteButton.setActivated(bool);
    mMuteButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Object localObject = this$0;
        if (mRouteForVolumeUpdatingByUser != null) {
          mHandler.removeMessages(2);
        }
        localObject = MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder.this;
        this$0.mRouteForVolumeUpdatingByUser = mRoute;
        boolean bool = paramAnonymousView.isActivated() ^ true;
        int i;
        if (bool) {
          i = 0;
        } else {
          i = getUnmutedVolume();
        }
        setMute(bool);
        mVolumeSlider.setProgress(i);
        mRoute.requestSetVolume(i);
        this$0.mHandler.sendEmptyMessageDelayed(2, 500L);
      }
    });
    mVolumeSlider.setTag(mRoute);
    mVolumeSlider.setMax(paramRouteInfo.getVolumeMax());
    mVolumeSlider.setProgress(i);
    mVolumeSlider.setOnSeekBarChangeListener(this$0.mVolumeChangeListener);
  }
  
  public int getUnmutedVolume()
  {
    Integer localInteger = (Integer)this$0.mUnmutedVolumeMap.get(mRoute.getId());
    int i = 1;
    if (localInteger != null) {
      i = Math.max(1, localInteger.intValue());
    }
    return i;
  }
  
  public void setMute(boolean paramBoolean)
  {
    if (mMuteButton.isActivated() == paramBoolean) {
      return;
    }
    mMuteButton.setActivated(paramBoolean);
    if (paramBoolean) {
      this$0.mUnmutedVolumeMap.put(mRoute.getId(), Integer.valueOf(mVolumeSlider.getProgress()));
    } else {
      this$0.mUnmutedVolumeMap.remove(mRoute.getId());
    }
  }
  
  public void updateVolume()
  {
    int i = mRoute.getVolume();
    boolean bool;
    if (i == 0) {
      bool = true;
    } else {
      bool = false;
    }
    setMute(bool);
    mVolumeSlider.setProgress(i);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */