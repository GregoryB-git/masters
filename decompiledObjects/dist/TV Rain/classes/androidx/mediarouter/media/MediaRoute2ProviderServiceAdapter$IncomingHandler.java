package androidx.mediarouter.media;

import android.content.Intent;
import android.os.BaseBundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;

class MediaRoute2ProviderServiceAdapter$IncomingHandler
  extends Handler
{
  private final MediaRoute2ProviderServiceAdapter mServiceAdapter;
  private final String mSessionId;
  
  public MediaRoute2ProviderServiceAdapter$IncomingHandler(MediaRoute2ProviderServiceAdapter paramMediaRoute2ProviderServiceAdapter, String paramString)
  {
    super(Looper.myLooper());
    mServiceAdapter = paramMediaRoute2ProviderServiceAdapter;
    mSessionId = paramString;
  }
  
  public void handleMessage(Message paramMessage)
  {
    Messenger localMessenger = replyTo;
    int i = what;
    int j = arg1;
    Object localObject = obj;
    paramMessage = paramMessage.getData();
    if (i != 7)
    {
      if (i != 8)
      {
        if ((i == 9) && ((localObject instanceof Intent))) {
          mServiceAdapter.onControlRequest(localMessenger, j, mSessionId, (Intent)localObject);
        }
      }
      else
      {
        j = paramMessage.getInt("volume", 0);
        paramMessage = paramMessage.getString("routeId");
        if ((j != 0) && (paramMessage != null)) {
          mServiceAdapter.updateRouteVolume(paramMessage, j);
        }
      }
    }
    else
    {
      j = paramMessage.getInt("volume", -1);
      paramMessage = paramMessage.getString("routeId");
      if ((j >= 0) && (paramMessage != null)) {
        mServiceAdapter.setRouteVolume(paramMessage, j);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRoute2ProviderServiceAdapter.IncomingHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */