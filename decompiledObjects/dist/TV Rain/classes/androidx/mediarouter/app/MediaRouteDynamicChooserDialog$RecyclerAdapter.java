package androidx.mediarouter.app;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.mediarouter.R.id;
import androidx.mediarouter.R.layout;
import androidx.mediarouter.R.string;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class MediaRouteDynamicChooserDialog$RecyclerAdapter
  extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
  private static final String TAG = "RecyclerAdapter";
  private final Drawable mDefaultIcon;
  private final LayoutInflater mInflater;
  private final ArrayList<Item> mItems = new ArrayList();
  private final Drawable mSpeakerGroupIcon;
  private final Drawable mSpeakerIcon;
  private final Drawable mTvIcon;
  
  public MediaRouteDynamicChooserDialog$RecyclerAdapter(MediaRouteDynamicChooserDialog paramMediaRouteDynamicChooserDialog)
  {
    mInflater = LayoutInflater.from(mContext);
    mDefaultIcon = MediaRouterThemeHelper.getDefaultDrawableIcon(mContext);
    mTvIcon = MediaRouterThemeHelper.getTvDrawableIcon(mContext);
    mSpeakerIcon = MediaRouterThemeHelper.getSpeakerDrawableIcon(mContext);
    mSpeakerGroupIcon = MediaRouterThemeHelper.getSpeakerGroupDrawableIcon(mContext);
    rebuildItems();
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
  
  public Drawable getIconDrawable(MediaRouter.RouteInfo paramRouteInfo)
  {
    Uri localUri = paramRouteInfo.getIconUri();
    if (localUri != null) {
      try
      {
        Drawable localDrawable = Drawable.createFromStream(this$0.mContext.getContentResolver().openInputStream(localUri), null);
        if (localDrawable != null) {
          return localDrawable;
        }
      }
      catch (IOException localIOException)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Failed to load ");
        localStringBuilder.append(localUri);
        Log.w("RecyclerAdapter", localStringBuilder.toString(), localIOException);
      }
    }
    return getDefaultIconDrawable(paramRouteInfo);
  }
  
  public Item getItem(int paramInt)
  {
    return (Item)mItems.get(paramInt);
  }
  
  public int getItemCount()
  {
    return mItems.size();
  }
  
  public int getItemViewType(int paramInt)
  {
    return ((Item)mItems.get(paramInt)).getType();
  }
  
  public void onBindViewHolder(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    int i = getItemViewType(paramInt);
    Item localItem = getItem(paramInt);
    if (i != 1)
    {
      if (i != 2) {
        Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
      } else {
        ((RouteViewHolder)paramViewHolder).bindRouteView(localItem);
      }
    }
    else {
      ((HeaderViewHolder)paramViewHolder).bindHeaderView(localItem);
    }
  }
  
  public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        Log.w("RecyclerAdapter", "Cannot create ViewHolder because of wrong view type");
        return null;
      }
      return new RouteViewHolder(mInflater.inflate(R.layout.mr_picker_route_item, paramViewGroup, false));
    }
    return new HeaderViewHolder(mInflater.inflate(R.layout.mr_picker_header_item, paramViewGroup, false));
  }
  
  public void rebuildItems()
  {
    mItems.clear();
    mItems.add(new Item(this$0.mContext.getString(R.string.mr_chooser_title)));
    Iterator localIterator = this$0.mRoutes.iterator();
    while (localIterator.hasNext())
    {
      MediaRouter.RouteInfo localRouteInfo = (MediaRouter.RouteInfo)localIterator.next();
      mItems.add(new Item(localRouteInfo));
    }
    notifyDataSetChanged();
  }
  
  public class HeaderViewHolder
    extends RecyclerView.ViewHolder
  {
    public TextView mTextView;
    
    public HeaderViewHolder(View paramView)
    {
      super();
      mTextView = ((TextView)paramView.findViewById(R.id.mr_picker_header_name));
    }
    
    public void bindHeaderView(MediaRouteDynamicChooserDialog.RecyclerAdapter.Item paramItem)
    {
      paramItem = paramItem.getData().toString();
      mTextView.setText(paramItem);
    }
  }
  
  public class Item
  {
    private final Object mData;
    private final int mType;
    
    public Item(Object paramObject)
    {
      mData = paramObject;
      if ((paramObject instanceof String))
      {
        mType = 1;
      }
      else if ((paramObject instanceof MediaRouter.RouteInfo))
      {
        mType = 2;
      }
      else
      {
        mType = 0;
        Log.w("RecyclerAdapter", "Wrong type of data passed to Item constructor");
      }
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
    extends RecyclerView.ViewHolder
  {
    public final ImageView mImageView;
    public final View mItemView;
    public final ProgressBar mProgressBar;
    public final TextView mTextView;
    
    public RouteViewHolder(View paramView)
    {
      super();
      mItemView = paramView;
      mImageView = ((ImageView)paramView.findViewById(R.id.mr_picker_route_icon));
      ProgressBar localProgressBar = (ProgressBar)paramView.findViewById(R.id.mr_picker_route_progress_bar);
      mProgressBar = localProgressBar;
      mTextView = ((TextView)paramView.findViewById(R.id.mr_picker_route_name));
      MediaRouterThemeHelper.setIndeterminateProgressBarColor(this$0.mContext, localProgressBar);
    }
    
    public void bindRouteView(final MediaRouteDynamicChooserDialog.RecyclerAdapter.Item paramItem)
    {
      paramItem = (MediaRouter.RouteInfo)paramItem.getData();
      mItemView.setVisibility(0);
      mProgressBar.setVisibility(4);
      mItemView.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          paramAnonymousView = this$0;
          MediaRouter.RouteInfo localRouteInfo = paramItem;
          mSelectingRoute = localRouteInfo;
          localRouteInfo.select();
          mImageView.setVisibility(4);
          mProgressBar.setVisibility(0);
        }
      });
      mTextView.setText(paramItem.getName());
      mImageView.setImageDrawable(getIconDrawable(paramItem));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicChooserDialog.RecyclerAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */