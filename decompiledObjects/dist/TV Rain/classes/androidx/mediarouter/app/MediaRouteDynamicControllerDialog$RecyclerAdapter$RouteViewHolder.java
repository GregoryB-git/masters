package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.mediarouter.R.dimen;
import androidx.mediarouter.R.id;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import androidx.mediarouter.media.MediaRouter.RouteInfo.DynamicGroupState;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class MediaRouteDynamicControllerDialog$RecyclerAdapter$RouteViewHolder
  extends MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder
{
  public final CheckBox mCheckBox;
  public final int mCollapsedLayoutHeight;
  public final float mDisabledAlpha;
  public final int mExpandedLayoutHeight;
  public final ImageView mImageView;
  public final View mItemView;
  public final ProgressBar mProgressBar;
  public final TextView mTextView;
  public final View.OnClickListener mViewClickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      paramAnonymousView = MediaRouteDynamicControllerDialog.RecyclerAdapter.RouteViewHolder.this;
      boolean bool1 = paramAnonymousView.isSelected(mRoute) ^ true;
      boolean bool2 = mRoute.isGroup();
      if (bool1)
      {
        paramAnonymousView = MediaRouteDynamicControllerDialog.RecyclerAdapter.RouteViewHolder.this;
        this$1.this$0.mRouter.addMemberToDynamicGroup(mRoute);
      }
      else
      {
        paramAnonymousView = MediaRouteDynamicControllerDialog.RecyclerAdapter.RouteViewHolder.this;
        this$1.this$0.mRouter.removeMemberFromDynamicGroup(mRoute);
      }
      showSelectingProgress(bool1, bool2 ^ true);
      if (bool2)
      {
        List localList = this$1.this$0.mSelectedRoute.getMemberRoutes();
        paramAnonymousView = mRoute.getMemberRoutes().iterator();
        while (paramAnonymousView.hasNext())
        {
          Object localObject = (MediaRouter.RouteInfo)paramAnonymousView.next();
          if (localList.contains(localObject) != bool1)
          {
            localObject = (MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder)this$1.this$0.mVolumeSliderHolderMap.get(((MediaRouter.RouteInfo)localObject).getId());
            if ((localObject instanceof MediaRouteDynamicControllerDialog.RecyclerAdapter.RouteViewHolder)) {
              ((MediaRouteDynamicControllerDialog.RecyclerAdapter.RouteViewHolder)localObject).showSelectingProgress(bool1, true);
            }
          }
        }
      }
      paramAnonymousView = MediaRouteDynamicControllerDialog.RecyclerAdapter.RouteViewHolder.this;
      this$1.mayUpdateGroupVolume(mRoute, bool1);
    }
  };
  public final RelativeLayout mVolumeSliderLayout;
  
  public MediaRouteDynamicControllerDialog$RecyclerAdapter$RouteViewHolder(MediaRouteDynamicControllerDialog.RecyclerAdapter paramRecyclerAdapter, View paramView)
  {
    super(this$0, paramView, (ImageButton)paramView.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider)paramView.findViewById(R.id.mr_cast_volume_slider));
    mItemView = paramView;
    mImageView = ((ImageView)paramView.findViewById(R.id.mr_cast_route_icon));
    Object localObject = (ProgressBar)paramView.findViewById(R.id.mr_cast_route_progress_bar);
    mProgressBar = ((ProgressBar)localObject);
    mTextView = ((TextView)paramView.findViewById(R.id.mr_cast_route_name));
    mVolumeSliderLayout = ((RelativeLayout)paramView.findViewById(R.id.mr_cast_volume_layout));
    paramView = (CheckBox)paramView.findViewById(R.id.mr_cast_checkbox);
    mCheckBox = paramView;
    paramView.setButtonDrawable(MediaRouterThemeHelper.getCheckBoxDrawableIcon(this$0.mContext));
    MediaRouterThemeHelper.setIndeterminateProgressBarColor(this$0.mContext, (ProgressBar)localObject);
    mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(this$0.mContext);
    localObject = this$0.mContext.getResources();
    paramRecyclerAdapter = ((Resources)localObject).getDisplayMetrics();
    paramView = new TypedValue();
    ((Resources)localObject).getValue(R.dimen.mr_dynamic_dialog_row_height, paramView, true);
    mExpandedLayoutHeight = ((int)paramView.getDimension(paramRecyclerAdapter));
    mCollapsedLayoutHeight = 0;
  }
  
  private boolean isEnabled(MediaRouter.RouteInfo paramRouteInfo)
  {
    boolean bool1 = this$1.this$0.mUngroupableRoutes.contains(paramRouteInfo);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    if ((isSelected(paramRouteInfo)) && (this$1.this$0.mSelectedRoute.getMemberRoutes().size() < 2)) {
      return false;
    }
    if (isSelected(paramRouteInfo))
    {
      paramRouteInfo = this$1.this$0.mSelectedRoute.getDynamicGroupState(paramRouteInfo);
      bool1 = bool2;
      if (paramRouteInfo != null)
      {
        bool1 = bool2;
        if (paramRouteInfo.isUnselectable()) {
          bool1 = true;
        }
      }
      return bool1;
    }
    return true;
  }
  
  public void bindRouteViewHolder(MediaRouteDynamicControllerDialog.RecyclerAdapter.Item paramItem)
  {
    Object localObject = (MediaRouter.RouteInfo)paramItem.getData();
    paramItem = (MediaRouteDynamicControllerDialog.RecyclerAdapter.Item)localObject;
    if (localObject == this$1.this$0.mSelectedRoute)
    {
      paramItem = (MediaRouteDynamicControllerDialog.RecyclerAdapter.Item)localObject;
      if (((MediaRouter.RouteInfo)localObject).getMemberRoutes().size() > 0)
      {
        Iterator localIterator = ((MediaRouter.RouteInfo)localObject).getMemberRoutes().iterator();
        do
        {
          paramItem = (MediaRouteDynamicControllerDialog.RecyclerAdapter.Item)localObject;
          if (!localIterator.hasNext()) {
            break;
          }
          paramItem = (MediaRouter.RouteInfo)localIterator.next();
        } while (this$1.this$0.mGroupableRoutes.contains(paramItem));
      }
    }
    bindRouteVolumeSliderHolder(paramItem);
    mImageView.setImageDrawable(this$1.getIconDrawable(paramItem));
    mTextView.setText(paramItem.getName());
    localObject = mCheckBox;
    boolean bool1 = false;
    ((View)localObject).setVisibility(0);
    boolean bool2 = isSelected(paramItem);
    boolean bool3 = isEnabled(paramItem);
    mCheckBox.setChecked(bool2);
    mProgressBar.setVisibility(4);
    mImageView.setVisibility(0);
    mItemView.setEnabled(bool3);
    mCheckBox.setEnabled(bool3);
    paramItem = mMuteButton;
    boolean bool4;
    if ((!bool3) && (!bool2)) {
      bool4 = false;
    } else {
      bool4 = true;
    }
    paramItem.setEnabled(bool4);
    paramItem = mVolumeSlider;
    if (!bool3)
    {
      bool4 = bool1;
      if (!bool2) {}
    }
    else
    {
      bool4 = true;
    }
    paramItem.setEnabled(bool4);
    mItemView.setOnClickListener(mViewClickListener);
    mCheckBox.setOnClickListener(mViewClickListener);
    paramItem = mVolumeSliderLayout;
    int i;
    if ((bool2) && (!mRoute.isGroup())) {
      i = mExpandedLayoutHeight;
    } else {
      i = mCollapsedLayoutHeight;
    }
    MediaRouteDynamicControllerDialog.setLayoutHeight(paramItem, i);
    paramItem = mItemView;
    float f1 = 1.0F;
    if ((!bool3) && (!bool2)) {
      f2 = mDisabledAlpha;
    } else {
      f2 = 1.0F;
    }
    paramItem.setAlpha(f2);
    paramItem = mCheckBox;
    float f2 = f1;
    if (!bool3) {
      if (!bool2) {
        f2 = f1;
      } else {
        f2 = mDisabledAlpha;
      }
    }
    paramItem.setAlpha(f2);
  }
  
  public boolean isSelected(MediaRouter.RouteInfo paramRouteInfo)
  {
    boolean bool1 = paramRouteInfo.isSelected();
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    paramRouteInfo = this$1.this$0.mSelectedRoute.getDynamicGroupState(paramRouteInfo);
    if ((paramRouteInfo == null) || (paramRouteInfo.getSelectionState() != 3)) {
      bool2 = false;
    }
    return bool2;
  }
  
  public void showSelectingProgress(boolean paramBoolean1, boolean paramBoolean2)
  {
    mCheckBox.setEnabled(false);
    mItemView.setEnabled(false);
    mCheckBox.setChecked(paramBoolean1);
    if (paramBoolean1)
    {
      mImageView.setVisibility(4);
      mProgressBar.setVisibility(0);
    }
    if (paramBoolean2)
    {
      MediaRouteDynamicControllerDialog.RecyclerAdapter localRecyclerAdapter = this$1;
      RelativeLayout localRelativeLayout = mVolumeSliderLayout;
      int i;
      if (paramBoolean1) {
        i = mExpandedLayoutHeight;
      } else {
        i = mCollapsedLayoutHeight;
      }
      localRecyclerAdapter.animateLayoutHeight(localRelativeLayout, i);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicControllerDialog.RecyclerAdapter.RouteViewHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */