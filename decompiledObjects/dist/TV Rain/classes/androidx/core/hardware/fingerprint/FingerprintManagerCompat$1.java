package androidx.core.hardware.fingerprint;

import android.hardware.fingerprint.FingerprintManager.AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager.AuthenticationResult;

class FingerprintManagerCompat$1
  extends FingerprintManager.AuthenticationCallback
{
  public FingerprintManagerCompat$1(FingerprintManagerCompat.AuthenticationCallback paramAuthenticationCallback) {}
  
  public void onAuthenticationError(int paramInt, CharSequence paramCharSequence)
  {
    val$callback.onAuthenticationError(paramInt, paramCharSequence);
  }
  
  public void onAuthenticationFailed()
  {
    val$callback.onAuthenticationFailed();
  }
  
  public void onAuthenticationHelp(int paramInt, CharSequence paramCharSequence)
  {
    val$callback.onAuthenticationHelp(paramInt, paramCharSequence);
  }
  
  public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult paramAuthenticationResult)
  {
    val$callback.onAuthenticationSucceeded(new FingerprintManagerCompat.AuthenticationResult(FingerprintManagerCompat.unwrapCryptoObject(FingerprintManagerCompat.Api23Impl.getCryptoObject(paramAuthenticationResult))));
  }
}

/* Location:
 * Qualified Name:     androidx.core.hardware.fingerprint.FingerprintManagerCompat.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */