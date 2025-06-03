package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import androidx.fragment.app.Fragment;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import java.util.Collection;

abstract class NativeAppLoginMethodHandler
  extends LoginMethodHandler
{
  public NativeAppLoginMethodHandler(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  public NativeAppLoginMethodHandler(LoginClient paramLoginClient)
  {
    super(paramLoginClient);
  }
  
  private String getError(Bundle paramBundle)
  {
    String str1 = paramBundle.getString("error");
    String str2 = str1;
    if (str1 == null) {
      str2 = paramBundle.getString("error_type");
    }
    return str2;
  }
  
  private String getErrorMessage(Bundle paramBundle)
  {
    String str1 = paramBundle.getString("error_message");
    String str2 = str1;
    if (str1 == null) {
      str2 = paramBundle.getString("error_description");
    }
    return str2;
  }
  
  private LoginClient.Result handleResultCancel(LoginClient.Request paramRequest, Intent paramIntent)
  {
    Bundle localBundle = paramIntent.getExtras();
    String str = getError(localBundle);
    if (localBundle.get("error_code") != null) {
      paramIntent = localBundle.get("error_code").toString();
    } else {
      paramIntent = null;
    }
    if ("CONNECTION_FAILURE".equals(paramIntent)) {
      return LoginClient.Result.createErrorResult(paramRequest, str, getErrorMessage(localBundle), paramIntent);
    }
    return LoginClient.Result.createCancelResult(paramRequest, str);
  }
  
  private LoginClient.Result handleResultOk(LoginClient.Request paramRequest, Intent paramIntent)
  {
    Bundle localBundle = paramIntent.getExtras();
    String str1 = getError(localBundle);
    if (localBundle.get("error_code") != null) {
      paramIntent = localBundle.get("error_code").toString();
    } else {
      paramIntent = null;
    }
    String str2 = getErrorMessage(localBundle);
    String str3 = localBundle.getString("e2e");
    if (!Utility.isNullOrEmpty(str3)) {
      logWebLoginCompleted(str3);
    }
    if ((str1 == null) && (paramIntent == null) && (str2 == null)) {
      try
      {
        paramIntent = LoginClient.Result.createTokenResult(paramRequest, LoginMethodHandler.createAccessTokenFromWebBundle(paramRequest.getPermissions(), localBundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB, paramRequest.getApplicationId()));
        return paramIntent;
      }
      catch (FacebookException paramIntent)
      {
        return LoginClient.Result.createErrorResult(paramRequest, null, paramIntent.getMessage());
      }
    }
    if (str1.equals("logged_out"))
    {
      CustomTabLoginMethodHandler.calledThroughLoggedOutAppSwitch = true;
      return null;
    }
    if (ServerProtocol.errorsProxyAuthDisabled.contains(str1)) {
      return null;
    }
    if (ServerProtocol.errorsUserCanceled.contains(str1)) {
      return LoginClient.Result.createCancelResult(paramRequest, null);
    }
    return LoginClient.Result.createErrorResult(paramRequest, str1, str2, paramIntent);
  }
  
  public boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    LoginClient.Request localRequest = loginClient.getPendingRequest();
    if (paramIntent == null) {
      paramIntent = LoginClient.Result.createCancelResult(localRequest, "Operation canceled");
    } else if (paramInt2 == 0) {
      paramIntent = handleResultCancel(localRequest, paramIntent);
    } else if (paramInt2 != -1) {
      paramIntent = LoginClient.Result.createErrorResult(localRequest, "Unexpected resultCode from authorization.", null);
    } else {
      paramIntent = handleResultOk(localRequest, paramIntent);
    }
    if (paramIntent != null) {
      loginClient.completeAndValidate(paramIntent);
    } else {
      loginClient.tryNextHandler();
    }
    return true;
  }
  
  public abstract int tryAuthorize(LoginClient.Request paramRequest);
  
  public boolean tryIntent(Intent paramIntent, int paramInt)
  {
    if (paramIntent == null) {
      return false;
    }
    try
    {
      loginClient.getFragment().startActivityForResult(paramIntent, paramInt);
      return true;
    }
    catch (ActivityNotFoundException paramIntent) {}
    return false;
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.NativeAppLoginMethodHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */