package androidx.mediarouter.media;

import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import z2;

class MediaRoute2ProviderServiceAdapter$1
  extends MediaRouter.ControlRequestCallback
{
  public MediaRoute2ProviderServiceAdapter$1(MediaRoute2ProviderServiceAdapter paramMediaRoute2ProviderServiceAdapter, String paramString, Intent paramIntent, Messenger paramMessenger, int paramInt) {}
  
  public void onError(String paramString, Bundle paramBundle)
  {
    if (MediaRoute2ProviderServiceAdapter.DEBUG)
    {
      StringBuilder localStringBuilder = z2.t("Route control request failed, sessionId=");
      localStringBuilder.append(val$sessionId);
      localStringBuilder.append(", intent=");
      localStringBuilder.append(val$intent);
      localStringBuilder.append(", error=");
      localStringBuilder.append(paramString);
      localStringBuilder.append(", data=");
      localStringBuilder.append(paramBundle);
      Log.d("MR2ProviderService", localStringBuilder.toString());
    }
    if (paramString != null)
    {
      paramString = z2.d("error", paramString);
      sendReply(val$messenger, 4, val$requestId, 0, paramBundle, paramString);
    }
    else
    {
      sendReply(val$messenger, 4, val$requestId, 0, paramBundle, null);
    }
  }
  
  public void onResult(Bundle paramBundle)
  {
    if (MediaRoute2ProviderServiceAdapter.DEBUG)
    {
      StringBuilder localStringBuilder = z2.t("Route control request succeeded, sessionId=");
      localStringBuilder.append(val$sessionId);
      localStringBuilder.append(", intent=");
      localStringBuilder.append(val$intent);
      localStringBuilder.append(", data=");
      localStringBuilder.append(paramBundle);
      Log.d("MR2ProviderService", localStringBuilder.toString());
    }
    sendReply(val$messenger, 3, val$requestId, 0, paramBundle, null);
  }
  
  public void sendReply(Messenger paramMessenger, int paramInt1, int paramInt2, int paramInt3, Object paramObject, Bundle paramBundle)
  {
    Message localMessage = Message.obtain();
    what = paramInt1;
    arg1 = paramInt2;
    arg2 = paramInt3;
    obj = paramObject;
    localMessage.setData(paramBundle);
    try
    {
      try
      {
        paramMessenger.send(localMessage);
      }
      catch (RemoteException paramMessenger)
      {
        Log.e("MR2ProviderService", "Could not send message to the client.", paramMessenger);
      }
      return;
    }
    catch (DeadObjectException paramMessenger)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRoute2ProviderServiceAdapter.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */