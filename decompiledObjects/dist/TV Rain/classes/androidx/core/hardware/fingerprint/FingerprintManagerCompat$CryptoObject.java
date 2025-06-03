package androidx.core.hardware.fingerprint;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public class FingerprintManagerCompat$CryptoObject
{
  private final Cipher mCipher;
  private final Mac mMac;
  private final Signature mSignature;
  
  public FingerprintManagerCompat$CryptoObject(@NonNull Signature paramSignature)
  {
    mSignature = paramSignature;
    mCipher = null;
    mMac = null;
  }
  
  public FingerprintManagerCompat$CryptoObject(@NonNull Cipher paramCipher)
  {
    mCipher = paramCipher;
    mSignature = null;
    mMac = null;
  }
  
  public FingerprintManagerCompat$CryptoObject(@NonNull Mac paramMac)
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

/* Location:
 * Qualified Name:     androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */