package io.flutter.plugins.firebase.auth;

import b8.m0;
import java.util.Map;

public class FlutterFirebaseTotpSecret
  implements GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi
{
  public void generateQrCodeUrl(String paramString1, String paramString2, String paramString3, GeneratedAndroidFirebaseAuth.Result<String> paramResult)
  {
    paramString1 = (m0)FlutterFirebaseTotpMultiFactor.multiFactorSecret.get(paramString1);
    if ((paramString2 != null) && (paramString3 != null)) {}
    for (paramString1 = paramString1.c(paramString2, paramString3);; paramString1 = paramString1.d())
    {
      paramResult.success(paramString1);
      return;
    }
  }
  
  public void openInOtpApp(String paramString1, String paramString2, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult)
  {
    ((m0)FlutterFirebaseTotpMultiFactor.multiFactorSecret.get(paramString1)).g(paramString2);
    paramVoidResult.success();
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.FlutterFirebaseTotpSecret
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */