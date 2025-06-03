package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.mediarouter.R.attr;
import androidx.mediarouter.R.id;
import androidx.mediarouter.R.layout;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouter.Callback;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MediaRouteChooserDialog
  extends AppCompatDialog
{
  public static final int MSG_UPDATE_ROUTES = 1;
  public static final String TAG = "MediaRouteChooserDialog";
  private static final long UPDATE_ROUTES_DELAY_MS = 300L;
  private RouteAdapter mAdapter;
  private boolean mAttachedToWindow;
  private final MediaRouterCallback mCallback = new MediaRouterCallback();
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
  private ListView mListView;
  private final MediaRouter mRouter = MediaRouter.getInstance(getContext());
  private ArrayList<MediaRouter.RouteInfo> mRoutes;
  private MediaRouteSelector mSelector = MediaRouteSelector.EMPTY;
  private TextView mTitleView;
  
  public MediaRouteChooserDialog(@NonNull Context paramContext)
  {
    this(paramContext, 0);
  }
  
  public MediaRouteChooserDialog(@NonNull Context paramContext, int paramInt)
  {
    super(paramContext, MediaRouterThemeHelper.createThemedDialogStyle(paramContext));
  }
  
  @NonNull
  public MediaRouteSelector getRouteSelector()
  {
    return mSelector;
  }
  
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
    setContentView(R.layout.mr_chooser_dialog);
    mRoutes = new ArrayList();
    mAdapter = new RouteAdapter(getContext(), mRoutes);
    paramBundle = (ListView)findViewById(R.id.mr_chooser_list);
    mListView = paramBundle;
    paramBundle.setAdapter(mAdapter);
    mListView.setOnItemClickListener(mAdapter);
    mListView.setEmptyView(findViewById(16908292));
    mTitleView = ((TextView)findViewById(R.id.mr_chooser_title));
    updateLayout();
  }
  
  public void onDetachedFromWindow()
  {
    mAttachedToWindow = false;
    mRouter.removeCallback(mCallback);
    mHandler.removeMessages(1);
    super.onDetachedFromWindow();
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
    if (mAttachedToWindow)
    {
      ArrayList localArrayList = new ArrayList(mRouter.getRoutes());
      onFilterRoutes(localArrayList);
      Collections.sort(localArrayList, RouteComparator.sInstance);
      if (SystemClock.uptimeMillis() - mLastUpdateTime >= 300L)
      {
        updateRoutes(localArrayList);
      }
      else
      {
        mHandler.removeMessages(1);
        Handler localHandler = mHandler;
        localHandler.sendMessageAtTime(localHandler.obtainMessage(1, localArrayList), mLastUpdateTime + 300L);
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
  
  public void setTitle(int paramInt)
  {
    mTitleView.setText(paramInt);
  }
  
  public void setTitle(@Nullable CharSequence paramCharSequence)
  {
    mTitleView.setText(paramCharSequence);
  }
  
  public void updateLayout()
  {
    getWindow().setLayout(MediaRouteDialogHelper.getDialogWidth(getContext()), -2);
  }
  
  public void updateRoutes(List<MediaRouter.RouteInfo> paramList)
  {
    mLastUpdateTime = SystemClock.uptimeMillis();
    mRoutes.clear();
    mRoutes.addAll(paramList);
    mAdapter.notifyDataSetChanged();
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
  
  public static final class RouteAdapter
    extends ArrayAdapter<MediaRouter.RouteInfo>
    implements AdapterView.OnItemClickListener
  {
    private final Drawable mDefaultIcon;
    private final LayoutInflater mInflater;
    private final Drawable mSpeakerGroupIcon;
    private final Drawable mSpeakerIcon;
    private final Drawable mTvIcon;
    
    public RouteAdapter(Context paramContext, List<MediaRouter.RouteInfo> paramList)
    {
      super(0, paramList);
      mInflater = LayoutInflater.from(paramContext);
      paramList = getContext().obtainStyledAttributes(new int[] { R.attr.mediaRouteDefaultIconDrawable, R.attr.mediaRouteTvIconDrawable, R.attr.mediaRouteSpeakerIconDrawable, R.attr.mediaRouteSpeakerGroupIconDrawable });
      mDefaultIcon = AppCompatResources.getDrawable(paramContext, paramList.getResourceId(0, 0));
      mTvIcon = AppCompatResources.getDrawable(paramContext, paramList.getResourceId(1, 0));
      mSpeakerIcon = AppCompatResources.getDrawable(paramContext, paramList.getResourceId(2, 0));
      mSpeakerGroupIcon = AppCompatResources.getDrawable(paramContext, paramList.getResourceId(3, 0));
      paramList.recycle();
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
    
    private Drawable getIconDrawable(MediaRouter.RouteInfo paramRouteInfo)
    {
      Uri localUri = paramRouteInfo.getIconUri();
      if (localUri != null) {
        try
        {
          Drawable localDrawable = Drawable.createFromStream(getContext().getContentResolver().openInputStream(localUri), null);
          if (localDrawable != null) {
            return localDrawable;
          }
        }
        catch (IOException localIOException)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Failed to load ");
          localStringBuilder.append(localUri);
          Log.w("MediaRouteChooserDialog", localStringBuilder.toString(), localIOException);
        }
      }
      return getDefaultIconDrawable(paramRouteInfo);
    }
    
    public boolean areAllItemsEnabled()
    {
      return false;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      View localView = paramView;
      if (paramView == null) {
        localView = mInflater.inflate(R.layout.mr_chooser_list_item, paramViewGroup, false);
      }
      paramView = (MediaRouter.RouteInfo)getItem(paramInt);
      paramViewGroup = (TextView)localView.findViewById(R.id.mr_chooser_route_name);
      TextView localTextView = (TextView)localView.findViewById(R.id.mr_chooser_route_desc);
      paramViewGroup.setText(paramView.getName());
      String str = paramView.getDescription();
      int i = paramView.getConnectionState();
      int j = 1;
      paramInt = j;
      if (i != 2) {
        if (paramView.getConnectionState() == 1) {
          paramInt = j;
        } else {
          paramInt = 0;
        }
      }
      if ((paramInt != 0) && (!TextUtils.isEmpty(str)))
      {
        paramViewGroup.setGravity(80);
        localTextView.setVisibility(0);
        localTextView.setText(str);
      }
      else
      {
        paramViewGroup.setGravity(16);
        localTextView.setVisibility(8);
        localTextView.setText("");
      }
      localView.setEnabled(paramView.isEnabled());
      paramViewGroup = (ImageView)localView.findViewById(R.id.mr_chooser_route_icon);
      if (paramViewGroup != null) {
        paramViewGroup.setImageDrawable(getIconDrawable(paramView));
      }
      return localView;
    }
    
    public boolean isEnabled(int paramInt)
    {
      return ((MediaRouter.RouteInfo)getItem(paramInt)).isEnabled();
    }
    
    public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
    {
      paramAdapterView = (MediaRouter.RouteInfo)getItem(paramInt);
      if (paramAdapterView.isEnabled())
      {
        ImageView localImageView = (ImageView)paramView.findViewById(R.id.mr_chooser_route_icon);
        paramView = (ProgressBar)paramView.findViewById(R.id.mr_chooser_route_progress_bar);
        if ((localImageView != null) && (paramView != null))
        {
          localImageView.setVisibility(8);
          paramView.setVisibility(0);
        }
        paramAdapterView.select();
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
 * Qualified Name:     androidx.mediarouter.app.MediaRouteChooserDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */