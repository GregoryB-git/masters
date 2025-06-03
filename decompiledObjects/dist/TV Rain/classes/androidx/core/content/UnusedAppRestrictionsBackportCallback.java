package androidx.core.content;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;

public class UnusedAppRestrictionsBackportCallback
{
  private IUnusedAppRestrictionsBackportCallback mCallback;
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public UnusedAppRestrictionsBackportCallback(@NonNull IUnusedAppRestrictionsBackportCallback paramIUnusedAppRestrictionsBackportCallback)
  {
    mCallback = paramIUnusedAppRestrictionsBackportCallback;
  }
  
  public void onResult(boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException
  {
    mCallback.onIsPermissionRevocationEnabledForAppResult(paramBoolean1, paramBoolean2);
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.UnusedAppRestrictionsBackportCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */