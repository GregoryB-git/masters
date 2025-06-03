package androidx.mediarouter.media;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;

final class MediaRouteProviderService$ReceiveHandler
  extends Handler
{
  private final WeakReference<MediaRouteProviderService> mServiceRef;
  
  public MediaRouteProviderService$ReceiveHandler(MediaRouteProviderService paramMediaRouteProviderService)
  {
    mServiceRef = new WeakReference(paramMediaRouteProviderService);
  }
  
  private boolean processMessage(int paramInt1, Messenger paramMessenger, int paramInt2, int paramInt3, Object paramObject, Bundle paramBundle, String paramString)
  {
    MediaRouteProviderService localMediaRouteProviderService = (MediaRouteProviderService)mServiceRef.get();
    int i = 0;
    if (localMediaRouteProviderService != null) {
      switch (paramInt1)
      {
      default: 
        break;
      case 14: 
        paramObject = paramBundle.getStringArrayList("memberRouteIds");
        if (paramObject != null) {
          return mImpl.onUpdateMemberRoutes(paramMessenger, paramInt2, paramInt3, (List)paramObject);
        }
        break;
      case 13: 
        paramObject = paramBundle.getString("memberRouteId");
        if (paramObject != null) {
          return mImpl.onRemoveMemberRoute(paramMessenger, paramInt2, paramInt3, (String)paramObject);
        }
        break;
      case 12: 
        paramObject = paramBundle.getString("memberRouteId");
        if (paramObject != null) {
          return mImpl.onAddMemberRoute(paramMessenger, paramInt2, paramInt3, (String)paramObject);
        }
        break;
      case 11: 
        paramObject = paramBundle.getString("memberRouteId");
        if (paramObject != null) {
          return mImpl.onCreateDynamicGroupRouteController(paramMessenger, paramInt2, paramInt3, (String)paramObject);
        }
        break;
      case 10: 
        if ((paramObject == null) || ((paramObject instanceof Bundle)))
        {
          paramObject = MediaRouteDiscoveryRequest.fromBundle((Bundle)paramObject);
          paramBundle = mImpl;
          if ((paramObject == null) || (!((MediaRouteDiscoveryRequest)paramObject).isValid())) {
            paramObject = null;
          }
          return paramBundle.onSetDiscoveryRequest(paramMessenger, paramInt2, (MediaRouteDiscoveryRequest)paramObject);
        }
        break;
      case 9: 
        if ((paramObject instanceof Intent)) {
          return mImpl.onRouteControlRequest(paramMessenger, paramInt2, paramInt3, (Intent)paramObject);
        }
        break;
      case 8: 
        paramInt1 = paramBundle.getInt("volume", 0);
        if (paramInt1 != 0) {
          return mImpl.onUpdateRouteVolume(paramMessenger, paramInt2, paramInt3, paramInt1);
        }
        break;
      case 7: 
        paramInt1 = paramBundle.getInt("volume", -1);
        if (paramInt1 >= 0) {
          return mImpl.onSetRouteVolume(paramMessenger, paramInt2, paramInt3, paramInt1);
        }
        break;
      case 6: 
        if (paramBundle == null) {
          paramInt1 = i;
        } else {
          paramInt1 = paramBundle.getInt("unselectReason", 0);
        }
        return mImpl.onUnselectRoute(paramMessenger, paramInt2, paramInt3, paramInt1);
      case 5: 
        return mImpl.onSelectRoute(paramMessenger, paramInt2, paramInt3);
      case 4: 
        return mImpl.onReleaseRouteController(paramMessenger, paramInt2, paramInt3);
      case 3: 
        paramObject = paramBundle.getString("routeId");
        paramBundle = paramBundle.getString("routeGroupId");
        if (paramObject != null) {
          return mImpl.onCreateRouteController(paramMessenger, paramInt2, paramInt3, (String)paramObject, paramBundle);
        }
        break;
      case 2: 
        return mImpl.onUnregisterClient(paramMessenger, paramInt2);
      case 1: 
        return mImpl.onRegisterClient(paramMessenger, paramInt2, paramInt3, paramString);
      }
    }
    return false;
  }
  
  public void handleMessage(Message paramMessage)
  {
    Messenger localMessenger = replyTo;
    if (MediaRouteProviderProtocol.isValidRemoteMessenger(localMessenger))
    {
      int i = what;
      int j = arg1;
      int k = arg2;
      Object localObject = obj;
      Bundle localBundle = paramMessage.peekData();
      if (i == 1)
      {
        paramMessage = ((MediaRouteProviderService)mServiceRef.get()).getPackageManager().getPackagesForUid(sendingUid);
        if ((paramMessage != null) && (paramMessage.length > 0))
        {
          paramMessage = paramMessage[0];
          break label85;
        }
      }
      paramMessage = null;
      label85:
      if (!processMessage(i, localMessenger, j, k, localObject, localBundle, paramMessage))
      {
        if (MediaRouteProviderService.DEBUG)
        {
          paramMessage = new StringBuilder();
          paramMessage.append(MediaRouteProviderService.getClientId(localMessenger));
          paramMessage.append(": Message failed, what=");
          paramMessage.append(i);
          paramMessage.append(", requestId=");
          paramMessage.append(j);
          paramMessage.append(", arg=");
          paramMessage.append(k);
          paramMessage.append(", obj=");
          paramMessage.append(localObject);
          paramMessage.append(", data=");
          paramMessage.append(localBundle);
          Log.d("MediaRouteProviderSrv", paramMessage.toString());
        }
        MediaRouteProviderService.sendGenericFailure(localMessenger, j);
      }
    }
    else if (MediaRouteProviderService.DEBUG)
    {
      Log.d("MediaRouteProviderSrv", "Ignoring message without valid reply messenger.");
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteProviderService.ReceiveHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */