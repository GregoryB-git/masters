package com.facebook.login.widget;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.AccessToken;
import com.facebook.FacebookButtonBase;
import com.facebook.Profile;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.LoginManager;
import com.facebook.login.R.string;

public class LoginButton$LoginClickListener
  implements View.OnClickListener
{
  public LoginButton$LoginClickListener(LoginButton paramLoginButton) {}
  
  public LoginManager getLoginManager()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      LoginManager localLoginManager = LoginManager.getInstance();
      localLoginManager.setDefaultAudience(this$0.getDefaultAudience());
      localLoginManager.setLoginBehavior(this$0.getLoginBehavior());
      localLoginManager.setAuthType(this$0.getAuthType());
      return localLoginManager;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return null;
  }
  
  public void onClick(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      LoginButton.access$300(this$0, paramView);
      AccessToken localAccessToken = AccessToken.getCurrentAccessToken();
      if (AccessToken.isCurrentAccessTokenActive()) {
        performLogout(this$0.getContext());
      } else {
        performLogin();
      }
      paramView = new com/facebook/appevents/InternalAppEventsLogger;
      paramView.<init>(this$0.getContext());
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      int i = 0;
      if (localAccessToken != null) {
        j = 0;
      } else {
        j = 1;
      }
      localBundle.putInt("logging_in", j);
      int j = i;
      if (AccessToken.isCurrentAccessTokenActive()) {
        j = 1;
      }
      localBundle.putInt("access_token_expired", j);
      paramView.logEventImplicitly(LoginButton.access$400(this$0), localBundle);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, this);
    }
  }
  
  public void performLogin()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      LoginManager localLoginManager = getLoginManager();
      if (this$0.getFragment() != null) {
        localLoginManager.logIn(this$0.getFragment(), LoginButton.LoginButtonProperties.access$600(LoginButton.access$500(this$0)));
      } else if (this$0.getNativeFragment() != null) {
        localLoginManager.logIn(this$0.getNativeFragment(), LoginButton.LoginButtonProperties.access$600(LoginButton.access$500(this$0)));
      } else {
        localLoginManager.logIn(LoginButton.access$700(this$0), LoginButton.LoginButtonProperties.access$600(LoginButton.access$500(this$0)));
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  public void performLogout(Context paramContext)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      LoginManager localLoginManager = getLoginManager();
      if (LoginButton.access$800(this$0))
      {
        String str1 = this$0.getResources().getString(R.string.com_facebook_loginview_log_out_action);
        String str2 = this$0.getResources().getString(R.string.com_facebook_loginview_cancel_action);
        Object localObject = Profile.getCurrentProfile();
        if ((localObject != null) && (((Profile)localObject).getName() != null)) {
          localObject = String.format(this$0.getResources().getString(R.string.com_facebook_loginview_logged_in_as), new Object[] { ((Profile)localObject).getName() });
        } else {
          localObject = this$0.getResources().getString(R.string.com_facebook_loginview_logged_in_using_facebook);
        }
        AlertDialog.Builder localBuilder = new android/app/AlertDialog$Builder;
        localBuilder.<init>(paramContext);
        paramContext = localBuilder.setMessage((CharSequence)localObject).setCancelable(true);
        localObject = new com/facebook/login/widget/LoginButton$LoginClickListener$1;
        ((1)localObject).<init>(this, localLoginManager);
        paramContext.setPositiveButton(str1, (DialogInterface.OnClickListener)localObject).setNegativeButton(str2, null);
        localBuilder.create().show();
      }
      else
      {
        localLoginManager.logOut();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.widget.LoginButton.LoginClickListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */