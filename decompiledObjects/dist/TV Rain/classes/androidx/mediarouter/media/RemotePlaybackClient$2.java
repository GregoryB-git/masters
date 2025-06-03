package androidx.mediarouter.media;

import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import z2;

class RemotePlaybackClient$2
  extends MediaRouter.ControlRequestCallback
{
  public RemotePlaybackClient$2(RemotePlaybackClient paramRemotePlaybackClient, String paramString, Intent paramIntent, RemotePlaybackClient.SessionActionCallback paramSessionActionCallback) {}
  
  public void onError(String paramString, Bundle paramBundle)
  {
    this$0.handleError(val$intent, val$callback, paramString, paramBundle);
  }
  
  public void onResult(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      String str = RemotePlaybackClient.inferMissingResult(val$sessionId, paramBundle.getString("android.media.intent.extra.SESSION_ID"));
      MediaSessionStatus localMediaSessionStatus = MediaSessionStatus.fromBundle(paramBundle.getBundle("android.media.intent.extra.SESSION_STATUS"));
      this$0.adoptSession(str);
      if (str != null)
      {
        if (RemotePlaybackClient.DEBUG)
        {
          StringBuilder localStringBuilder = z2.t("Received result from ");
          localStringBuilder.append(val$intent.getAction());
          localStringBuilder.append(": data=");
          localStringBuilder.append(RemotePlaybackClient.bundleToString(paramBundle));
          localStringBuilder.append(", sessionId=");
          localStringBuilder.append(str);
          localStringBuilder.append(", sessionStatus=");
          localStringBuilder.append(localMediaSessionStatus);
          Log.d("RemotePlaybackClient", localStringBuilder.toString());
        }
        try
        {
          val$callback.onResult(paramBundle, str, localMediaSessionStatus);
          return;
        }
        finally
        {
          if ((val$intent.getAction().equals("android.media.intent.action.END_SESSION")) && (str.equals(this$0.mSessionId))) {
            this$0.setSessionId(null);
          }
        }
      }
    }
    this$0.handleInvalidResult(val$intent, val$callback, paramBundle);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.RemotePlaybackClient.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */