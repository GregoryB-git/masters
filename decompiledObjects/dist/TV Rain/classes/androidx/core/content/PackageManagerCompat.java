package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.AbstractResolvableFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.os.UserManagerCompat;
import com.google.common.util.concurrent.ListenableFuture;
import d;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;

public final class PackageManagerCompat
{
  @SuppressLint({"ActionValue"})
  public static final String ACTION_PERMISSION_REVOCATION_SETTINGS = "android.intent.action.AUTO_REVOKE_PERMISSIONS";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String LOG_TAG = "PackageManagerCompat";
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static boolean areUnusedAppRestrictionsAvailable(@NonNull PackageManager paramPackageManager)
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool1 = true;
    int j;
    if (i >= 30) {
      j = 1;
    } else {
      j = 0;
    }
    if (i < 30) {
      i = 1;
    } else {
      i = 0;
    }
    int k;
    if (getPermissionRevocationVerifierApp(paramPackageManager) != null) {
      k = 1;
    } else {
      k = 0;
    }
    boolean bool2 = bool1;
    if (j == 0) {
      if ((i != 0) && (k != 0)) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static String getPermissionRevocationVerifierApp(@NonNull PackageManager paramPackageManager)
  {
    Object localObject1 = new Intent("android.intent.action.AUTO_REVOKE_PERMISSIONS");
    Object localObject2 = null;
    Iterator localIterator = paramPackageManager.queryIntentActivities(((Intent)localObject1).setData(Uri.fromParts("package", "com.example", null)), 0).iterator();
    while (localIterator.hasNext())
    {
      localObject1 = nextactivityInfo.packageName;
      if (paramPackageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", (String)localObject1) == 0)
      {
        if (localObject2 != null) {
          return (String)localObject2;
        }
        localObject2 = localObject1;
      }
    }
    return (String)localObject2;
  }
  
  @NonNull
  public static ListenableFuture<Integer> getUnusedAppRestrictionsStatus(@NonNull Context paramContext)
  {
    ResolvableFuture localResolvableFuture = ResolvableFuture.create();
    boolean bool = UserManagerCompat.isUserUnlocked(paramContext);
    Integer localInteger = Integer.valueOf(0);
    if (!bool)
    {
      localResolvableFuture.set(localInteger);
      Log.e("PackageManagerCompat", "User is in locked direct boot mode");
      return localResolvableFuture;
    }
    if (!areUnusedAppRestrictionsAvailable(paramContext.getPackageManager()))
    {
      localResolvableFuture.set(Integer.valueOf(1));
      return localResolvableFuture;
    }
    int i = getApplicationInfotargetSdkVersion;
    if (i < 30)
    {
      localResolvableFuture.set(localInteger);
      Log.e("PackageManagerCompat", "Target SDK version below API 30");
      return localResolvableFuture;
    }
    int j = Build.VERSION.SDK_INT;
    int k = 4;
    if (j >= 31)
    {
      if (Api30Impl.areUnusedAppRestrictionsEnabled(paramContext))
      {
        if (i >= 31) {
          k = 5;
        }
        localResolvableFuture.set(Integer.valueOf(k));
      }
      else
      {
        localResolvableFuture.set(Integer.valueOf(2));
      }
      return localResolvableFuture;
    }
    if (j == 30)
    {
      if (!Api30Impl.areUnusedAppRestrictionsEnabled(paramContext)) {
        k = 2;
      }
      localResolvableFuture.set(Integer.valueOf(k));
      return localResolvableFuture;
    }
    paramContext = new UnusedAppRestrictionsBackportServiceConnection(paramContext);
    localResolvableFuture.addListener(new a(paramContext), Executors.newSingleThreadExecutor());
    paramContext.connectAndFetchResult(localResolvableFuture);
    return localResolvableFuture;
  }
  
  @RequiresApi(30)
  public static class Api30Impl
  {
    public static boolean areUnusedAppRestrictionsEnabled(@NonNull Context paramContext)
    {
      return d.x(paramContext.getPackageManager()) ^ true;
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static @interface UnusedAppRestrictionsStatus {}
}

/* Location:
 * Qualified Name:     androidx.core.content.PackageManagerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */