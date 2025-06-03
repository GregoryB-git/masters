package io.flutter.plugins.firebase.messaging;

import android.app.Activity;
import io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener;
import java.util.ArrayList;
import u.b;

class FlutterFirebasePermissionManager
  implements PluginRegistry.RequestPermissionsResultListener
{
  private final int permissionCode = 240;
  private boolean requestInProgress = false;
  private RequestPermissionsSuccessCallback successCallback;
  
  public boolean onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    boolean bool = requestInProgress;
    int i = 0;
    if ((bool) && (paramInt == 240))
    {
      paramArrayOfString = successCallback;
      if (paramArrayOfString != null)
      {
        requestInProgress = false;
        paramInt = i;
        if (paramArrayOfInt.length > 0)
        {
          paramInt = i;
          if (paramArrayOfInt[0] == 0) {
            paramInt = 1;
          }
        }
        paramArrayOfString.onSuccess(paramInt);
        return true;
      }
    }
    return false;
  }
  
  public void requestPermissions(Activity paramActivity, RequestPermissionsSuccessCallback paramRequestPermissionsSuccessCallback, ErrorCallback paramErrorCallback)
  {
    if (requestInProgress) {}
    for (paramActivity = "A request for permissions is already running, please wait for it to finish before doing another request.";; paramActivity = "Unable to detect current Android Activity.")
    {
      paramErrorCallback.onError(paramActivity);
      return;
      if (paramActivity != null) {
        break;
      }
    }
    successCallback = paramRequestPermissionsSuccessCallback;
    paramRequestPermissionsSuccessCallback = new ArrayList();
    paramRequestPermissionsSuccessCallback.add("android.permission.POST_NOTIFICATIONS");
    paramRequestPermissionsSuccessCallback = (String[])paramRequestPermissionsSuccessCallback.toArray(new String[0]);
    if (!requestInProgress)
    {
      b.a(paramActivity, paramRequestPermissionsSuccessCallback, 240);
      requestInProgress = true;
    }
  }
  
  @FunctionalInterface
  public static abstract interface RequestPermissionsSuccessCallback
  {
    public abstract void onSuccess(int paramInt);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.FlutterFirebasePermissionManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */