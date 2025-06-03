package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.net.ConnectivityManagerCompat;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class NetworkStateTracker
  extends ConstraintTracker<NetworkState>
{
  public static final String TAG = Logger.tagWithPrefix("NetworkStateTracker");
  private NetworkStateBroadcastReceiver mBroadcastReceiver;
  private final ConnectivityManager mConnectivityManager = (ConnectivityManager)mAppContext.getSystemService("connectivity");
  @RequiresApi(24)
  private NetworkStateCallback mNetworkCallback;
  
  public NetworkStateTracker(@NonNull Context paramContext, @NonNull TaskExecutor paramTaskExecutor)
  {
    super(paramContext, paramTaskExecutor);
    if (isNetworkCallbackSupported()) {
      mNetworkCallback = new NetworkStateCallback();
    } else {
      mBroadcastReceiver = new NetworkStateBroadcastReceiver();
    }
  }
  
  private static boolean isNetworkCallbackSupported()
  {
    return true;
  }
  
  public NetworkState getActiveNetworkState()
  {
    NetworkInfo localNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
    boolean bool1 = true;
    boolean bool2;
    if ((localNetworkInfo != null) && (localNetworkInfo.isConnected())) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    boolean bool3 = isActiveNetworkValidated();
    boolean bool4 = ConnectivityManagerCompat.isActiveNetworkMetered(mConnectivityManager);
    if ((localNetworkInfo == null) || (localNetworkInfo.isRoaming())) {
      bool1 = false;
    }
    return new NetworkState(bool2, bool3, bool4, bool1);
  }
  
  public NetworkState getInitialState()
  {
    return getActiveNetworkState();
  }
  
  @VisibleForTesting
  public boolean isActiveNetworkValidated()
  {
    boolean bool1 = true;
    try
    {
      Object localObject = mConnectivityManager.getActiveNetwork();
      localObject = mConnectivityManager.getNetworkCapabilities((Network)localObject);
      if (localObject != null)
      {
        boolean bool2 = ((NetworkCapabilities)localObject).hasCapability(16);
        if (bool2) {}
      }
      else
      {
        bool1 = false;
      }
      return bool1;
    }
    catch (SecurityException localSecurityException)
    {
      Logger.get().error(TAG, "Unable to validate active network", new Throwable[] { localSecurityException });
    }
    return false;
  }
  
  public void startTracking()
  {
    if (isNetworkCallbackSupported())
    {
      try
      {
        Logger.get().debug(TAG, "Registering network callback", new Throwable[0]);
        mConnectivityManager.registerDefaultNetworkCallback(mNetworkCallback);
      }
      catch (SecurityException localSecurityException) {}catch (IllegalArgumentException localIllegalArgumentException) {}
      Logger.get().error(TAG, "Received exception while registering network callback", new Throwable[] { localIllegalArgumentException });
    }
    else
    {
      Logger.get().debug(TAG, "Registering broadcast receiver", new Throwable[0]);
      mAppContext.registerReceiver(mBroadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }
  }
  
  public void stopTracking()
  {
    if (isNetworkCallbackSupported())
    {
      try
      {
        Logger.get().debug(TAG, "Unregistering network callback", new Throwable[0]);
        mConnectivityManager.unregisterNetworkCallback(mNetworkCallback);
      }
      catch (SecurityException localSecurityException) {}catch (IllegalArgumentException localIllegalArgumentException) {}
      Logger.get().error(TAG, "Received exception while unregistering network callback", new Throwable[] { localIllegalArgumentException });
    }
    else
    {
      Logger.get().debug(TAG, "Unregistering broadcast receiver", new Throwable[0]);
      mAppContext.unregisterReceiver(mBroadcastReceiver);
    }
  }
  
  public class NetworkStateBroadcastReceiver
    extends BroadcastReceiver
  {
    public NetworkStateBroadcastReceiver() {}
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      if ((paramIntent != null) && (paramIntent.getAction() != null) && (paramIntent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")))
      {
        Logger.get().debug(NetworkStateTracker.TAG, "Network broadcast received", new Throwable[0]);
        paramContext = NetworkStateTracker.this;
        paramContext.setState(paramContext.getActiveNetworkState());
      }
    }
  }
  
  @RequiresApi(24)
  public class NetworkStateCallback
    extends ConnectivityManager.NetworkCallback
  {
    public NetworkStateCallback() {}
    
    public void onCapabilitiesChanged(@NonNull Network paramNetwork, @NonNull NetworkCapabilities paramNetworkCapabilities)
    {
      Logger.get().debug(NetworkStateTracker.TAG, String.format("Network capabilities changed: %s", new Object[] { paramNetworkCapabilities }), new Throwable[0]);
      paramNetwork = NetworkStateTracker.this;
      paramNetwork.setState(paramNetwork.getActiveNetworkState());
    }
    
    public void onLost(@NonNull Network paramNetwork)
    {
      Logger.get().debug(NetworkStateTracker.TAG, "Network connection lost", new Throwable[0]);
      paramNetwork = NetworkStateTracker.this;
      paramNetwork.setState(paramNetwork.getActiveNetworkState());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.constraints.trackers.NetworkStateTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */