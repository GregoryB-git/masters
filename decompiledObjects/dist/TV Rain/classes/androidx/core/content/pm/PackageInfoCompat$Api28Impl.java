package androidx.core.content.pm;

import a3;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(28)
class PackageInfoCompat$Api28Impl
{
  @DoNotInline
  @Nullable
  public static Signature[] getApkContentsSigners(@NonNull SigningInfo paramSigningInfo)
  {
    return paramSigningInfo.getApkContentsSigners();
  }
  
  @DoNotInline
  public static long getLongVersionCode(PackageInfo paramPackageInfo)
  {
    return a3.e(paramPackageInfo);
  }
  
  @DoNotInline
  @Nullable
  public static Signature[] getSigningCertificateHistory(@NonNull SigningInfo paramSigningInfo)
  {
    return paramSigningInfo.getSigningCertificateHistory();
  }
  
  @DoNotInline
  public static boolean hasMultipleSigners(@NonNull SigningInfo paramSigningInfo)
  {
    return paramSigningInfo.hasMultipleSigners();
  }
  
  @DoNotInline
  public static boolean hasSigningCertificate(@NonNull PackageManager paramPackageManager, @NonNull String paramString, @NonNull byte[] paramArrayOfByte, int paramInt)
  {
    return a3.A(paramPackageManager, paramString, paramArrayOfByte, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.pm.PackageInfoCompat.Api28Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */