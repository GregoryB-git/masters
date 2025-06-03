package io.flutter.plugins.firebase.auth;

import b8.l;
import b8.o;
import b8.p;
import b8.q;
import b8.y;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import u7.c;
import u7.f;
import u7.i;
import u7.k;

public class FlutterFirebaseAuthPluginException
{
  public static GeneratedAndroidFirebaseAuth.FlutterError alreadyLinkedProvider()
  {
    return new GeneratedAndroidFirebaseAuth.FlutterError("PROVIDER_ALREADY_LINKED", "User has already been linked to the given provider.", null);
  }
  
  public static GeneratedAndroidFirebaseAuth.FlutterError invalidCredential()
  {
    return new GeneratedAndroidFirebaseAuth.FlutterError("INVALID_CREDENTIAL", "The supplied auth credential is malformed, has expired or is not currently supported.", null);
  }
  
  public static GeneratedAndroidFirebaseAuth.FlutterError noSuchProvider()
  {
    return new GeneratedAndroidFirebaseAuth.FlutterError("NO_SUCH_PROVIDER", "User was not linked to an account with the given provider.", null);
  }
  
  public static GeneratedAndroidFirebaseAuth.FlutterError noUser()
  {
    return new GeneratedAndroidFirebaseAuth.FlutterError("NO_CURRENT_USER", "No user currently signed in.", null);
  }
  
  public static GeneratedAndroidFirebaseAuth.FlutterError parserExceptionToFlutter(Exception paramException)
  {
    Object localObject1 = "UNKNOWN";
    if (paramException == null) {
      return new GeneratedAndroidFirebaseAuth.FlutterError("UNKNOWN", null, null);
    }
    String str = paramException.getMessage();
    Object localObject2 = new HashMap();
    Object localObject4;
    if ((paramException instanceof o))
    {
      localObject1 = (o)paramException;
      paramException = new HashMap();
      Object localObject3 = b;
      localObject4 = ((y)localObject3).E();
      localObject2 = ((y)localObject3).F();
      str = UUID.randomUUID().toString();
      FlutterFirebaseMultiFactor.multiFactorSessionMap.put(str, localObject2);
      localObject2 = UUID.randomUUID().toString();
      FlutterFirebaseMultiFactor.multiFactorResolverMap.put(localObject2, localObject3);
      localObject4 = PigeonParser.multiFactorInfoToMap((List)localObject4);
      localObject3 = b.D().a;
      ((f)localObject3).a();
      paramException.put("appName", b);
      paramException.put("multiFactorHints", localObject4);
      paramException.put("multiFactorSessionId", str);
      paramException.put("multiFactorResolverId", localObject2);
      return new GeneratedAndroidFirebaseAuth.FlutterError(a, ((Throwable)localObject1).getLocalizedMessage(), paramException);
    }
    if ((!(paramException instanceof i)) && ((paramException.getCause() == null) || (!(paramException.getCause() instanceof i))))
    {
      if ((!(paramException instanceof c)) && ((paramException.getCause() == null) || (!(paramException.getCause() instanceof c))))
      {
        if ((!(paramException instanceof k)) && ((paramException.getCause() == null) || (!(paramException.getCause() instanceof k))))
        {
          if ((paramException.getMessage() != null) && (paramException.getMessage().startsWith("Cannot create PhoneAuthCredential without either verificationProof"))) {
            return new GeneratedAndroidFirebaseAuth.FlutterError("invalid-verification-code", "The verification ID used to create the phone auth credential is invalid.", null);
          }
          if ((str != null) && (str.contains("User has already been linked to the given provider."))) {
            return alreadyLinkedProvider();
          }
          if ((paramException instanceof l)) {
            localObject1 = a;
          }
          if ((paramException instanceof q)) {
            str = b;
          }
          if ((paramException instanceof p))
          {
            localObject4 = (p)paramException;
            paramException = c;
            if (paramException != null) {
              ((HashMap)localObject2).put("email", paramException);
            }
            paramException = b;
            if (paramException != null) {
              ((HashMap)localObject2).put("authCredential", PigeonParser.parseAuthCredential(paramException));
            }
          }
          return new GeneratedAndroidFirebaseAuth.FlutterError((String)localObject1, str, localObject2);
        }
        return new GeneratedAndroidFirebaseAuth.FlutterError("too-many-requests", "We have blocked all requests from this device due to unusual activity. Try again later.", null);
      }
      return new GeneratedAndroidFirebaseAuth.FlutterError("api-not-available", "The requested API is not available.", null);
    }
    return new GeneratedAndroidFirebaseAuth.FlutterError("network-request-failed", "A network error (such as timeout, interrupted connection or unreachable host) has occurred.", null);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPluginException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */