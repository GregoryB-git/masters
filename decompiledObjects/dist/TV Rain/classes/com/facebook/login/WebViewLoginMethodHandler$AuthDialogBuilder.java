package com.facebook.login;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.internal.WebDialog;
import com.facebook.internal.WebDialog.Builder;

class WebViewLoginMethodHandler$AuthDialogBuilder
  extends WebDialog.Builder
{
  private static final String OAUTH_DIALOG = "oauth";
  private String authType;
  private String e2e;
  private LoginBehavior loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
  private String redirect_uri = "fbconnect://success";
  
  public WebViewLoginMethodHandler$AuthDialogBuilder(Context paramContext, String paramString, Bundle paramBundle)
  {
    super(paramContext, paramString, "oauth", paramBundle);
  }
  
  public WebDialog build()
  {
    Bundle localBundle = getParameters();
    localBundle.putString("redirect_uri", redirect_uri);
    localBundle.putString("client_id", getApplicationId());
    localBundle.putString("e2e", e2e);
    localBundle.putString("response_type", "token,signed_request,graph_domain");
    localBundle.putString("return_scopes", "true");
    localBundle.putString("auth_type", authType);
    localBundle.putString("login_behavior", loginBehavior.name());
    return WebDialog.newInstance(getContext(), "oauth", localBundle, getTheme(), getListener());
  }
  
  public AuthDialogBuilder setAuthType(String paramString)
  {
    authType = paramString;
    return this;
  }
  
  public AuthDialogBuilder setE2E(String paramString)
  {
    e2e = paramString;
    return this;
  }
  
  public AuthDialogBuilder setIsChromeOS(boolean paramBoolean)
  {
    String str;
    if (paramBoolean) {
      str = "fbconnect://chrome_os_success";
    } else {
      str = "fbconnect://success";
    }
    redirect_uri = str;
    return this;
  }
  
  public AuthDialogBuilder setIsRerequest(boolean paramBoolean)
  {
    return this;
  }
  
  public AuthDialogBuilder setLoginBehavior(LoginBehavior paramLoginBehavior)
  {
    loginBehavior = paramLoginBehavior;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.WebViewLoginMethodHandler.AuthDialogBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */