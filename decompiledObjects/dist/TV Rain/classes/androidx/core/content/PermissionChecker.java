package androidx.core.content;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.AppOpsManagerCompat;
import androidx.core.util.ObjectsCompat;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class PermissionChecker
{
  public static final int PERMISSION_DENIED = -1;
  public static final int PERMISSION_DENIED_APP_OP = -2;
  public static final int PERMISSION_GRANTED = 0;
  
  public static int checkCallingOrSelfPermission(@NonNull Context paramContext, @NonNull String paramString)
  {
    String str;
    if (Binder.getCallingPid() == Process.myPid()) {
      str = paramContext.getPackageName();
    } else {
      str = null;
    }
    return checkPermission(paramContext, paramString, Binder.getCallingPid(), Binder.getCallingUid(), str);
  }
  
  public static int checkCallingPermission(@NonNull Context paramContext, @NonNull String paramString1, @Nullable String paramString2)
  {
    if (Binder.getCallingPid() == Process.myPid()) {
      return -1;
    }
    return checkPermission(paramContext, paramString1, Binder.getCallingPid(), Binder.getCallingUid(), paramString2);
  }
  
  public static int checkPermission(@NonNull Context paramContext, @NonNull String paramString1, int paramInt1, int paramInt2, @Nullable String paramString2)
  {
    if (paramContext.checkPermission(paramString1, paramInt1, paramInt2) == -1) {
      return -1;
    }
    String str = AppOpsManagerCompat.permissionToOp(paramString1);
    int i = 0;
    if (str == null) {
      return 0;
    }
    paramString1 = paramString2;
    if (paramString2 == null)
    {
      paramString1 = paramContext.getPackageManager().getPackagesForUid(paramInt2);
      if ((paramString1 != null) && (paramString1.length > 0)) {
        paramString1 = paramString1[0];
      } else {
        return -1;
      }
    }
    paramInt1 = Process.myUid();
    paramString2 = paramContext.getPackageName();
    if ((paramInt1 == paramInt2) && (ObjectsCompat.equals(paramString2, paramString1))) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    }
    if (paramInt1 != 0) {
      paramInt1 = AppOpsManagerCompat.checkOrNoteProxyOp(paramContext, paramInt2, str, paramString1);
    } else {
      paramInt1 = AppOpsManagerCompat.noteProxyOpNoThrow(paramContext, str, paramString1);
    }
    if (paramInt1 == 0) {
      paramInt1 = i;
    } else {
      paramInt1 = -2;
    }
    return paramInt1;
  }
  
  public static int checkSelfPermission(@NonNull Context paramContext, @NonNull String paramString)
  {
    return checkPermission(paramContext, paramString, Process.myPid(), Process.myUid(), paramContext.getPackageName());
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface PermissionResult {}
}

/* Location:
 * Qualified Name:     androidx.core.content.PermissionChecker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */