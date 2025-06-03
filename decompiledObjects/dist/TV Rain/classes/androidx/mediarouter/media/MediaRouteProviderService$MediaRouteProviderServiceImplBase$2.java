package androidx.mediarouter.media;

import android.content.Intent;
import android.os.Bundle;
import android.os.Messenger;
import android.util.Log;
import z2;

class MediaRouteProviderService$MediaRouteProviderServiceImplBase$2
  extends MediaRouter.ControlRequestCallback
{
  public MediaRouteProviderService$MediaRouteProviderServiceImplBase$2(MediaRouteProviderService.MediaRouteProviderServiceImplBase paramMediaRouteProviderServiceImplBase, MediaRouteProviderService.MediaRouteProviderServiceImplBase.ClientRecord paramClientRecord, int paramInt1, Intent paramIntent, Messenger paramMessenger, int paramInt2) {}
  
  public void onError(String paramString, Bundle paramBundle)
  {
    if (MediaRouteProviderService.DEBUG)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(val$client);
      localStringBuilder.append(": Route control request failed, controllerId=");
      localStringBuilder.append(val$controllerId);
      localStringBuilder.append(", intent=");
      localStringBuilder.append(val$intent);
      localStringBuilder.append(", error=");
      localStringBuilder.append(paramString);
      localStringBuilder.append(", data=");
      localStringBuilder.append(paramBundle);
      Log.d("MediaRouteProviderSrv", localStringBuilder.toString());
    }
    if (this$0.findClient(val$messenger) >= 0) {
      if (paramString != null)
      {
        paramString = z2.d("error", paramString);
        MediaRouteProviderService.sendMessage(val$messenger, 4, val$requestId, 0, paramBundle, paramString);
      }
      else
      {
        MediaRouteProviderService.sendMessage(val$messenger, 4, val$requestId, 0, paramBundle, null);
      }
    }
  }
  
  public void onResult(Bundle paramBundle)
  {
    if (MediaRouteProviderService.DEBUG)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(val$client);
      localStringBuilder.append(": Route control request succeeded, controllerId=");
      localStringBuilder.append(val$controllerId);
      localStringBuilder.append(", intent=");
      localStringBuilder.append(val$intent);
      localStringBuilder.append(", data=");
      localStringBuilder.append(paramBundle);
      Log.d("MediaRouteProviderSrv", localStringBuilder.toString());
    }
    if (this$0.findClient(val$messenger) >= 0) {
      MediaRouteProviderService.sendMessage(val$messenger, 3, val$requestId, 0, paramBundle, null);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteProviderService.MediaRouteProviderServiceImplBase.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */