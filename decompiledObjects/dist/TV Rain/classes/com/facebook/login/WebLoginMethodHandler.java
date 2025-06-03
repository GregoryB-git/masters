package com.facebook.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.internal.Utility;
import java.util.Locale;
import z2;

abstract class WebLoginMethodHandler
  extends LoginMethodHandler
{
  private static final String WEB_VIEW_AUTH_HANDLER_STORE = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY";
  private static final String WEB_VIEW_AUTH_HANDLER_TOKEN_KEY = "TOKEN";
  private String e2e;
  
  public WebLoginMethodHandler(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  public WebLoginMethodHandler(LoginClient paramLoginClient)
  {
    super(paramLoginClient);
  }
  
  private String loadCookieToken()
  {
    return loginClient.getActivity().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
  }
  
  private void saveCookieToken(String paramString)
  {
    loginClient.getActivity().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", paramString).apply();
  }
  
  public Bundle addExtraParameters(Bundle paramBundle, LoginClient.Request paramRequest)
  {
    paramBundle.putString("redirect_uri", getRedirectUrl());
    paramBundle.putString("client_id", paramRequest.getApplicationId());
    paramBundle.putString("e2e", LoginClient.getE2E());
    paramBundle.putString("response_type", "token,signed_request,graph_domain");
    paramBundle.putString("return_scopes", "true");
    paramBundle.putString("auth_type", paramRequest.getAuthType());
    paramBundle.putString("login_behavior", paramRequest.getLoginBehavior().name());
    paramBundle.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[] { FacebookSdk.getSdkVersion() }));
    if (getSSODevice() != null) {
      paramBundle.putString("sso", getSSODevice());
    }
    if (FacebookSdk.hasCustomTabsPrefetching) {
      paramRequest = "1";
    } else {
      paramRequest = "0";
    }
    paramBundle.putString("cct_prefetching", paramRequest);
    return paramBundle;
  }
  
  public Bundle getParameters(LoginClient.Request paramRequest)
  {
    Bundle localBundle = new Bundle();
    if (!Utility.isNullOrEmpty(paramRequest.getPermissions()))
    {
      str = TextUtils.join(",", paramRequest.getPermissions());
      localBundle.putString("scope", str);
      addLoggingExtra("scope", str);
    }
    localBundle.putString("default_audience", paramRequest.getDefaultAudience().getNativeProtocolAudience());
    localBundle.putString("state", getClientState(paramRequest.getAuthId()));
    paramRequest = AccessToken.getCurrentAccessToken();
    if (paramRequest != null) {
      paramRequest = paramRequest.getToken();
    } else {
      paramRequest = null;
    }
    String str = "1";
    if ((paramRequest != null) && (paramRequest.equals(loadCookieToken())))
    {
      localBundle.putString("access_token", paramRequest);
      addLoggingExtra("access_token", "1");
    }
    else
    {
      Utility.clearFacebookCookies(loginClient.getActivity());
      addLoggingExtra("access_token", "0");
    }
    localBundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
    if (FacebookSdk.getAutoLogAppEventsEnabled()) {
      paramRequest = str;
    } else {
      paramRequest = "0";
    }
    localBundle.putString("ies", paramRequest);
    return localBundle;
  }
  
  public String getRedirectUrl()
  {
    StringBuilder localStringBuilder = z2.t("fb");
    localStringBuilder.append(FacebookSdk.getApplicationId());
    localStringBuilder.append("://authorize");
    return localStringBuilder.toString();
  }
  
  public String getSSODevice()
  {
    return null;
  }
  
  public abstract AccessTokenSource getTokenSource();
  
  public void onComplete(LoginClient.Request paramRequest, Bundle paramBundle, FacebookException paramFacebookException)
  {
    e2e = null;
    if (paramBundle != null)
    {
      if (paramBundle.containsKey("e2e")) {
        e2e = paramBundle.getString("e2e");
      }
      try
      {
        paramBundle = LoginMethodHandler.createAccessTokenFromWebBundle(paramRequest.getPermissions(), paramBundle, getTokenSource(), paramRequest.getApplicationId());
        paramRequest = LoginClient.Result.createTokenResult(loginClient.getPendingRequest(), paramBundle);
        CookieSyncManager.createInstance(loginClient.getActivity()).sync();
        saveCookieToken(paramBundle.getToken());
      }
      catch (FacebookException paramRequest)
      {
        paramRequest = LoginClient.Result.createErrorResult(loginClient.getPendingRequest(), null, paramRequest.getMessage());
      }
    }
    else if ((paramFacebookException instanceof FacebookOperationCanceledException))
    {
      paramRequest = LoginClient.Result.createCancelResult(loginClient.getPendingRequest(), "User canceled log in.");
    }
    else
    {
      e2e = null;
      paramRequest = paramFacebookException.getMessage();
      if ((paramFacebookException instanceof FacebookServiceException))
      {
        paramRequest = ((FacebookServiceException)paramFacebookException).getRequestError();
        paramBundle = String.format(Locale.ROOT, "%d", new Object[] { Integer.valueOf(paramRequest.getErrorCode()) });
        paramRequest = paramRequest.toString();
      }
      else
      {
        paramBundle = null;
      }
      paramRequest = LoginClient.Result.createErrorResult(loginClient.getPendingRequest(), null, paramRequest, paramBundle);
    }
    if (!Utility.isNullOrEmpty(e2e)) {
      logWebLoginCompleted(e2e);
    }
    loginClient.completeAndValidate(paramRequest);
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.WebLoginMethodHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */