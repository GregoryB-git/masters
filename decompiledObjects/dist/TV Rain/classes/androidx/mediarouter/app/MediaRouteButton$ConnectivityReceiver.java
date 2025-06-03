package androidx.mediarouter.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class MediaRouteButton$ConnectivityReceiver
  extends BroadcastReceiver
{
  private List<MediaRouteButton> mButtons;
  private final Context mContext;
  private boolean mIsConnected = true;
  
  public MediaRouteButton$ConnectivityReceiver(Context paramContext)
  {
    mContext = paramContext;
    mButtons = new ArrayList();
  }
  
  public boolean isConnected()
  {
    return mIsConnected;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(paramIntent.getAction()))
    {
      boolean bool = paramIntent.getBooleanExtra("noConnectivity", false) ^ true;
      if (mIsConnected != bool)
      {
        mIsConnected = bool;
        paramContext = mButtons.iterator();
        while (paramContext.hasNext()) {
          ((MediaRouteButton)paramContext.next()).refreshVisibility();
        }
      }
    }
  }
  
  public void registerReceiver(MediaRouteButton paramMediaRouteButton)
  {
    if (mButtons.size() == 0)
    {
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
      mContext.registerReceiver(this, localIntentFilter);
    }
    mButtons.add(paramMediaRouteButton);
  }
  
  public void unregisterReceiver(MediaRouteButton paramMediaRouteButton)
  {
    mButtons.remove(paramMediaRouteButton);
    if (mButtons.size() == 0) {
      mContext.unregisterReceiver(this);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteButton.ConnectivityReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */