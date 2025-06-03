package androidx.mediarouter.media;

import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import z2;

class RemotePlaybackClient$1
  extends MediaRouter.ControlRequestCallback
{
  public RemotePlaybackClient$1(RemotePlaybackClient paramRemotePlaybackClient, String paramString1, String paramString2, Intent paramIntent, RemotePlaybackClient.ItemActionCallback paramItemActionCallback) {}
  
  public void onError(String paramString, Bundle paramBundle)
  {
    this$0.handleError(val$intent, val$callback, paramString, paramBundle);
  }
  
  public void onResult(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      String str1 = RemotePlaybackClient.inferMissingResult(val$sessionId, paramBundle.getString("android.media.intent.extra.SESSION_ID"));
      MediaSessionStatus localMediaSessionStatus = MediaSessionStatus.fromBundle(paramBundle.getBundle("android.media.intent.extra.SESSION_STATUS"));
      String str2 = RemotePlaybackClient.inferMissingResult(val$itemId, paramBundle.getString("android.media.intent.extra.ITEM_ID"));
      MediaItemStatus localMediaItemStatus = MediaItemStatus.fromBundle(paramBundle.getBundle("android.media.intent.extra.ITEM_STATUS"));
      this$0.adoptSession(str1);
      if ((str1 != null) && (str2 != null) && (localMediaItemStatus != null))
      {
        if (RemotePlaybackClient.DEBUG)
        {
          StringBuilder localStringBuilder = z2.t("Received result from ");
          localStringBuilder.append(val$intent.getAction());
          localStringBuilder.append(": data=");
          localStringBuilder.append(RemotePlaybackClient.bundleToString(paramBundle));
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
        val$callback.onResult(paramBundle, str1, localMediaSessionStatus, str2, localMediaItemStatus);
        return;
      }
    }
    this$0.handleInvalidResult(val$intent, val$callback, paramBundle);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.RemotePlaybackClient.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */