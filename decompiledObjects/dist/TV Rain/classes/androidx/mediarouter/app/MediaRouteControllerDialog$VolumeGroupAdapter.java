package androidx.mediarouter.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.R.id;
import androidx.mediarouter.R.layout;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;

class MediaRouteControllerDialog$VolumeGroupAdapter
  extends ArrayAdapter<MediaRouter.RouteInfo>
{
  public final float mDisabledAlpha;
  
  public MediaRouteControllerDialog$VolumeGroupAdapter(Context paramContext, List<MediaRouter.RouteInfo> paramList)
  {
    super(paramList, 0, localList);
    mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(paramList);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = 0;
    if (paramView == null) {
      paramView = LayoutInflater.from(paramViewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, paramViewGroup, false);
    } else {
      this$0.updateVolumeGroupItemHeight(paramView);
    }
    MediaRouter.RouteInfo localRouteInfo = (MediaRouter.RouteInfo)getItem(paramInt);
    if (localRouteInfo != null)
    {
      boolean bool = localRouteInfo.isEnabled();
      Object localObject = (TextView)paramView.findViewById(R.id.mr_name);
      ((TextView)localObject).setEnabled(bool);
      ((TextView)localObject).setText(localRouteInfo.getName());
      localObject = (MediaRouteVolumeSlider)paramView.findViewById(R.id.mr_volume_slider);
      MediaRouterThemeHelper.setVolumeSliderColor(paramViewGroup.getContext(), (MediaRouteVolumeSlider)localObject, this$0.mVolumeGroupList);
      ((View)localObject).setTag(localRouteInfo);
      this$0.mVolumeSliderMap.put(localRouteInfo, localObject);
      ((MediaRouteVolumeSlider)localObject).setHideThumb(bool ^ true);
      ((View)localObject).setEnabled(bool);
      if (bool) {
        if (this$0.isVolumeControlAvailable(localRouteInfo))
        {
          ((ProgressBar)localObject).setMax(localRouteInfo.getVolumeMax());
          ((ProgressBar)localObject).setProgress(localRouteInfo.getVolume());
          ((SeekBar)localObject).setOnSeekBarChangeListener(this$0.mVolumeChangeListener);
        }
        else
        {
          ((ProgressBar)localObject).setMax(100);
          ((ProgressBar)localObject).setProgress(100);
          ((View)localObject).setEnabled(false);
        }
      }
      paramViewGroup = (ImageView)paramView.findViewById(R.id.mr_volume_item_icon);
      if (bool) {
        paramInt = 255;
      } else {
        paramInt = (int)(mDisabledAlpha * 255.0F);
      }
      paramViewGroup.setAlpha(paramInt);
      paramViewGroup = (LinearLayout)paramView.findViewById(R.id.volume_item_container);
      paramInt = i;
      if (this$0.mGroupMemberRoutesAnimatingWithBitmap.contains(localRouteInfo)) {
        paramInt = 4;
      }
      paramViewGroup.setVisibility(paramInt);
      paramViewGroup = this$0.mGroupMemberRoutesAdded;
      if ((paramViewGroup != null) && (paramViewGroup.contains(localRouteInfo)))
      {
        paramViewGroup = new AlphaAnimation(0.0F, 0.0F);
        paramViewGroup.setDuration(0L);
        paramViewGroup.setFillEnabled(true);
        paramViewGroup.setFillAfter(true);
        paramView.clearAnimation();
        paramView.startAnimation(paramViewGroup);
      }
    }
    return paramView;
  }
  
  public boolean isEnabled(int paramInt)
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteControllerDialog.VolumeGroupAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */