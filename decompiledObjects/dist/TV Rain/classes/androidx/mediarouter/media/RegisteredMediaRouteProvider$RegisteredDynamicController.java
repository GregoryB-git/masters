package androidx.mediarouter.media;

import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

final class RegisteredMediaRouteProvider$RegisteredDynamicController
  extends MediaRouteProvider.DynamicGroupRouteController
  implements RegisteredMediaRouteProvider.ControllerConnection
{
  private RegisteredMediaRouteProvider.Connection mConnection;
  private int mControllerId = -1;
  public String mGroupableSectionTitle;
  private final String mInitialMemberRouteId;
  private int mPendingSetVolume = -1;
  private int mPendingUpdateVolumeDelta;
  private boolean mSelected;
  public String mTransferableSectionTitle;
  
  public RegisteredMediaRouteProvider$RegisteredDynamicController(RegisteredMediaRouteProvider paramRegisteredMediaRouteProvider, String paramString)
  {
    mInitialMemberRouteId = paramString;
  }
  
  public void attachConnection(RegisteredMediaRouteProvider.Connection paramConnection)
  {
    MediaRouter.ControlRequestCallback local1 = new MediaRouter.ControlRequestCallback()
    {
      public void onError(String paramAnonymousString, Bundle paramAnonymousBundle)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Error: ");
        localStringBuilder.append(paramAnonymousString);
        localStringBuilder.append(", data: ");
        localStringBuilder.append(paramAnonymousBundle);
        Log.d("MediaRouteProviderProxy", localStringBuilder.toString());
      }
      
      public void onResult(Bundle paramAnonymousBundle)
      {
        mGroupableSectionTitle = paramAnonymousBundle.getString("groupableTitle");
        mTransferableSectionTitle = paramAnonymousBundle.getString("transferableTitle");
      }
    };
    mConnection = paramConnection;
    int i = paramConnection.createDynamicGroupRouteController(mInitialMemberRouteId, local1);
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
  
  public String getGroupableSelectionTitle()
  {
    return mGroupableSectionTitle;
  }
  
  public String getTransferableSectionTitle()
  {
    return mTransferableSectionTitle;
  }
  
  public void onAddMemberRoute(@NonNull String paramString)
  {
    RegisteredMediaRouteProvider.Connection localConnection = mConnection;
    if (localConnection != null) {
      localConnection.addMemberRoute(mControllerId, paramString);
    }
  }
  
  public boolean onControlRequest(Intent paramIntent, MediaRouter.ControlRequestCallback paramControlRequestCallback)
  {
    RegisteredMediaRouteProvider.Connection localConnection = mConnection;
    if (localConnection != null) {
      return localConnection.sendControlRequest(mControllerId, paramIntent, paramControlRequestCallback);
    }
    return false;
  }
  
  public void onDynamicRoutesChanged(MediaRouteDescriptor paramMediaRouteDescriptor, List<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> paramList)
  {
    notifyDynamicRoutesChanged(paramMediaRouteDescriptor, paramList);
  }
  
  public void onRelease()
  {
    this$0.onControllerReleased(this);
  }
  
  public void onRemoveMemberRoute(@NonNull String paramString)
  {
    RegisteredMediaRouteProvider.Connection localConnection = mConnection;
    if (localConnection != null) {
      localConnection.removeMemberRoute(mControllerId, paramString);
    }
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
  
  public void onUpdateMemberRoutes(@Nullable List<String> paramList)
  {
    RegisteredMediaRouteProvider.Connection localConnection = mConnection;
    if (localConnection != null) {
      localConnection.updateMemberRoutes(mControllerId, paramList);
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
 * Qualified Name:     androidx.mediarouter.media.RegisteredMediaRouteProvider.RegisteredDynamicController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */