package androidx.core.content.pm;

import a3;
import android.annotation.SuppressLint;
import android.content.pm.PermissionInfo;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class PermissionInfoCompat
{
  @SuppressLint({"WrongConstant"})
  public static int getProtection(@NonNull PermissionInfo paramPermissionInfo)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.getProtection(paramPermissionInfo);
    }
    return protectionLevel & 0xF;
  }
  
  @SuppressLint({"WrongConstant"})
  public static int getProtectionFlags(@NonNull PermissionInfo paramPermissionInfo)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.getProtectionFlags(paramPermissionInfo);
    }
    return protectionLevel & 0xFFFFFFF0;
  }
  
  @RequiresApi(28)
  public static class Api28Impl
  {
    @DoNotInline
    public static int getProtection(PermissionInfo paramPermissionInfo)
    {
      return a3.c(paramPermissionInfo);
    }
    
    @DoNotInline
    public static int getProtectionFlags(PermissionInfo paramPermissionInfo)
    {
      return a3.D(paramPermissionInfo);
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static @interface Protection {}
  
  @Retention(RetentionPolicy.SOURCE)
  @SuppressLint({"UniqueConstants"})
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static @interface ProtectionFlags {}
}

/* Location:
 * Qualified Name:     androidx.core.content.pm.PermissionInfoCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */