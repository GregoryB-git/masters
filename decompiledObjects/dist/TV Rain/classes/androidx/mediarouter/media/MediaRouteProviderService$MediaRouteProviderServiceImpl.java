package androidx.mediarouter.media;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import java.util.List;

abstract interface MediaRouteProviderService$MediaRouteProviderServiceImpl
{
  public abstract void attachBaseContext(Context paramContext);
  
  public abstract MediaRouteProvider.Callback getProviderCallback();
  
  public abstract boolean onAddMemberRoute(Messenger paramMessenger, int paramInt1, int paramInt2, String paramString);
  
  public abstract IBinder onBind(Intent paramIntent);
  
  public abstract void onBinderDied(Messenger paramMessenger);
  
  public abstract boolean onCreateDynamicGroupRouteController(Messenger paramMessenger, int paramInt1, int paramInt2, String paramString);
  
  public abstract boolean onCreateRouteController(Messenger paramMessenger, int paramInt1, int paramInt2, String paramString1, String paramString2);
  
  public abstract boolean onRegisterClient(Messenger paramMessenger, int paramInt1, int paramInt2, String paramString);
  
  public abstract boolean onReleaseRouteController(Messenger paramMessenger, int paramInt1, int paramInt2);
  
  public abstract boolean onRemoveMemberRoute(Messenger paramMessenger, int paramInt1, int paramInt2, String paramString);
  
  public abstract boolean onRouteControlRequest(Messenger paramMessenger, int paramInt1, int paramInt2, Intent paramIntent);
  
  public abstract boolean onSelectRoute(Messenger paramMessenger, int paramInt1, int paramInt2);
  
  public abstract boolean onSetDiscoveryRequest(Messenger paramMessenger, int paramInt, MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest);
  
  public abstract boolean onSetRouteVolume(Messenger paramMessenger, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract boolean onUnregisterClient(Messenger paramMessenger, int paramInt);
  
  public abstract boolean onUnselectRoute(Messenger paramMessenger, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract boolean onUpdateMemberRoutes(Messenger paramMessenger, int paramInt1, int paramInt2, List<String> paramList);
  
  public abstract boolean onUpdateRouteVolume(Messenger paramMessenger, int paramInt1, int paramInt2, int paramInt3);
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteProviderService.MediaRouteProviderServiceImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */