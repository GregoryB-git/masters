package com.facebook.login;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.Utility;
import com.facebook.internal.WebDialog;
import com.facebook.internal.WebDialog.Builder;
import com.facebook.internal.WebDialog.OnCompleteListener;

class WebViewLoginMethodHandler
  extends WebLoginMethodHandler
{
  public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new Parcelable.Creator()
  {
    public WebViewLoginMethodHandler createFromParcel(Parcel paramAnonymousParcel)
    {
      return new WebViewLoginMethodHandler(paramAnonymousParcel);
    }
    
    public WebViewLoginMethodHandler[] newArray(int paramAnonymousInt)
    {
      return new WebViewLoginMethodHandler[paramAnonymousInt];
    }
  };
  private String e2e;
  private WebDialog loginDialog;
  
  public WebViewLoginMethodHandler(Parcel paramParcel)
  {
    super(paramParcel);
    e2e = paramParcel.readString();
  }
  
  public WebViewLoginMethodHandler(LoginClient paramLoginClient)
  {
    super(paramLoginClient);
  }
  
  public void cancel()
  {
    WebDialog localWebDialog = loginDialog;
    if (localWebDialog != null)
    {
      localWebDialog.cancel();
      loginDialog = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getNameForLogging()
  {
    return "web_view";
  }
  
  public AccessTokenSource getTokenSource()
  {
    return AccessTokenSource.WEB_VIEW;
  }
  
  public boolean needsInternetPermission()
  {
    return true;
  }
  
  public void onWebDialogComplete(LoginClient.Request paramRequest, Bundle paramBundle, FacebookException paramFacebookException)
  {
    super.onComplete(paramRequest, paramBundle, paramFacebookException);
  }
  
  public int tryAuthorize(final LoginClient.Request paramRequest)
  {
    Bundle localBundle = getParameters(paramRequest);
    WebDialog.OnCompleteListener local1 = new WebDialog.OnCompleteListener()
    {
      public void onComplete(Bundle paramAnonymousBundle, FacebookException paramAnonymousFacebookException)
      {
        onWebDialogComplete(paramRequest, paramAnonymousBundle, paramAnonymousFacebookException);
      }
    };
    Object localObject = LoginClient.getE2E();
    e2e = ((String)localObject);
    addLoggingExtra("e2e", localObject);
    localObject = loginClient.getActivity();
    boolean bool = Utility.isChromeOS((Context)localObject);
    loginDialog = new AuthDialogBuilder((Context)localObject, paramRequest.getApplicationId(), localBundle).setE2E(e2e).setIsChromeOS(bool).setAuthType(paramRequest.getAuthType()).setLoginBehavior(paramRequest.getLoginBehavior()).setOnCompleteListener(local1).build();
    paramRequest = new FacebookDialogFragment();
    paramRequest.setRetainInstance(true);
    paramRequest.setDialog(loginDialog);
    paramRequest.show(((FragmentActivity)localObject).getSupportFragmentManager(), "FacebookDialogFragment");
    return 1;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(e2e);
  }
  
  public static class AuthDialogBuilder
    extends WebDialog.Builder
  {
    private static final String OAUTH_DIALOG = "oauth";
    private String authType;
    private String e2e;
    private LoginBehavior loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
    private String redirect_uri = "fbconnect://success";
    
    public AuthDialogBuilder(Context paramContext, String paramString, Bundle paramBundle)
    {
      super(paramString, "oauth", paramBundle);
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
}

/* Location:
 * Qualified Name:     com.facebook.login.WebViewLoginMethodHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */