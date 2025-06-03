package b8;

import android.util.Log;
import p6.a;
import u7.h;

public abstract class f0
{
  private static final a zza = new a("PhoneAuthProvider", new String[0]);
  
  public void onCodeAutoRetrievalTimeOut(String paramString)
  {
    paramString = zza;
    Log.i(a, paramString.d("Sms auto retrieval timed-out.", new Object[0]));
  }
  
  public void onCodeSent(String paramString, e0 parame0) {}
  
  public abstract void onVerificationCompleted(c0 paramc0);
  
  public abstract void onVerificationFailed(h paramh);
}

/* Location:
 * Qualified Name:     b8.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */