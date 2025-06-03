package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatDialog;
import androidx.mediarouter.R.id;
import androidx.mediarouter.R.integer;
import androidx.mediarouter.R.layout;
import androidx.mediarouter.R.string;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouter.Callback;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class MediaRouteDynamicChooserDialog
  extends AppCompatDialog
{
  private static final int ITEM_TYPE_HEADER = 1;
  private static final int ITEM_TYPE_NONE = 0;
  private static final int ITEM_TYPE_ROUTE = 2;
  private static final int MSG_UPDATE_ROUTES = 1;
  private static final String TAG = "MediaRouteChooserDialog";
  private RecyclerAdapter mAdapter;
  private boolean mAttachedToWindow;
  private final MediaRouterCallback mCallback;
  private ImageButton mCloseButton;
  public Context mContext;
  private final Handler mHandler = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      if (what == 1) {
        updateRoutes((List)obj);
      }
    }
  };
  private long mLastUpdateTime;
  private RecyclerView mRecyclerView;
  public final MediaRouter mRouter;
  public List<MediaRouter.RouteInfo> mRoutes;
  public MediaRouter.RouteInfo mSelectingRoute;
  private MediaRouteSelector mSelector = MediaRouteSelector.EMPTY;
  private long mUpdateRoutesDelayMs;
  
  public MediaRouteDynamicChooserDialog(@NonNull Context paramContext)
  {
    this(paramContext, 0);
  }
  
  public MediaRouteDynamicChooserDialog(@NonNull Context paramContext, int paramInt)
  {
    super(paramContext, MediaRouterThemeHelper.createThemedDialogStyle(paramContext));
    paramContext = getContext();
    mRouter = MediaRouter.getInstance(paramContext);
    mCallback = new MediaRouterCallback();
    mContext = paramContext;
    mUpdateRoutesDelayMs = paramContext.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
  }
  
  @NonNull
  public MediaRouteSelector getRouteSelector()
  {
    return mSelector;
  }
  
  @CallSuper
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    mAttachedToWindow = true;
    mRouter.addCallback(mSelector, mCallback, 1);
    refreshRoutes();
  }
  
  public void onCreate(@Nullable Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.mr_picker_dialog);
    MediaRouterThemeHelper.setDialogBackgroundColor(mContext, this);
    mRoutes = new ArrayList();
    paramBundle = (ImageButton)findViewById(R.id.mr_picker_close_button);
    mCloseButton = paramBundle;
    paramBundle.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        dismiss();
      }
    });
    mAdapter = new RecyclerAdapter();
    paramBundle = (RecyclerView)findViewById(R.id.mr_picker_list);
    mRecyclerView = paramBundle;
    paramBundle.setAdapter(mAdapter);
    mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
    updateLayout();
  }
  
  @CallSuper
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    mAttachedToWindow = false;
    mRouter.removeCallback(mCallback);
    mHandler.removeMessages(1);
  }
  
  public boolean onFilterRoute(@NonNull MediaRouter.RouteInfo paramRouteInfo)
  {
    boolean bool;
    if ((!paramRouteInfo.isDefaultOrBluetooth()) && (paramRouteInfo.isEnabled()) && (paramRouteInfo.matchesSelector(mSelector))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onFilterRoutes(@NonNull List<MediaRouter.RouteInfo> paramList)
  {
    int j;
    for (int i = paramList.size();; i = j)
    {
      j = i - 1;
      if (i <= 0) {
        break;
      }
      if (!onFilterRoute((MediaRouter.RouteInfo)paramList.get(j))) {
        paramList.remove(j);
      }
    }
  }
  
  public void refreshRoutes()
  {
    if (mSelectingRoute != null) {
      return;
    }
    if (mAttachedToWindow)
    {
      ArrayList localArrayList = new ArrayList(mRouter.getRoutes());
      onFilterRoutes(localArrayList);
      Collections.sort(localArrayList, RouteComparator.sInstance);
      if (SystemClock.uptimeMillis() - mLastUpdateTime >= mUpdateRoutesDelayMs)
      {
        updateRoutes(localArrayList);
      }
      else
      {
        mHandler.removeMessages(1);
        Handler localHandler = mHandler;
        localHandler.sendMessageAtTime(localHandler.obtainMessage(1, localArrayList), mLastUpdateTime + mUpdateRoutesDelayMs);
      }
    }
  }
  
  public void setRouteSelector(@NonNull MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector != null)
    {
      if (!mSelector.equals(paramMediaRouteSelector))
      {
        mSelector = paramMediaRouteSelector;
        if (mAttachedToWindow)
        {
          mRouter.removeCallback(mCallback);
          mRouter.addCallback(paramMediaRouteSelector, mCallback, 1);
        }
        refreshRoutes();
      }
      return;
    }
    throw new IllegalArgumentException("selector must not be null");
  }
  
  public void updateLayout()
  {
    int i = MediaRouteDialogHelper.getDialogWidthForDynamicGroup(mContext);
    int j = MediaRouteDialogHelper.getDialogHeight(mContext);
    getWindow().setLayout(i, j);
  }
  
  public void updateRoutes(List<MediaRouter.RouteInfo> paramList)
  {
    mLastUpdateTime = SystemClock.uptimeMillis();
    mRoutes.clear();
    mRoutes.addAll(paramList);
    mAdapter.rebuildItems();
  }
  
  public final class MediaRouterCallback
    extends MediaRouter.Callback
  {
    public MediaRouterCallback() {}
    
    public void onRouteAdded(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      refreshRoutes();
    }
    
    public void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      refreshRoutes();
    }
    
    public void onRouteRemoved(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      refreshRoutes();
    }
    
    public void onRouteSelected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      dismiss();
    }
  }
  
  public final class RecyclerAdapter
    extends RecyclerView.Adapter<RecyclerView.ViewHolder>
  {
    private static final String TAG = "RecyclerAdapter";
    private final Drawable mDefaultIcon = MediaRouterThemeHelper.getDefaultDrawableIcon(mContext);
    private final LayoutInflater mInflater = LayoutInflater.from(mContext);
    private final ArrayList<Item> mItems = new ArrayList();
    private final Drawable mSpeakerGroupIcon = MediaRouterThemeHelper.getSpeakerGroupDrawableIcon(mContext);
    private final Drawable mSpeakerIcon = MediaRouterThemeHelper.getSpeakerDrawableIcon(mContext);
    private final Drawable mTvIcon = MediaRouterThemeHelper.getTvDrawableIcon(mContext);
    
    public RecyclerAdapter()
    {
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
          Drawable localDrawable = Drawable.createFromStream(mContext.getContentResolver().openInputStream(localUri), null);
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
      mItems.add(new Item(mContext.getString(R.string.mr_chooser_title)));
      Iterator localIterator = mRoutes.iterator();
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
        MediaRouterThemeHelper.setIndeterminateProgressBarColor(mContext, localProgressBar);
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
            paramAnonymousView = MediaRouteDynamicChooserDialog.this;
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
  
  public static final class RouteComparator
    implements Comparator<MediaRouter.RouteInfo>
  {
    public static final RouteComparator sInstance = new RouteComparator();
    
    public int compare(MediaRouter.RouteInfo paramRouteInfo1, MediaRouter.RouteInfo paramRouteInfo2)
    {
      return paramRouteInfo1.getName().compareToIgnoreCase(paramRouteInfo2.getName());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicChooserDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */