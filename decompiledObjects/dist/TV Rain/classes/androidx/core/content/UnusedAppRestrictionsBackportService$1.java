package androidx.core.content;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub;

class UnusedAppRestrictionsBackportService$1
  extends IUnusedAppRestrictionsBackportService.Stub
{
  public UnusedAppRestrictionsBackportService$1(UnusedAppRestrictionsBackportService paramUnusedAppRestrictionsBackportService) {}
  
  public void isPermissionRevocationEnabledForApp(@Nullable IUnusedAppRestrictionsBackportCallback paramIUnusedAppRestrictionsBackportCallback)
    throws RemoteException
  {
    if (paramIUnusedAppRestrictionsBackportCallback == null) {
      return;
    }
    paramIUnusedAppRestrictionsBackportCallback = new UnusedAppRestrictionsBackportCallback(paramIUnusedAppRestrictionsBackportCallback);
    this$0.isPermissionRevocationEnabled(paramIUnusedAppRestrictionsBackportCallback);
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.UnusedAppRestrictionsBackportService.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */