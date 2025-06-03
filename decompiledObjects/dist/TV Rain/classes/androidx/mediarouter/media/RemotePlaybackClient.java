package androidx.mediarouter.media;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import java.util.Iterator;
import java.util.List;
import z2;

public class RemotePlaybackClient
{
  public static final boolean DEBUG = Log.isLoggable("RemotePlaybackClient", 3);
  public static final String TAG = "RemotePlaybackClient";
  private final ActionReceiver mActionReceiver;
  private final Context mContext;
  private final PendingIntent mItemStatusPendingIntent;
  private final PendingIntent mMessagePendingIntent;
  public OnMessageReceivedListener mOnMessageReceivedListener;
  private final MediaRouter.RouteInfo mRoute;
  private boolean mRouteSupportsMessaging;
  private boolean mRouteSupportsQueuing;
  private boolean mRouteSupportsRemotePlayback;
  private boolean mRouteSupportsSessionManagement;
  public String mSessionId;
  private final PendingIntent mSessionStatusPendingIntent;
  public StatusCallback mStatusCallback;
  
  public RemotePlaybackClient(@NonNull Context paramContext, @NonNull MediaRouter.RouteInfo paramRouteInfo)
  {
    if (paramContext != null)
    {
      if (paramRouteInfo != null)
      {
        mContext = paramContext;
        mRoute = paramRouteInfo;
        paramRouteInfo = new IntentFilter();
        paramRouteInfo.addAction("androidx.mediarouter.media.actions.ACTION_ITEM_STATUS_CHANGED");
        paramRouteInfo.addAction("androidx.mediarouter.media.actions.ACTION_SESSION_STATUS_CHANGED");
        paramRouteInfo.addAction("androidx.mediarouter.media.actions.ACTION_MESSAGE_RECEIVED");
        ActionReceiver localActionReceiver = new ActionReceiver();
        mActionReceiver = localActionReceiver;
        paramContext.registerReceiver(localActionReceiver, paramRouteInfo);
        paramRouteInfo = new Intent("androidx.mediarouter.media.actions.ACTION_ITEM_STATUS_CHANGED");
        paramRouteInfo.setPackage(paramContext.getPackageName());
        mItemStatusPendingIntent = PendingIntent.getBroadcast(paramContext, 0, paramRouteInfo, 67108864);
        paramRouteInfo = new Intent("androidx.mediarouter.media.actions.ACTION_SESSION_STATUS_CHANGED");
        paramRouteInfo.setPackage(paramContext.getPackageName());
        mSessionStatusPendingIntent = PendingIntent.getBroadcast(paramContext, 0, paramRouteInfo, 67108864);
        paramRouteInfo = new Intent("androidx.mediarouter.media.actions.ACTION_MESSAGE_RECEIVED");
        paramRouteInfo.setPackage(paramContext.getPackageName());
        mMessagePendingIntent = PendingIntent.getBroadcast(paramContext, 0, paramRouteInfo, 67108864);
        detectFeatures();
        return;
      }
      throw new IllegalArgumentException("route must not be null");
    }
    throw new IllegalArgumentException("context must not be null");
  }
  
  public static String bundleToString(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      paramBundle.size();
      return paramBundle.toString();
    }
    return "null";
  }
  
  private void detectFeatures()
  {
    boolean bool1 = routeSupportsAction("android.media.intent.action.PLAY");
    boolean bool2 = true;
    if ((bool1) && (routeSupportsAction("android.media.intent.action.SEEK")) && (routeSupportsAction("android.media.intent.action.GET_STATUS")) && (routeSupportsAction("android.media.intent.action.PAUSE")) && (routeSupportsAction("android.media.intent.action.RESUME")) && (routeSupportsAction("android.media.intent.action.STOP"))) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    mRouteSupportsRemotePlayback = bool1;
    if ((bool1) && (routeSupportsAction("android.media.intent.action.ENQUEUE")) && (routeSupportsAction("android.media.intent.action.REMOVE"))) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    mRouteSupportsQueuing = bool1;
    if ((mRouteSupportsRemotePlayback) && (routeSupportsAction("android.media.intent.action.START_SESSION")) && (routeSupportsAction("android.media.intent.action.GET_SESSION_STATUS")) && (routeSupportsAction("android.media.intent.action.END_SESSION"))) {
      bool1 = bool2;
    } else {
      bool1 = false;
    }
    mRouteSupportsSessionManagement = bool1;
    mRouteSupportsMessaging = doesRouteSupportMessaging();
  }
  
  private boolean doesRouteSupportMessaging()
  {
    Iterator localIterator = mRoute.getControlFilters().iterator();
    while (localIterator.hasNext()) {
      if (((IntentFilter)localIterator.next()).hasAction("android.media.intent.action.SEND_MESSAGE")) {
        return true;
      }
    }
    return false;
  }
  
  public static String inferMissingResult(String paramString1, String paramString2)
  {
    if (paramString2 == null) {
      return paramString1;
    }
    if ((paramString1 != null) && (!paramString1.equals(paramString2))) {
      return null;
    }
    return paramString2;
  }
  
  private static void logRequest(Intent paramIntent)
  {
    if (DEBUG)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Sending request: ");
      localStringBuilder.append(paramIntent);
      Log.d("RemotePlaybackClient", localStringBuilder.toString());
    }
  }
  
  private void performItemAction(final Intent paramIntent, final String paramString1, final String paramString2, Bundle paramBundle, final ItemActionCallback paramItemActionCallback)
  {
    paramIntent.addCategory("android.media.intent.category.REMOTE_PLAYBACK");
    if (paramString1 != null) {
      paramIntent.putExtra("android.media.intent.extra.SESSION_ID", paramString1);
    }
    if (paramString2 != null) {
      paramIntent.putExtra("android.media.intent.extra.ITEM_ID", paramString2);
    }
    if (paramBundle != null) {
      paramIntent.putExtras(paramBundle);
    }
    logRequest(paramIntent);
    mRoute.sendControlRequest(paramIntent, new MediaRouter.ControlRequestCallback()
    {
      public void onError(String paramAnonymousString, Bundle paramAnonymousBundle)
      {
        handleError(paramIntent, paramItemActionCallback, paramAnonymousString, paramAnonymousBundle);
      }
      
      public void onResult(Bundle paramAnonymousBundle)
      {
        if (paramAnonymousBundle != null)
        {
          String str1 = RemotePlaybackClient.inferMissingResult(paramString1, paramAnonymousBundle.getString("android.media.intent.extra.SESSION_ID"));
          MediaSessionStatus localMediaSessionStatus = MediaSessionStatus.fromBundle(paramAnonymousBundle.getBundle("android.media.intent.extra.SESSION_STATUS"));
          String str2 = RemotePlaybackClient.inferMissingResult(paramString2, paramAnonymousBundle.getString("android.media.intent.extra.ITEM_ID"));
          MediaItemStatus localMediaItemStatus = MediaItemStatus.fromBundle(paramAnonymousBundle.getBundle("android.media.intent.extra.ITEM_STATUS"));
          adoptSession(str1);
          if ((str1 != null) && (str2 != null) && (localMediaItemStatus != null))
          {
            if (RemotePlaybackClient.DEBUG)
            {
              StringBuilder localStringBuilder = z2.t("Received result from ");
              localStringBuilder.append(paramIntent.getAction());
              localStringBuilder.append(": data=");
              localStringBuilder.append(RemotePlaybackClient.bundleToString(paramAnonymousBundle));
              localStringBuilder.append(", sessionId=");
              localStringBuilder.append(str1);
              localStringBuilder.append(", sessionStatus=");
              localStringBuilder.append(localMediaSessionStatus);
              localStringBuilder.append(", itemId=");
              localStringBuilder.append(str2);
              localStringBuilder.append(", itemStatus=");
              localStringBuilder.append(localMediaItemStatus);
              Log.d("RemotePlaybackClient", localStringBuilder.toString());
            }
            paramItemActionCallback.onResult(paramAnonymousBundle, str1, localMediaSessionStatus, str2, localMediaItemStatus);
            return;
          }
        }
        handleInvalidResult(paramIntent, paramItemActionCallback, paramAnonymousBundle);
      }
    });
  }
  
  private void performSessionAction(final Intent paramIntent, final String paramString, Bundle paramBundle, final SessionActionCallback paramSessionActionCallback)
  {
    paramIntent.addCategory("android.media.intent.category.REMOTE_PLAYBACK");
    if (paramString != null) {
      paramIntent.putExtra("android.media.intent.extra.SESSION_ID", paramString);
    }
    if (paramBundle != null) {
      paramIntent.putExtras(paramBundle);
    }
    logRequest(paramIntent);
    mRoute.sendControlRequest(paramIntent, new MediaRouter.ControlRequestCallback()
    {
      public void onError(String paramAnonymousString, Bundle paramAnonymousBundle)
      {
        handleError(paramIntent, paramSessionActionCallback, paramAnonymousString, paramAnonymousBundle);
      }
      
      public void onResult(Bundle paramAnonymousBundle)
      {
        if (paramAnonymousBundle != null)
        {
          String str = RemotePlaybackClient.inferMissingResult(paramString, paramAnonymousBundle.getString("android.media.intent.extra.SESSION_ID"));
          MediaSessionStatus localMediaSessionStatus = MediaSessionStatus.fromBundle(paramAnonymousBundle.getBundle("android.media.intent.extra.SESSION_STATUS"));
          adoptSession(str);
          if (str != null)
          {
            if (RemotePlaybackClient.DEBUG)
            {
              StringBuilder localStringBuilder = z2.t("Received result from ");
              localStringBuilder.append(paramIntent.getAction());
              localStringBuilder.append(": data=");
              localStringBuilder.append(RemotePlaybackClient.bundleToString(paramAnonymousBundle));
              localStringBuilder.append(", sessionId=");
              localStringBuilder.append(str);
              localStringBuilder.append(", sessionStatus=");
              localStringBuilder.append(localMediaSessionStatus);
              Log.d("RemotePlaybackClient", localStringBuilder.toString());
            }
            try
            {
              paramSessionActionCallback.onResult(paramAnonymousBundle, str, localMediaSessionStatus);
              return;
            }
            finally
            {
              if ((paramIntent.getAction().equals("android.media.intent.action.END_SESSION")) && (str.equals(mSessionId))) {
                setSessionId(null);
              }
            }
          }
        }
        handleInvalidResult(paramIntent, paramSessionActionCallback, paramAnonymousBundle);
      }
    });
  }
  
  private void playOrEnqueue(Uri paramUri, String paramString1, Bundle paramBundle1, long paramLong, Bundle paramBundle2, ItemActionCallback paramItemActionCallback, String paramString2)
  {
    if (paramUri != null)
    {
      throwIfRemotePlaybackNotSupported();
      if (paramString2.equals("android.media.intent.action.ENQUEUE")) {
        throwIfQueuingNotSupported();
      }
      paramString2 = new Intent(paramString2);
      paramString2.setDataAndType(paramUri, paramString1);
      paramString2.putExtra("android.media.intent.extra.ITEM_STATUS_UPDATE_RECEIVER", mItemStatusPendingIntent);
      if (paramBundle1 != null) {
        paramString2.putExtra("android.media.intent.extra.ITEM_METADATA", paramBundle1);
      }
      if (paramLong != 0L) {
        paramString2.putExtra("android.media.intent.extra.ITEM_POSITION", paramLong);
      }
      performItemAction(paramString2, mSessionId, null, paramBundle2, paramItemActionCallback);
      return;
    }
    throw new IllegalArgumentException("contentUri must not be null");
  }
  
  private boolean routeSupportsAction(String paramString)
  {
    return mRoute.supportsControlAction("android.media.intent.category.REMOTE_PLAYBACK", paramString);
  }
  
  private void throwIfMessageNotSupported()
  {
    if (mRouteSupportsMessaging) {
      return;
    }
    throw new UnsupportedOperationException("The route does not support message.");
  }
  
  private void throwIfNoCurrentSession()
  {
    if (mSessionId != null) {
      return;
    }
    throw new IllegalStateException("There is no current session.");
  }
  
  private void throwIfQueuingNotSupported()
  {
    if (mRouteSupportsQueuing) {
      return;
    }
    throw new UnsupportedOperationException("The route does not support queuing.");
  }
  
  private void throwIfRemotePlaybackNotSupported()
  {
    if (mRouteSupportsRemotePlayback) {
      return;
    }
    throw new UnsupportedOperationException("The route does not support remote playback.");
  }
  
  private void throwIfSessionManagementNotSupported()
  {
    if (mRouteSupportsSessionManagement) {
      return;
    }
    throw new UnsupportedOperationException("The route does not support session management.");
  }
  
  public void adoptSession(String paramString)
  {
    if (paramString != null) {
      setSessionId(paramString);
    }
  }
  
  public void endSession(@Nullable Bundle paramBundle, @Nullable SessionActionCallback paramSessionActionCallback)
  {
    throwIfSessionManagementNotSupported();
    throwIfNoCurrentSession();
    performSessionAction(new Intent("android.media.intent.action.END_SESSION"), mSessionId, paramBundle, paramSessionActionCallback);
  }
  
  public void enqueue(@NonNull Uri paramUri, @Nullable String paramString, @Nullable Bundle paramBundle1, long paramLong, @Nullable Bundle paramBundle2, @Nullable ItemActionCallback paramItemActionCallback)
  {
    playOrEnqueue(paramUri, paramString, paramBundle1, paramLong, paramBundle2, paramItemActionCallback, "android.media.intent.action.ENQUEUE");
  }
  
  @Nullable
  public String getSessionId()
  {
    return mSessionId;
  }
  
  public void getSessionStatus(@Nullable Bundle paramBundle, @Nullable SessionActionCallback paramSessionActionCallback)
  {
    throwIfSessionManagementNotSupported();
    throwIfNoCurrentSession();
    performSessionAction(new Intent("android.media.intent.action.GET_SESSION_STATUS"), mSessionId, paramBundle, paramSessionActionCallback);
  }
  
  public void getStatus(@NonNull String paramString, @Nullable Bundle paramBundle, @Nullable ItemActionCallback paramItemActionCallback)
  {
    if (paramString != null)
    {
      throwIfNoCurrentSession();
      performItemAction(new Intent("android.media.intent.action.GET_STATUS"), mSessionId, paramString, paramBundle, paramItemActionCallback);
      return;
    }
    throw new IllegalArgumentException("itemId must not be null");
  }
  
  public void handleError(Intent paramIntent, ActionCallback paramActionCallback, String paramString, Bundle paramBundle)
  {
    int i = 0;
    if (paramBundle != null) {
      i = paramBundle.getInt("android.media.intent.extra.ERROR_CODE", 0);
    }
    if (DEBUG)
    {
      StringBuilder localStringBuilder = z2.t("Received error from ");
      localStringBuilder.append(paramIntent.getAction());
      localStringBuilder.append(": error=");
      localStringBuilder.append(paramString);
      localStringBuilder.append(", code=");
      localStringBuilder.append(i);
      localStringBuilder.append(", data=");
      localStringBuilder.append(bundleToString(paramBundle));
      Log.w("RemotePlaybackClient", localStringBuilder.toString());
    }
    paramActionCallback.onError(paramString, i, paramBundle);
  }
  
  public void handleInvalidResult(Intent paramIntent, ActionCallback paramActionCallback, Bundle paramBundle)
  {
    StringBuilder localStringBuilder = z2.t("Received invalid result data from ");
    localStringBuilder.append(paramIntent.getAction());
    localStringBuilder.append(": data=");
    localStringBuilder.append(bundleToString(paramBundle));
    Log.w("RemotePlaybackClient", localStringBuilder.toString());
    paramActionCallback.onError(null, 0, paramBundle);
  }
  
  public boolean hasSession()
  {
    boolean bool;
    if (mSessionId != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isMessagingSupported()
  {
    return mRouteSupportsMessaging;
  }
  
  public boolean isQueuingSupported()
  {
    return mRouteSupportsQueuing;
  }
  
  public boolean isRemotePlaybackSupported()
  {
    return mRouteSupportsRemotePlayback;
  }
  
  public boolean isSessionManagementSupported()
  {
    return mRouteSupportsSessionManagement;
  }
  
  public void pause(@Nullable Bundle paramBundle, @Nullable SessionActionCallback paramSessionActionCallback)
  {
    throwIfNoCurrentSession();
    performSessionAction(new Intent("android.media.intent.action.PAUSE"), mSessionId, paramBundle, paramSessionActionCallback);
  }
  
  public void play(@NonNull Uri paramUri, @Nullable String paramString, @Nullable Bundle paramBundle1, long paramLong, @Nullable Bundle paramBundle2, @Nullable ItemActionCallback paramItemActionCallback)
  {
    playOrEnqueue(paramUri, paramString, paramBundle1, paramLong, paramBundle2, paramItemActionCallback, "android.media.intent.action.PLAY");
  }
  
  public void release()
  {
    mContext.unregisterReceiver(mActionReceiver);
  }
  
  public void remove(@NonNull String paramString, @Nullable Bundle paramBundle, @Nullable ItemActionCallback paramItemActionCallback)
  {
    if (paramString != null)
    {
      throwIfQueuingNotSupported();
      throwIfNoCurrentSession();
      performItemAction(new Intent("android.media.intent.action.REMOVE"), mSessionId, paramString, paramBundle, paramItemActionCallback);
      return;
    }
    throw new IllegalArgumentException("itemId must not be null");
  }
  
  public void resume(@Nullable Bundle paramBundle, @Nullable SessionActionCallback paramSessionActionCallback)
  {
    throwIfNoCurrentSession();
    performSessionAction(new Intent("android.media.intent.action.RESUME"), mSessionId, paramBundle, paramSessionActionCallback);
  }
  
  public void seek(@NonNull String paramString, long paramLong, @Nullable Bundle paramBundle, @Nullable ItemActionCallback paramItemActionCallback)
  {
    if (paramString != null)
    {
      throwIfNoCurrentSession();
      Intent localIntent = new Intent("android.media.intent.action.SEEK");
      localIntent.putExtra("android.media.intent.extra.ITEM_POSITION", paramLong);
      performItemAction(localIntent, mSessionId, paramString, paramBundle, paramItemActionCallback);
      return;
    }
    throw new IllegalArgumentException("itemId must not be null");
  }
  
  public void sendMessage(@Nullable Bundle paramBundle, @Nullable SessionActionCallback paramSessionActionCallback)
  {
    throwIfNoCurrentSession();
    throwIfMessageNotSupported();
    performSessionAction(new Intent("android.media.intent.action.SEND_MESSAGE"), mSessionId, paramBundle, paramSessionActionCallback);
  }
  
  public void setOnMessageReceivedListener(@Nullable OnMessageReceivedListener paramOnMessageReceivedListener)
  {
    mOnMessageReceivedListener = paramOnMessageReceivedListener;
  }
  
  public void setSessionId(@Nullable String paramString)
  {
    if (!ObjectsCompat.equals(mSessionId, paramString))
    {
      if (DEBUG)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Session id is now: ");
        ((StringBuilder)localObject).append(paramString);
        Log.d("RemotePlaybackClient", ((StringBuilder)localObject).toString());
      }
      mSessionId = paramString;
      Object localObject = mStatusCallback;
      if (localObject != null) {
        ((StatusCallback)localObject).onSessionChanged(paramString);
      }
    }
  }
  
  public void setStatusCallback(@Nullable StatusCallback paramStatusCallback)
  {
    mStatusCallback = paramStatusCallback;
  }
  
  public void startSession(@Nullable Bundle paramBundle, @Nullable SessionActionCallback paramSessionActionCallback)
  {
    throwIfSessionManagementNotSupported();
    Intent localIntent = new Intent("android.media.intent.action.START_SESSION");
    localIntent.putExtra("android.media.intent.extra.SESSION_STATUS_UPDATE_RECEIVER", mSessionStatusPendingIntent);
    if (mRouteSupportsMessaging) {
      localIntent.putExtra("android.media.intent.extra.MESSAGE_RECEIVER", mMessagePendingIntent);
    }
    performSessionAction(localIntent, null, paramBundle, paramSessionActionCallback);
  }
  
  public void stop(@Nullable Bundle paramBundle, @Nullable SessionActionCallback paramSessionActionCallback)
  {
    throwIfNoCurrentSession();
    performSessionAction(new Intent("android.media.intent.action.STOP"), mSessionId, paramBundle, paramSessionActionCallback);
  }
  
  public static abstract class ActionCallback
  {
    public void onError(@Nullable String paramString, int paramInt, @Nullable Bundle paramBundle) {}
  }
  
  public final class ActionReceiver
    extends BroadcastReceiver
  {
    public static final String ACTION_ITEM_STATUS_CHANGED = "androidx.mediarouter.media.actions.ACTION_ITEM_STATUS_CHANGED";
    public static final String ACTION_MESSAGE_RECEIVED = "androidx.mediarouter.media.actions.ACTION_MESSAGE_RECEIVED";
    public static final String ACTION_SESSION_STATUS_CHANGED = "androidx.mediarouter.media.actions.ACTION_SESSION_STATUS_CHANGED";
    
    public ActionReceiver() {}
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      paramContext = paramIntent.getStringExtra("android.media.intent.extra.SESSION_ID");
      if ((paramContext != null) && (paramContext.equals(mSessionId)))
      {
        Object localObject1 = MediaSessionStatus.fromBundle(paramIntent.getBundleExtra("android.media.intent.extra.SESSION_STATUS"));
        Object localObject2 = paramIntent.getAction();
        if (((String)localObject2).equals("androidx.mediarouter.media.actions.ACTION_ITEM_STATUS_CHANGED"))
        {
          String str = paramIntent.getStringExtra("android.media.intent.extra.ITEM_ID");
          if (str == null)
          {
            Log.w("RemotePlaybackClient", "Discarding spurious status callback with missing item id.");
            return;
          }
          localObject2 = MediaItemStatus.fromBundle(paramIntent.getBundleExtra("android.media.intent.extra.ITEM_STATUS"));
          if (localObject2 == null)
          {
            Log.w("RemotePlaybackClient", "Discarding spurious status callback with missing item status.");
            return;
          }
          if (RemotePlaybackClient.DEBUG)
          {
            localObject3 = new StringBuilder();
            ((StringBuilder)localObject3).append("Received item status callback: sessionId=");
            ((StringBuilder)localObject3).append(paramContext);
            ((StringBuilder)localObject3).append(", sessionStatus=");
            ((StringBuilder)localObject3).append(localObject1);
            ((StringBuilder)localObject3).append(", itemId=");
            ((StringBuilder)localObject3).append(str);
            ((StringBuilder)localObject3).append(", itemStatus=");
            ((StringBuilder)localObject3).append(localObject2);
            Log.d("RemotePlaybackClient", ((StringBuilder)localObject3).toString());
          }
          Object localObject3 = mStatusCallback;
          if (localObject3 != null) {
            ((RemotePlaybackClient.StatusCallback)localObject3).onItemStatusChanged(paramIntent.getExtras(), paramContext, (MediaSessionStatus)localObject1, str, (MediaItemStatus)localObject2);
          }
        }
        else if (((String)localObject2).equals("androidx.mediarouter.media.actions.ACTION_SESSION_STATUS_CHANGED"))
        {
          if (localObject1 == null)
          {
            Log.w("RemotePlaybackClient", "Discarding spurious media status callback with missing session status.");
            return;
          }
          if (RemotePlaybackClient.DEBUG)
          {
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("Received session status callback: sessionId=");
            ((StringBuilder)localObject2).append(paramContext);
            ((StringBuilder)localObject2).append(", sessionStatus=");
            ((StringBuilder)localObject2).append(localObject1);
            Log.d("RemotePlaybackClient", ((StringBuilder)localObject2).toString());
          }
          localObject2 = mStatusCallback;
          if (localObject2 != null) {
            ((RemotePlaybackClient.StatusCallback)localObject2).onSessionStatusChanged(paramIntent.getExtras(), paramContext, (MediaSessionStatus)localObject1);
          }
        }
        else if (((String)localObject2).equals("androidx.mediarouter.media.actions.ACTION_MESSAGE_RECEIVED"))
        {
          if (RemotePlaybackClient.DEBUG)
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("Received message callback: sessionId=");
            ((StringBuilder)localObject1).append(paramContext);
            Log.d("RemotePlaybackClient", ((StringBuilder)localObject1).toString());
          }
          localObject1 = mOnMessageReceivedListener;
          if (localObject1 != null) {
            ((RemotePlaybackClient.OnMessageReceivedListener)localObject1).onMessageReceived(paramContext, paramIntent.getBundleExtra("android.media.intent.extra.MESSAGE"));
          }
        }
        return;
      }
      z2.A("Discarding spurious status callback with missing or invalid session id: sessionId=", paramContext, "RemotePlaybackClient");
    }
  }
  
  public static abstract class ItemActionCallback
    extends RemotePlaybackClient.ActionCallback
  {
    public void onResult(@NonNull Bundle paramBundle, @NonNull String paramString1, @Nullable MediaSessionStatus paramMediaSessionStatus, @NonNull String paramString2, @NonNull MediaItemStatus paramMediaItemStatus) {}
  }
  
  public static abstract interface OnMessageReceivedListener
  {
    public abstract void onMessageReceived(@NonNull String paramString, @Nullable Bundle paramBundle);
  }
  
  public static abstract class SessionActionCallback
    extends RemotePlaybackClient.ActionCallback
  {
    public void onResult(@NonNull Bundle paramBundle, @NonNull String paramString, @Nullable MediaSessionStatus paramMediaSessionStatus) {}
  }
  
  public static abstract class StatusCallback
  {
    public void onItemStatusChanged(@Nullable Bundle paramBundle, @NonNull String paramString1, @Nullable MediaSessionStatus paramMediaSessionStatus, @NonNull String paramString2, @NonNull MediaItemStatus paramMediaItemStatus) {}
    
    public void onSessionChanged(@Nullable String paramString) {}
    
    public void onSessionStatusChanged(@Nullable Bundle paramBundle, @NonNull String paramString, @Nullable MediaSessionStatus paramMediaSessionStatus) {}
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.RemotePlaybackClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */