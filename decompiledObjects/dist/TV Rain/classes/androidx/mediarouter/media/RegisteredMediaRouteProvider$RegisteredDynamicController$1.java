package androidx.mediarouter.media;

import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;

class RegisteredMediaRouteProvider$RegisteredDynamicController$1
  extends MediaRouter.ControlRequestCallback
{
  public RegisteredMediaRouteProvider$RegisteredDynamicController$1(RegisteredMediaRouteProvider.RegisteredDynamicController paramRegisteredDynamicController) {}
  
  public void onError(String paramString, Bundle paramBundle)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Error: ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(", data: ");
    localStringBuilder.append(paramBundle);
    Log.d("MediaRouteProviderProxy", localStringBuilder.toString());
  }
  
  public void onResult(Bundle paramBundle)
  {
    this$1.mGroupableSectionTitle = paramBundle.getString("groupableTitle");
    this$1.mTransferableSectionTitle = paramBundle.getString("transferableTitle");
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.RegisteredMediaRouteProvider.RegisteredDynamicController.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */