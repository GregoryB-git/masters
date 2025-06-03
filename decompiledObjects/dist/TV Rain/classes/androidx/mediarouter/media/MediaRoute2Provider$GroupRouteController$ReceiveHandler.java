package androidx.mediarouter.media;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;

class MediaRoute2Provider$GroupRouteController$ReceiveHandler
  extends Handler
{
  public MediaRoute2Provider$GroupRouteController$ReceiveHandler(MediaRoute2Provider.GroupRouteController paramGroupRouteController)
  {
    super(Looper.getMainLooper());
  }
  
  public void handleMessage(Message paramMessage)
  {
    int i = what;
    int j = arg1;
    Object localObject = obj;
    paramMessage = paramMessage.peekData();
    MediaRouter.ControlRequestCallback localControlRequestCallback = (MediaRouter.ControlRequestCallback)this$1.mPendingCallbacks.get(j);
    if (localControlRequestCallback == null)
    {
      Log.w("MR2Provider", "Pending callback not found for control request.");
      return;
    }
    this$1.mPendingCallbacks.remove(j);
    if (i != 3)
    {
      if (i == 4)
      {
        if (paramMessage == null) {
          paramMessage = null;
        } else {
          paramMessage = paramMessage.getString("error");
        }
        localControlRequestCallback.onError(paramMessage, (Bundle)localObject);
      }
    }
    else {
      localControlRequestCallback.onResult((Bundle)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRoute2Provider.GroupRouteController.ReceiveHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */