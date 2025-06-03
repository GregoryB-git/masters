package io.flutter.plugins.firebase.auth;

import android.app.Activity;
import b8.c0;
import b8.d0;
import b8.e0;
import b8.f0;
import b8.h0;
import b8.z;
import c8.n;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugin.common.EventChannel.EventSink;
import io.flutter.plugin.common.EventChannel.StreamHandler;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import m6.j;
import u7.h;

public class PhoneNumberVerificationStreamHandler
  implements EventChannel.StreamHandler
{
  private static final HashMap<Integer, e0> forceResendingTokens = new HashMap();
  public final AtomicReference<Activity> activityRef;
  public String autoRetrievedSmsCodeForTesting;
  private EventChannel.EventSink eventSink;
  public final FirebaseAuth firebaseAuth;
  public Integer forceResendingToken;
  public final h0 multiFactorInfo;
  public final z multiFactorSession;
  public final OnCredentialsListener onCredentialsListener;
  public final String phoneNumber;
  public final int timeout;
  
  public PhoneNumberVerificationStreamHandler(Activity paramActivity, GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest paramPigeonVerifyPhoneNumberRequest, z paramz, h0 paramh0, OnCredentialsListener paramOnCredentialsListener)
  {
    AtomicReference localAtomicReference = new AtomicReference(null);
    activityRef = localAtomicReference;
    localAtomicReference.set(paramActivity);
    multiFactorSession = paramz;
    multiFactorInfo = paramh0;
    firebaseAuth = FlutterFirebaseAuthPlugin.getAuthFromPigeon(paramAuthPigeonFirebaseApp);
    phoneNumber = paramPigeonVerifyPhoneNumberRequest.getPhoneNumber();
    long l = paramPigeonVerifyPhoneNumberRequest.getTimeout().longValue();
    int i = (int)l;
    if (l == i)
    {
      timeout = i;
      if (paramPigeonVerifyPhoneNumberRequest.getAutoRetrievedSmsCodeForTesting() != null) {
        autoRetrievedSmsCodeForTesting = paramPigeonVerifyPhoneNumberRequest.getAutoRetrievedSmsCodeForTesting();
      }
      if (paramPigeonVerifyPhoneNumberRequest.getForceResendingToken() != null)
      {
        l = paramPigeonVerifyPhoneNumberRequest.getForceResendingToken().longValue();
        i = (int)l;
        if (l == i) {
          forceResendingToken = Integer.valueOf(i);
        } else {
          throw new ArithmeticException();
        }
      }
      onCredentialsListener = paramOnCredentialsListener;
      return;
    }
    throw new ArithmeticException();
  }
  
  public void onCancel(Object paramObject)
  {
    eventSink = null;
    activityRef.set(null);
  }
  
  public void onListen(Object paramObject, EventChannel.EventSink paramEventSink)
  {
    eventSink = paramEventSink;
    f0 local1 = new f0()
    {
      public void onCodeAutoRetrievalTimeOut(String paramAnonymousString)
      {
        HashMap localHashMap = new HashMap();
        localHashMap.put("verificationId", paramAnonymousString);
        localHashMap.put("name", "Auth#phoneCodeAutoRetrievalTimeout");
        if (PhoneNumberVerificationStreamHandler.access$000(PhoneNumberVerificationStreamHandler.this) != null) {
          PhoneNumberVerificationStreamHandler.access$000(PhoneNumberVerificationStreamHandler.this).success(localHashMap);
        }
      }
      
      public void onCodeSent(String paramAnonymousString, e0 paramAnonymouse0)
      {
        int i = paramAnonymouse0.hashCode();
        PhoneNumberVerificationStreamHandler.access$100().put(Integer.valueOf(i), paramAnonymouse0);
        paramAnonymouse0 = new HashMap();
        paramAnonymouse0.put("verificationId", paramAnonymousString);
        paramAnonymouse0.put("forceResendingToken", Integer.valueOf(i));
        paramAnonymouse0.put("name", "Auth#phoneCodeSent");
        if (PhoneNumberVerificationStreamHandler.access$000(PhoneNumberVerificationStreamHandler.this) != null) {
          PhoneNumberVerificationStreamHandler.access$000(PhoneNumberVerificationStreamHandler.this).success(paramAnonymouse0);
        }
      }
      
      public void onVerificationCompleted(c0 paramAnonymousc0)
      {
        int i = paramAnonymousc0.hashCode();
        onCredentialsListener.onCredentialsReceived(paramAnonymousc0);
        HashMap localHashMap = new HashMap();
        localHashMap.put("token", Integer.valueOf(i));
        paramAnonymousc0 = b;
        if (paramAnonymousc0 != null) {
          localHashMap.put("smsCode", paramAnonymousc0);
        }
        localHashMap.put("name", "Auth#phoneVerificationCompleted");
        if (PhoneNumberVerificationStreamHandler.access$000(PhoneNumberVerificationStreamHandler.this) != null) {
          PhoneNumberVerificationStreamHandler.access$000(PhoneNumberVerificationStreamHandler.this).success(localHashMap);
        }
      }
      
      public void onVerificationFailed(h paramAnonymoush)
      {
        HashMap localHashMap1 = new HashMap();
        HashMap localHashMap2 = new HashMap();
        paramAnonymoush = FlutterFirebaseAuthPluginException.parserExceptionToFlutter(paramAnonymoush);
        localHashMap2.put("code", code.replaceAll("ERROR_", "").toLowerCase(Locale.ROOT).replaceAll("_", "-"));
        localHashMap2.put("message", paramAnonymoush.getMessage());
        localHashMap2.put("details", details);
        localHashMap1.put("error", localHashMap2);
        localHashMap1.put("name", "Auth#phoneVerificationFailed");
        if (PhoneNumberVerificationStreamHandler.access$000(PhoneNumberVerificationStreamHandler.this) != null) {
          PhoneNumberVerificationStreamHandler.access$000(PhoneNumberVerificationStreamHandler.this).success(localHashMap1);
        }
      }
    };
    paramObject = autoRetrievedSmsCodeForTesting;
    if (paramObject != null)
    {
      paramEventSink = firebaseAuth.g;
      a = phoneNumber;
      b = ((String)paramObject);
    }
    FirebaseAuth localFirebaseAuth = firebaseAuth;
    j.i(localFirebaseAuth);
    Activity localActivity = (Activity)activityRef.get();
    paramObject = phoneNumber;
    if (paramObject == null) {
      paramObject = null;
    }
    paramEventSink = multiFactorSession;
    if (paramEventSink == null) {
      paramEventSink = null;
    }
    h0 localh0 = multiFactorInfo;
    if (localh0 == null) {
      localh0 = null;
    }
    long l = timeout;
    Object localObject = TimeUnit.MILLISECONDS;
    Long localLong = Long.valueOf(TimeUnit.SECONDS.convert(Long.valueOf(l).longValue(), (TimeUnit)localObject));
    localObject = forceResendingToken;
    if (localObject != null)
    {
      localObject = (e0)forceResendingTokens.get(localObject);
      if (localObject != null) {}
    }
    else
    {
      localObject = null;
    }
    j.j(localLong, "You must specify an auto-retrieval timeout; please call #setTimeout()");
    Executor localExecutor = A;
    if ((localLong.longValue() >= 0L) && (localLong.longValue() <= 120L))
    {
      boolean bool1 = false;
      boolean bool2 = false;
      boolean bool3 = false;
      int i;
      if (paramEventSink == null) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        j.f("The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()", (String)paramObject);
        if (localh0 == null) {
          bool3 = true;
        }
        j.a("A phoneMultiFactorInfo must be set for second factor sign-in.", bool3);
      }
      else
      {
        if (paramEventSink != null)
        {
          if (a != null) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            i = 1;
            break label304;
          }
        }
        i = 0;
        label304:
        String str;
        if (i != 0)
        {
          j.e((String)paramObject);
          bool3 = bool1;
          if (localh0 == null) {
            bool3 = true;
          }
          str = "Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session.";
        }
        else
        {
          if (localh0 != null) {
            bool3 = true;
          } else {
            bool3 = false;
          }
          j.a("A phoneMultiFactorInfo must be set for second factor sign-in.", bool3);
          bool3 = bool2;
          if (paramObject == null) {
            bool3 = true;
          }
          str = "A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead.";
        }
        j.a(str, bool3);
      }
      FirebaseAuth.l(new d0(localFirebaseAuth, localLong, local1, localExecutor, (String)paramObject, localActivity, (e0)localObject, paramEventSink, localh0));
      return;
    }
    throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
  }
  
  public static abstract interface OnCredentialsListener
  {
    public abstract void onCredentialsReceived(c0 paramc0);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.PhoneNumberVerificationStreamHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */