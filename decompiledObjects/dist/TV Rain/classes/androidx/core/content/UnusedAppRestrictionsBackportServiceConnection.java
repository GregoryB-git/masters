package androidx.core.content;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub;

class UnusedAppRestrictionsBackportServiceConnection
  implements ServiceConnection
{
  private final Context mContext;
  private boolean mHasBoundService = false;
  @NonNull
  public ResolvableFuture<Integer> mResultFuture;
  @Nullable
  @VisibleForTesting
  public IUnusedAppRestrictionsBackportService mUnusedAppRestrictionsService = null;
  
  public UnusedAppRestrictionsBackportServiceConnection(@NonNull Context paramContext)
  {
    mContext = paramContext;
  }
  
  private IUnusedAppRestrictionsBackportCallback getBackportCallback()
  {
    new IUnusedAppRestrictionsBackportCallback.Stub()
    {
      public void onIsPermissionRevocationEnabledForAppResult(boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2)
        throws RemoteException
      {
        if (paramAnonymousBoolean1)
        {
          if (paramAnonymousBoolean2) {
            mResultFuture.set(Integer.valueOf(3));
          } else {
            mResultFuture.set(Integer.valueOf(2));
          }
        }
        else
        {
          mResultFuture.set(Integer.valueOf(0));
          Log.e("PackageManagerCompat", "Unable to retrieve the permission revocation setting from the backport");
        }
      }
    };
  }
  
  public void connectAndFetchResult(@NonNull ResolvableFuture<Integer> paramResolvableFuture)
  {
    if (!mHasBoundService)
    {
      mHasBoundService = true;
      mResultFuture = paramResolvableFuture;
      paramResolvableFuture = new Intent("android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService").setPackage(PackageManagerCompat.getPermissionRevocationVerifierApp(mContext.getPackageManager()));
      mContext.bindService(paramResolvableFuture, this, 1);
      return;
    }
    throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
  }
  
  public void disconnectFromService()
  {
    if (mHasBoundService)
    {
      mHasBoundService = false;
      mContext.unbindService(this);
      return;
    }
    throw new IllegalStateException("bindService must be called before unbind");
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = IUnusedAppRestrictionsBackportService.Stub.asInterface(paramIBinder);
    mUnusedAppRestrictionsService = paramComponentName;
    try
    {
      paramComponentName.isPermissionRevocationEnabledForApp(getBackportCallback());
    }
    catch (RemoteException paramComponentName)
    {
      mResultFuture.set(Integer.valueOf(0));
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    mUnusedAppRestrictionsService = null;
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.UnusedAppRestrictionsBackportServiceConnection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */