package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.fingerprint.FingerprintManager.AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager.AuthenticationResult;
import android.hardware.fingerprint.FingerprintManager.CryptoObject;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@Deprecated
public class FingerprintManagerCompat
{
  private final Context mContext;
  
  private FingerprintManagerCompat(Context paramContext)
  {
    mContext = paramContext;
  }
  
  @NonNull
  public static FingerprintManagerCompat from(@NonNull Context paramContext)
  {
    return new FingerprintManagerCompat(paramContext);
  }
  
  @Nullable
  @RequiresApi(23)
  private static FingerprintManager getFingerprintManagerOrNull(@NonNull Context paramContext)
  {
    return Api23Impl.getFingerprintManagerOrNull(paramContext);
  }
  
  @RequiresApi(23)
  public static CryptoObject unwrapCryptoObject(FingerprintManager.CryptoObject paramCryptoObject)
  {
    return Api23Impl.unwrapCryptoObject(paramCryptoObject);
  }
  
  @RequiresApi(23)
  private static FingerprintManager.AuthenticationCallback wrapCallback(AuthenticationCallback paramAuthenticationCallback)
  {
    new FingerprintManager.AuthenticationCallback()
    {
      public void onAuthenticationError(int paramAnonymousInt, CharSequence paramAnonymousCharSequence)
      {
        FingerprintManagerCompat.this.onAuthenticationError(paramAnonymousInt, paramAnonymousCharSequence);
      }
      
      public void onAuthenticationFailed()
      {
        FingerprintManagerCompat.this.onAuthenticationFailed();
      }
      
      public void onAuthenticationHelp(int paramAnonymousInt, CharSequence paramAnonymousCharSequence)
      {
        FingerprintManagerCompat.this.onAuthenticationHelp(paramAnonymousInt, paramAnonymousCharSequence);
      }
      
      public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult paramAnonymousAuthenticationResult)
      {
        onAuthenticationSucceeded(new FingerprintManagerCompat.AuthenticationResult(FingerprintManagerCompat.unwrapCryptoObject(FingerprintManagerCompat.Api23Impl.getCryptoObject(paramAnonymousAuthenticationResult))));
      }
    };
  }
  
  @RequiresApi(23)
  private static FingerprintManager.CryptoObject wrapCryptoObject(CryptoObject paramCryptoObject)
  {
    return Api23Impl.wrapCryptoObject(paramCryptoObject);
  }
  
  @RequiresPermission("android.permission.USE_FINGERPRINT")
  public void authenticate(@Nullable CryptoObject paramCryptoObject, int paramInt, @Nullable androidx.core.os.CancellationSignal paramCancellationSignal, @NonNull AuthenticationCallback paramAuthenticationCallback, @Nullable Handler paramHandler)
  {
    FingerprintManager localFingerprintManager = getFingerprintManagerOrNull(mContext);
    if (localFingerprintManager != null)
    {
      if (paramCancellationSignal != null) {
        paramCancellationSignal = (android.os.CancellationSignal)paramCancellationSignal.getCancellationSignalObject();
      } else {
        paramCancellationSignal = null;
      }
      Api23Impl.authenticate(localFingerprintManager, wrapCryptoObject(paramCryptoObject), paramCancellationSignal, paramInt, wrapCallback(paramAuthenticationCallback), paramHandler);
    }
  }
  
  @RequiresPermission("android.permission.USE_FINGERPRINT")
  public boolean hasEnrolledFingerprints()
  {
    FingerprintManager localFingerprintManager = getFingerprintManagerOrNull(mContext);
    boolean bool;
    if ((localFingerprintManager != null) && (Api23Impl.hasEnrolledFingerprints(localFingerprintManager))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @RequiresPermission("android.permission.USE_FINGERPRINT")
  public boolean isHardwareDetected()
  {
    FingerprintManager localFingerprintManager = getFingerprintManagerOrNull(mContext);
    boolean bool;
    if ((localFingerprintManager != null) && (Api23Impl.isHardwareDetected(localFingerprintManager))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @RequiresApi(23)
  public static class Api23Impl
  {
    @DoNotInline
    @RequiresPermission("android.permission.USE_FINGERPRINT")
    public static void authenticate(Object paramObject1, Object paramObject2, android.os.CancellationSignal paramCancellationSignal, int paramInt, Object paramObject3, Handler paramHandler)
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
  
  public static abstract class AuthenticationCallback
  {
    public void onAuthenticationError(int paramInt, CharSequence paramCharSequence) {}
    
    public void onAuthenticationFailed() {}
    
    public void onAuthenticationHelp(int paramInt, CharSequence paramCharSequence) {}
    
    public void onAuthenticationSucceeded(FingerprintManagerCompat.AuthenticationResult paramAuthenticationResult) {}
  }
  
  public static final class AuthenticationResult
  {
    private final FingerprintManagerCompat.CryptoObject mCryptoObject;
    
    public AuthenticationResult(FingerprintManagerCompat.CryptoObject paramCryptoObject)
    {
      mCryptoObject = paramCryptoObject;
    }
    
    public FingerprintManagerCompat.CryptoObject getCryptoObject()
    {
      return mCryptoObject;
    }
  }
  
  public static class CryptoObject
  {
    private final Cipher mCipher;
    private final Mac mMac;
    private final Signature mSignature;
    
    public CryptoObject(@NonNull Signature paramSignature)
    {
      mSignature = paramSignature;
      mCipher = null;
      mMac = null;
    }
    
    public CryptoObject(@NonNull Cipher paramCipher)
    {
      mCipher = paramCipher;
      mSignature = null;
      mMac = null;
    }
    
    public CryptoObject(@NonNull Mac paramMac)
    {
      mMac = paramMac;
      mCipher = null;
      mSignature = null;
    }
    
    @Nullable
    public Cipher getCipher()
    {
      return mCipher;
    }
    
    @Nullable
    public Mac getMac()
    {
      return mMac;
    }
    
    @Nullable
    public Signature getSignature()
    {
      return mSignature;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.hardware.fingerprint.FingerprintManagerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */