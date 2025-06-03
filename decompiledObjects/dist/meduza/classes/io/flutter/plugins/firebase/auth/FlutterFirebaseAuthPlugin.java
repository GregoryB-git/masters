package io.flutter.plugins.firebase.auth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import b8.b0;
import b8.b0.a;
import b8.h0;
import b8.m1;
import b8.x;
import b8.y;
import c8.f0;
import c8.i0;
import c8.k1;
import c8.r0;
import c8.u0;
import c8.w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase_auth_api.zzabq;
import com.google.android.gms.internal.firebase_auth_api.zzadr;
import com.google.android.gms.internal.firebase_auth_api.zzaee;
import com.google.android.gms.internal.firebase_auth_api.zzafm;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuth.d;
import com.google.firebase.auth.internal.GenericIdpActivity;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.EventChannel.StreamHandler;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import va.a;

public class FlutterFirebaseAuthPlugin
  implements FlutterFirebasePlugin, FlutterPlugin, ActivityAware, GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
{
  private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/firebase_auth";
  public static final HashMap<Integer, b8.f> authCredentials = new HashMap();
  private Activity activity;
  private MethodChannel channel;
  private final FlutterFirebaseAuthUser firebaseAuthUser = new FlutterFirebaseAuthUser();
  private final FlutterFirebaseMultiFactor firebaseMultiFactor = new FlutterFirebaseMultiFactor();
  private final FlutterFirebaseTotpMultiFactor firebaseTotpMultiFactor = new FlutterFirebaseTotpMultiFactor();
  private final FlutterFirebaseTotpSecret firebaseTotpSecret = new FlutterFirebaseTotpSecret();
  private BinaryMessenger messenger;
  private final Map<EventChannel, EventChannel.StreamHandler> streamHandlers = new HashMap();
  
  private Activity getActivity()
  {
    return activity;
  }
  
  public static FirebaseAuth getAuthFromPigeon(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp)
  {
    FirebaseAuth localFirebaseAuth = FirebaseAuth.getInstance(u7.f.f(paramAuthPigeonFirebaseApp.getAppName()));
    if (paramAuthPigeonFirebaseApp.getTenantId() != null)
    {
      String str = paramAuthPigeonFirebaseApp.getTenantId();
      localFirebaseAuth.getClass();
      m6.j.e(str);
      synchronized (j)
      {
        k = str;
      }
    }
    ??? = (String)FlutterFirebaseCorePlugin.customAuthDomain.get(paramAuthPigeonFirebaseApp.getAppName());
    if (??? != null) {
      localFirebaseAuth.f((String)???);
    }
    if (paramAuthPigeonFirebaseApp.getCustomAuthDomain() != null) {
      localFirebaseAuth.f(paramAuthPigeonFirebaseApp.getCustomAuthDomain());
    }
    return localFirebaseAuth;
  }
  
  private void initInstance(BinaryMessenger paramBinaryMessenger)
  {
    FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_auth", this);
    channel = new MethodChannel(paramBinaryMessenger, "plugins.flutter.io/firebase_auth");
    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi._CC.x(paramBinaryMessenger, this);
    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi._CC.p(paramBinaryMessenger, firebaseAuthUser);
    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi._CC.g(paramBinaryMessenger, firebaseMultiFactor);
    GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi._CC.c(paramBinaryMessenger, firebaseMultiFactor);
    GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi._CC.e(paramBinaryMessenger, firebaseTotpMultiFactor);
    GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi._CC.d(paramBinaryMessenger, firebaseTotpSecret);
    messenger = paramBinaryMessenger;
  }
  
  private static void lambda$getPluginConstantsForFirebaseApp$16(u7.f arg0, TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      Object localObject2 = FirebaseAuth.getInstance(???);
      b8.r localr = f;
      synchronized (h)
      {
        localObject2 = i;
        if (localr == null) {
          ??? = null;
        } else {
          ??? = PigeonParser.parseFirebaseUser(localr);
        }
        if (localObject2 != null) {
          localHashMap.put("APP_LANGUAGE_CODE", localObject2);
        }
        if (??? != null) {
          localHashMap.put("APP_CURRENT_USER", PigeonParser.manuallyToList(???));
        }
        paramTaskCompletionSource.setResult(localHashMap);
      }
      return;
    }
    catch (Exception ???)
    {
      paramTaskCompletionSource.setException(???);
    }
  }
  
  private void removeEventListeners()
  {
    Iterator localIterator = streamHandlers.keySet().iterator();
    while (localIterator.hasNext())
    {
      EventChannel localEventChannel = (EventChannel)localIterator.next();
      EventChannel.StreamHandler localStreamHandler = (EventChannel.StreamHandler)streamHandlers.get(localEventChannel);
      if (localStreamHandler != null) {
        localStreamHandler.onCancel(null);
      }
      localEventChannel.setStreamHandler(null);
    }
    streamHandlers.clear();
  }
  
  public void applyActionCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult)
  {
    paramAuthPigeonFirebaseApp = getAuthFromPigeon(paramAuthPigeonFirebaseApp);
    paramAuthPigeonFirebaseApp.getClass();
    m6.j.e(paramString);
    e.zza(a, paramString, k).addOnCompleteListener(new d(paramVoidResult, 1));
  }
  
  public void checkActionCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo> paramResult)
  {
    paramAuthPigeonFirebaseApp = getAuthFromPigeon(paramAuthPigeonFirebaseApp);
    paramAuthPigeonFirebaseApp.getClass();
    m6.j.e(paramString);
    e.zzb(a, paramString, k).addOnCompleteListener(new j(paramResult, 0));
  }
  
  public void confirmPasswordReset(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString1, String paramString2, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult)
  {
    paramAuthPigeonFirebaseApp = getAuthFromPigeon(paramAuthPigeonFirebaseApp);
    paramAuthPigeonFirebaseApp.getClass();
    m6.j.e(paramString1);
    m6.j.e(paramString2);
    e.zza(a, paramString1, paramString2, k).addOnCompleteListener(new g(paramVoidResult, 1));
  }
  
  public void createUserWithEmailAndPassword(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString1, String paramString2, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult)
  {
    paramAuthPigeonFirebaseApp = getAuthFromPigeon(paramAuthPigeonFirebaseApp);
    paramAuthPigeonFirebaseApp.getClass();
    m6.j.e(paramString1);
    m6.j.e(paramString2);
    new com.google.firebase.auth.e(paramAuthPigeonFirebaseApp, paramString1, paramString2).a(paramAuthPigeonFirebaseApp, k, o).addOnCompleteListener(new c(paramResult, 0));
  }
  
  public Task<Void> didReinitializeFirebaseCore()
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new w.g(28, this, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
  
  public void fetchSignInMethodsForEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.Result<List<String>> paramResult)
  {
    paramAuthPigeonFirebaseApp = getAuthFromPigeon(paramAuthPigeonFirebaseApp);
    paramAuthPigeonFirebaseApp.getClass();
    m6.j.e(paramString);
    e.zzc(a, paramString, k).addOnCompleteListener(new j(paramResult, 1));
  }
  
  public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(u7.f paramf)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new f(paramf, localTaskCompletionSource, 0));
    return localTaskCompletionSource.getTask();
  }
  
  public void onAttachedToActivity(ActivityPluginBinding paramActivityPluginBinding)
  {
    paramActivityPluginBinding = paramActivityPluginBinding.getActivity();
    activity = paramActivityPluginBinding;
    firebaseAuthUser.setActivity(paramActivityPluginBinding);
  }
  
  public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    initInstance(paramFlutterPluginBinding.getBinaryMessenger());
  }
  
  public void onDetachedFromActivity()
  {
    activity = null;
    firebaseAuthUser.setActivity(null);
  }
  
  public void onDetachedFromActivityForConfigChanges()
  {
    activity = null;
    firebaseAuthUser.setActivity(null);
  }
  
  public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    channel.setMethodCallHandler(null);
    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi._CC.x(messenger, null);
    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi._CC.p(messenger, null);
    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi._CC.g(messenger, null);
    GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi._CC.c(messenger, null);
    GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi._CC.e(messenger, null);
    GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi._CC.d(messenger, null);
    channel = null;
    messenger = null;
    removeEventListeners();
  }
  
  public void onReattachedToActivityForConfigChanges(ActivityPluginBinding paramActivityPluginBinding)
  {
    paramActivityPluginBinding = paramActivityPluginBinding.getActivity();
    activity = paramActivityPluginBinding;
    firebaseAuthUser.setActivity(paramActivityPluginBinding);
  }
  
  public void registerAuthStateListener(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<String> paramResult)
  {
    try
    {
      Object localObject1 = getAuthFromPigeon(paramAuthPigeonFirebaseApp);
      paramAuthPigeonFirebaseApp = new io/flutter/plugins/firebase/auth/AuthStateChannelStreamHandler;
      paramAuthPigeonFirebaseApp.<init>((FirebaseAuth)localObject1);
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("plugins.flutter.io/firebase_auth/auth-state/");
      localObject1 = a;
      ((u7.f)localObject1).a();
      ((StringBuilder)localObject2).append(b);
      localObject1 = ((StringBuilder)localObject2).toString();
      localObject2 = new io/flutter/plugin/common/EventChannel;
      ((EventChannel)localObject2).<init>(messenger, (String)localObject1);
      ((EventChannel)localObject2).setStreamHandler(paramAuthPigeonFirebaseApp);
      streamHandlers.put(localObject2, paramAuthPigeonFirebaseApp);
      paramResult.success(localObject1);
    }
    catch (Exception paramAuthPigeonFirebaseApp)
    {
      paramResult.error(paramAuthPigeonFirebaseApp);
    }
  }
  
  public void registerIdTokenListener(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<String> paramResult)
  {
    try
    {
      Object localObject1 = getAuthFromPigeon(paramAuthPigeonFirebaseApp);
      paramAuthPigeonFirebaseApp = new io/flutter/plugins/firebase/auth/IdTokenChannelStreamHandler;
      paramAuthPigeonFirebaseApp.<init>((FirebaseAuth)localObject1);
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("plugins.flutter.io/firebase_auth/id-token/");
      localObject1 = a;
      ((u7.f)localObject1).a();
      ((StringBuilder)localObject2).append(b);
      localObject1 = ((StringBuilder)localObject2).toString();
      localObject2 = new io/flutter/plugin/common/EventChannel;
      ((EventChannel)localObject2).<init>(messenger, (String)localObject1);
      ((EventChannel)localObject2).setStreamHandler(paramAuthPigeonFirebaseApp);
      streamHandlers.put(localObject2, paramAuthPigeonFirebaseApp);
      paramResult.success(localObject1);
    }
    catch (Exception paramAuthPigeonFirebaseApp)
    {
      paramResult.error(paramAuthPigeonFirebaseApp);
    }
  }
  
  public void revokeTokenWithAuthorizationCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult)
  {
    paramVoidResult.success();
  }
  
  public void sendPasswordResetEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings paramPigeonActionCodeSettings, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult)
  {
    paramAuthPigeonFirebaseApp = getAuthFromPigeon(paramAuthPigeonFirebaseApp);
    if (paramPigeonActionCodeSettings == null)
    {
      paramAuthPigeonFirebaseApp.getClass();
      m6.j.e(paramString);
      paramString = paramAuthPigeonFirebaseApp.e(paramString, null);
      paramAuthPigeonFirebaseApp = new g(paramVoidResult, 0);
    }
    else
    {
      paramString = paramAuthPigeonFirebaseApp.e(paramString, PigeonParser.getActionCodeSettings(paramPigeonActionCodeSettings));
      paramAuthPigeonFirebaseApp = new h(paramVoidResult, 0);
    }
    paramString.addOnCompleteListener(paramAuthPigeonFirebaseApp);
  }
  
  public void sendSignInLinkToEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings paramPigeonActionCodeSettings, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult)
  {
    paramAuthPigeonFirebaseApp = getAuthFromPigeon(paramAuthPigeonFirebaseApp);
    b8.c localc = PigeonParser.getActionCodeSettings(paramPigeonActionCodeSettings);
    paramAuthPigeonFirebaseApp.getClass();
    m6.j.e(paramString);
    m6.j.i(localc);
    if (o)
    {
      paramPigeonActionCodeSettings = i;
      if (paramPigeonActionCodeSettings != null) {
        p = paramPigeonActionCodeSettings;
      }
      new m1(paramAuthPigeonFirebaseApp, paramString, localc).a(paramAuthPigeonFirebaseApp, k, m).addOnCompleteListener(new d(paramVoidResult, 0));
      return;
    }
    throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
  }
  
  public void setLanguageCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String arg2, GeneratedAndroidFirebaseAuth.Result<String> paramResult)
  {
    try
    {
      paramAuthPigeonFirebaseApp = getAuthFromPigeon(paramAuthPigeonFirebaseApp);
      if (??? == null) {
        synchronized (h)
        {
          i = zzaee.zza();
        }
      }
      paramAuthPigeonFirebaseApp.getClass();
      m6.j.e(???);
      synchronized (h)
      {
        i = ???;
        synchronized (h)
        {
          paramAuthPigeonFirebaseApp = i;
          paramResult.success(paramAuthPigeonFirebaseApp);
        }
      }
      return;
    }
    catch (Exception paramAuthPigeonFirebaseApp)
    {
      paramResult.error(paramAuthPigeonFirebaseApp);
    }
  }
  
  public void setSettings(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonFirebaseAuthSettings paramPigeonFirebaseAuthSettings, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult)
  {
    try
    {
      paramAuthPigeonFirebaseApp = getAuthFromPigeon(paramAuthPigeonFirebaseApp);
      g.c = paramPigeonFirebaseAuthSettings.getAppVerificationDisabledForTesting().booleanValue();
      if (paramPigeonFirebaseAuthSettings.getForceRecaptchaFlow() != null) {
        g.d = paramPigeonFirebaseAuthSettings.getForceRecaptchaFlow().booleanValue();
      }
      if ((paramPigeonFirebaseAuthSettings.getPhoneNumber() != null) && (paramPigeonFirebaseAuthSettings.getSmsCode() != null))
      {
        paramAuthPigeonFirebaseApp = g;
        String str = paramPigeonFirebaseAuthSettings.getPhoneNumber();
        paramPigeonFirebaseAuthSettings = paramPigeonFirebaseAuthSettings.getSmsCode();
        a = str;
        b = paramPigeonFirebaseAuthSettings;
      }
      paramVoidResult.success();
    }
    catch (Exception paramAuthPigeonFirebaseApp)
    {
      paramVoidResult.error(paramAuthPigeonFirebaseApp);
    }
  }
  
  public void signInAnonymously(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult)
  {
    paramAuthPigeonFirebaseApp = getAuthFromPigeon(paramAuthPigeonFirebaseApp);
    b8.r localr = f;
    if ((localr != null) && (localr.H()))
    {
      paramAuthPigeonFirebaseApp = (c8.i)f;
      r = false;
      paramAuthPigeonFirebaseApp = Tasks.forResult(new k1(paramAuthPigeonFirebaseApp));
    }
    else
    {
      paramAuthPigeonFirebaseApp = e.zza(a, new FirebaseAuth.d(paramAuthPigeonFirebaseApp), k);
    }
    paramAuthPigeonFirebaseApp.addOnCompleteListener(new i(paramResult, 1));
  }
  
  public void signInWithCredential(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, Map<String, Object> paramMap, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult)
  {
    paramAuthPigeonFirebaseApp = getAuthFromPigeon(paramAuthPigeonFirebaseApp);
    paramMap = PigeonParser.getCredential(paramMap);
    if (paramMap != null)
    {
      paramAuthPigeonFirebaseApp.g(paramMap).addOnCompleteListener(new c(paramResult, 2));
      return;
    }
    throw FlutterFirebaseAuthPluginException.invalidCredential();
  }
  
  public void signInWithCustomToken(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult)
  {
    paramAuthPigeonFirebaseApp = getAuthFromPigeon(paramAuthPigeonFirebaseApp);
    paramAuthPigeonFirebaseApp.getClass();
    m6.j.e(paramString);
    e.zza(a, paramString, k, new FirebaseAuth.d(paramAuthPigeonFirebaseApp)).addOnCompleteListener(new c(paramResult, 3));
  }
  
  public void signInWithEmailAndPassword(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString1, String paramString2, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult)
  {
    paramAuthPigeonFirebaseApp = getAuthFromPigeon(paramAuthPigeonFirebaseApp);
    paramAuthPigeonFirebaseApp.getClass();
    m6.j.e(paramString1);
    m6.j.e(paramString2);
    paramAuthPigeonFirebaseApp.k(paramString1, paramString2, k, null, false).addOnCompleteListener(new c(paramResult, 1));
  }
  
  public void signInWithEmailLink(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString1, String paramString2, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult)
  {
    paramAuthPigeonFirebaseApp = getAuthFromPigeon(paramAuthPigeonFirebaseApp);
    paramAuthPigeonFirebaseApp.getClass();
    paramAuthPigeonFirebaseApp.g(a.c(paramString1, paramString2)).addOnCompleteListener(new e(paramResult, 1));
  }
  
  public void signInWithProvider(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonSignInProvider paramPigeonSignInProvider, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult)
  {
    paramAuthPigeonFirebaseApp = getAuthFromPigeon(paramAuthPigeonFirebaseApp);
    Object localObject1 = b0.v(paramPigeonSignInProvider.getProviderId(), paramAuthPigeonFirebaseApp);
    if (paramPigeonSignInProvider.getScopes() != null)
    {
      localObject2 = paramPigeonSignInProvider.getScopes();
      a.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList((Collection)localObject2));
    }
    if (paramPigeonSignInProvider.getCustomParameters() != null) {
      ((b0.a)localObject1).a(paramPigeonSignInProvider.getCustomParameters());
    }
    paramPigeonSignInProvider = getActivity();
    localObject1 = a;
    m6.j.i(paramPigeonSignInProvider);
    Object localObject2 = new TaskCompletionSource();
    w localw = t.b;
    int i;
    if (!a)
    {
      localw.b(paramPigeonSignInProvider, new c8.z(localw, paramPigeonSignInProvider, (TaskCompletionSource)localObject2, paramAuthPigeonFirebaseApp, null));
      i = 1;
      a = true;
    }
    else
    {
      i = 0;
    }
    if (i == 0)
    {
      paramAuthPigeonFirebaseApp = Tasks.forException(zzadr.zza(new Status(17057, null, null, null)));
    }
    else
    {
      f0.b(paramPigeonSignInProvider.getApplicationContext(), paramAuthPigeonFirebaseApp);
      paramAuthPigeonFirebaseApp = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
      paramAuthPigeonFirebaseApp.setClass(paramPigeonSignInProvider, GenericIdpActivity.class);
      paramAuthPigeonFirebaseApp.setPackage(paramPigeonSignInProvider.getPackageName());
      paramAuthPigeonFirebaseApp.putExtras((Bundle)localObject1);
      paramPigeonSignInProvider.startActivity(paramAuthPigeonFirebaseApp);
      paramAuthPigeonFirebaseApp = ((TaskCompletionSource)localObject2).getTask();
    }
    paramAuthPigeonFirebaseApp.addOnCompleteListener(new e(paramResult, 0));
  }
  
  public void signOut(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult)
  {
    try
    {
      FirebaseAuth localFirebaseAuth = getAuthFromPigeon(paramAuthPigeonFirebaseApp);
      if (f != null)
      {
        paramAuthPigeonFirebaseApp = (Map)FlutterFirebaseMultiFactor.multiFactorUserMap.get(paramAuthPigeonFirebaseApp.getAppName());
        if (paramAuthPigeonFirebaseApp != null) {
          paramAuthPigeonFirebaseApp.remove(f.a());
        }
      }
      localFirebaseAuth.s();
      paramAuthPigeonFirebaseApp = x;
      if (paramAuthPigeonFirebaseApp != null)
      {
        paramAuthPigeonFirebaseApp = b;
        e.removeCallbacks(f);
      }
      paramVoidResult.success();
    }
    catch (Exception paramAuthPigeonFirebaseApp)
    {
      paramVoidResult.error(paramAuthPigeonFirebaseApp);
    }
  }
  
  public void useEmulator(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, Long paramLong, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult)
  {
    try
    {
      paramAuthPigeonFirebaseApp = getAuthFromPigeon(paramAuthPigeonFirebaseApp);
      int i = paramLong.intValue();
      paramAuthPigeonFirebaseApp.getClass();
      m6.j.e(paramString);
      boolean bool;
      if ((i >= 0) && (i <= 65535)) {
        bool = true;
      } else {
        bool = false;
      }
      m6.j.a("Port number must be in the range 0-65535", bool);
      zzafm.zza(a, paramString, i);
      paramVoidResult.success();
    }
    catch (Exception paramAuthPigeonFirebaseApp)
    {
      paramVoidResult.error(paramAuthPigeonFirebaseApp);
    }
  }
  
  public void verifyPasswordResetCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.Result<String> paramResult)
  {
    paramAuthPigeonFirebaseApp = getAuthFromPigeon(paramAuthPigeonFirebaseApp);
    paramAuthPigeonFirebaseApp.getClass();
    m6.j.e(paramString);
    e.zzd(a, paramString, k).addOnCompleteListener(new i(paramResult, 0));
  }
  
  public void verifyPhoneNumber(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest paramPigeonVerifyPhoneNumberRequest, GeneratedAndroidFirebaseAuth.Result<String> paramResult)
  {
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("plugins.flutter.io/firebase_auth/phone/");
      ((StringBuilder)localObject1).append(UUID.randomUUID().toString());
      String str = ((StringBuilder)localObject1).toString();
      EventChannel localEventChannel = new io/flutter/plugin/common/EventChannel;
      localEventChannel.<init>(messenger, str);
      Object localObject2 = paramPigeonVerifyPhoneNumberRequest.getMultiFactorSessionId();
      Object localObject3 = null;
      localObject1 = null;
      if (localObject2 != null) {
        localObject2 = (b8.z)FlutterFirebaseMultiFactor.multiFactorSessionMap.get(paramPigeonVerifyPhoneNumberRequest.getMultiFactorSessionId());
      } else {
        localObject2 = null;
      }
      Object localObject4 = paramPigeonVerifyPhoneNumberRequest.getMultiFactorInfoId();
      if (localObject4 != null)
      {
        localObject5 = FlutterFirebaseMultiFactor.multiFactorResolverMap.keySet().iterator();
        for (;;)
        {
          localObject3 = localObject1;
          if (!((Iterator)localObject5).hasNext()) {
            break label222;
          }
          localObject3 = (String)((Iterator)localObject5).next();
          localObject3 = ((y)FlutterFirebaseMultiFactor.multiFactorResolverMap.get(localObject3)).E().iterator();
          if (((Iterator)localObject3).hasNext())
          {
            x localx = (x)((Iterator)localObject3).next();
            if ((!localx.a().equals(localObject4)) || (!(localx instanceof h0))) {
              break;
            }
            localObject1 = (h0)localx;
          }
        }
      }
      label222:
      localObject4 = new io/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;
      localObject1 = getActivity();
      Object localObject5 = new io/flutter/plugins/firebase/auth/b;
      ((b)localObject5).<init>();
      ((PhoneNumberVerificationStreamHandler)localObject4).<init>((Activity)localObject1, paramAuthPigeonFirebaseApp, paramPigeonVerifyPhoneNumberRequest, (b8.z)localObject2, (h0)localObject3, (PhoneNumberVerificationStreamHandler.OnCredentialsListener)localObject5);
      localEventChannel.setStreamHandler((EventChannel.StreamHandler)localObject4);
      streamHandlers.put(localEventChannel, localObject4);
      paramResult.success(str);
    }
    catch (Exception paramAuthPigeonFirebaseApp)
    {
      paramResult.error(paramAuthPigeonFirebaseApp);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */