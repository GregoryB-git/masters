package com.facebook.referrals;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.BaseBundle;
import com.facebook.CallbackManager;
import com.facebook.FacebookActivity;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import org.json.JSONArray;
import org.json.JSONException;

public class ReferralManager
{
  private static volatile ReferralManager instance;
  private ReferralLogger logger;
  
  public ReferralManager()
  {
    Validate.sdkInitialized();
  }
  
  public static ReferralManager getInstance()
  {
    if (instance == null) {
      try
      {
        if (instance == null)
        {
          ReferralManager localReferralManager = new com/facebook/referrals/ReferralManager;
          localReferralManager.<init>();
          instance = localReferralManager;
        }
      }
      finally {}
    }
    return instance;
  }
  
  private ReferralLogger getLogger(Context paramContext)
  {
    if (paramContext == null) {
      paramContext = FacebookSdk.getApplicationContext();
    }
    if (paramContext == null) {
      return null;
    }
    if (logger == null) {
      logger = new ReferralLogger(paramContext, FacebookSdk.getApplicationId());
    }
    return logger;
  }
  
  private static boolean resolveIntent(Intent paramIntent)
  {
    PackageManager localPackageManager = FacebookSdk.getApplicationContext().getPackageManager();
    boolean bool = false;
    if (localPackageManager.resolveActivity(paramIntent, 0) != null) {
      bool = true;
    }
    return bool;
  }
  
  private void startReferralImpl(StartActivityDelegate paramStartActivityDelegate)
  {
    ReferralLogger localReferralLogger = getLogger(paramStartActivityDelegate.getActivityContext());
    if (localReferralLogger != null) {
      localReferralLogger.logStartReferral();
    }
    if (!tryFacebookActivity(paramStartActivityDelegate))
    {
      paramStartActivityDelegate = new FacebookException("Failed to open Referral dialog: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
      if (localReferralLogger != null) {
        localReferralLogger.logError(paramStartActivityDelegate);
      }
      throw paramStartActivityDelegate;
    }
  }
  
  private boolean tryFacebookActivity(StartActivityDelegate paramStartActivityDelegate)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
    localIntent.setAction("ReferralFragment");
    if (!resolveIntent(localIntent)) {
      return false;
    }
    try
    {
      paramStartActivityDelegate.startActivityForResult(localIntent, CallbackManagerImpl.RequestCodeOffset.Referral.toRequestCode());
      return true;
    }
    catch (ActivityNotFoundException paramStartActivityDelegate) {}
    return false;
  }
  
  public boolean onActivityResult(int paramInt, Intent paramIntent, FacebookCallback<ReferralResult> paramFacebookCallback)
  {
    if ((paramInt == -1) && (paramIntent != null)) {}
    try
    {
      if ((paramIntent.getExtras() != null) && (paramIntent.getExtras().containsKey("fb_referral_codes")))
      {
        paramIntent = paramIntent.getExtras().getString("fb_referral_codes");
        localObject = new org/json/JSONArray;
        ((JSONArray)localObject).<init>(paramIntent);
        paramIntent = Utility.convertJSONArrayToList((JSONArray)localObject);
        localObject = new com/facebook/referrals/ReferralResult;
        ((ReferralResult)localObject).<init>(paramIntent);
        paramIntent = null;
        break label153;
      }
      if (paramInt == 0)
      {
        if ((paramIntent != null) && (paramIntent.getExtras() != null) && (paramIntent.getExtras().containsKey("error_message")))
        {
          paramIntent = new FacebookException(paramIntent.getExtras().getString("error_message"));
        }
        else
        {
          paramIntent = null;
          localObject = paramIntent;
          break label153;
        }
      }
      else {
        paramIntent = new FacebookException("Unexpected call to ReferralManager.onActivityResult");
      }
    }
    catch (JSONException paramIntent)
    {
      paramIntent = new FacebookException("Unable to parse referral codes from response");
    }
    Object localObject = null;
    label153:
    ReferralLogger localReferralLogger = getLogger(null);
    if (localReferralLogger != null) {
      if (localObject != null) {
        localReferralLogger.logSuccess();
      } else if (paramIntent != null) {
        localReferralLogger.logError(paramIntent);
      } else {
        localReferralLogger.logCancel();
      }
    }
    if (localObject != null) {
      paramFacebookCallback.onSuccess(localObject);
    } else if (paramIntent != null) {
      paramFacebookCallback.onError(paramIntent);
    } else {
      paramFacebookCallback.onCancel();
    }
    return true;
  }
  
  public void registerCallback(CallbackManager paramCallbackManager, final FacebookCallback<ReferralResult> paramFacebookCallback)
  {
    if ((paramCallbackManager instanceof CallbackManagerImpl))
    {
      ((CallbackManagerImpl)paramCallbackManager).registerCallback(ReferralClient.getReferralRequestCode(), new CallbackManagerImpl.Callback()
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
  
  public void startReferral(Activity paramActivity)
  {
    startReferralImpl(new ActivityStartActivityDelegate(paramActivity));
  }
  
  public void startReferral(android.app.Fragment paramFragment)
  {
    startReferralImpl(new FragmentStartActivityDelegate(new FragmentWrapper(paramFragment)));
  }
  
  public void startReferral(androidx.fragment.app.Fragment paramFragment)
  {
    startReferralImpl(new FragmentStartActivityDelegate(new FragmentWrapper(paramFragment)));
  }
  
  public void startReferral(FragmentWrapper paramFragmentWrapper)
  {
    startReferralImpl(new FragmentStartActivityDelegate(paramFragmentWrapper));
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
}

/* Location:
 * Qualified Name:     com.facebook.referrals.ReferralManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */