package io.flutter.plugins.firebase.auth;

import b8.k0;
import b8.m0;
import b8.o1;
import b8.z;
import c8.i;
import c8.n;
import com.google.android.gms.internal.firebase_auth_api.zzabq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import m6.j;

public class FlutterFirebaseTotpMultiFactor
  implements GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi
{
  public static final Map<String, m0> multiFactorSecret = new HashMap();
  
  public void generateSecret(String paramString, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonTotpSecret> paramResult)
  {
    paramString = (z)FlutterFirebaseMultiFactor.multiFactorSessionMap.get(paramString);
    j.i(paramString);
    n localn = (n)paramString;
    paramString = FirebaseAuth.getInstance(e.K());
    paramString.getClass();
    e.zza(localn, k).continueWithTask(new o1(paramString)).addOnCompleteListener(new e(paramResult, 4));
  }
  
  public void getAssertionForEnrollment(String paramString1, String paramString2, GeneratedAndroidFirebaseAuth.Result<String> paramResult)
  {
    paramString1 = (m0)multiFactorSecret.get(paramString1);
    j.i(paramString2);
    j.i(paramString1);
    paramString2 = new k0(paramString2, paramString1, null);
    paramString1 = UUID.randomUUID().toString();
    FlutterFirebaseMultiFactor.multiFactorAssertionMap.put(paramString1, paramString2);
    paramResult.success(paramString1);
  }
  
  public void getAssertionForSignIn(String paramString1, String paramString2, GeneratedAndroidFirebaseAuth.Result<String> paramResult)
  {
    j.i(paramString2);
    j.i(paramString1);
    paramString1 = new k0(paramString2, null, paramString1);
    paramString2 = UUID.randomUUID().toString();
    FlutterFirebaseMultiFactor.multiFactorAssertionMap.put(paramString2, paramString1);
    paramResult.success(paramString2);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.FlutterFirebaseTotpMultiFactor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */