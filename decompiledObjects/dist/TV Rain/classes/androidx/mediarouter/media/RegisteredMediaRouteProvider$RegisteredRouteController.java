package androidx.mediarouter.media;

import android.content.Intent;

final class RegisteredMediaRouteProvider$RegisteredRouteController
  extends MediaRouteProvider.RouteController
  implements RegisteredMediaRouteProvider.ControllerConnection
{
  private RegisteredMediaRouteProvider.Connection mConnection;
  private int mControllerId;
  private int mPendingSetVolume = -1;
  private int mPendingUpdateVolumeDelta;
  private final String mRouteGroupId;
  private final String mRouteId;
  private boolean mSelected;
  
  public RegisteredMediaRouteProvider$RegisteredRouteController(RegisteredMediaRouteProvider paramRegisteredMediaRouteProvider, String paramString1, String paramString2)
  {
    mRouteId = paramString1;
    mRouteGroupId = paramString2;
  }
  
  public void attachConnection(RegisteredMediaRouteProvider.Connection paramConnection)
  {
    mConnection = paramConnection;
    int i = paramConnection.createRouteController(mRouteId, mRouteGroupId);
    mControllerId = i;
    if (mSelected)
    {
      paramConnection.selectRoute(i);
      i = mPendingSetVolume;
      if (i >= 0)
      {
        paramConnection.setVolume(mControllerId, i);
        mPendingSetVolume = -1;
      }
      i = mPendingUpdateVolumeDelta;
      if (i != 0)
      {
        paramConnection.updateVolume(mControllerId, i);
        mPendingUpdateVolumeDelta = 0;
      }
    }
  }
  
  public void detachConnection()
  {
    RegisteredMediaRouteProvider.Connection localConnection = mConnection;
    if (localConnection != null)
    {
      localConnection.releaseRouteController(mControllerId);
      mConnection = null;
      mControllerId = 0;
    }
  }
  
  public int getControllerId()
  {
    return mControllerId;
  }
  
  public boolean onControlRequest(Intent paramIntent, MediaRouter.ControlRequestCallback paramControlRequestCallback)
  {
    RegisteredMediaRouteProvider.Connection localConnection = mConnection;
    if (localConnection != null) {
      return localConnection.sendControlRequest(mControllerId, paramIntent, paramControlRequestCallback);
    }
    return false;
  }
  
  public void onRelease()
  {
    this$0.onControllerReleased(this);
  }
  
  public void onSelect()
  {
    mSelected = true;
    RegisteredMediaRouteProvider.Connection localConnection = mConnection;
    if (localConnection != null) {
      localConnection.selectRoute(mControllerId);
    }
  }
  
  public void onSetVolume(int paramInt)
  {
    RegisteredMediaRouteProvider.Connection localConnection = mConnection;
    if (localConnection != null)
    {
      localConnection.setVolume(mControllerId, paramInt);
    }
    else
    {
      mPendingSetVolume = paramInt;
      mPendingUpdateVolumeDelta = 0;
    }
  }
  
  public void onUnselect()
  {
    onUnselect(0);
  }
  
  public void onUnselect(int paramInt)
  {
    mSelected = false;
    RegisteredMediaRouteProvider.Connection localConnection = mConnection;
    if (localConnection != null) {
      localConnection.unselectRoute(mControllerId, paramInt);
    }
  }
  
  public void onUpdateVolume(int paramInt)
  {
    RegisteredMediaRouteProvider.Connection localConnection = mConnection;
    if (localConnection != null) {
      localConnection.updateVolume(mControllerId, paramInt);
    } else {
      mPendingUpdateVolumeDelta += paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.RegisteredMediaRouteProvider.RegisteredRouteController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */