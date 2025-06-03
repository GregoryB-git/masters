package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsClient;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.LoginStatusCallback;
import com.facebook.Profile;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.internal.PlatformServiceClient.CompletedListener;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import z2;

public class LoginManager
{
  private static final String EXPRESS_LOGIN_ALLOWED = "express_login_allowed";
  private static final String MANAGE_PERMISSION_PREFIX = "manage";
  private static final Set<String> OTHER_PUBLISH_PERMISSIONS = ;
  private static final String PREFERENCE_LOGIN_MANAGER = "com.facebook.loginManager";
  private static final String PUBLISH_PERMISSION_PREFIX = "publish";
  private static volatile LoginManager instance;
  private String authType = "rerequest";
  private DefaultAudience defaultAudience = DefaultAudience.FRIENDS;
  private LoginBehavior loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
  private final SharedPreferences sharedPreferences;
  
  public LoginManager()
  {
    Validate.sdkInitialized();
    sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.loginManager", 0);
    if ((FacebookSdk.hasCustomTabsPrefetching) && (CustomTabUtils.getChromePackage() != null))
    {
      CustomTabPrefetchHelper localCustomTabPrefetchHelper = new CustomTabPrefetchHelper();
      CustomTabsClient.bindCustomTabsService(FacebookSdk.getApplicationContext(), "com.android.chrome", localCustomTabPrefetchHelper);
      CustomTabsClient.connectAndInitialize(FacebookSdk.getApplicationContext(), FacebookSdk.getApplicationContext().getPackageName());
    }
  }
  
  public static LoginResult computeLoginResult(LoginClient.Request paramRequest, AccessToken paramAccessToken)
  {
    Set localSet = paramRequest.getPermissions();
    HashSet localHashSet = new HashSet(paramAccessToken.getPermissions());
    if (paramRequest.isRerequest()) {
      localHashSet.retainAll(localSet);
    }
    paramRequest = new HashSet(localSet);
    paramRequest.removeAll(localHashSet);
    return new LoginResult(paramAccessToken, localHashSet, paramRequest);
  }
  
  private LoginClient.Request createLoginRequestFromResponse(GraphResponse paramGraphResponse)
  {
    Validate.notNull(paramGraphResponse, "response");
    paramGraphResponse = paramGraphResponse.getRequest().getAccessToken();
    if (paramGraphResponse != null) {
      paramGraphResponse = paramGraphResponse.getPermissions();
    } else {
      paramGraphResponse = null;
    }
    return createLoginRequest(paramGraphResponse);
  }
  
  private void finishLogin(AccessToken paramAccessToken, LoginClient.Request paramRequest, FacebookException paramFacebookException, boolean paramBoolean, FacebookCallback<LoginResult> paramFacebookCallback)
  {
    if (paramAccessToken != null)
    {
      AccessToken.setCurrentAccessToken(paramAccessToken);
      Profile.fetchProfileForCurrentAccessToken();
    }
    if (paramFacebookCallback != null)
    {
      if (paramAccessToken != null) {
        paramRequest = computeLoginResult(paramRequest, paramAccessToken);
      } else {
        paramRequest = null;
      }
      if ((!paramBoolean) && ((paramRequest == null) || (paramRequest.getRecentlyGrantedPermissions().size() != 0)))
      {
        if (paramFacebookException != null)
        {
          paramFacebookCallback.onError(paramFacebookException);
        }
        else if (paramAccessToken != null)
        {
          setExpressLoginStatus(true);
          paramFacebookCallback.onSuccess(paramRequest);
        }
      }
      else {
        paramFacebookCallback.onCancel();
      }
    }
  }
  
  @Nullable
  public static Map<String, String> getExtraDataFromIntent(Intent paramIntent)
  {
    if (paramIntent == null) {
      return null;
    }
    paramIntent = (LoginClient.Result)paramIntent.getParcelableExtra("com.facebook.LoginFragment:Result");
    if (paramIntent == null) {
      return null;
    }
    return extraData;
  }
  
  public static LoginManager getInstance()
  {
    if (instance == null) {
      try
      {
        if (instance == null)
        {
          LoginManager localLoginManager = new com/facebook/login/LoginManager;
          localLoginManager.<init>();
          instance = localLoginManager;
        }
      }
      finally {}
    }
    return instance;
  }
  
  private static Set<String> getOtherPublishPermissions()
  {
    Collections.unmodifiableSet(new HashSet() {});
  }
  
  private static void handleLoginStatusError(String paramString1, String paramString2, String paramString3, LoginLogger paramLoginLogger, LoginStatusCallback paramLoginStatusCallback)
  {
    paramString1 = new FacebookException(z2.p(paramString1, ": ", paramString2));
    paramLoginLogger.logLoginStatusError(paramString3, paramString1);
    paramLoginStatusCallback.onError(paramString1);
  }
  
  private boolean isExpressLoginAllowed()
  {
    return sharedPreferences.getBoolean("express_login_allowed", true);
  }
  
  public static boolean isPublishPermission(String paramString)
  {
    boolean bool;
    if ((paramString != null) && ((paramString.startsWith("publish")) || (paramString.startsWith("manage")) || (OTHER_PUBLISH_PERMISSIONS.contains(paramString)))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void logCompleteLogin(Context paramContext, LoginClient.Result.Code paramCode, Map<String, String> paramMap, Exception paramException, boolean paramBoolean, LoginClient.Request paramRequest)
  {
    LoginLogger localLoginLogger = LoginLoggerHolder.access$000(paramContext);
    if (localLoginLogger == null) {
      return;
    }
    if (paramRequest == null)
    {
      localLoginLogger.logUnexpectedError("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
    }
    else
    {
      HashMap localHashMap = new HashMap();
      if (paramBoolean) {
        paramContext = "1";
      } else {
        paramContext = "0";
      }
      localHashMap.put("try_login_activity", paramContext);
      localLoginLogger.logCompleteLogin(paramRequest.getAuthId(), localHashMap, paramCode, paramMap, paramException);
    }
  }
  
  private void logInWithPublishPermissions(FragmentWrapper paramFragmentWrapper, Collection<String> paramCollection)
  {
    validatePublishPermissions(paramCollection);
    logIn(paramFragmentWrapper, paramCollection);
  }
  
  private void logInWithReadPermissions(FragmentWrapper paramFragmentWrapper, Collection<String> paramCollection)
  {
    validateReadPermissions(paramCollection);
    logIn(paramFragmentWrapper, paramCollection);
  }
  
  private void logStartLogin(Context paramContext, LoginClient.Request paramRequest)
  {
    paramContext = LoginLoggerHolder.access$000(paramContext);
    if ((paramContext != null) && (paramRequest != null)) {
      paramContext.logStartLogin(paramRequest);
    }
  }
  
  private void reauthorizeDataAccess(FragmentWrapper paramFragmentWrapper)
  {
    LoginClient.Request localRequest = createReauthorizeRequest();
    startLogin(new FragmentStartActivityDelegate(paramFragmentWrapper), localRequest);
  }
  
  private void resolveError(FragmentWrapper paramFragmentWrapper, GraphResponse paramGraphResponse)
  {
    startLogin(new FragmentStartActivityDelegate(paramFragmentWrapper), createLoginRequestFromResponse(paramGraphResponse));
  }
  
  private boolean resolveIntent(Intent paramIntent)
  {
    PackageManager localPackageManager = FacebookSdk.getApplicationContext().getPackageManager();
    boolean bool = false;
    if (localPackageManager.resolveActivity(paramIntent, 0) != null) {
      bool = true;
    }
    return bool;
  }
  
  private void retrieveLoginStatusImpl(Context paramContext, final LoginStatusCallback paramLoginStatusCallback, long paramLong)
  {
    final String str1 = FacebookSdk.getApplicationId();
    final String str2 = UUID.randomUUID().toString();
    final LoginLogger localLoginLogger = new LoginLogger(paramContext, str1);
    if (!isExpressLoginAllowed())
    {
      localLoginLogger.logLoginStatusFailure(str2);
      paramLoginStatusCallback.onFailure();
      return;
    }
    paramContext = new LoginStatusClient(paramContext, str1, str2, FacebookSdk.getGraphApiVersion(), paramLong);
    paramContext.setCompletedListener(new PlatformServiceClient.CompletedListener()
    {
      public void completed(Bundle paramAnonymousBundle)
      {
        if (paramAnonymousBundle != null)
        {
          String str1 = paramAnonymousBundle.getString("com.facebook.platform.status.ERROR_TYPE");
          Object localObject = paramAnonymousBundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
          if (str1 != null)
          {
            LoginManager.access$100(str1, (String)localObject, str2, localLoginLogger, paramLoginStatusCallback);
          }
          else
          {
            String str2 = paramAnonymousBundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date localDate1 = Utility.getBundleLongAsDate(paramAnonymousBundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            localObject = paramAnonymousBundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String str3 = paramAnonymousBundle.getString("signed request");
            str1 = paramAnonymousBundle.getString("graph_domain");
            Date localDate2 = Utility.getBundleLongAsDate(paramAnonymousBundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            paramAnonymousBundle = null;
            if (!Utility.isNullOrEmpty(str3)) {
              paramAnonymousBundle = LoginMethodHandler.getUserIDFromSignedRequest(str3);
            }
            if ((!Utility.isNullOrEmpty(str2)) && (localObject != null) && (!((ArrayList)localObject).isEmpty()) && (!Utility.isNullOrEmpty(paramAnonymousBundle)))
            {
              paramAnonymousBundle = new AccessToken(str2, str1, paramAnonymousBundle, (Collection)localObject, null, null, null, localDate1, null, localDate2, str1);
              AccessToken.setCurrentAccessToken(paramAnonymousBundle);
              Profile.fetchProfileForCurrentAccessToken();
              localLoginLogger.logLoginStatusSuccess(str2);
              paramLoginStatusCallback.onCompleted(paramAnonymousBundle);
            }
            else
            {
              localLoginLogger.logLoginStatusFailure(str2);
              paramLoginStatusCallback.onFailure();
            }
          }
        }
        else
        {
          localLoginLogger.logLoginStatusFailure(str2);
          paramLoginStatusCallback.onFailure();
        }
      }
    });
    localLoginLogger.logLoginStatusStart(str2);
    if (!paramContext.start())
    {
      localLoginLogger.logLoginStatusFailure(str2);
      paramLoginStatusCallback.onFailure();
    }
  }
  
  private void setExpressLoginStatus(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = sharedPreferences.edit();
    localEditor.putBoolean("express_login_allowed", paramBoolean);
    localEditor.apply();
  }
  
  private void startLogin(StartActivityDelegate paramStartActivityDelegate, LoginClient.Request paramRequest)
    throws FacebookException
  {
    logStartLogin(paramStartActivityDelegate.getActivityContext(), paramRequest);
    CallbackManagerImpl.registerStaticCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new CallbackManagerImpl.Callback()
    {
      public boolean onActivityResult(int paramAnonymousInt, Intent paramAnonymousIntent)
      {
        return LoginManager.this.onActivityResult(paramAnonymousInt, paramAnonymousIntent);
      }
    });
    if (tryFacebookActivity(paramStartActivityDelegate, paramRequest)) {
      return;
    }
    FacebookException localFacebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
    logCompleteLogin(paramStartActivityDelegate.getActivityContext(), LoginClient.Result.Code.ERROR, null, localFacebookException, false, paramRequest);
    throw localFacebookException;
  }
  
  private boolean tryFacebookActivity(StartActivityDelegate paramStartActivityDelegate, LoginClient.Request paramRequest)
  {
    paramRequest = getFacebookActivityIntent(paramRequest);
    if (!resolveIntent(paramRequest)) {
      return false;
    }
    try
    {
      paramStartActivityDelegate.startActivityForResult(paramRequest, LoginClient.getLoginRequestCode());
      return true;
    }
    catch (ActivityNotFoundException paramStartActivityDelegate) {}
    return false;
  }
  
  private void validatePublishPermissions(Collection<String> paramCollection)
  {
    if (paramCollection == null) {
      return;
    }
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      paramCollection = (String)localIterator.next();
      if (!isPublishPermission(paramCollection)) {
        throw new FacebookException(String.format("Cannot pass a read permission (%s) to a request for publish authorization", new Object[] { paramCollection }));
      }
    }
  }
  
  private void validateReadPermissions(Collection<String> paramCollection)
  {
    if (paramCollection == null) {
      return;
    }
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      paramCollection = (String)localIterator.next();
      if (isPublishPermission(paramCollection)) {
        throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[] { paramCollection }));
      }
    }
  }
  
  public LoginClient.Request createLoginRequest(Collection<String> paramCollection)
  {
    LoginBehavior localLoginBehavior = loginBehavior;
    HashSet localHashSet = new java/util/HashSet;
    if (paramCollection != null) {
      localHashSet.<init>(paramCollection);
    } else {
      localHashSet.<init>();
    }
    paramCollection = new LoginClient.Request(localLoginBehavior, Collections.unmodifiableSet(localHashSet), defaultAudience, authType, FacebookSdk.getApplicationId(), UUID.randomUUID().toString());
    paramCollection.setRerequest(AccessToken.isCurrentAccessTokenActive());
    return paramCollection;
  }
  
  public LoginClient.Request createReauthorizeRequest()
  {
    return new LoginClient.Request(LoginBehavior.DIALOG_ONLY, new HashSet(), defaultAudience, "reauthorize", FacebookSdk.getApplicationId(), UUID.randomUUID().toString());
  }
  
  public String getAuthType()
  {
    return authType;
  }
  
  public DefaultAudience getDefaultAudience()
  {
    return defaultAudience;
  }
  
  public Intent getFacebookActivityIntent(LoginClient.Request paramRequest)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
    localIntent.setAction(paramRequest.getLoginBehavior().toString());
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("request", paramRequest);
    localIntent.putExtra("com.facebook.LoginFragment:Request", localBundle);
    return localIntent;
  }
  
  public LoginBehavior getLoginBehavior()
  {
    return loginBehavior;
  }
  
  public void logIn(Activity paramActivity, Collection<String> paramCollection)
  {
    paramCollection = createLoginRequest(paramCollection);
    startLogin(new ActivityStartActivityDelegate(paramActivity), paramCollection);
  }
  
  public void logIn(android.app.Fragment paramFragment, Collection<String> paramCollection)
  {
    logIn(new FragmentWrapper(paramFragment), paramCollection);
  }
  
  public void logIn(androidx.fragment.app.Fragment paramFragment, Collection<String> paramCollection)
  {
    logIn(new FragmentWrapper(paramFragment), paramCollection);
  }
  
  public void logIn(FragmentWrapper paramFragmentWrapper, Collection<String> paramCollection)
  {
    paramCollection = createLoginRequest(paramCollection);
    startLogin(new FragmentStartActivityDelegate(paramFragmentWrapper), paramCollection);
  }
  
  public void logInWithPublishPermissions(Activity paramActivity, Collection<String> paramCollection)
  {
    validatePublishPermissions(paramCollection);
    logIn(paramActivity, paramCollection);
  }
  
  public void logInWithPublishPermissions(android.app.Fragment paramFragment, Collection<String> paramCollection)
  {
    logInWithPublishPermissions(new FragmentWrapper(paramFragment), paramCollection);
  }
  
  public void logInWithPublishPermissions(androidx.fragment.app.Fragment paramFragment, Collection<String> paramCollection)
  {
    logInWithPublishPermissions(new FragmentWrapper(paramFragment), paramCollection);
  }
  
  public void logInWithReadPermissions(Activity paramActivity, Collection<String> paramCollection)
  {
    validateReadPermissions(paramCollection);
    logIn(paramActivity, paramCollection);
  }
  
  public void logInWithReadPermissions(android.app.Fragment paramFragment, Collection<String> paramCollection)
  {
    logInWithReadPermissions(new FragmentWrapper(paramFragment), paramCollection);
  }
  
  public void logInWithReadPermissions(androidx.fragment.app.Fragment paramFragment, Collection<String> paramCollection)
  {
    logInWithReadPermissions(new FragmentWrapper(paramFragment), paramCollection);
  }
  
  public void logOut()
  {
    AccessToken.setCurrentAccessToken(null);
    Profile.setCurrentProfile(null);
    setExpressLoginStatus(false);
  }
  
  public boolean onActivityResult(int paramInt, Intent paramIntent)
  {
    return onActivityResult(paramInt, paramIntent, null);
  }
  
  public boolean onActivityResult(int paramInt, Intent paramIntent, FacebookCallback<LoginResult> paramFacebookCallback)
  {
    Object localObject1 = LoginClient.Result.Code.ERROR;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    boolean bool1 = false;
    boolean bool2 = false;
    Object localObject5;
    Object localObject6;
    if (paramIntent != null)
    {
      localObject5 = (LoginClient.Result)paramIntent.getParcelableExtra("com.facebook.LoginFragment:Result");
      if (localObject5 != null)
      {
        localObject6 = request;
        localObject1 = code;
        if (paramInt == -1)
        {
          if (localObject1 == LoginClient.Result.Code.SUCCESS)
          {
            paramIntent = token;
            bool2 = bool1;
          }
          else
          {
            localObject4 = new FacebookAuthorizationException(errorMessage);
            paramIntent = null;
            bool2 = bool1;
          }
        }
        else
        {
          if (paramInt == 0) {
            bool2 = true;
          }
          paramIntent = null;
        }
        localObject5 = loggingExtras;
      }
      else
      {
        paramIntent = null;
        localObject5 = paramIntent;
        bool2 = false;
        localObject6 = localObject5;
        localObject4 = localObject2;
      }
      localObject3 = localObject1;
      localObject1 = localObject4;
      localObject4 = localObject3;
    }
    else if (paramInt == 0)
    {
      localObject4 = LoginClient.Result.Code.CANCEL;
      bool2 = true;
      paramIntent = null;
      localObject6 = paramIntent;
      localObject5 = localObject6;
      localObject1 = localObject3;
    }
    else
    {
      localObject4 = localObject1;
      paramIntent = null;
      localObject6 = paramIntent;
      localObject5 = localObject6;
      bool2 = false;
      localObject1 = localObject3;
    }
    localObject3 = localObject1;
    if (localObject1 == null)
    {
      localObject3 = localObject1;
      if (paramIntent == null)
      {
        localObject3 = localObject1;
        if (!bool2) {
          localObject3 = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
      }
    }
    logCompleteLogin(null, (LoginClient.Result.Code)localObject4, (Map)localObject5, (Exception)localObject3, true, (LoginClient.Request)localObject6);
    finishLogin(paramIntent, (LoginClient.Request)localObject6, (FacebookException)localObject3, bool2, paramFacebookCallback);
    return true;
  }
  
  public void reauthorizeDataAccess(Activity paramActivity)
  {
    LoginClient.Request localRequest = createReauthorizeRequest();
    startLogin(new ActivityStartActivityDelegate(paramActivity), localRequest);
  }
  
  public void reauthorizeDataAccess(androidx.fragment.app.Fragment paramFragment)
  {
    reauthorizeDataAccess(new FragmentWrapper(paramFragment));
  }
  
  public void registerCallback(CallbackManager paramCallbackManager, final FacebookCallback<LoginResult> paramFacebookCallback)
  {
    if ((paramCallbackManager instanceof CallbackManagerImpl))
    {
      ((CallbackManagerImpl)paramCallbackManager).registerCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new CallbackManagerImpl.Callback()
      {
        public boolean onActivityResult(int paramAnonymousInt, Intent paramAnonymousIntent)
        {
          return onActivityResult(paramAnonymousInt, paramAnonymousIntent, paramFacebookCallback);
        }
      });
      return;
    }
    throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
  }
  
  public void resolveError(Activity paramActivity, GraphResponse paramGraphResponse)
  {
    startLogin(new ActivityStartActivityDelegate(paramActivity), createLoginRequestFromResponse(paramGraphResponse));
  }
  
  public void resolveError(android.app.Fragment paramFragment, GraphResponse paramGraphResponse)
  {
    resolveError(new FragmentWrapper(paramFragment), paramGraphResponse);
  }
  
  public void resolveError(androidx.fragment.app.Fragment paramFragment, GraphResponse paramGraphResponse)
  {
    resolveError(new FragmentWrapper(paramFragment), paramGraphResponse);
  }
  
  public void retrieveLoginStatus(Context paramContext, long paramLong, LoginStatusCallback paramLoginStatusCallback)
  {
    retrieveLoginStatusImpl(paramContext, paramLoginStatusCallback, paramLong);
  }
  
  public void retrieveLoginStatus(Context paramContext, LoginStatusCallback paramLoginStatusCallback)
  {
    retrieveLoginStatus(paramContext, 5000L, paramLoginStatusCallback);
  }
  
  public LoginManager setAuthType(String paramString)
  {
    authType = paramString;
    return this;
  }
  
  public LoginManager setDefaultAudience(DefaultAudience paramDefaultAudience)
  {
    defaultAudience = paramDefaultAudience;
    return this;
  }
  
  public LoginManager setLoginBehavior(LoginBehavior paramLoginBehavior)
  {
    loginBehavior = paramLoginBehavior;
    return this;
  }
  
  public void unregisterCallback(CallbackManager paramCallbackManager)
  {
    if ((paramCallbackManager instanceof CallbackManagerImpl))
    {
      ((CallbackManagerImpl)paramCallbackManager).unregisterCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode());
      return;
    }
    throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
  }
  
  public static class ActivityStartActivityDelegate
    implements StartActivityDelegate
  {
    private final Activity activity;
    
    public ActivityStartActivityDelegate(Activity paramActivity)
    {
      Validate.notNull(paramActivity, "activity");
      activity = paramActivity;
    }
    
    public Activity getActivityContext()
    {
      return activity;
    }
    
    public void startActivityForResult(Intent paramIntent, int paramInt)
    {
      activity.startActivityForResult(paramIntent, paramInt);
    }
  }
  
  public static class FragmentStartActivityDelegate
    implements StartActivityDelegate
  {
    private final FragmentWrapper fragment;
    
    public FragmentStartActivityDelegate(FragmentWrapper paramFragmentWrapper)
    {
      Validate.notNull(paramFragmentWrapper, "fragment");
      fragment = paramFragmentWrapper;
    }
    
    public Activity getActivityContext()
    {
      return fragment.getActivity();
    }
    
    public void startActivityForResult(Intent paramIntent, int paramInt)
    {
      fragment.startActivityForResult(paramIntent, paramInt);
    }
  }
  
  public static class LoginLoggerHolder
  {
    private static LoginLogger logger;
    
    private static LoginLogger getLogger(Context paramContext)
    {
      if (paramContext == null) {}
      try
      {
        paramContext = FacebookSdk.getApplicationContext();
        if (paramContext == null) {
          return null;
        }
        if (logger == null)
        {
          LoginLogger localLoginLogger = new com/facebook/login/LoginLogger;
          localLoginLogger.<init>(paramContext, FacebookSdk.getApplicationId());
          logger = localLoginLogger;
        }
        paramContext = logger;
        return paramContext;
      }
      finally {}
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.LoginManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */