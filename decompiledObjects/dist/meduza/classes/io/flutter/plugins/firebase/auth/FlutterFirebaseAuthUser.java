package io.flutter.plugins.firebase.auth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import b8.b0;
import b8.b0.a;
import b8.c0;
import b8.n1;
import b8.p0;
import b8.r;
import c8.f0;
import c8.u0;
import c8.w;
import c8.z;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase_auth_api.zzabq;
import com.google.android.gms.internal.firebase_auth_api.zzadr;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuth.c;
import com.google.firebase.auth.internal.GenericIdpActivity;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Executor;
import m6.j;
import r3.a0;
import r4.c;
import u7.f;
import v3.x0;

public class FlutterFirebaseAuthUser
  implements GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
{
  private Activity activity;
  
  public static r getCurrentUserFromPigeon(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp arg0)
  {
    FirebaseAuth localFirebaseAuth = FirebaseAuth.getInstance(f.f(???.getAppName()));
    if (???.getTenantId() != null)
    {
      String str = ???.getTenantId();
      localFirebaseAuth.getClass();
      j.e(str);
      synchronized (j)
      {
        k = str;
      }
    }
    return f;
  }
  
  private static void lambda$getIdToken$1(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result paramResult, Boolean paramBoolean)
  {
    paramAuthPigeonFirebaseApp = getCurrentUserFromPigeon(paramAuthPigeonFirebaseApp);
    if (paramAuthPigeonFirebaseApp == null)
    {
      paramResult.error(FlutterFirebaseAuthPluginException.noUser());
      return;
    }
    try
    {
      boolean bool = paramBoolean.booleanValue();
      paramResult.success(PigeonParser.parseTokenResult((b8.s)Tasks.await(FirebaseAuth.getInstance(paramAuthPigeonFirebaseApp.K()).j(paramAuthPigeonFirebaseApp, bool))));
    }
    catch (Exception paramAuthPigeonFirebaseApp)
    {
      paramResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(paramAuthPigeonFirebaseApp));
    }
  }
  
  public void delete(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult)
  {
    r localr = getCurrentUserFromPigeon(paramAuthPigeonFirebaseApp);
    if (localr == null)
    {
      paramVoidResult.error(FlutterFirebaseAuthPluginException.noUser());
      return;
    }
    paramAuthPigeonFirebaseApp = FirebaseAuth.getInstance(localr.K());
    paramAuthPigeonFirebaseApp.getClass();
    e.zza(localr, new n1(paramAuthPigeonFirebaseApp, localr)).addOnCompleteListener(new h(paramVoidResult, 2));
  }
  
  public void getIdToken(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, Boolean paramBoolean, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonIdTokenResult> paramResult)
  {
    FlutterFirebasePlugin.cachedThreadPool.execute(new x0(paramAuthPigeonFirebaseApp, paramResult, paramBoolean, 9));
  }
  
  public void linkWithCredential(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, Map<String, Object> paramMap, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult)
  {
    paramAuthPigeonFirebaseApp = getCurrentUserFromPigeon(paramAuthPigeonFirebaseApp);
    paramMap = PigeonParser.getCredential(paramMap);
    if (paramAuthPigeonFirebaseApp == null)
    {
      paramResult.error(FlutterFirebaseAuthPluginException.noUser());
      return;
    }
    if (paramMap == null)
    {
      paramResult.error(FlutterFirebaseAuthPluginException.invalidCredential());
      return;
    }
    FirebaseAuth.getInstance(paramAuthPigeonFirebaseApp.K()).i(paramAuthPigeonFirebaseApp, paramMap).addOnCompleteListener(new e(paramResult, 3));
  }
  
  public void linkWithProvider(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonSignInProvider paramPigeonSignInProvider, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult)
  {
    paramAuthPigeonFirebaseApp = getCurrentUserFromPigeon(paramAuthPigeonFirebaseApp);
    Object localObject1 = b0.v(paramPigeonSignInProvider.getProviderId(), FirebaseAuth.getInstance());
    if (paramPigeonSignInProvider.getScopes() != null)
    {
      localObject2 = paramPigeonSignInProvider.getScopes();
      a.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList((Collection)localObject2));
    }
    if (paramPigeonSignInProvider.getCustomParameters() != null) {
      ((b0.a)localObject1).a(paramPigeonSignInProvider.getCustomParameters());
    }
    paramPigeonSignInProvider = activity;
    localObject1 = a;
    paramAuthPigeonFirebaseApp.getClass();
    j.i(paramPigeonSignInProvider);
    FirebaseAuth localFirebaseAuth = FirebaseAuth.getInstance(paramAuthPigeonFirebaseApp.K());
    localFirebaseAuth.getClass();
    Object localObject2 = new TaskCompletionSource();
    w localw = t.b;
    int i;
    if (!a)
    {
      localw.b(paramPigeonSignInProvider, new z(localw, paramPigeonSignInProvider, (TaskCompletionSource)localObject2, localFirebaseAuth, paramAuthPigeonFirebaseApp));
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
      f0.c(paramPigeonSignInProvider.getApplicationContext(), localFirebaseAuth, paramAuthPigeonFirebaseApp);
      paramAuthPigeonFirebaseApp = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
      paramAuthPigeonFirebaseApp.setClass(paramPigeonSignInProvider, GenericIdpActivity.class);
      paramAuthPigeonFirebaseApp.setPackage(paramPigeonSignInProvider.getPackageName());
      paramAuthPigeonFirebaseApp.putExtras((Bundle)localObject1);
      paramPigeonSignInProvider.startActivity(paramAuthPigeonFirebaseApp);
      paramAuthPigeonFirebaseApp = ((TaskCompletionSource)localObject2).getTask();
    }
    paramAuthPigeonFirebaseApp.addOnCompleteListener(new i(paramResult, 3));
  }
  
  public void reauthenticateWithCredential(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, Map<String, Object> paramMap, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult)
  {
    paramAuthPigeonFirebaseApp = getCurrentUserFromPigeon(paramAuthPigeonFirebaseApp);
    paramMap = PigeonParser.getCredential(paramMap);
    if (paramAuthPigeonFirebaseApp == null)
    {
      paramResult.error(FlutterFirebaseAuthPluginException.noUser());
      return;
    }
    if (paramMap == null)
    {
      paramResult.error(FlutterFirebaseAuthPluginException.invalidCredential());
      return;
    }
    FirebaseAuth.getInstance(paramAuthPigeonFirebaseApp.K()).r(paramAuthPigeonFirebaseApp, paramMap).addOnCompleteListener(new i(paramResult, 2));
  }
  
  public void reauthenticateWithProvider(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonSignInProvider paramPigeonSignInProvider, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult)
  {
    paramAuthPigeonFirebaseApp = getCurrentUserFromPigeon(paramAuthPigeonFirebaseApp);
    Object localObject1 = b0.v(paramPigeonSignInProvider.getProviderId(), FirebaseAuth.getInstance());
    if (paramPigeonSignInProvider.getScopes() != null)
    {
      localObject2 = paramPigeonSignInProvider.getScopes();
      a.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList((Collection)localObject2));
    }
    if (paramPigeonSignInProvider.getCustomParameters() != null) {
      ((b0.a)localObject1).a(paramPigeonSignInProvider.getCustomParameters());
    }
    paramPigeonSignInProvider = activity;
    localObject1 = a;
    paramAuthPigeonFirebaseApp.getClass();
    j.i(paramPigeonSignInProvider);
    FirebaseAuth localFirebaseAuth = FirebaseAuth.getInstance(paramAuthPigeonFirebaseApp.K());
    localFirebaseAuth.getClass();
    Object localObject2 = new TaskCompletionSource();
    w localw = t.b;
    int i;
    if (!a)
    {
      localw.b(paramPigeonSignInProvider, new z(localw, paramPigeonSignInProvider, (TaskCompletionSource)localObject2, localFirebaseAuth, paramAuthPigeonFirebaseApp));
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
      f0.c(paramPigeonSignInProvider.getApplicationContext(), localFirebaseAuth, paramAuthPigeonFirebaseApp);
      paramAuthPigeonFirebaseApp = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
      paramAuthPigeonFirebaseApp.setClass(paramPigeonSignInProvider, GenericIdpActivity.class);
      paramAuthPigeonFirebaseApp.setPackage(paramPigeonSignInProvider.getPackageName());
      paramAuthPigeonFirebaseApp.putExtras((Bundle)localObject1);
      paramPigeonSignInProvider.startActivity(paramAuthPigeonFirebaseApp);
      paramAuthPigeonFirebaseApp = ((TaskCompletionSource)localObject2).getTask();
    }
    paramAuthPigeonFirebaseApp.addOnCompleteListener(new e(paramResult, 2));
  }
  
  public void reload(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> paramResult)
  {
    paramAuthPigeonFirebaseApp = getCurrentUserFromPigeon(paramAuthPigeonFirebaseApp);
    if (paramAuthPigeonFirebaseApp == null)
    {
      paramResult.error(FlutterFirebaseAuthPluginException.noUser());
      return;
    }
    paramAuthPigeonFirebaseApp.I().addOnCompleteListener(new k(paramResult, paramAuthPigeonFirebaseApp));
  }
  
  public void sendEmailVerification(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings paramPigeonActionCodeSettings, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult)
  {
    paramAuthPigeonFirebaseApp = getCurrentUserFromPigeon(paramAuthPigeonFirebaseApp);
    if (paramAuthPigeonFirebaseApp == null)
    {
      paramVoidResult.error(FlutterFirebaseAuthPluginException.noUser());
      return;
    }
    if (paramPigeonActionCodeSettings == null)
    {
      FirebaseAuth.getInstance(paramAuthPigeonFirebaseApp.K()).j(paramAuthPigeonFirebaseApp, false).continueWithTask(new g.s(paramAuthPigeonFirebaseApp, 7)).addOnCompleteListener(new g(paramVoidResult, 2));
      return;
    }
    paramPigeonActionCodeSettings = PigeonParser.getActionCodeSettings(paramPigeonActionCodeSettings);
    FirebaseAuth.getInstance(paramAuthPigeonFirebaseApp.K()).j(paramAuthPigeonFirebaseApp, false).continueWithTask(new c(paramAuthPigeonFirebaseApp, paramPigeonActionCodeSettings, 3)).addOnCompleteListener(new h(paramVoidResult, 1));
  }
  
  public void setActivity(Activity paramActivity)
  {
    activity = paramActivity;
  }
  
  public void unlink(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> paramResult)
  {
    paramAuthPigeonFirebaseApp = getCurrentUserFromPigeon(paramAuthPigeonFirebaseApp);
    if (paramAuthPigeonFirebaseApp == null)
    {
      paramResult.error(FlutterFirebaseAuthPluginException.noUser());
      return;
    }
    j.e(paramString);
    FirebaseAuth localFirebaseAuth = FirebaseAuth.getInstance(paramAuthPigeonFirebaseApp.K());
    localFirebaseAuth.getClass();
    j.e(paramString);
    e.zzb(a, paramAuthPigeonFirebaseApp, paramString, new FirebaseAuth.c(localFirebaseAuth)).addOnCompleteListener(new i(paramResult, 4));
  }
  
  public void updateEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> paramResult)
  {
    paramAuthPigeonFirebaseApp = getCurrentUserFromPigeon(paramAuthPigeonFirebaseApp);
    if (paramAuthPigeonFirebaseApp == null)
    {
      paramResult.error(FlutterFirebaseAuthPluginException.noUser());
      return;
    }
    j.e(paramString);
    FirebaseAuth localFirebaseAuth = FirebaseAuth.getInstance(paramAuthPigeonFirebaseApp.K());
    localFirebaseAuth.getClass();
    j.e(paramString);
    e.zzc(a, paramAuthPigeonFirebaseApp, paramString, new FirebaseAuth.c(localFirebaseAuth)).addOnCompleteListener(new k(paramAuthPigeonFirebaseApp, paramResult));
  }
  
  public void updatePassword(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> paramResult)
  {
    paramAuthPigeonFirebaseApp = getCurrentUserFromPigeon(paramAuthPigeonFirebaseApp);
    if (paramAuthPigeonFirebaseApp == null)
    {
      paramResult.error(FlutterFirebaseAuthPluginException.noUser());
      return;
    }
    j.e(paramString);
    FirebaseAuth localFirebaseAuth = FirebaseAuth.getInstance(paramAuthPigeonFirebaseApp.K());
    localFirebaseAuth.getClass();
    j.e(paramString);
    e.zzd(a, paramAuthPigeonFirebaseApp, paramString, new FirebaseAuth.c(localFirebaseAuth)).addOnCompleteListener(new n(0, paramAuthPigeonFirebaseApp, paramResult));
  }
  
  public void updatePhoneNumber(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, Map<String, Object> paramMap, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> paramResult)
  {
    paramAuthPigeonFirebaseApp = getCurrentUserFromPigeon(paramAuthPigeonFirebaseApp);
    if (paramAuthPigeonFirebaseApp == null)
    {
      paramResult.error(FlutterFirebaseAuthPluginException.noUser());
      return;
    }
    paramMap = (c0)PigeonParser.getCredential(paramMap);
    if (paramMap == null)
    {
      paramResult.error(FlutterFirebaseAuthPluginException.invalidCredential());
      return;
    }
    FirebaseAuth localFirebaseAuth = FirebaseAuth.getInstance(paramAuthPigeonFirebaseApp.K());
    localFirebaseAuth.getClass();
    e.zza(a, paramAuthPigeonFirebaseApp, (c0)paramMap.F(), new FirebaseAuth.c(localFirebaseAuth)).addOnCompleteListener(new l(2, paramAuthPigeonFirebaseApp, paramResult));
  }
  
  public void updateProfile(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonUserProfile paramPigeonUserProfile, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> paramResult)
  {
    r localr = getCurrentUserFromPigeon(paramAuthPigeonFirebaseApp);
    if (localr == null)
    {
      paramResult.error(FlutterFirebaseAuthPluginException.noUser());
      return;
    }
    boolean bool1 = paramPigeonUserProfile.getDisplayNameChanged().booleanValue();
    boolean bool2 = false;
    boolean bool3 = false;
    Object localObject = null;
    if (bool1)
    {
      paramAuthPigeonFirebaseApp = paramPigeonUserProfile.getDisplayName();
      if (paramAuthPigeonFirebaseApp == null)
      {
        bool1 = true;
      }
      else
      {
        bool4 = false;
        break label74;
      }
    }
    else
    {
      bool1 = false;
    }
    paramAuthPigeonFirebaseApp = null;
    boolean bool4 = bool1;
    label74:
    bool1 = bool3;
    if (paramPigeonUserProfile.getPhotoUrlChanged().booleanValue())
    {
      if (paramPigeonUserProfile.getPhotoUrl() != null)
      {
        Uri localUri = Uri.parse(paramPigeonUserProfile.getPhotoUrl());
        bool1 = bool2;
        paramPigeonUserProfile = localUri;
        if (localUri != null) {}
      }
      else
      {
        bool1 = true;
      }
    }
    else {
      paramPigeonUserProfile = null;
    }
    if (paramPigeonUserProfile == null) {
      paramPigeonUserProfile = (GeneratedAndroidFirebaseAuth.PigeonUserProfile)localObject;
    } else {
      paramPigeonUserProfile = paramPigeonUserProfile.toString();
    }
    paramAuthPigeonFirebaseApp = new p0(paramAuthPigeonFirebaseApp, paramPigeonUserProfile, bool4, bool1);
    paramPigeonUserProfile = FirebaseAuth.getInstance(localr.K());
    paramPigeonUserProfile.getClass();
    e.zza(a, localr, paramAuthPigeonFirebaseApp, new FirebaseAuth.c(paramPigeonUserProfile)).addOnCompleteListener(new l(1, localr, paramResult));
  }
  
  public void verifyBeforeUpdateEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp paramAuthPigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings paramPigeonActionCodeSettings, GeneratedAndroidFirebaseAuth.VoidResult paramVoidResult)
  {
    paramAuthPigeonFirebaseApp = getCurrentUserFromPigeon(paramAuthPigeonFirebaseApp);
    if (paramAuthPigeonFirebaseApp == null)
    {
      paramVoidResult.error(FlutterFirebaseAuthPluginException.noUser());
      return;
    }
    if (paramPigeonActionCodeSettings == null)
    {
      FirebaseAuth.getInstance(paramAuthPigeonFirebaseApp.K()).j(paramAuthPigeonFirebaseApp, false).continueWithTask(new a0(paramAuthPigeonFirebaseApp, paramString, null)).addOnCompleteListener(new h(paramVoidResult, 3));
      return;
    }
    paramPigeonActionCodeSettings = PigeonParser.getActionCodeSettings(paramPigeonActionCodeSettings);
    FirebaseAuth.getInstance(paramAuthPigeonFirebaseApp.K()).j(paramAuthPigeonFirebaseApp, false).continueWithTask(new a0(paramAuthPigeonFirebaseApp, paramString, paramPigeonActionCodeSettings)).addOnCompleteListener(new o(paramVoidResult, 0));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.FlutterFirebaseAuthUser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */