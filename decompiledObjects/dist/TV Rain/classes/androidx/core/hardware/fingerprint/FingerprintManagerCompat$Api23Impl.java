package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.fingerprint.FingerprintManager.AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager.AuthenticationResult;
import android.hardware.fingerprint.FingerprintManager.CryptoObject;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;

@RequiresApi(23)
class FingerprintManagerCompat$Api23Impl
{
  @DoNotInline
  @RequiresPermission("android.permission.USE_FINGERPRINT")
  public static void authenticate(Object paramObject1, Object paramObject2, CancellationSignal paramCancellationSignal, int paramInt, Object paramObject3, Handler paramHandler)
  {
    ((FingerprintManager)paramObject1).authenticate((FingerprintManager.CryptoObject)paramObject2, paramCancellationSignal, paramInt, (FingerprintManager.AuthenticationCallback)paramObject3, paramHandler);
  }
  
  @DoNotInline
  public static FingerprintManager.CryptoObject getCryptoObject(Object paramObject)
  {
    return ((FingerprintManager.AuthenticationResult)paramObject).getCryptoObject();
  }
  
  @DoNotInline
  public static FingerprintManager getFingerprintManagerOrNull(Context paramContext)
  {
    if (paramContext.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
      return (FingerprintManager)paramContext.getSystemService(FingerprintManager.class);
    }
    return null;
  }
  
  @DoNotInline
  @RequiresPermission("android.permission.USE_FINGERPRINT")
  public static boolean hasEnrolledFingerprints(Object paramObject)
  {
    return ((FingerprintManager)paramObject).hasEnrolledFingerprints();
  }
  
  @DoNotInline
  @RequiresPermission("android.permission.USE_FINGERPRINT")
  public static boolean isHardwareDetected(Object paramObject)
  {
    return ((FingerprintManager)paramObject).isHardwareDetected();
  }
  
  @DoNotInline
  public static FingerprintManagerCompat.CryptoObject unwrapCryptoObject(Object paramObject)
  {
    FingerprintManager.CryptoObject localCryptoObject = (FingerprintManager.CryptoObject)paramObject;
    paramObject = null;
    if (localCryptoObject == null) {
      return null;
    }
    if (localCryptoObject.getCipher() != null) {
      return new FingerprintManagerCompat.CryptoObject(localCryptoObject.getCipher());
    }
    if (localCryptoObject.getSignature() != null) {
      return new FingerprintManagerCompat.CryptoObject(localCryptoObject.getSignature());
    }
    if (localCryptoObject.getMac() != null) {
      paramObject = new FingerprintManagerCompat.CryptoObject(localCryptoObject.getMac());
    }
    return (FingerprintManagerCompat.CryptoObject)paramObject;
  }
  
  @DoNotInline
  public static FingerprintManager.CryptoObject wrapCryptoObject(FingerprintManagerCompat.CryptoObject paramCryptoObject)
  {
    FingerprintManager.CryptoObject localCryptoObject = null;
    if (paramCryptoObject == null) {
      return null;
    }
    if (paramCryptoObject.getCipher() != null) {
      return new FingerprintManager.CryptoObject(paramCryptoObject.getCipher());
    }
    if (paramCryptoObject.getSignature() != null) {
      return new FingerprintManager.CryptoObject(paramCryptoObject.getSignature());
    }
    if (paramCryptoObject.getMac() != null) {
      localCryptoObject = new FingerprintManager.CryptoObject(paramCryptoObject.getMac());
    }
    return localCryptoObject;
  }
}

/* Location:
 * Qualified Name:     androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */