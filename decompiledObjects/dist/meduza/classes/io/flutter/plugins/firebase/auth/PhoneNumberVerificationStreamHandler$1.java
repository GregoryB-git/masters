package io.flutter.plugins.firebase.auth;

import b8.c0;
import b8.e0;
import b8.f0;
import io.flutter.plugin.common.EventChannel.EventSink;
import java.util.HashMap;
import java.util.Locale;
import u7.h;

class PhoneNumberVerificationStreamHandler$1
  extends f0
{
  public PhoneNumberVerificationStreamHandler$1(PhoneNumberVerificationStreamHandler paramPhoneNumberVerificationStreamHandler) {}
  
  public void onCodeAutoRetrievalTimeOut(String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("verificationId", paramString);
    localHashMap.put("name", "Auth#phoneCodeAutoRetrievalTimeout");
    if (PhoneNumberVerificationStreamHandler.access$000(this$0) != null) {
      PhoneNumberVerificationStreamHandler.access$000(this$0).success(localHashMap);
    }
  }
  
  public void onCodeSent(String paramString, e0 parame0)
  {
    int i = parame0.hashCode();
    PhoneNumberVerificationStreamHandler.access$100().put(Integer.valueOf(i), parame0);
    parame0 = new HashMap();
    parame0.put("verificationId", paramString);
    parame0.put("forceResendingToken", Integer.valueOf(i));
    parame0.put("name", "Auth#phoneCodeSent");
    if (PhoneNumberVerificationStreamHandler.access$000(this$0) != null) {
      PhoneNumberVerificationStreamHandler.access$000(this$0).success(parame0);
    }
  }
  
  public void onVerificationCompleted(c0 paramc0)
  {
    int i = paramc0.hashCode();
    this$0.onCredentialsListener.onCredentialsReceived(paramc0);
    HashMap localHashMap = new HashMap();
    localHashMap.put("token", Integer.valueOf(i));
    paramc0 = b;
    if (paramc0 != null) {
      localHashMap.put("smsCode", paramc0);
    }
    localHashMap.put("name", "Auth#phoneVerificationCompleted");
    if (PhoneNumberVerificationStreamHandler.access$000(this$0) != null) {
      PhoneNumberVerificationStreamHandler.access$000(this$0).success(localHashMap);
    }
  }
  
  public void onVerificationFailed(h paramh)
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    paramh = FlutterFirebaseAuthPluginException.parserExceptionToFlutter(paramh);
    localHashMap2.put("code", code.replaceAll("ERROR_", "").toLowerCase(Locale.ROOT).replaceAll("_", "-"));
    localHashMap2.put("message", paramh.getMessage());
    localHashMap2.put("details", details);
    localHashMap1.put("error", localHashMap2);
    localHashMap1.put("name", "Auth#phoneVerificationFailed");
    if (PhoneNumberVerificationStreamHandler.access$000(this$0) != null) {
      PhoneNumberVerificationStreamHandler.access$000(this$0).success(localHashMap1);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.PhoneNumberVerificationStreamHandler.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */