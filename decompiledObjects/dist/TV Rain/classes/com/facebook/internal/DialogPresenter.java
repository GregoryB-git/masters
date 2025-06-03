package com.facebook.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.InternalAppEventsLogger;
import java.util.UUID;
import z2;

public class DialogPresenter
{
  public static boolean canPresentNativeDialogWithFeature(DialogFeature paramDialogFeature)
  {
    boolean bool;
    if (getProtocolVersionForNativeDialog(paramDialogFeature).getProtocolVersion() != -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean canPresentWebFallbackDialogWithFeature(DialogFeature paramDialogFeature)
  {
    boolean bool;
    if (getDialogWebFallbackUri(paramDialogFeature) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static Uri getDialogWebFallbackUri(DialogFeature paramDialogFeature)
  {
    String str = paramDialogFeature.name();
    paramDialogFeature = paramDialogFeature.getAction();
    paramDialogFeature = FetchedAppSettings.getDialogFeatureConfig(FacebookSdk.getApplicationId(), paramDialogFeature, str);
    if (paramDialogFeature != null) {
      paramDialogFeature = paramDialogFeature.getFallbackUrl();
    } else {
      paramDialogFeature = null;
    }
    return paramDialogFeature;
  }
  
  public static NativeProtocol.ProtocolVersionQueryResult getProtocolVersionForNativeDialog(DialogFeature paramDialogFeature)
  {
    String str1 = FacebookSdk.getApplicationId();
    String str2 = paramDialogFeature.getAction();
    return NativeProtocol.getLatestAvailableProtocolVersionForAction(str2, getVersionSpecForFeature(str1, str2, paramDialogFeature));
  }
  
  private static int[] getVersionSpecForFeature(String paramString1, String paramString2, DialogFeature paramDialogFeature)
  {
    paramString1 = FetchedAppSettings.getDialogFeatureConfig(paramString1, paramString2, paramDialogFeature.name());
    if (paramString1 != null) {
      return paramString1.getVersionSpec();
    }
    return new int[] { paramDialogFeature.getMinVersion() };
  }
  
  public static void logDialogActivity(Context paramContext, String paramString1, String paramString2)
  {
    paramContext = new InternalAppEventsLogger(paramContext);
    Bundle localBundle = new Bundle();
    localBundle.putString("fb_dialog_outcome", paramString2);
    paramContext.logEventImplicitly(paramString1, localBundle);
  }
  
  public static void present(AppCall paramAppCall, Activity paramActivity)
  {
    paramActivity.startActivityForResult(paramAppCall.getRequestIntent(), paramAppCall.getRequestCode());
    paramAppCall.setPending();
  }
  
  public static void present(AppCall paramAppCall, FragmentWrapper paramFragmentWrapper)
  {
    paramFragmentWrapper.startActivityForResult(paramAppCall.getRequestIntent(), paramAppCall.getRequestCode());
    paramAppCall.setPending();
  }
  
  public static void setupAppCallForCannotShowError(AppCall paramAppCall)
  {
    setupAppCallForValidationError(paramAppCall, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
  }
  
  public static void setupAppCallForCustomTabDialog(AppCall paramAppCall, String paramString, Bundle paramBundle)
  {
    Validate.hasCustomTabRedirectActivity(FacebookSdk.getApplicationContext(), CustomTabUtils.getDefaultRedirectURI());
    Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
    Intent localIntent = new Intent(FacebookSdk.getApplicationContext(), CustomTabMainActivity.class);
    localIntent.putExtra(CustomTabMainActivity.EXTRA_ACTION, paramString);
    localIntent.putExtra(CustomTabMainActivity.EXTRA_PARAMS, paramBundle);
    localIntent.putExtra(CustomTabMainActivity.EXTRA_CHROME_PACKAGE, CustomTabUtils.getChromePackage());
    NativeProtocol.setupProtocolRequestIntent(localIntent, paramAppCall.getCallId().toString(), paramString, NativeProtocol.getLatestKnownVersion(), null);
    paramAppCall.setRequestIntent(localIntent);
  }
  
  public static void setupAppCallForErrorResult(AppCall paramAppCall, FacebookException paramFacebookException)
  {
    if (paramFacebookException == null) {
      return;
    }
    Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
    Intent localIntent = new Intent();
    localIntent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
    localIntent.setAction(FacebookActivity.PASS_THROUGH_CANCEL_ACTION);
    NativeProtocol.setupProtocolRequestIntent(localIntent, paramAppCall.getCallId().toString(), null, NativeProtocol.getLatestKnownVersion(), NativeProtocol.createBundleForException(paramFacebookException));
    paramAppCall.setRequestIntent(localIntent);
  }
  
  public static void setupAppCallForNativeDialog(AppCall paramAppCall, ParameterProvider paramParameterProvider, DialogFeature paramDialogFeature)
  {
    Context localContext = FacebookSdk.getApplicationContext();
    String str = paramDialogFeature.getAction();
    NativeProtocol.ProtocolVersionQueryResult localProtocolVersionQueryResult = getProtocolVersionForNativeDialog(paramDialogFeature);
    int i = localProtocolVersionQueryResult.getProtocolVersion();
    if (i != -1)
    {
      if (NativeProtocol.isVersionCompatibleWithBucketedIntent(i)) {
        paramParameterProvider = paramParameterProvider.getParameters();
      } else {
        paramParameterProvider = paramParameterProvider.getLegacyParameters();
      }
      paramDialogFeature = paramParameterProvider;
      if (paramParameterProvider == null) {
        paramDialogFeature = new Bundle();
      }
      paramParameterProvider = NativeProtocol.createPlatformActivityIntent(localContext, paramAppCall.getCallId().toString(), str, localProtocolVersionQueryResult, paramDialogFeature);
      if (paramParameterProvider != null)
      {
        paramAppCall.setRequestIntent(paramParameterProvider);
        return;
      }
      throw new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
    }
    throw new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
  }
  
  public static void setupAppCallForValidationError(AppCall paramAppCall, FacebookException paramFacebookException)
  {
    setupAppCallForErrorResult(paramAppCall, paramFacebookException);
  }
  
  public static void setupAppCallForWebDialog(AppCall paramAppCall, String paramString, Bundle paramBundle)
  {
    Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
    Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
    Bundle localBundle = new Bundle();
    localBundle.putString("action", paramString);
    localBundle.putBundle("params", paramBundle);
    paramBundle = new Intent();
    NativeProtocol.setupProtocolRequestIntent(paramBundle, paramAppCall.getCallId().toString(), paramString, NativeProtocol.getLatestKnownVersion(), localBundle);
    paramBundle.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
    paramBundle.setAction("FacebookDialogFragment");
    paramAppCall.setRequestIntent(paramBundle);
  }
  
  public static void setupAppCallForWebFallbackDialog(AppCall paramAppCall, Bundle paramBundle, DialogFeature paramDialogFeature)
  {
    Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
    Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
    String str = paramDialogFeature.name();
    Object localObject = getDialogWebFallbackUri(paramDialogFeature);
    if (localObject != null)
    {
      int i = NativeProtocol.getLatestKnownVersion();
      paramBundle = ServerProtocol.getQueryParamsForPlatformActivityIntentWebFallback(paramAppCall.getCallId().toString(), i, paramBundle);
      if (paramBundle != null)
      {
        if (((Uri)localObject).isRelative()) {
          paramBundle = Utility.buildUri(ServerProtocol.getDialogAuthority(), ((Uri)localObject).toString(), paramBundle);
        } else {
          paramBundle = Utility.buildUri(((Uri)localObject).getAuthority(), ((Uri)localObject).getPath(), paramBundle);
        }
        localObject = new Bundle();
        ((BaseBundle)localObject).putString("url", paramBundle.toString());
        ((BaseBundle)localObject).putBoolean("is_fallback", true);
        paramBundle = new Intent();
        NativeProtocol.setupProtocolRequestIntent(paramBundle, paramAppCall.getCallId().toString(), paramDialogFeature.getAction(), NativeProtocol.getLatestKnownVersion(), (Bundle)localObject);
        paramBundle.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        paramBundle.setAction("FacebookDialogFragment");
        paramAppCall.setRequestIntent(paramBundle);
        return;
      }
      throw new FacebookException("Unable to fetch the app's key-hash");
    }
    throw new FacebookException(z2.p("Unable to fetch the Url for the DialogFeature : '", str, "'"));
  }
  
  public static abstract interface ParameterProvider
  {
    public abstract Bundle getLegacyParameters();
    
    public abstract Bundle getParameters();
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.DialogPresenter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */