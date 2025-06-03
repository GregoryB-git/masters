package androidx.core.content;

import android.os.RemoteException;
import android.util.Log;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub;

class UnusedAppRestrictionsBackportServiceConnection$1
  extends IUnusedAppRestrictionsBackportCallback.Stub
{
  public UnusedAppRestrictionsBackportServiceConnection$1(UnusedAppRestrictionsBackportServiceConnection paramUnusedAppRestrictionsBackportServiceConnection) {}
  
  public void onIsPermissionRevocationEnabledForAppResult(boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException
  {
    if (paramBoolean1)
    {
      if (paramBoolean2) {
        this$0.mResultFuture.set(Integer.valueOf(3));
      } else {
        this$0.mResultFuture.set(Integer.valueOf(2));
      }
    }
    else
    {
      this$0.mResultFuture.set(Integer.valueOf(0));
      Log.e("PackageManagerCompat", "Unable to retrieve the permission revocation setting from the backport");
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.UnusedAppRestrictionsBackportServiceConnection.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */