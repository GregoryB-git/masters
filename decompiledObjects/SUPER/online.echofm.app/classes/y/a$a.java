package y;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import androidx.annotation.NonNull;

public abstract class a$a
{
  public static Signature[] a(@NonNull SigningInfo paramSigningInfo)
  {
    return paramSigningInfo.getApkContentsSigners();
  }
  
  public static long b(PackageInfo paramPackageInfo)
  {
    return paramPackageInfo.getLongVersionCode();
  }
  
  public static Signature[] c(@NonNull SigningInfo paramSigningInfo)
  {
    return paramSigningInfo.getSigningCertificateHistory();
  }
  
  public static boolean d(@NonNull SigningInfo paramSigningInfo)
  {
    return paramSigningInfo.hasMultipleSigners();
  }
  
  public static boolean e(@NonNull PackageManager paramPackageManager, @NonNull String paramString, @NonNull byte[] paramArrayOfByte, int paramInt)
  {
    return paramPackageManager.hasSigningCertificate(paramString, paramArrayOfByte, paramInt);
  }
}

/* Location:
 * Qualified Name:     y.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */