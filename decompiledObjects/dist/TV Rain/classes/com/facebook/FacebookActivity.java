package com.facebook;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.common.R.id;
import com.facebook.common.R.layout;
import com.facebook.core.internal.logging.dumpsys.EndToEndDumpsysHelper;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.LoginFragment;
import com.facebook.referrals.ReferralFragment;
import com.facebook.share.internal.DeviceShareDialogFragment;
import com.facebook.share.model.ShareContent;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class FacebookActivity
  extends FragmentActivity
{
  private static String FRAGMENT_TAG = "SingleFragment";
  public static String PASS_THROUGH_CANCEL_ACTION = "PassThrough";
  private static final String TAG = "com.facebook.FacebookActivity";
  private Fragment singleFragment;
  
  private void handlePassThroughError()
  {
    FacebookException localFacebookException = NativeProtocol.getExceptionFromErrorData(NativeProtocol.getMethodArgumentsFromIntent(getIntent()));
    setResult(0, NativeProtocol.createProtocolResultIntent(getIntent(), null, localFacebookException));
    finish();
  }
  
  public void dump(String paramString, @Nullable FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, @Nullable String[] paramArrayOfString)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (EndToEndDumpsysHelper.maybeDump(paramString, paramPrintWriter, paramArrayOfString)) {
        return;
      }
      super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, this);
    }
  }
  
  public Fragment getCurrentFragment()
  {
    return singleFragment;
  }
  
  public Fragment getFragment()
  {
    Intent localIntent = getIntent();
    FragmentManager localFragmentManager = getSupportFragmentManager();
    Fragment localFragment = localFragmentManager.findFragmentByTag(FRAGMENT_TAG);
    Object localObject = localFragment;
    if (localFragment == null) {
      if ("FacebookDialogFragment".equals(localIntent.getAction()))
      {
        localObject = new FacebookDialogFragment();
        ((Fragment)localObject).setRetainInstance(true);
        ((DialogFragment)localObject).show(localFragmentManager, FRAGMENT_TAG);
      }
      else if ("DeviceShareDialogFragment".equals(localIntent.getAction()))
      {
        localObject = new DeviceShareDialogFragment();
        ((Fragment)localObject).setRetainInstance(true);
        ((DeviceShareDialogFragment)localObject).setShareContent((ShareContent)localIntent.getParcelableExtra("content"));
        ((DialogFragment)localObject).show(localFragmentManager, FRAGMENT_TAG);
      }
      else if ("ReferralFragment".equals(localIntent.getAction()))
      {
        localObject = new ReferralFragment();
        ((Fragment)localObject).setRetainInstance(true);
        localFragmentManager.beginTransaction().add(R.id.com_facebook_fragment_container, (Fragment)localObject, FRAGMENT_TAG).commit();
      }
      else
      {
        localObject = new LoginFragment();
        ((Fragment)localObject).setRetainInstance(true);
        localFragmentManager.beginTransaction().add(R.id.com_facebook_fragment_container, (Fragment)localObject, FRAGMENT_TAG).commit();
      }
    }
    return (Fragment)localObject;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    Fragment localFragment = singleFragment;
    if (localFragment != null) {
      localFragment.onConfigurationChanged(paramConfiguration);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    if (!FacebookSdk.isInitialized())
    {
      Utility.logd(TAG, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
      FacebookSdk.sdkInitialize(getApplicationContext());
    }
    setContentView(R.layout.com_facebook_activity_layout);
    if (PASS_THROUGH_CANCEL_ACTION.equals(paramBundle.getAction()))
    {
      handlePassThroughError();
      return;
    }
    singleFragment = getFragment();
  }
}

/* Location:
 * Qualified Name:     com.facebook.FacebookActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */