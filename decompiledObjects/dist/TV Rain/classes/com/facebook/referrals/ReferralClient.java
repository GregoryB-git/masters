package com.facebook.referrals;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookSdk;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.CustomTab;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.Utility;
import com.facebook.login.CustomTabPrefetchHelper;
import z2;

class ReferralClient
{
  private static final int CHALLENGE_LENGTH = 20;
  private static final int CUSTOM_TAB_REQUEST_CODE = 1;
  public static final String ERROR_MESSAGE_KEY = "error_message";
  public static final String REFERRAL_CODES_KEY = "fb_referral_codes";
  private static final String REFERRAL_DIALOG = "share_referral";
  private String currentPackage;
  public String expectedChallenge;
  private Fragment fragment;
  
  public ReferralClient(Fragment paramFragment)
  {
    fragment = paramFragment;
  }
  
  private void finishReferral(int paramInt, Intent paramIntent)
  {
    if (fragment.isAdded())
    {
      FragmentActivity localFragmentActivity = fragment.getActivity();
      if (localFragmentActivity != null)
      {
        localFragmentActivity.setResult(paramInt, paramIntent);
        localFragmentActivity.finish();
      }
    }
  }
  
  private String getChromePackage()
  {
    if (currentPackage == null) {
      currentPackage = CustomTabUtils.getChromePackage();
    }
    return currentPackage;
  }
  
  public static String getDeveloperDefinedRedirectUrl()
  {
    StringBuilder localStringBuilder = z2.t("fb");
    localStringBuilder.append(FacebookSdk.getApplicationId());
    localStringBuilder.append("://authorize");
    return localStringBuilder.toString();
  }
  
  private Bundle getParameters()
  {
    Bundle localBundle = new Bundle();
    expectedChallenge = Utility.generateRandomString(20);
    localBundle.putString("redirect_uri", CustomTabUtils.getValidRedirectURI(getDeveloperDefinedRedirectUrl()));
    localBundle.putString("app_id", FacebookSdk.getApplicationId());
    localBundle.putString("state", expectedChallenge);
    return localBundle;
  }
  
  public static int getReferralRequestCode()
  {
    return CallbackManagerImpl.RequestCodeOffset.Referral.toRequestCode();
  }
  
  private boolean isCustomTabsAllowed()
  {
    boolean bool;
    if (getChromePackage() != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean tryStartReferral()
  {
    if ((fragment.getActivity() != null) && (fragment.getActivity().checkCallingOrSelfPermission("android.permission.INTERNET") == 0) && (isCustomTabsAllowed()))
    {
      Bundle localBundle = getParameters();
      if (FacebookSdk.hasCustomTabsPrefetching) {
        CustomTabPrefetchHelper.mayLaunchUrl(CustomTab.getURIForAction("share_referral", localBundle));
      }
      Intent localIntent = new Intent(fragment.getActivity(), CustomTabMainActivity.class);
      localIntent.putExtra(CustomTabMainActivity.EXTRA_ACTION, "share_referral");
      localIntent.putExtra(CustomTabMainActivity.EXTRA_PARAMS, localBundle);
      localIntent.putExtra(CustomTabMainActivity.EXTRA_CHROME_PACKAGE, getChromePackage());
      fragment.startActivityForResult(localIntent, 1);
      return true;
    }
    return false;
  }
  
  private boolean validateChallenge(Bundle paramBundle)
  {
    boolean bool;
    if (expectedChallenge != null)
    {
      paramBundle = paramBundle.getString("state");
      bool = expectedChallenge.equals(paramBundle);
      expectedChallenge = null;
    }
    else
    {
      bool = true;
    }
    return bool;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 != 1) {
      return;
    }
    paramInt1 = paramInt2;
    if (paramIntent != null)
    {
      Object localObject = paramIntent.getStringExtra(CustomTabMainActivity.EXTRA_URL);
      paramInt1 = paramInt2;
      if (localObject != null)
      {
        paramInt1 = paramInt2;
        if (((String)localObject).startsWith(CustomTabUtils.getValidRedirectURI(getDeveloperDefinedRedirectUrl())))
        {
          localObject = Utility.parseUrlQueryString(Uri.parse((String)localObject).getQuery());
          if (validateChallenge((Bundle)localObject))
          {
            paramIntent.putExtras((Bundle)localObject);
            paramInt1 = paramInt2;
          }
          else
          {
            paramInt1 = 0;
            paramIntent.putExtra("error_message", "The referral response was missing a valid challenge string.");
          }
        }
      }
    }
    finishReferral(paramInt1, paramIntent);
  }
  
  public void startReferral()
  {
    if (!tryStartReferral())
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("error_message", "Failed to open Referral dialog: Chrome custom tab could not be started. Please make sure internet permission is granted and Chrome is installed");
      finishReferral(0, localIntent);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.referrals.ReferralClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */