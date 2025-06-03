package androidx.mediarouter.media;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class RegisteredMediaRouteProvider$ReceiveHandler
  extends Handler
{
  private final WeakReference<RegisteredMediaRouteProvider.Connection> mConnectionRef;
  
  public RegisteredMediaRouteProvider$ReceiveHandler(RegisteredMediaRouteProvider.Connection paramConnection)
  {
    mConnectionRef = new WeakReference(paramConnection);
  }
  
  private boolean processMessage(RegisteredMediaRouteProvider.Connection paramConnection, int paramInt1, int paramInt2, int paramInt3, Object paramObject, Bundle paramBundle)
  {
    switch (paramInt1)
    {
    default: 
      break;
    case 8: 
      paramConnection.onControllerReleasedByProvider(paramInt3);
      break;
    case 7: 
      if ((paramObject == null) || ((paramObject instanceof Bundle))) {
        return paramConnection.onDynamicRouteDescriptorsChanged(paramInt3, (Bundle)paramObject);
      }
      break;
    case 6: 
      if ((paramObject instanceof Bundle)) {
        paramConnection.onDynamicGroupRouteControllerCreated(paramInt2, (Bundle)paramObject);
      } else {
        Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
      }
      break;
    case 5: 
      if ((paramObject == null) || ((paramObject instanceof Bundle))) {
        return paramConnection.onDescriptorChanged((Bundle)paramObject);
      }
      break;
    case 4: 
      if ((paramObject == null) || ((paramObject instanceof Bundle)))
      {
        if (paramBundle == null) {
          paramBundle = null;
        } else {
          paramBundle = paramBundle.getString("error");
        }
        return paramConnection.onControlRequestFailed(paramInt2, paramBundle, (Bundle)paramObject);
      }
      break;
    case 3: 
      if ((paramObject == null) || ((paramObject instanceof Bundle))) {
        return paramConnection.onControlRequestSucceeded(paramInt2, (Bundle)paramObject);
      }
      break;
    case 2: 
      if ((paramObject == null) || ((paramObject instanceof Bundle))) {
        return paramConnection.onRegistered(paramInt2, paramInt3, (Bundle)paramObject);
      }
      break;
    case 1: 
      paramConnection.onGenericSuccess(paramInt2);
      return true;
    case 0: 
      paramConnection.onGenericFailure(paramInt2);
      return true;
    }
    return false;
  }
  
  public void dispose()
  {
    mConnectionRef.clear();
  }
  
  public void handleMessage(Message paramMessage)
  {
    Object localObject = (RegisteredMediaRouteProvider.Connection)mConnectionRef.get();
    if ((localObject != null) && (!processMessage((RegisteredMediaRouteProvider.Connection)localObject, what, arg1, arg2, obj, paramMessage.peekData())) && (RegisteredMediaRouteProvider.DEBUG))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Unhandled message from server: ");
      ((StringBuilder)localObject).append(paramMessage);
      Log.d("MediaRouteProviderProxy", ((StringBuilder)localObject).toString());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.RegisteredMediaRouteProvider.ReceiveHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */