package androidx.core.content;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub;

public abstract class UnusedAppRestrictionsBackportService
  extends Service
{
  @SuppressLint({"ActionValue"})
  public static final String ACTION_UNUSED_APP_RESTRICTIONS_BACKPORT_CONNECTION = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";
  private IUnusedAppRestrictionsBackportService.Stub mBinder = new IUnusedAppRestrictionsBackportService.Stub()
  {
    public void isPermissionRevocationEnabledForApp(@Nullable IUnusedAppRestrictionsBackportCallback paramAnonymousIUnusedAppRestrictionsBackportCallback)
      throws RemoteException
    {
      if (paramAnonymousIUnusedAppRestrictionsBackportCallback == null) {
        return;
      }
      paramAnonymousIUnusedAppRestrictionsBackportCallback = new UnusedAppRestrictionsBackportCallback(paramAnonymousIUnusedAppRestrictionsBackportCallback);
      isPermissionRevocationEnabled(paramAnonymousIUnusedAppRestrictionsBackportCallback);
    }
  };
  
  public abstract void isPermissionRevocationEnabled(@NonNull UnusedAppRestrictionsBackportCallback paramUnusedAppRestrictionsBackportCallback);
  
  @Nullable
  public IBinder onBind(@Nullable Intent paramIntent)
  {
    return mBinder;
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.UnusedAppRestrictionsBackportService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */