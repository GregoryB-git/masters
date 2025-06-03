package androidx.mediarouter.app;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.mediarouter.R.dimen;
import androidx.mediarouter.R.id;
import androidx.mediarouter.R.integer;
import androidx.mediarouter.R.layout;
import androidx.mediarouter.R.string;
import androidx.mediarouter.media.MediaRouteProvider.DynamicGroupRouteController;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import androidx.mediarouter.media.MediaRouter.RouteInfo.DynamicGroupState;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class MediaRouteDynamicControllerDialog$RecyclerAdapter
  extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
  private static final int ITEM_TYPE_GROUP = 4;
  private static final int ITEM_TYPE_GROUP_VOLUME = 1;
  private static final int ITEM_TYPE_HEADER = 2;
  private static final int ITEM_TYPE_ROUTE = 3;
  private final Interpolator mAccelerateDecelerateInterpolator;
  private final Drawable mDefaultIcon;
  private Item mGroupVolumeItem;
  private final LayoutInflater mInflater;
  private final ArrayList<Item> mItems = new ArrayList();
  private final int mLayoutAnimationDurationMs;
  private final Drawable mSpeakerGroupIcon;
  private final Drawable mSpeakerIcon;
  private final Drawable mTvIcon;
  
  public MediaRouteDynamicControllerDialog$RecyclerAdapter(MediaRouteDynamicControllerDialog paramMediaRouteDynamicControllerDialog)
  {
    mInflater = LayoutInflater.from(mContext);
    mDefaultIcon = MediaRouterThemeHelper.getDefaultDrawableIcon(mContext);
    mTvIcon = MediaRouterThemeHelper.getTvDrawableIcon(mContext);
    mSpeakerIcon = MediaRouterThemeHelper.getSpeakerDrawableIcon(mContext);
    mSpeakerGroupIcon = MediaRouterThemeHelper.getSpeakerGroupDrawableIcon(mContext);
    mLayoutAnimationDurationMs = mContext.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
    mAccelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
    updateItems();
  }
  
  private Drawable getDefaultIconDrawable(MediaRouter.RouteInfo paramRouteInfo)
  {
    int i = paramRouteInfo.getDeviceType();
    if (i != 1)
    {
      if (i != 2)
      {
        if (paramRouteInfo.isGroup()) {
          return mSpeakerGroupIcon;
        }
        return mDefaultIcon;
      }
      return mSpeakerIcon;
    }
    return mTvIcon;
  }
  
  public void animateLayoutHeight(final View paramView, final int paramInt)
  {
    Animation local1 = new Animation()
    {
      public void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        int i = paramInt;
        int j = val$startValue;
        i = (int)((i - j) * paramAnonymousFloat);
        MediaRouteDynamicControllerDialog.setLayoutHeight(paramView, j + i);
      }
    };
    local1.setAnimationListener(new Animation.AnimationListener()
    {
      public void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        paramAnonymousAnimation = this$0;
        mIsAnimatingVolumeSliderLayout = false;
        paramAnonymousAnimation.updateViewsIfNeeded();
      }
      
      public void onAnimationRepeat(Animation paramAnonymousAnimation) {}
      
      public void onAnimationStart(Animation paramAnonymousAnimation)
      {
        this$0.mIsAnimatingVolumeSliderLayout = true;
      }
    });
    local1.setDuration(mLayoutAnimationDurationMs);
    local1.setInterpolator(mAccelerateDecelerateInterpolator);
    paramView.startAnimation(local1);
  }
  
  public Drawable getIconDrawable(MediaRouter.RouteInfo paramRouteInfo)
  {
    Uri localUri = paramRouteInfo.getIconUri();
    if (localUri != null) {
      try
      {
        localObject = Drawable.createFromStream(this$0.mContext.getContentResolver().openInputStream(localUri), null);
        if (localObject != null) {
          return (Drawable)localObject;
        }
      }
      catch (IOException localIOException)
      {
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Failed to load ");
        ((StringBuilder)localObject).append(localUri);
        Log.w("MediaRouteCtrlDialog", ((StringBuilder)localObject).toString(), localIOException);
      }
    }
    return getDefaultIconDrawable(paramRouteInfo);
  }
  
  public Item getItem(int paramInt)
  {
    if (paramInt == 0) {
      return mGroupVolumeItem;
    }
    return (Item)mItems.get(paramInt - 1);
  }
  
  public int getItemCount()
  {
    return mItems.size() + 1;
  }
  
  public int getItemViewType(int paramInt)
  {
    return getItem(paramInt).getType();
  }
  
  public boolean isGroupVolumeNeeded()
  {
    MediaRouteDynamicControllerDialog localMediaRouteDynamicControllerDialog = this$0;
    boolean bool1 = mEnableGroupVolumeUX;
    boolean bool2 = true;
    if ((!bool1) || (mSelectedRoute.getMemberRoutes().size() <= 1)) {
      bool2 = false;
    }
    return bool2;
  }
  
  public void mayUpdateGroupVolume(MediaRouter.RouteInfo paramRouteInfo, boolean paramBoolean)
  {
    Object localObject = this$0.mSelectedRoute.getMemberRoutes();
    int i = ((List)localObject).size();
    boolean bool1 = true;
    int j = Math.max(1, i);
    boolean bool2 = paramRouteInfo.isGroup();
    i = -1;
    if (bool2)
    {
      paramRouteInfo = paramRouteInfo.getMemberRoutes().iterator();
      i = j;
      for (;;)
      {
        j = i;
        if (!paramRouteInfo.hasNext()) {
          break;
        }
        if (((List)localObject).contains((MediaRouter.RouteInfo)paramRouteInfo.next()) != paramBoolean)
        {
          if (paramBoolean) {
            j = 1;
          } else {
            j = -1;
          }
          i += j;
        }
      }
    }
    if (paramBoolean) {
      i = 1;
    }
    j += i;
    bool2 = isGroupVolumeNeeded();
    paramRouteInfo = this$0;
    paramBoolean = mEnableGroupVolumeUX;
    i = 0;
    if ((paramBoolean) && (j >= 2)) {
      paramBoolean = bool1;
    } else {
      paramBoolean = false;
    }
    if (bool2 != paramBoolean)
    {
      paramRouteInfo = mRecyclerView.findViewHolderForAdapterPosition(0);
      if ((paramRouteInfo instanceof GroupVolumeViewHolder))
      {
        paramRouteInfo = (GroupVolumeViewHolder)paramRouteInfo;
        localObject = itemView;
        if (paramBoolean) {
          i = paramRouteInfo.getExpandedHeight();
        }
        animateLayoutHeight((View)localObject, i);
      }
    }
  }
  
  public void notifyAdapterDataSetChanged()
  {
    this$0.mUngroupableRoutes.clear();
    MediaRouteDynamicControllerDialog localMediaRouteDynamicControllerDialog = this$0;
    mUngroupableRoutes.addAll(MediaRouteDialogHelper.getItemsRemoved(mGroupableRoutes, localMediaRouteDynamicControllerDialog.getCurrentGroupableRoutes()));
    notifyDataSetChanged();
  }
  
  public void onBindViewHolder(@NonNull RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    int i = getItemViewType(paramInt);
    Item localItem = getItem(paramInt);
    MediaRouter.RouteInfo localRouteInfo;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4) {
            Log.w("MediaRouteCtrlDialog", "Cannot bind item to ViewHolder because of wrong view type");
          } else {
            ((GroupViewHolder)paramViewHolder).bindGroupViewHolder(localItem);
          }
        }
        else
        {
          localRouteInfo = (MediaRouter.RouteInfo)localItem.getData();
          this$0.mVolumeSliderHolderMap.put(localRouteInfo.getId(), (MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder)paramViewHolder);
          ((RouteViewHolder)paramViewHolder).bindRouteViewHolder(localItem);
        }
      }
      else {
        ((HeaderViewHolder)paramViewHolder).bindHeaderViewHolder(localItem);
      }
    }
    else
    {
      localRouteInfo = (MediaRouter.RouteInfo)localItem.getData();
      this$0.mVolumeSliderHolderMap.put(localRouteInfo.getId(), (MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder)paramViewHolder);
      ((GroupVolumeViewHolder)paramViewHolder).bindGroupVolumeViewHolder(localItem);
    }
  }
  
  public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup paramViewGroup, int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3)
        {
          if (paramInt != 4)
          {
            Log.w("MediaRouteCtrlDialog", "Cannot create ViewHolder because of wrong view type");
            return null;
          }
          return new GroupViewHolder(mInflater.inflate(R.layout.mr_cast_group_item, paramViewGroup, false));
        }
        return new RouteViewHolder(mInflater.inflate(R.layout.mr_cast_route_item, paramViewGroup, false));
      }
      return new HeaderViewHolder(mInflater.inflate(R.layout.mr_cast_header_item, paramViewGroup, false));
    }
    return new GroupVolumeViewHolder(mInflater.inflate(R.layout.mr_cast_group_volume_item, paramViewGroup, false));
  }
  
  public void onViewRecycled(@NonNull RecyclerView.ViewHolder paramViewHolder)
  {
    super.onViewRecycled(paramViewHolder);
    this$0.mVolumeSliderHolderMap.values().remove(paramViewHolder);
  }
  
  public void updateItems()
  {
    mItems.clear();
    mGroupVolumeItem = new Item(this$0.mSelectedRoute, 1);
    Object localObject1;
    Object localObject2;
    if (!this$0.mMemberRoutes.isEmpty())
    {
      localObject1 = this$0.mMemberRoutes.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (MediaRouter.RouteInfo)((Iterator)localObject1).next();
        mItems.add(new Item(localObject2, 3));
      }
    }
    mItems.add(new Item(this$0.mSelectedRoute, 3));
    boolean bool = this$0.mGroupableRoutes.isEmpty();
    int i = 0;
    Iterator localIterator;
    int j;
    MediaRouter.RouteInfo localRouteInfo;
    int k;
    if (!bool)
    {
      localIterator = this$0.mGroupableRoutes.iterator();
      j = 0;
      while (localIterator.hasNext())
      {
        localRouteInfo = (MediaRouter.RouteInfo)localIterator.next();
        if (!this$0.mMemberRoutes.contains(localRouteInfo))
        {
          k = j;
          if (j == 0)
          {
            localObject2 = this$0.mSelectedRoute.getDynamicGroupController();
            if (localObject2 != null) {
              localObject2 = ((MediaRouteProvider.DynamicGroupRouteController)localObject2).getGroupableSelectionTitle();
            } else {
              localObject2 = null;
            }
            localObject1 = localObject2;
            if (TextUtils.isEmpty((CharSequence)localObject2)) {
              localObject1 = this$0.mContext.getString(R.string.mr_dialog_groupable_header);
            }
            mItems.add(new Item(localObject1, 2));
            k = 1;
          }
          mItems.add(new Item(localRouteInfo, 3));
          j = k;
        }
      }
    }
    if (!this$0.mTransferableRoutes.isEmpty())
    {
      localIterator = this$0.mTransferableRoutes.iterator();
      j = i;
      while (localIterator.hasNext())
      {
        localRouteInfo = (MediaRouter.RouteInfo)localIterator.next();
        localObject2 = this$0.mSelectedRoute;
        if (localObject2 != localRouteInfo)
        {
          k = j;
          if (j == 0)
          {
            localObject2 = ((MediaRouter.RouteInfo)localObject2).getDynamicGroupController();
            if (localObject2 != null) {
              localObject2 = ((MediaRouteProvider.DynamicGroupRouteController)localObject2).getTransferableSectionTitle();
            } else {
              localObject2 = null;
            }
            localObject1 = localObject2;
            if (TextUtils.isEmpty((CharSequence)localObject2)) {
              localObject1 = this$0.mContext.getString(R.string.mr_dialog_transferable_header);
            }
            mItems.add(new Item(localObject1, 2));
            k = 1;
          }
          mItems.add(new Item(localRouteInfo, 4));
          j = k;
        }
      }
    }
    notifyAdapterDataSetChanged();
  }
  
  public class GroupViewHolder
    extends RecyclerView.ViewHolder
  {
    public final float mDisabledAlpha;
    public final ImageView mImageView;
    public final View mItemView;
    public final ProgressBar mProgressBar;
    public MediaRouter.RouteInfo mRoute;
    public final TextView mTextView;
    
    public GroupViewHolder(View paramView)
    {
      super();
      mItemView = paramView;
      mImageView = ((ImageView)paramView.findViewById(R.id.mr_cast_group_icon));
      ProgressBar localProgressBar = (ProgressBar)paramView.findViewById(R.id.mr_cast_group_progress_bar);
      mProgressBar = localProgressBar;
      mTextView = ((TextView)paramView.findViewById(R.id.mr_cast_group_name));
      mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(this$0.mContext);
      MediaRouterThemeHelper.setIndeterminateProgressBarColor(this$0.mContext, localProgressBar);
    }
    
    private boolean isEnabled(MediaRouter.RouteInfo paramRouteInfo)
    {
      List localList = this$0.mSelectedRoute.getMemberRoutes();
      return (localList.size() != 1) || (localList.get(0) != paramRouteInfo);
    }
    
    public void bindGroupViewHolder(MediaRouteDynamicControllerDialog.RecyclerAdapter.Item paramItem)
    {
      MediaRouter.RouteInfo localRouteInfo = (MediaRouter.RouteInfo)paramItem.getData();
      mRoute = localRouteInfo;
      mImageView.setVisibility(0);
      mProgressBar.setVisibility(4);
      boolean bool = isEnabled(localRouteInfo);
      paramItem = mItemView;
      float f;
      if (bool) {
        f = 1.0F;
      } else {
        f = mDisabledAlpha;
      }
      paramItem.setAlpha(f);
      mItemView.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          paramAnonymousView = MediaRouteDynamicControllerDialog.RecyclerAdapter.GroupViewHolder.this;
          this$1.this$0.mRouter.transferToRoute(mRoute);
          mImageView.setVisibility(4);
          mProgressBar.setVisibility(0);
        }
      });
      mImageView.setImageDrawable(getIconDrawable(localRouteInfo));
      mTextView.setText(localRouteInfo.getName());
    }
  }
  
  public class GroupVolumeViewHolder
    extends MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder
  {
    private final int mExpandedHeight;
    private final TextView mTextView;
    
    public GroupVolumeViewHolder(View paramView)
    {
      super(paramView, (ImageButton)paramView.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider)paramView.findViewById(R.id.mr_cast_volume_slider));
      mTextView = ((TextView)paramView.findViewById(R.id.mr_group_volume_route_name));
      paramView = this$0.mContext.getResources();
      this$1 = paramView.getDisplayMetrics();
      TypedValue localTypedValue = new TypedValue();
      paramView.getValue(R.dimen.mr_dynamic_volume_group_list_item_height, localTypedValue, true);
      mExpandedHeight = ((int)localTypedValue.getDimension(MediaRouteDynamicControllerDialog.RecyclerAdapter.this));
    }
    
    public void bindGroupVolumeViewHolder(MediaRouteDynamicControllerDialog.RecyclerAdapter.Item paramItem)
    {
      View localView = itemView;
      int i;
      if (isGroupVolumeNeeded()) {
        i = mExpandedHeight;
      } else {
        i = 0;
      }
      MediaRouteDynamicControllerDialog.setLayoutHeight(localView, i);
      paramItem = (MediaRouter.RouteInfo)paramItem.getData();
      super.bindRouteVolumeSliderHolder(paramItem);
      mTextView.setText(paramItem.getName());
    }
    
    public int getExpandedHeight()
    {
      return mExpandedHeight;
    }
  }
  
  public class HeaderViewHolder
    extends RecyclerView.ViewHolder
  {
    private final TextView mTextView;
    
    public HeaderViewHolder(View paramView)
    {
      super();
      mTextView = ((TextView)paramView.findViewById(R.id.mr_cast_header_name));
    }
    
    public void bindHeaderViewHolder(MediaRouteDynamicControllerDialog.RecyclerAdapter.Item paramItem)
    {
      paramItem = paramItem.getData().toString();
      mTextView.setText(paramItem);
    }
  }
  
  public class Item
  {
    private final Object mData;
    private final int mType;
    
    public Item(Object paramObject, int paramInt)
    {
      mData = paramObject;
      mType = paramInt;
    }
    
    public Object getData()
    {
      return mData;
    }
    
    public int getType()
    {
      return mType;
    }
  }
  
  public class RouteViewHolder
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
          List localList = this$0.mSelectedRoute.getMemberRoutes();
          paramAnonymousView = mRoute.getMemberRoutes().iterator();
          while (paramAnonymousView.hasNext())
          {
            Object localObject = (MediaRouter.RouteInfo)paramAnonymousView.next();
            if (localList.contains(localObject) != bool1)
            {
              localObject = (MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder)this$0.mVolumeSliderHolderMap.get(((MediaRouter.RouteInfo)localObject).getId());
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
    
    public RouteViewHolder(View paramView)
    {
      super(paramView, (ImageButton)paramView.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider)paramView.findViewById(R.id.mr_cast_volume_slider));
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
      this$1 = ((Resources)localObject).getDisplayMetrics();
      paramView = new TypedValue();
      ((Resources)localObject).getValue(R.dimen.mr_dynamic_dialog_row_height, paramView, true);
      mExpandedLayoutHeight = ((int)paramView.getDimension(MediaRouteDynamicControllerDialog.RecyclerAdapter.this));
      mCollapsedLayoutHeight = 0;
    }
    
    private boolean isEnabled(MediaRouter.RouteInfo paramRouteInfo)
    {
      boolean bool1 = this$0.mUngroupableRoutes.contains(paramRouteInfo);
      boolean bool2 = false;
      if (bool1) {
        return false;
      }
      if ((isSelected(paramRouteInfo)) && (this$0.mSelectedRoute.getMemberRoutes().size() < 2)) {
        return false;
      }
      if (isSelected(paramRouteInfo))
      {
        paramRouteInfo = this$0.mSelectedRoute.getDynamicGroupState(paramRouteInfo);
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
      if (localObject == this$0.mSelectedRoute)
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
          } while (this$0.mGroupableRoutes.contains(paramItem));
        }
      }
      bindRouteVolumeSliderHolder(paramItem);
      mImageView.setImageDrawable(getIconDrawable(paramItem));
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
      paramRouteInfo = this$0.mSelectedRoute.getDynamicGroupState(paramRouteInfo);
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
        MediaRouteDynamicControllerDialog.RecyclerAdapter localRecyclerAdapter = MediaRouteDynamicControllerDialog.RecyclerAdapter.this;
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
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicControllerDialog.RecyclerAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */