package androidx.mediarouter.app;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.mediarouter.R.attr;
import androidx.mediarouter.R.id;
import androidx.mediarouter.R.layout;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import java.io.IOException;
import java.util.List;

final class MediaRouteChooserDialog$RouteAdapter
  extends ArrayAdapter<MediaRouter.RouteInfo>
  implements AdapterView.OnItemClickListener
{
  private final Drawable mDefaultIcon;
  private final LayoutInflater mInflater;
  private final Drawable mSpeakerGroupIcon;
  private final Drawable mSpeakerIcon;
  private final Drawable mTvIcon;
  
  public MediaRouteChooserDialog$RouteAdapter(Context paramContext, List<MediaRouter.RouteInfo> paramList)
  {
    super(paramContext, 0, paramList);
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

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteChooserDialog.RouteAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */