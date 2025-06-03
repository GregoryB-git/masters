package com.facebook.login;

import a;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.common.R.string;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class LoginClient
  implements Parcelable
{
  public static final Parcelable.Creator<LoginClient> CREATOR = new Parcelable.Creator()
  {
    public LoginClient createFromParcel(Parcel paramAnonymousParcel)
    {
      return new LoginClient(paramAnonymousParcel);
    }
    
    public LoginClient[] newArray(int paramAnonymousInt)
    {
      return new LoginClient[paramAnonymousInt];
    }
  };
  public BackgroundProcessingListener backgroundProcessingListener;
  public boolean checkedInternetPermission;
  public int currentHandler = -1;
  public Map<String, String> extraData;
  public Fragment fragment;
  public LoginMethodHandler[] handlersToTry;
  public Map<String, String> loggingExtras;
  private LoginLogger loginLogger;
  private int numActivitiesReturned;
  private int numTotalIntentsFired;
  public OnCompletedListener onCompletedListener;
  public Request pendingRequest;
  
  public LoginClient(Parcel paramParcel)
  {
    int i = 0;
    numActivitiesReturned = 0;
    numTotalIntentsFired = 0;
    Parcelable[] arrayOfParcelable = paramParcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
    handlersToTry = new LoginMethodHandler[arrayOfParcelable.length];
    while (i < arrayOfParcelable.length)
    {
      LoginMethodHandler[] arrayOfLoginMethodHandler = handlersToTry;
      LoginMethodHandler localLoginMethodHandler = (LoginMethodHandler)arrayOfParcelable[i];
      arrayOfLoginMethodHandler[i] = localLoginMethodHandler;
      localLoginMethodHandler.setLoginClient(this);
      i++;
    }
    currentHandler = paramParcel.readInt();
    pendingRequest = ((Request)paramParcel.readParcelable(Request.class.getClassLoader()));
    loggingExtras = Utility.readStringMapFromParcel(paramParcel);
    extraData = Utility.readStringMapFromParcel(paramParcel);
  }
  
  public LoginClient(Fragment paramFragment)
  {
    numActivitiesReturned = 0;
    numTotalIntentsFired = 0;
    fragment = paramFragment;
  }
  
  private void addLoggingExtra(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (loggingExtras == null) {
      loggingExtras = new HashMap();
    }
    String str = paramString2;
    if (loggingExtras.containsKey(paramString1))
    {
      str = paramString2;
      if (paramBoolean) {
        str = a.p(new StringBuilder(), (String)loggingExtras.get(paramString1), ",", paramString2);
      }
    }
    loggingExtras.put(paramString1, str);
  }
  
  private void completeWithFailure()
  {
    complete(Result.createErrorResult(pendingRequest, "Login attempt failed.", null));
  }
  
  public static String getE2E()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("init", System.currentTimeMillis());
      return localJSONObject.toString();
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
  
  private LoginLogger getLogger()
  {
    LoginLogger localLoginLogger = loginLogger;
    if ((localLoginLogger == null) || (!localLoginLogger.getApplicationId().equals(pendingRequest.getApplicationId()))) {
      loginLogger = new LoginLogger(getActivity(), pendingRequest.getApplicationId());
    }
    return loginLogger;
  }
  
  public static int getLoginRequestCode()
  {
    return CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
  }
  
  private void logAuthorizationMethodComplete(String paramString, Result paramResult, Map<String, String> paramMap)
  {
    logAuthorizationMethodComplete(paramString, code.getLoggingValue(), errorMessage, errorCode, paramMap);
  }
  
  private void logAuthorizationMethodComplete(String paramString1, String paramString2, String paramString3, String paramString4, Map<String, String> paramMap)
  {
    if (pendingRequest == null) {
      getLogger().logUnexpectedError("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", paramString1);
    } else {
      getLogger().logAuthorizationMethodComplete(pendingRequest.getAuthId(), paramString1, paramString2, paramString3, paramString4, paramMap);
    }
  }
  
  private void notifyOnCompleteListener(Result paramResult)
  {
    OnCompletedListener localOnCompletedListener = onCompletedListener;
    if (localOnCompletedListener != null) {
      localOnCompletedListener.onCompleted(paramResult);
    }
  }
  
  public void addExtraData(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (extraData == null) {
      extraData = new HashMap();
    }
    String str = paramString2;
    if (extraData.containsKey(paramString1))
    {
      str = paramString2;
      if (paramBoolean) {
        str = a.p(new StringBuilder(), (String)extraData.get(paramString1), ",", paramString2);
      }
    }
    extraData.put(paramString1, str);
  }
  
  public void authorize(Request paramRequest)
  {
    if (paramRequest == null) {
      return;
    }
    if (pendingRequest == null)
    {
      if ((AccessToken.isCurrentAccessTokenActive()) && (!checkInternetPermission())) {
        return;
      }
      pendingRequest = paramRequest;
      handlersToTry = getHandlersToTry(paramRequest);
      tryNextHandler();
      return;
    }
    throw new FacebookException("Attempted to authorize while a request is pending.");
  }
  
  public void cancelCurrentHandler()
  {
    if (currentHandler >= 0) {
      getCurrentHandler().cancel();
    }
  }
  
  public boolean checkInternetPermission()
  {
    if (checkedInternetPermission) {
      return true;
    }
    if (checkPermission("android.permission.INTERNET") != 0)
    {
      Object localObject = getActivity();
      String str = ((Context)localObject).getString(R.string.com_facebook_internet_permission_error_title);
      localObject = ((Context)localObject).getString(R.string.com_facebook_internet_permission_error_message);
      complete(Result.createErrorResult(pendingRequest, str, (String)localObject));
      return false;
    }
    checkedInternetPermission = true;
    return true;
  }
  
  public int checkPermission(String paramString)
  {
    return getActivity().checkCallingOrSelfPermission(paramString);
  }
  
  public void complete(Result paramResult)
  {
    Object localObject = getCurrentHandler();
    if (localObject != null) {
      logAuthorizationMethodComplete(((LoginMethodHandler)localObject).getNameForLogging(), paramResult, methodLoggingExtras);
    }
    localObject = loggingExtras;
    if (localObject != null) {
      loggingExtras = ((Map)localObject);
    }
    localObject = extraData;
    if (localObject != null) {
      extraData = ((Map)localObject);
    }
    handlersToTry = null;
    currentHandler = -1;
    pendingRequest = null;
    loggingExtras = null;
    numActivitiesReturned = 0;
    numTotalIntentsFired = 0;
    notifyOnCompleteListener(paramResult);
  }
  
  public void completeAndValidate(Result paramResult)
  {
    if ((token != null) && (AccessToken.isCurrentAccessTokenActive())) {
      validateSameFbidAndFinish(paramResult);
    } else {
      complete(paramResult);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public FragmentActivity getActivity()
  {
    return fragment.getActivity();
  }
  
  public BackgroundProcessingListener getBackgroundProcessingListener()
  {
    return backgroundProcessingListener;
  }
  
  public LoginMethodHandler getCurrentHandler()
  {
    int i = currentHandler;
    if (i >= 0) {
      return handlersToTry[i];
    }
    return null;
  }
  
  public Fragment getFragment()
  {
    return fragment;
  }
  
  public LoginMethodHandler[] getHandlersToTry(Request paramRequest)
  {
    ArrayList localArrayList = new ArrayList();
    paramRequest = paramRequest.getLoginBehavior();
    if (paramRequest.allowsGetTokenAuth()) {
      localArrayList.add(new GetTokenLoginMethodHandler(this));
    }
    if (paramRequest.allowsKatanaAuth()) {
      localArrayList.add(new KatanaProxyLoginMethodHandler(this));
    }
    if (paramRequest.allowsFacebookLiteAuth()) {
      localArrayList.add(new FacebookLiteLoginMethodHandler(this));
    }
    if (paramRequest.allowsCustomTabAuth()) {
      localArrayList.add(new CustomTabLoginMethodHandler(this));
    }
    if (paramRequest.allowsWebViewAuth()) {
      localArrayList.add(new WebViewLoginMethodHandler(this));
    }
    if (paramRequest.allowsDeviceAuth()) {
      localArrayList.add(new DeviceAuthMethodHandler(this));
    }
    paramRequest = new LoginMethodHandler[localArrayList.size()];
    localArrayList.toArray(paramRequest);
    return paramRequest;
  }
  
  public boolean getInProgress()
  {
    boolean bool;
    if ((pendingRequest != null) && (currentHandler >= 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public OnCompletedListener getOnCompletedListener()
  {
    return onCompletedListener;
  }
  
  public Request getPendingRequest()
  {
    return pendingRequest;
  }
  
  public void notifyBackgroundProcessingStart()
  {
    BackgroundProcessingListener localBackgroundProcessingListener = backgroundProcessingListener;
    if (localBackgroundProcessingListener != null) {
      localBackgroundProcessingListener.onBackgroundProcessingStarted();
    }
  }
  
  public void notifyBackgroundProcessingStop()
  {
    BackgroundProcessingListener localBackgroundProcessingListener = backgroundProcessingListener;
    if (localBackgroundProcessingListener != null) {
      localBackgroundProcessingListener.onBackgroundProcessingStopped();
    }
  }
  
  public boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    numActivitiesReturned += 1;
    if (pendingRequest != null)
    {
      if ((paramIntent != null) && (paramIntent.getBooleanExtra(CustomTabMainActivity.NO_ACTIVITY_EXCEPTION, false)))
      {
        tryNextHandler();
        return false;
      }
      if ((!getCurrentHandler().shouldKeepTrackOfMultipleIntents()) || (paramIntent != null) || (numActivitiesReturned >= numTotalIntentsFired)) {
        return getCurrentHandler().onActivityResult(paramInt1, paramInt2, paramIntent);
      }
    }
    return false;
  }
  
  public void setBackgroundProcessingListener(BackgroundProcessingListener paramBackgroundProcessingListener)
  {
    backgroundProcessingListener = paramBackgroundProcessingListener;
  }
  
  public void setFragment(Fragment paramFragment)
  {
    if (fragment == null)
    {
      fragment = paramFragment;
      return;
    }
    throw new FacebookException("Can't set fragment once it is already set.");
  }
  
  public void setOnCompletedListener(OnCompletedListener paramOnCompletedListener)
  {
    onCompletedListener = paramOnCompletedListener;
  }
  
  public void startOrContinueAuth(Request paramRequest)
  {
    if (!getInProgress()) {
      authorize(paramRequest);
    }
  }
  
  public boolean tryCurrentHandler()
  {
    LoginMethodHandler localLoginMethodHandler = getCurrentHandler();
    boolean bool1 = localLoginMethodHandler.needsInternetPermission();
    boolean bool2 = false;
    if ((bool1) && (!checkInternetPermission()))
    {
      addLoggingExtra("no_internet_permission", "1", false);
      return false;
    }
    int i = localLoginMethodHandler.tryAuthorize(pendingRequest);
    numActivitiesReturned = 0;
    if (i > 0)
    {
      getLogger().logAuthorizationMethodStart(pendingRequest.getAuthId(), localLoginMethodHandler.getNameForLogging());
      numTotalIntentsFired = i;
    }
    else
    {
      getLogger().logAuthorizationMethodNotTried(pendingRequest.getAuthId(), localLoginMethodHandler.getNameForLogging());
      addLoggingExtra("not_tried", localLoginMethodHandler.getNameForLogging(), true);
    }
    if (i > 0) {
      bool2 = true;
    }
    return bool2;
  }
  
  public void tryNextHandler()
  {
    if (currentHandler >= 0) {
      logAuthorizationMethodComplete(getCurrentHandler().getNameForLogging(), "skipped", null, null, getCurrentHandlermethodLoggingExtras);
    }
    do
    {
      LoginMethodHandler[] arrayOfLoginMethodHandler = handlersToTry;
      if (arrayOfLoginMethodHandler == null) {
        break;
      }
      int i = currentHandler;
      if (i >= arrayOfLoginMethodHandler.length - 1) {
        break;
      }
      currentHandler = (i + 1);
    } while (!tryCurrentHandler());
    return;
    if (pendingRequest != null) {
      completeWithFailure();
    }
  }
  
  public void validateSameFbidAndFinish(Result paramResult)
  {
    if (token != null)
    {
      AccessToken localAccessToken1 = AccessToken.getCurrentAccessToken();
      AccessToken localAccessToken2 = token;
      if ((localAccessToken1 != null) && (localAccessToken2 != null)) {}
      try
      {
        if (localAccessToken1.getUserId().equals(localAccessToken2.getUserId())) {
          paramResult = Result.createTokenResult(pendingRequest, token);
        } else {
          paramResult = Result.createErrorResult(pendingRequest, "User logged in as different Facebook user.", null);
        }
        complete(paramResult);
      }
      catch (Exception paramResult)
      {
        complete(Result.createErrorResult(pendingRequest, "Caught exception", paramResult.getMessage()));
      }
      return;
    }
    throw new FacebookException("Can't validate without a token");
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelableArray(handlersToTry, paramInt);
    paramParcel.writeInt(currentHandler);
    paramParcel.writeParcelable(pendingRequest, paramInt);
    Utility.writeStringMapToParcel(paramParcel, loggingExtras);
    Utility.writeStringMapToParcel(paramParcel, extraData);
  }
  
  public static abstract interface BackgroundProcessingListener
  {
    public abstract void onBackgroundProcessingStarted();
    
    public abstract void onBackgroundProcessingStopped();
  }
  
  public static abstract interface OnCompletedListener
  {
    public abstract void onCompleted(LoginClient.Result paramResult);
  }
  
  public static class Request
    implements Parcelable
  {
    public static final Parcelable.Creator<Request> CREATOR = new Parcelable.Creator()
    {
      public LoginClient.Request createFromParcel(Parcel paramAnonymousParcel)
      {
        return new LoginClient.Request(paramAnonymousParcel, null);
      }
      
      public LoginClient.Request[] newArray(int paramAnonymousInt)
      {
        return new LoginClient.Request[paramAnonymousInt];
      }
    };
    private final String applicationId;
    private final String authId;
    private String authType;
    private final DefaultAudience defaultAudience;
    private String deviceAuthTargetUserId;
    private String deviceRedirectUriString;
    private boolean isRerequest;
    private final LoginBehavior loginBehavior;
    private Set<String> permissions;
    
    private Request(Parcel paramParcel)
    {
      boolean bool = false;
      isRerequest = false;
      Object localObject1 = paramParcel.readString();
      Object localObject2 = null;
      if (localObject1 != null) {
        localObject1 = LoginBehavior.valueOf((String)localObject1);
      } else {
        localObject1 = null;
      }
      loginBehavior = ((LoginBehavior)localObject1);
      localObject1 = new ArrayList();
      paramParcel.readStringList((List)localObject1);
      permissions = new HashSet((Collection)localObject1);
      String str = paramParcel.readString();
      localObject1 = localObject2;
      if (str != null) {
        localObject1 = DefaultAudience.valueOf(str);
      }
      defaultAudience = ((DefaultAudience)localObject1);
      applicationId = paramParcel.readString();
      authId = paramParcel.readString();
      if (paramParcel.readByte() != 0) {
        bool = true;
      }
      isRerequest = bool;
      deviceRedirectUriString = paramParcel.readString();
      authType = paramParcel.readString();
      deviceAuthTargetUserId = paramParcel.readString();
    }
    
    public Request(LoginBehavior paramLoginBehavior, Set<String> paramSet, DefaultAudience paramDefaultAudience, String paramString1, String paramString2, String paramString3)
    {
      isRerequest = false;
      loginBehavior = paramLoginBehavior;
      if (paramSet == null) {
        paramSet = new HashSet();
      }
      permissions = paramSet;
      defaultAudience = paramDefaultAudience;
      authType = paramString1;
      applicationId = paramString2;
      authId = paramString3;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public String getApplicationId()
    {
      return applicationId;
    }
    
    public String getAuthId()
    {
      return authId;
    }
    
    public String getAuthType()
    {
      return authType;
    }
    
    public DefaultAudience getDefaultAudience()
    {
      return defaultAudience;
    }
    
    public String getDeviceAuthTargetUserId()
    {
      return deviceAuthTargetUserId;
    }
    
    public String getDeviceRedirectUriString()
    {
      return deviceRedirectUriString;
    }
    
    public LoginBehavior getLoginBehavior()
    {
      return loginBehavior;
    }
    
    public Set<String> getPermissions()
    {
      return permissions;
    }
    
    public boolean hasPublishPermission()
    {
      Iterator localIterator = permissions.iterator();
      while (localIterator.hasNext()) {
        if (LoginManager.isPublishPermission((String)localIterator.next())) {
          return true;
        }
      }
      return false;
    }
    
    public boolean isRerequest()
    {
      return isRerequest;
    }
    
    public void setAuthType(String paramString)
    {
      authType = paramString;
    }
    
    public void setDeviceAuthTargetUserId(String paramString)
    {
      deviceAuthTargetUserId = paramString;
    }
    
    public void setDeviceRedirectUriString(String paramString)
    {
      deviceRedirectUriString = paramString;
    }
    
    public void setPermissions(Set<String> paramSet)
    {
      Validate.notNull(paramSet, "permissions");
      permissions = paramSet;
    }
    
    public void setRerequest(boolean paramBoolean)
    {
      isRerequest = paramBoolean;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      Object localObject1 = loginBehavior;
      Object localObject2 = null;
      if (localObject1 != null) {
        localObject1 = ((Enum)localObject1).name();
      } else {
        localObject1 = null;
      }
      paramParcel.writeString((String)localObject1);
      paramParcel.writeStringList(new ArrayList(permissions));
      DefaultAudience localDefaultAudience = defaultAudience;
      localObject1 = localObject2;
      if (localDefaultAudience != null) {
        localObject1 = localDefaultAudience.name();
      }
      paramParcel.writeString((String)localObject1);
      paramParcel.writeString(applicationId);
      paramParcel.writeString(authId);
      paramParcel.writeByte((byte)isRerequest);
      paramParcel.writeString(deviceRedirectUriString);
      paramParcel.writeString(authType);
      paramParcel.writeString(deviceAuthTargetUserId);
    }
  }
  
  public static class Result
    implements Parcelable
  {
    public static final Parcelable.Creator<Result> CREATOR = new Parcelable.Creator()
    {
      public LoginClient.Result createFromParcel(Parcel paramAnonymousParcel)
      {
        return new LoginClient.Result(paramAnonymousParcel, null);
      }
      
      public LoginClient.Result[] newArray(int paramAnonymousInt)
      {
        return new LoginClient.Result[paramAnonymousInt];
      }
    };
    public final Code code;
    public final String errorCode;
    public final String errorMessage;
    public Map<String, String> extraData;
    public Map<String, String> loggingExtras;
    public final LoginClient.Request request;
    public final AccessToken token;
    
    private Result(Parcel paramParcel)
    {
      code = Code.valueOf(paramParcel.readString());
      token = ((AccessToken)paramParcel.readParcelable(AccessToken.class.getClassLoader()));
      errorMessage = paramParcel.readString();
      errorCode = paramParcel.readString();
      request = ((LoginClient.Request)paramParcel.readParcelable(LoginClient.Request.class.getClassLoader()));
      loggingExtras = Utility.readStringMapFromParcel(paramParcel);
      extraData = Utility.readStringMapFromParcel(paramParcel);
    }
    
    public Result(LoginClient.Request paramRequest, Code paramCode, AccessToken paramAccessToken, String paramString1, String paramString2)
    {
      Validate.notNull(paramCode, "code");
      request = paramRequest;
      token = paramAccessToken;
      errorMessage = paramString1;
      code = paramCode;
      errorCode = paramString2;
    }
    
    public static Result createCancelResult(LoginClient.Request paramRequest, String paramString)
    {
      return new Result(paramRequest, Code.CANCEL, null, paramString, null);
    }
    
    public static Result createErrorResult(LoginClient.Request paramRequest, String paramString1, String paramString2)
    {
      return createErrorResult(paramRequest, paramString1, paramString2, null);
    }
    
    public static Result createErrorResult(LoginClient.Request paramRequest, String paramString1, String paramString2, String paramString3)
    {
      paramString1 = TextUtils.join(": ", Utility.asListNoNulls(new String[] { paramString1, paramString2 }));
      return new Result(paramRequest, Code.ERROR, null, paramString1, paramString3);
    }
    
    public static Result createTokenResult(LoginClient.Request paramRequest, AccessToken paramAccessToken)
    {
      return new Result(paramRequest, Code.SUCCESS, paramAccessToken, null, null);
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(code.name());
      paramParcel.writeParcelable(token, paramInt);
      paramParcel.writeString(errorMessage);
      paramParcel.writeString(errorCode);
      paramParcel.writeParcelable(request, paramInt);
      Utility.writeStringMapToParcel(paramParcel, loggingExtras);
      Utility.writeStringMapToParcel(paramParcel, extraData);
    }
    
    public static enum Code
    {
      private final String loggingValue;
      
      static
      {
        Code localCode1 = new Code("SUCCESS", 0, "success");
        SUCCESS = localCode1;
        Code localCode2 = new Code("CANCEL", 1, "cancel");
        CANCEL = localCode2;
        Code localCode3 = new Code("ERROR", 2, "error");
        ERROR = localCode3;
        $VALUES = new Code[] { localCode1, localCode2, localCode3 };
      }
      
      private Code(String paramString)
      {
        loggingValue = paramString;
      }
      
      public String getLoggingValue()
      {
        return loggingValue;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.LoginClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */