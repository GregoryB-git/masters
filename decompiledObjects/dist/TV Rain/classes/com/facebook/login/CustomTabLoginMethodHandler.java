package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.fragment.app.Fragment;
import com.facebook.AccessTokenSource;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.internal.CustomTab;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.Utility;
import org.json.JSONException;
import org.json.JSONObject;

public class CustomTabLoginMethodHandler
  extends WebLoginMethodHandler
{
  private static final int API_EC_DIALOG_CANCEL = 4201;
  private static final int CHALLENGE_LENGTH = 20;
  public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new Parcelable.Creator()
  {
    public CustomTabLoginMethodHandler createFromParcel(Parcel paramAnonymousParcel)
    {
      return new CustomTabLoginMethodHandler(paramAnonymousParcel);
    }
    
    public CustomTabLoginMethodHandler[] newArray(int paramAnonymousInt)
    {
      return new CustomTabLoginMethodHandler[paramAnonymousInt];
    }
  };
  private static final int CUSTOM_TAB_REQUEST_CODE = 1;
  private static final String OAUTH_DIALOG = "oauth";
  public static boolean calledThroughLoggedOutAppSwitch = false;
  private String currentPackage;
  private String expectedChallenge;
  private String validRedirectURI = "";
  
  public CustomTabLoginMethodHandler(Parcel paramParcel)
  {
    super(paramParcel);
    expectedChallenge = paramParcel.readString();
  }
  
  public CustomTabLoginMethodHandler(LoginClient paramLoginClient)
  {
    super(paramLoginClient);
    expectedChallenge = Utility.generateRandomString(20);
    calledThroughLoggedOutAppSwitch = false;
    validRedirectURI = CustomTabUtils.getValidRedirectURI(getDeveloperDefinedRedirectURI());
  }
  
  private String getChromePackage()
  {
    String str = currentPackage;
    if (str != null) {
      return str;
    }
    str = CustomTabUtils.getChromePackage();
    currentPackage = str;
    return str;
  }
  
  private String getDeveloperDefinedRedirectURI()
  {
    return super.getRedirectUrl();
  }
  
  private void onCustomTabComplete(String paramString, LoginClient.Request paramRequest)
  {
    Bundle localBundle;
    String str1;
    String str2;
    if ((paramString != null) && ((paramString.startsWith("fbconnect://cct.")) || (paramString.startsWith(super.getRedirectUrl()))))
    {
      paramString = Uri.parse(paramString);
      localBundle = Utility.parseUrlQueryString(paramString.getQuery());
      localBundle.putAll(Utility.parseUrlQueryString(paramString.getFragment()));
      if (!validateChallengeParam(localBundle))
      {
        super.onComplete(paramRequest, null, new FacebookException("Invalid state parameter"));
        return;
      }
      paramString = localBundle.getString("error");
      str1 = paramString;
      if (paramString == null) {
        str1 = localBundle.getString("error_type");
      }
      str2 = localBundle.getString("error_msg");
      paramString = str2;
      if (str2 == null) {
        paramString = localBundle.getString("error_message");
      }
      str2 = paramString;
      if (paramString == null) {
        str2 = localBundle.getString("error_description");
      }
      paramString = localBundle.getString("error_code");
      if (Utility.isNullOrEmpty(paramString)) {}
    }
    try
    {
      i = Integer.parseInt(paramString);
    }
    catch (NumberFormatException paramString)
    {
      int i;
      for (;;) {}
    }
    i = -1;
    if ((Utility.isNullOrEmpty(str1)) && (Utility.isNullOrEmpty(str2)) && (i == -1)) {
      super.onComplete(paramRequest, localBundle, null);
    } else if ((str1 != null) && ((str1.equals("access_denied")) || (str1.equals("OAuthAccessDeniedException")))) {
      super.onComplete(paramRequest, null, new FacebookOperationCanceledException());
    } else if (i == 4201) {
      super.onComplete(paramRequest, null, new FacebookOperationCanceledException());
    } else {
      super.onComplete(paramRequest, null, new FacebookServiceException(new FacebookRequestError(i, str1, str2), str2));
    }
  }
  
  private boolean validateChallengeParam(Bundle paramBundle)
  {
    try
    {
      String str = paramBundle.getString("state");
      if (str == null) {
        return false;
      }
      paramBundle = new org/json/JSONObject;
      paramBundle.<init>(str);
      boolean bool = paramBundle.getString("7_challenge").equals(expectedChallenge);
      return bool;
    }
    catch (JSONException paramBundle) {}
    return false;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getNameForLogging()
  {
    return "custom_tab";
  }
  
  public String getRedirectUrl()
  {
    return validRedirectURI;
  }
  
  public String getSSODevice()
  {
    return "chrome_custom_tab";
  }
  
  public AccessTokenSource getTokenSource()
  {
    return AccessTokenSource.CHROME_CUSTOM_TAB;
  }
  
  public boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramIntent != null) && (paramIntent.getBooleanExtra(CustomTabMainActivity.NO_ACTIVITY_EXCEPTION, false))) {
      return super.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
    if (paramInt1 != 1) {
      return super.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
    LoginClient.Request localRequest = loginClient.getPendingRequest();
    if (paramInt2 == -1)
    {
      onCustomTabComplete(paramIntent.getStringExtra(CustomTabMainActivity.EXTRA_URL), localRequest);
      return true;
    }
    super.onComplete(localRequest, null, new FacebookOperationCanceledException());
    return false;
  }
  
  public void putChallengeParam(JSONObject paramJSONObject)
    throws JSONException
  {
    paramJSONObject.put("7_challenge", expectedChallenge);
  }
  
  public int tryAuthorize(LoginClient.Request paramRequest)
  {
    if (getRedirectUrl().isEmpty()) {
      return 0;
    }
    paramRequest = addExtraParameters(getParameters(paramRequest), paramRequest);
    if (calledThroughLoggedOutAppSwitch) {
      paramRequest.putString("cct_over_app_switch", "1");
    }
    if (FacebookSdk.hasCustomTabsPrefetching) {
      CustomTabPrefetchHelper.mayLaunchUrl(CustomTab.getURIForAction("oauth", paramRequest));
    }
    Intent localIntent = new Intent(loginClient.getActivity(), CustomTabMainActivity.class);
    localIntent.putExtra(CustomTabMainActivity.EXTRA_ACTION, "oauth");
    localIntent.putExtra(CustomTabMainActivity.EXTRA_PARAMS, paramRequest);
    localIntent.putExtra(CustomTabMainActivity.EXTRA_CHROME_PACKAGE, getChromePackage());
    loginClient.getFragment().startActivityForResult(localIntent, 1);
    return 1;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(expectedChallenge);
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.CustomTabLoginMethodHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */