package io.flutter.plugins.googlesignin;

import aa.m0;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import b.a0;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.auth.zzdc;
import com.google.android.gms.internal.auth.zzg;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.internal.auth.zzhw;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import f;
import h6.n;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.ActivityResultListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import k6.p;
import l6.k;
import m6.w;
import q0.g;
import z5.l;

public class GoogleSignInPlugin
  implements FlutterPlugin, ActivityAware
{
  private ActivityPluginBinding activityPluginBinding;
  private Delegate delegate;
  private BinaryMessenger messenger;
  
  private void attachToActivity(ActivityPluginBinding paramActivityPluginBinding)
  {
    activityPluginBinding = paramActivityPluginBinding;
    paramActivityPluginBinding.addActivityResultListener(delegate);
    delegate.setActivity(paramActivityPluginBinding.getActivity());
  }
  
  private void dispose()
  {
    delegate = null;
    BinaryMessenger localBinaryMessenger = messenger;
    if (localBinaryMessenger != null)
    {
      Messages.GoogleSignInApi._CC.k(localBinaryMessenger, null);
      messenger = null;
    }
  }
  
  private void disposeActivity()
  {
    activityPluginBinding.removeActivityResultListener(delegate);
    delegate.setActivity(null);
    activityPluginBinding = null;
  }
  
  public void initInstance(BinaryMessenger paramBinaryMessenger, Context paramContext, GoogleSignInWrapper paramGoogleSignInWrapper)
  {
    messenger = paramBinaryMessenger;
    paramContext = new Delegate(paramContext, paramGoogleSignInWrapper);
    delegate = paramContext;
    Messages.GoogleSignInApi._CC.k(paramBinaryMessenger, paramContext);
  }
  
  public void onAttachedToActivity(ActivityPluginBinding paramActivityPluginBinding)
  {
    attachToActivity(paramActivityPluginBinding);
  }
  
  public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    initInstance(paramFlutterPluginBinding.getBinaryMessenger(), paramFlutterPluginBinding.getApplicationContext(), new GoogleSignInWrapper());
  }
  
  public void onDetachedFromActivity()
  {
    disposeActivity();
  }
  
  public void onDetachedFromActivityForConfigChanges()
  {
    disposeActivity();
  }
  
  public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    dispose();
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    String str1 = method;
    str1.getClass();
    int i = str1.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 2088248401: 
      if (str1.equals("signOut")) {
        j = 8;
      }
      break;
    case 1387660302: 
      if (str1.equals("requestScopes")) {
        j = 7;
      }
      break;
    case 827828368: 
      if (str1.equals("getTokens")) {
        j = 6;
      }
      break;
    case 530405532: 
      if (str1.equals("disconnect")) {
        j = 5;
      }
      break;
    case 24140525: 
      if (str1.equals("clearAuthCache")) {
        j = 4;
      }
      break;
    case 3237136: 
      if (str1.equals("init")) {
        j = 3;
      }
      break;
    case -481441621: 
      if (str1.equals("isSignedIn")) {
        j = 2;
      }
      break;
    case -638267772: 
      if (str1.equals("signInSilently")) {
        j = 1;
      }
      break;
    case -902468670: 
      if (str1.equals("signIn")) {
        j = 0;
      }
      break;
    }
    boolean bool;
    switch (j)
    {
    default: 
      paramResult.notImplemented();
      break;
    case 8: 
      delegate.signOut(paramResult);
      break;
    case 7: 
      paramMethodCall = (List)paramMethodCall.argument("scopes");
      Objects.requireNonNull(paramMethodCall);
      paramMethodCall = (List)paramMethodCall;
      delegate.requestScopes(paramResult, paramMethodCall);
      break;
    case 6: 
      str1 = (String)paramMethodCall.argument("email");
      Objects.requireNonNull(str1);
      paramMethodCall = (Boolean)paramMethodCall.argument("shouldRecoverAuth");
      Objects.requireNonNull(paramMethodCall);
      bool = paramMethodCall.booleanValue();
      delegate.getTokens(paramResult, str1, bool);
      break;
    case 5: 
      delegate.disconnect(paramResult);
      break;
    case 4: 
      paramMethodCall = (String)paramMethodCall.argument("token");
      Objects.requireNonNull(paramMethodCall);
      delegate.clearAuthCache(paramResult, paramMethodCall);
      break;
    case 3: 
      str1 = (String)paramMethodCall.argument("signInOption");
      Objects.requireNonNull(str1);
      Object localObject = (List)paramMethodCall.argument("scopes");
      Objects.requireNonNull(localObject);
      List localList = (List)localObject;
      String str2 = (String)paramMethodCall.argument("hostedDomain");
      String str3 = (String)paramMethodCall.argument("clientId");
      localObject = (String)paramMethodCall.argument("serverClientId");
      paramMethodCall = (Boolean)paramMethodCall.argument("forceCodeForRefreshToken");
      Objects.requireNonNull(paramMethodCall);
      bool = paramMethodCall.booleanValue();
      delegate.init(paramResult, str1, localList, str2, str3, (String)localObject, bool);
      break;
    case 2: 
      delegate.isSignedIn(paramResult);
      break;
    case 1: 
      delegate.signInSilently(paramResult);
      break;
    case 0: 
      delegate.signIn(paramResult);
    }
  }
  
  public void onReattachedToActivityForConfigChanges(ActivityPluginBinding paramActivityPluginBinding)
  {
    attachToActivity(paramActivityPluginBinding);
  }
  
  public static class Delegate
    implements GoogleSignInPlugin.IDelegate, PluginRegistry.ActivityResultListener, Messages.GoogleSignInApi
  {
    private static final String DEFAULT_GAMES_SIGN_IN = "SignInOption.games";
    private static final String DEFAULT_SIGN_IN = "SignInOption.standard";
    private static final String ERROR_FAILURE_TO_RECOVER_AUTH = "failed_to_recover_auth";
    private static final String ERROR_REASON_EXCEPTION = "exception";
    private static final String ERROR_REASON_NETWORK_ERROR = "network_error";
    private static final String ERROR_REASON_SIGN_IN_CANCELED = "sign_in_canceled";
    private static final String ERROR_REASON_SIGN_IN_FAILED = "sign_in_failed";
    private static final String ERROR_REASON_SIGN_IN_REQUIRED = "sign_in_required";
    private static final String ERROR_REASON_STATUS = "status";
    private static final String ERROR_USER_RECOVERABLE_AUTH = "user_recoverable_auth";
    private static final int REQUEST_CODE_RECOVER_AUTH = 53294;
    public static final int REQUEST_CODE_REQUEST_SCOPE = 53295;
    private static final int REQUEST_CODE_SIGNIN = 53293;
    private Activity activity;
    private final BackgroundTaskRunner backgroundTaskRunner = new BackgroundTaskRunner(1);
    private final Context context;
    private final GoogleSignInWrapper googleSignInWrapper;
    private PendingOperation pendingOperation;
    private List<String> requestedScopes;
    private g6.a signInClient;
    
    public Delegate(Context paramContext, GoogleSignInWrapper paramGoogleSignInWrapper)
    {
      context = paramContext;
      googleSignInWrapper = paramGoogleSignInWrapper;
    }
    
    private void checkAndSetPendingAccessTokenOperation(String paramString, Messages.Result<String> paramResult, Object paramObject)
    {
      checkAndSetPendingStringOperation(paramString, paramResult, paramObject);
    }
    
    private void checkAndSetPendingBoolOperation(String paramString, Messages.Result<Boolean> paramResult)
    {
      checkAndSetPendingOperation(paramString, null, null, paramResult, null, null);
    }
    
    private void checkAndSetPendingOperation(String paramString, Messages.Result<Messages.UserData> paramResult, Messages.Result<Void> paramResult1, Messages.Result<Boolean> paramResult2, Messages.Result<String> paramResult3, Object paramObject)
    {
      if (pendingOperation == null)
      {
        pendingOperation = new PendingOperation(paramString, paramResult, paramResult1, paramResult2, paramResult3, paramObject);
        return;
      }
      paramResult = f.l("Concurrent operations detected: ");
      paramResult.append(pendingOperation.method);
      paramResult.append(", ");
      paramResult.append(paramString);
      throw new IllegalStateException(paramResult.toString());
    }
    
    private void checkAndSetPendingSignInOperation(String paramString, Messages.Result<Messages.UserData> paramResult)
    {
      checkAndSetPendingOperation(paramString, paramResult, null, null, null, null);
    }
    
    private void checkAndSetPendingStringOperation(String paramString, Messages.Result<String> paramResult, Object paramObject)
    {
      checkAndSetPendingOperation(paramString, null, null, null, paramResult, paramObject);
    }
    
    private void checkAndSetPendingVoidOperation(String paramString, Messages.Result<Void> paramResult)
    {
      checkAndSetPendingOperation(paramString, null, paramResult, null, null, null);
    }
    
    private String errorCodeForStatus(int paramInt)
    {
      if (paramInt != 4)
      {
        if (paramInt != 7)
        {
          if (paramInt != 12501) {
            return "sign_in_failed";
          }
          return "sign_in_canceled";
        }
        return "network_error";
      }
      return "sign_in_required";
    }
    
    private void finishWithBoolean(Boolean paramBoolean)
    {
      Messages.Result localResult = pendingOperation.boolResult;
      Objects.requireNonNull(localResult);
      ((Messages.Result)localResult).success(paramBoolean);
      pendingOperation = null;
    }
    
    private void finishWithError(String paramString1, String paramString2)
    {
      PendingOperation localPendingOperation = pendingOperation;
      Messages.Result localResult = userDataResult;
      if (localResult == null)
      {
        localResult = boolResult;
        if (localResult == null)
        {
          localResult = stringResult;
          if (localResult == null) {
            localResult = voidResult;
          }
        }
      }
      Objects.requireNonNull(localResult);
      ((Messages.Result)localResult).error(new Messages.FlutterError(paramString1, paramString2, null));
      pendingOperation = null;
    }
    
    private void finishWithSuccess()
    {
      Messages.Result localResult = pendingOperation.voidResult;
      Objects.requireNonNull(localResult);
      ((Messages.Result)localResult).success(null);
      pendingOperation = null;
    }
    
    private void finishWithUserData(Messages.UserData paramUserData)
    {
      Messages.Result localResult = pendingOperation.userDataResult;
      Objects.requireNonNull(localResult);
      ((Messages.Result)localResult).success(paramUserData);
      pendingOperation = null;
    }
    
    private Void lambda$clearAuthCache$2(String paramString)
    {
      Context localContext = context;
      int i = z5.d.d;
      m6.j.h("Calling this from your main thread can lead to deadlock");
      l.d(localContext);
      Bundle localBundle = new Bundle();
      l.e(localContext, localBundle);
      zzdc.zzd(localContext);
      if ((zzhw.zze()) && (l.g(localContext)))
      {
        zzg localzzg = zzh.zza(localContext);
        Object localObject = new zzbw();
        ((zzbw)localObject).zza(paramString);
        localObject = localzzg.zza((zzbw)localObject);
        try
        {
          l.c((Task)localObject, "clear token");
        }
        catch (k6.b localb)
        {
          l.c.f("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", new Object[] { "clear token", Log.getStackTraceString(localb) });
        }
      }
      else
      {
        paramString = new r4.c(1, paramString, localBundle);
        l.b(localContext, l.b, paramString);
      }
      return null;
    }
    
    private String lambda$getAccessToken$4(String paramString)
    {
      Account localAccount = new Account(paramString, "com.google");
      Object localObject1 = f.l("oauth2:");
      Object localObject2 = String.valueOf(' ');
      localObject2.getClass();
      Iterator localIterator = requestedScopes.iterator();
      Object localObject3 = new StringBuilder();
      try
      {
        if (localIterator.hasNext()) {
          for (;;)
          {
            paramString = localIterator.next();
            Objects.requireNonNull(paramString);
            if ((paramString instanceof CharSequence)) {
              paramString = (CharSequence)paramString;
            } else {
              paramString = paramString.toString();
            }
            ((StringBuilder)localObject3).append(paramString);
            if (!localIterator.hasNext()) {
              break;
            }
            ((StringBuilder)localObject3).append((CharSequence)localObject2);
          }
        }
        ((StringBuilder)localObject1).append(((StringBuilder)localObject3).toString());
        localObject3 = ((StringBuilder)localObject1).toString();
        localObject2 = context;
        int i = z5.d.d;
        paramString = new Bundle();
        l.f(localAccount);
        m6.j.h("Calling this from your main thread can lead to deadlock");
        m6.j.f("Scope cannot be empty or null.", (String)localObject3);
        l.f(localAccount);
        l.d((Context)localObject2);
        localObject1 = new Bundle(paramString);
        l.e((Context)localObject2, (Bundle)localObject1);
        zzdc.zzd((Context)localObject2);
        if ((zzhw.zze()) && (l.g((Context)localObject2)))
        {
          paramString = zzh.zza((Context)localObject2).zzc(localAccount, (String)localObject3, (Bundle)localObject1);
          try
          {
            paramString = (Bundle)l.c(paramString, "token retrieval");
            if (paramString != null)
            {
              paramString = l.a((Context)localObject2, paramString);
              break label338;
            }
            l.c.f("Service call returned null.", new Object[0]);
            paramString = new java/io/IOException;
            paramString.<init>("Service unavailable.");
            throw paramString;
          }
          catch (k6.b paramString)
          {
            l.c.f("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", new Object[] { "token retrieval", Log.getStackTraceString(paramString) });
          }
        }
        paramString = new z5.j(localAccount, localObject1, localObject2, (String)localObject3);
        paramString = (TokenData)l.b((Context)localObject2, l.b, paramString);
        label338:
        return b;
      }
      catch (IOException paramString)
      {
        throw new AssertionError(paramString);
      }
    }
    
    private void lambda$getAccessToken$5(Messages.Result paramResult, Boolean paramBoolean, String paramString, Future paramFuture)
    {
      Object localObject = null;
      try
      {
        paramResult.success((String)paramFuture.get());
      }
      catch (InterruptedException paramBoolean)
      {
        paramResult.error(new Messages.FlutterError("exception", paramBoolean.getMessage(), null));
        Thread.currentThread().interrupt();
      }
      catch (ExecutionException paramFuture)
      {
        if ((paramFuture.getCause() instanceof UserRecoverableAuthException))
        {
          if ((paramBoolean.booleanValue()) && (pendingOperation == null))
          {
            paramBoolean = getActivity();
            if (paramBoolean == null)
            {
              paramBoolean = f.l("Cannot recover auth because app is not in foreground. ");
              paramBoolean.append(paramFuture.getLocalizedMessage());
              paramResult.error(new Messages.FlutterError("user_recoverable_auth", paramBoolean.toString(), null));
            }
            else
            {
              checkAndSetPendingAccessTokenOperation("getTokens", paramResult, paramString);
              paramResult = (UserRecoverableAuthException)paramFuture.getCause();
              paramString = a;
              if (paramString == null)
              {
                int i = g.c(b);
                if (i != 0)
                {
                  if (i != 1)
                  {
                    if (i != 2)
                    {
                      paramResult = (Messages.Result)localObject;
                      break label237;
                    }
                    paramResult = "this instantiation of UserRecoverableAuthException doesn't support an Intent.";
                  }
                  else
                  {
                    paramResult = "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.";
                  }
                  Log.e("Auth", paramResult);
                  paramResult = (Messages.Result)localObject;
                }
                else
                {
                  Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
                  paramResult = (Messages.Result)localObject;
                }
              }
              else
              {
                paramResult = new Intent(paramString);
              }
              label237:
              paramBoolean.startActivityForResult(paramResult, 53294);
            }
          }
          else
          {
            paramResult.error(new Messages.FlutterError("user_recoverable_auth", paramFuture.getLocalizedMessage(), null));
          }
        }
        else
        {
          paramBoolean = paramFuture.getCause();
          if (paramBoolean == null) {
            paramBoolean = null;
          } else {
            paramBoolean = paramBoolean.getMessage();
          }
          paramResult.error(new Messages.FlutterError("exception", paramBoolean, null));
        }
      }
    }
    
    private void onSignInAccount(GoogleSignInAccount paramGoogleSignInAccount)
    {
      Messages.UserData.Builder localBuilder = new Messages.UserData.Builder().setEmail(d).setId(b).setIdToken(c).setServerAuthCode(o).setDisplayName(e);
      paramGoogleSignInAccount = f;
      if (paramGoogleSignInAccount != null) {
        localBuilder.setPhotoUrl(paramGoogleSignInAccount.toString());
      }
      finishWithUserData(localBuilder.build());
    }
    
    private void onSignInResult(Task<GoogleSignInAccount> paramTask)
    {
      String str;
      try
      {
        onSignInAccount((GoogleSignInAccount)paramTask.getResult(k6.b.class));
      }
      catch (RuntimeExecutionException paramTask)
      {
        paramTask = paramTask.toString();
        str = "exception";
      }
      catch (k6.b paramTask)
      {
        str = errorCodeForStatus(paramTask.getStatusCode());
        paramTask = paramTask.toString();
      }
      finishWithError(str, paramTask);
    }
    
    public void clearAuthCache(MethodChannel.Result paramResult, String paramString)
    {
      clearAuthCache(paramString, new GoogleSignInPlugin.VoidMethodChannelResult(paramResult));
    }
    
    public void clearAuthCache(String paramString, Messages.Result<Void> paramResult)
    {
      paramString = new b(this, paramString);
      backgroundTaskRunner.runInBackground(paramString, new e(paramResult, 16));
    }
    
    public void disconnect(MethodChannel.Result paramResult)
    {
      signOut(new GoogleSignInPlugin.VoidMethodChannelResult(paramResult));
    }
    
    public void disconnect(Messages.Result<Void> paramResult)
    {
      checkAndSetPendingVoidOperation("disconnect", paramResult);
      signInClient.b().addOnCompleteListener(new io.flutter.plugins.firebase.auth.o(this, 1));
    }
    
    public void getAccessToken(String paramString, Boolean paramBoolean, Messages.Result<String> paramResult)
    {
      c localc = new c(this, paramString);
      backgroundTaskRunner.runInBackground(localc, new o9.c(this, paramResult, paramBoolean, paramString));
    }
    
    public Activity getActivity()
    {
      return activity;
    }
    
    public void getTokens(MethodChannel.Result paramResult, String paramString, boolean paramBoolean)
    {
      getAccessToken(paramString, Boolean.valueOf(paramBoolean), new GoogleSignInPlugin.ErrorConvertingMethodChannelResult(paramResult)
      {
        public void success(String paramAnonymousString)
        {
          HashMap localHashMap = new HashMap();
          localHashMap.put("accessToken", paramAnonymousString);
          result.success(localHashMap);
        }
      });
    }
    
    public void init(MethodChannel.Result paramResult, String paramString1, List<String> paramList, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
    {
      int i = -1;
      try
      {
        int j = paramString1.hashCode();
        if (j != 849126666)
        {
          if ((j == 2056100820) && (paramString1.equals("SignInOption.standard"))) {
            i = 1;
          }
        }
        else if (paramString1.equals("SignInOption.games")) {
          i = 0;
        }
        if (i != 0)
        {
          if (i == 1)
          {
            paramString1 = Messages.SignInType.STANDARD;
          }
          else
          {
            paramString1 = new java/lang/IllegalStateException;
            paramString1.<init>("Unknown signInOption");
            throw paramString1;
          }
        }
        else {
          paramString1 = Messages.SignInType.GAMES;
        }
        Messages.InitParams.Builder localBuilder = new io/flutter/plugins/googlesignin/Messages$InitParams$Builder;
        localBuilder.<init>();
        init(localBuilder.setSignInType(paramString1).setScopes(paramList).setHostedDomain(paramString2).setClientId(paramString3).setServerClientId(paramString4).setForceCodeForRefreshToken(Boolean.valueOf(paramBoolean)).build());
        paramResult.success(null);
      }
      catch (Messages.FlutterError paramString1)
      {
        paramResult.error(code, paramString1.getMessage(), details);
      }
    }
    
    public void init(Messages.InitParams paramInitParams)
    {
      try
      {
        int i = GoogleSignInPlugin.1.$SwitchMap$io$flutter$plugins$googlesignin$Messages$SignInType[paramInitParams.getSignInType().ordinal()];
        GoogleSignInOptions.a locala;
        if (i != 1)
        {
          if (i == 2)
          {
            locala = new com/google/android/gms/auth/api/signin/GoogleSignInOptions$a;
            locala.<init>(GoogleSignInOptions.t);
            a.add(GoogleSignInOptions.v);
          }
          else
          {
            paramInitParams = new java/lang/IllegalStateException;
            paramInitParams.<init>("Unknown signInOption");
            throw paramInitParams;
          }
        }
        else {
          locala = new GoogleSignInOptions.a(GoogleSignInOptions.u);
        }
        Object localObject1 = paramInitParams.getServerClientId();
        Object localObject2 = localObject1;
        if (!n7.i.a(paramInitParams.getClientId()))
        {
          localObject2 = localObject1;
          if (n7.i.a((String)localObject1))
          {
            Log.w("google_sign_in", "clientId is not supported on Android and is interpreted as serverClientId. Use serverClientId instead to suppress this warning.");
            localObject2 = paramInitParams.getClientId();
          }
        }
        localObject1 = localObject2;
        if (n7.i.a((String)localObject2))
        {
          i = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName());
          localObject1 = localObject2;
          if (i != 0) {
            localObject1 = context.getString(i);
          }
        }
        if (!n7.i.a((String)localObject1))
        {
          d = true;
          m6.j.e((String)localObject1);
          localObject2 = e;
          boolean bool1;
          if ((localObject2 != null) && (!((String)localObject2).equals(localObject1))) {
            bool1 = false;
          } else {
            bool1 = true;
          }
          m6.j.a("two different server client ids provided", bool1);
          e = ((String)localObject1);
          boolean bool2 = paramInitParams.getForceCodeForRefreshToken().booleanValue();
          b = true;
          m6.j.e((String)localObject1);
          localObject2 = e;
          if ((localObject2 != null) && (!((String)localObject2).equals(localObject1))) {
            bool1 = false;
          } else {
            bool1 = true;
          }
          m6.j.a("two different server client ids provided", bool1);
          e = ((String)localObject1);
          c = bool2;
        }
        localObject2 = paramInitParams.getScopes();
        requestedScopes = ((List)localObject2);
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          String str = (String)((Iterator)localObject2).next();
          localObject1 = new com/google/android/gms/common/api/Scope;
          ((Scope)localObject1).<init>(1, str);
          locala.b((Scope)localObject1, new Scope[0]);
        }
        if (!n7.i.a(paramInitParams.getHostedDomain()))
        {
          paramInitParams = paramInitParams.getHostedDomain();
          m6.j.e(paramInitParams);
          g = paramInitParams;
        }
        signInClient = googleSignInWrapper.getClient(context, locala.a());
        return;
      }
      catch (Exception paramInitParams)
      {
        throw new Messages.FlutterError("exception", paramInitParams.getMessage(), null);
      }
    }
    
    public Boolean isSignedIn()
    {
      synchronized (h6.o.a(context))
      {
        GoogleSignInAccount localGoogleSignInAccount = b;
        boolean bool;
        if (localGoogleSignInAccount != null) {
          bool = true;
        } else {
          bool = false;
        }
        return Boolean.valueOf(bool);
      }
    }
    
    public void isSignedIn(MethodChannel.Result paramResult)
    {
      paramResult.success(isSignedIn());
    }
    
    public boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
    {
      Object localObject = pendingOperation;
      boolean bool = false;
      if (localObject == null) {
        return false;
      }
      switch (paramInt1)
      {
      default: 
        return false;
      case 53295: 
        if (paramInt2 == -1) {
          bool = true;
        }
        finishWithBoolean(Boolean.valueOf(bool));
        return true;
      case 53294: 
        if (paramInt2 == -1)
        {
          paramIntent = stringResult;
          Objects.requireNonNull(paramIntent);
          localObject = pendingOperation.data;
          Objects.requireNonNull(localObject);
          localObject = (String)localObject;
          pendingOperation = null;
          getAccessToken((String)localObject, Boolean.FALSE, paramIntent);
        }
        else
        {
          finishWithError("failed_to_recover_auth", "Failed attempt to recover authentication");
        }
        return true;
      }
      if (paramIntent != null)
      {
        localObject = n.a;
        localObject = (Status)paramIntent.getParcelableExtra("googleSignInStatus");
        paramIntent = (GoogleSignInAccount)paramIntent.getParcelableExtra("googleSignInAccount");
        if (paramIntent == null)
        {
          paramIntent = (Intent)localObject;
          if (localObject == null) {
            paramIntent = Status.o;
          }
          paramIntent = new g6.b(null, paramIntent);
        }
        else
        {
          paramIntent = new g6.b(paramIntent, Status.e);
        }
        localObject = b;
        if ((a.D()) && (localObject != null)) {
          paramIntent = Tasks.forResult(localObject);
        } else {
          paramIntent = Tasks.forException(a0.r(a));
        }
        onSignInResult(paramIntent);
      }
      else
      {
        finishWithError("sign_in_failed", "Signin failed");
      }
      return true;
    }
    
    public void requestScopes(MethodChannel.Result paramResult, List<String> paramList)
    {
      requestScopes(paramList, new GoogleSignInPlugin.ErrorConvertingMethodChannelResult(paramResult)
      {
        public void success(Boolean paramAnonymousBoolean)
        {
          result.success(paramAnonymousBoolean);
        }
      });
    }
    
    public void requestScopes(List<String> paramList, Messages.Result<Boolean> paramResult)
    {
      checkAndSetPendingBoolOperation("requestScopes", paramResult);
      GoogleSignInAccount localGoogleSignInAccount = googleSignInWrapper.getLastSignedInAccount(context);
      if (localGoogleSignInAccount == null)
      {
        finishWithError("sign_in_required", "No account to grant scopes.");
        return;
      }
      paramResult = new ArrayList();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        Scope localScope = new Scope(1, (String)paramList.next());
        if (!googleSignInWrapper.hasPermissions(localGoogleSignInAccount, localScope)) {
          paramResult.add(localScope);
        }
      }
      if (paramResult.isEmpty())
      {
        finishWithBoolean(Boolean.TRUE);
        return;
      }
      googleSignInWrapper.requestPermissions(getActivity(), 53295, localGoogleSignInAccount, (Scope[])paramResult.toArray(new Scope[0]));
    }
    
    public void setActivity(Activity paramActivity)
    {
      activity = paramActivity;
    }
    
    public void signIn(MethodChannel.Result paramResult)
    {
      signIn(new GoogleSignInPlugin.UserDataMethodChannelResult(paramResult));
    }
    
    public void signIn(Messages.Result<Messages.UserData> paramResult)
    {
      if (getActivity() != null)
      {
        checkAndSetPendingSignInOperation("signIn", paramResult);
        paramResult = signInClient.a();
        getActivity().startActivityForResult(paramResult, 53293);
        return;
      }
      throw new IllegalStateException("signIn needs a foreground activity");
    }
    
    public void signInSilently(MethodChannel.Result paramResult)
    {
      signInSilently(new GoogleSignInPlugin.UserDataMethodChannelResult(paramResult));
    }
    
    public void signInSilently(Messages.Result<Messages.UserData> arg1)
    {
      checkAndSetPendingSignInOperation("signInSilently", ???);
      ??? = signInClient;
      Object localObject1 = ???.asGoogleApiClient();
      Context localContext = ???.getApplicationContext();
      Object localObject3 = (GoogleSignInOptions)???.getApiOptions();
      int i = ???.c();
      int j = 1;
      if (i == 3) {
        i = 1;
      } else {
        i = 0;
      }
      p6.a locala = n.a;
      locala.a("silentSignIn()", new Object[0]);
      locala.a("getEligibleSavedSignInResult()", new Object[0]);
      m6.j.i(localObject3);
      synchronized (h6.o.a(localContext))
      {
        ??? = c;
        if (??? != null)
        {
          Account localAccount = c;
          ??? = c;
          if ((localAccount == null ? ??? != null : !localAccount.equals(???)) || (e) || ((d) && ((!d) || (!m6.h.a(o, o)))) || (!new HashSet(???.D()).containsAll(new HashSet(((GoogleSignInOptions)localObject3).D())))) {}
        }
        synchronized (h6.o.a(localContext))
        {
          ??? = b;
          if (??? != null)
          {
            if (System.currentTimeMillis() / 1000L < p - 300L) {
              j = 0;
            }
            if (j == 0)
            {
              ??? = new g6.b((GoogleSignInAccount)???, Status.e);
              break label304;
            }
          }
          ??? = null;
          label304:
          if (??? != null)
          {
            locala.a("Eligible saved sign in result found", new Object[0]);
            localObject1 = new p((k6.e)localObject1);
            ((BasePendingResult)localObject1).setResult(???);
            ??? = new k((BasePendingResult)localObject1);
          }
          else if (i != 0)
          {
            ??? = new g6.b(null, new Status(4, null, null, null));
            localObject1 = new p((k6.e)localObject1);
            ((BasePendingResult)localObject1).setResult(???);
            ??? = new k((BasePendingResult)localObject1);
          }
          else
          {
            locala.a("trySilentSignIn()", new Object[0]);
            ??? = new k(((k6.e)localObject1).a(new h6.h((k6.e)localObject1, localContext, (GoogleSignInOptions)localObject3)));
          }
          localObject1 = g6.a.a;
          localObject3 = new TaskCompletionSource();
          ???.addStatusListener(new w(???, (TaskCompletionSource)localObject3, (m6.i)localObject1));
          ??? = ((TaskCompletionSource)localObject3).getTask();
          if (???.isComplete()) {
            onSignInResult(???);
          } else {
            ???.addOnCompleteListener(new m0(this, 2));
          }
          return;
        }
      }
    }
    
    public void signOut(MethodChannel.Result paramResult)
    {
      signOut(new GoogleSignInPlugin.VoidMethodChannelResult(paramResult));
    }
    
    public void signOut(Messages.Result<Void> paramResult)
    {
      checkAndSetPendingVoidOperation("signOut", paramResult);
      signInClient.signOut().addOnCompleteListener(new e(this, 3));
    }
    
    public static class PendingOperation
    {
      public final Messages.Result<Boolean> boolResult;
      public final Object data;
      public final String method;
      public final Messages.Result<String> stringResult;
      public final Messages.Result<Messages.UserData> userDataResult;
      public final Messages.Result<Void> voidResult;
      
      public PendingOperation(String paramString, Messages.Result<Messages.UserData> paramResult, Messages.Result<Void> paramResult1, Messages.Result<Boolean> paramResult2, Messages.Result<String> paramResult3, Object paramObject)
      {
        method = paramString;
        userDataResult = paramResult;
        voidResult = paramResult1;
        boolResult = paramResult2;
        stringResult = paramResult3;
        data = paramObject;
      }
    }
  }
  
  public static abstract class ErrorConvertingMethodChannelResult<T>
    implements Messages.Result<T>
  {
    public final MethodChannel.Result result;
    
    public ErrorConvertingMethodChannelResult(MethodChannel.Result paramResult)
    {
      result = paramResult;
    }
    
    public void error(Throwable paramThrowable)
    {
      if ((paramThrowable instanceof Messages.FlutterError))
      {
        paramThrowable = (Messages.FlutterError)paramThrowable;
        result.error(code, paramThrowable.getMessage(), details);
      }
      else
      {
        result.error("exception", paramThrowable.getMessage(), null);
      }
    }
  }
  
  public static abstract interface IDelegate
  {
    public abstract void clearAuthCache(MethodChannel.Result paramResult, String paramString);
    
    public abstract void disconnect(MethodChannel.Result paramResult);
    
    public abstract void getTokens(MethodChannel.Result paramResult, String paramString, boolean paramBoolean);
    
    public abstract void init(MethodChannel.Result paramResult, String paramString1, List<String> paramList, String paramString2, String paramString3, String paramString4, boolean paramBoolean);
    
    public abstract void isSignedIn(MethodChannel.Result paramResult);
    
    public abstract void requestScopes(MethodChannel.Result paramResult, List<String> paramList);
    
    public abstract void signIn(MethodChannel.Result paramResult);
    
    public abstract void signInSilently(MethodChannel.Result paramResult);
    
    public abstract void signOut(MethodChannel.Result paramResult);
  }
  
  public static class UserDataMethodChannelResult
    extends GoogleSignInPlugin.ErrorConvertingMethodChannelResult<Messages.UserData>
  {
    public UserDataMethodChannelResult(MethodChannel.Result paramResult)
    {
      super();
    }
    
    public void success(Messages.UserData paramUserData)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("email", paramUserData.getEmail());
      localHashMap.put("id", paramUserData.getId());
      localHashMap.put("idToken", paramUserData.getIdToken());
      localHashMap.put("serverAuthCode", paramUserData.getServerAuthCode());
      localHashMap.put("displayName", paramUserData.getDisplayName());
      if (paramUserData.getPhotoUrl() != null) {
        localHashMap.put("photoUrl", paramUserData.getPhotoUrl());
      }
      result.success(localHashMap);
    }
  }
  
  public static class VoidMethodChannelResult
    extends GoogleSignInPlugin.ErrorConvertingMethodChannelResult<Void>
  {
    public VoidMethodChannelResult(MethodChannel.Result paramResult)
    {
      super();
    }
    
    public void success(Void paramVoid)
    {
      result.success(null);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.googlesignin.GoogleSignInPlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */