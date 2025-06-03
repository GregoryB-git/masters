package io.flutter.plugins.firebase.auth;

import b8.c0;
import b8.g0;
import b8.r;
import b8.v;
import b8.w;
import b8.y;
import b8.z;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import z9.a;

public class FlutterFirebaseMultiFactor
  implements GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi, GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi
{
  public static final Map<String, w> multiFactorAssertionMap = new HashMap();
  public static final Map<String, y> multiFactorResolverMap;
  public static final Map<String, z> multiFactorSessionMap;
  public static final Map<String, Map<String, v>> multiFactorUserMap = new HashMap();
  
  static
  {
    multiFactorSessionMap = new HashMap();
    multiFactorResolverMap = new HashMap();
  }
  
  public void enrollPhone(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion paramPigeonPhoneMultiFactorAssertion, String paramString, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult)
  {
    try
    {
      paramAuthPigeonFirebaseApp = getAppMultiFactor(paramAuthPigeonFirebaseApp);
      paramAuthPigeonFirebaseApp.a(new g0(c0.G(paramPigeonPhoneMultiFactorAssertion.getVerificationId(), paramPigeonPhoneMultiFactorAssertion.getVerificationCode())), paramString).addOnCompleteListener(new d(paramVoidResult, 2));
      return;
    }
    catch (a paramAuthPigeonFirebaseApp)
    {
      paramVoidResult.error(paramAuthPigeonFirebaseApp);
    }
  }
  
  public void enrollTotp(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString1, String paramString2, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult)
  {
    try
    {
      paramAuthPigeonFirebaseApp = getAppMultiFactor(paramAuthPigeonFirebaseApp);
      paramAuthPigeonFirebaseApp.a((w)multiFactorAssertionMap.get(paramString1), paramString2).addOnCompleteListener(new h(paramVoidResult, 4));
      return;
    }
    catch (a paramAuthPigeonFirebaseApp)
    {
      paramVoidResult.error(paramAuthPigeonFirebaseApp);
    }
  }
  
  public v getAppMultiFactor(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp)
  {
    r localr = FlutterFirebaseAuthUser.getCurrentUserFromPigeon(paramAuthPigeonFirebaseApp);
    if (localr != null)
    {
      Map localMap = multiFactorUserMap;
      if (localMap.get(paramAuthPigeonFirebaseApp.getAppName()) == null) {
        localMap.put(paramAuthPigeonFirebaseApp.getAppName(), new HashMap());
      }
      paramAuthPigeonFirebaseApp = (Map)localMap.get(paramAuthPigeonFirebaseApp.getAppName());
      if (paramAuthPigeonFirebaseApp.get(localr.a()) == null) {
        paramAuthPigeonFirebaseApp.put(localr.a(), localr.E());
      }
      return (v)paramAuthPigeonFirebaseApp.get(localr.a());
    }
    throw new a("No user is signed in");
  }
  
  public void getEnrolledFactors(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<List<GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo>> paramResult)
  {
    try
    {
      paramAuthPigeonFirebaseApp = getAppMultiFactor(paramAuthPigeonFirebaseApp);
      paramResult.success(PigeonParser.multiFactorInfoToPigeon(paramAuthPigeonFirebaseApp.b()));
      return;
    }
    catch (a paramAuthPigeonFirebaseApp)
    {
      paramResult.error(paramAuthPigeonFirebaseApp);
    }
  }
  
  public void getSession(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession> paramResult)
  {
    try
    {
      paramAuthPigeonFirebaseApp = getAppMultiFactor(paramAuthPigeonFirebaseApp);
      paramAuthPigeonFirebaseApp.c().addOnCompleteListener(new c(paramResult, 4));
      return;
    }
    catch (a paramAuthPigeonFirebaseApp)
    {
      paramResult.error(paramAuthPigeonFirebaseApp);
    }
  }
  
  public void resolveSignIn(String paramString1, GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion paramPigeonPhoneMultiFactorAssertion, String paramString2, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult)
  {
    y localy = (y)multiFactorResolverMap.get(paramString1);
    if (localy == null)
    {
      paramResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(new Exception("Resolver not found")));
      return;
    }
    if (paramPigeonPhoneMultiFactorAssertion != null) {
      paramString1 = new g0(c0.G(paramPigeonPhoneMultiFactorAssertion.getVerificationId(), paramPigeonPhoneMultiFactorAssertion.getVerificationCode()));
    } else {
      paramString1 = (w)multiFactorAssertionMap.get(paramString2);
    }
    localy.G(paramString1).addOnCompleteListener(new i(paramResult, 5));
  }
  
  public void unenroll(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult)
  {
    try
    {
      paramAuthPigeonFirebaseApp = getAppMultiFactor(paramAuthPigeonFirebaseApp);
      paramAuthPigeonFirebaseApp.d(paramString).addOnCompleteListener(new g(paramVoidResult, 3));
      return;
    }
    catch (a paramAuthPigeonFirebaseApp)
    {
      paramVoidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(paramAuthPigeonFirebaseApp));
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.FlutterFirebaseMultiFactor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */