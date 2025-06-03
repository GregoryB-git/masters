package com.facebook.share.widget;

import android.app.Activity;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.FacebookCallback;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.DialogPresenter.ParameterProvider;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FacebookDialogBase.ModeHandler;
import com.facebook.internal.FragmentWrapper;
import com.facebook.share.internal.AppInviteDialogFeature;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.AppInviteContent;
import com.facebook.share.model.AppInviteContent.Builder.Destination;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class AppInviteDialog
  extends FacebookDialogBase<AppInviteContent, Result>
{
  private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.AppInvite.toRequestCode();
  private static final String TAG = "AppInviteDialog";
  
  @Deprecated
  public AppInviteDialog(Activity paramActivity)
  {
    super(paramActivity, DEFAULT_REQUEST_CODE);
  }
  
  @Deprecated
  public AppInviteDialog(android.app.Fragment paramFragment)
  {
    this(new FragmentWrapper(paramFragment));
  }
  
  @Deprecated
  public AppInviteDialog(androidx.fragment.app.Fragment paramFragment)
  {
    this(new FragmentWrapper(paramFragment));
  }
  
  private AppInviteDialog(FragmentWrapper paramFragmentWrapper)
  {
    super(paramFragmentWrapper, DEFAULT_REQUEST_CODE);
  }
  
  @Deprecated
  public static boolean canShow()
  {
    return false;
  }
  
  private static boolean canShowNativeDialog()
  {
    return false;
  }
  
  private static boolean canShowWebFallback()
  {
    return false;
  }
  
  private static Bundle createParameters(AppInviteContent paramAppInviteContent)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("app_link_url", paramAppInviteContent.getApplinkUrl());
    localBundle.putString("preview_image_url", paramAppInviteContent.getPreviewImageUrl());
    localBundle.putString("destination", paramAppInviteContent.getDestination().toString());
    String str = paramAppInviteContent.getPromotionCode();
    if (str == null) {
      str = "";
    }
    paramAppInviteContent = paramAppInviteContent.getPromotionText();
    if (!TextUtils.isEmpty(paramAppInviteContent)) {
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        localJSONObject.put("promo_code", str);
        localJSONObject.put("promo_text", paramAppInviteContent);
        localBundle.putString("deeplink_context", localJSONObject.toString());
        localBundle.putString("promo_code", str);
        localBundle.putString("promo_text", paramAppInviteContent);
      }
      catch (JSONException paramAppInviteContent)
      {
        Log.e("AppInviteDialog", "Json Exception in creating deeplink context");
      }
    }
    return localBundle;
  }
  
  private static DialogFeature getFeature()
  {
    return AppInviteDialogFeature.APP_INVITES_DIALOG;
  }
  
  @Deprecated
  public static void show(Activity paramActivity, AppInviteContent paramAppInviteContent)
  {
    new AppInviteDialog(paramActivity).show(paramAppInviteContent);
  }
  
  @Deprecated
  public static void show(android.app.Fragment paramFragment, AppInviteContent paramAppInviteContent)
  {
    show(new FragmentWrapper(paramFragment), paramAppInviteContent);
  }
  
  @Deprecated
  public static void show(androidx.fragment.app.Fragment paramFragment, AppInviteContent paramAppInviteContent)
  {
    show(new FragmentWrapper(paramFragment), paramAppInviteContent);
  }
  
  private static void show(FragmentWrapper paramFragmentWrapper, AppInviteContent paramAppInviteContent)
  {
    new AppInviteDialog(paramFragmentWrapper).show(paramAppInviteContent);
  }
  
  public AppCall createBaseAppCall()
  {
    return new AppCall(getRequestCode());
  }
  
  public List<FacebookDialogBase<AppInviteContent, Result>.ModeHandler> getOrderedModeHandlers()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new NativeHandler(null));
    localArrayList.add(new WebFallbackHandler(null));
    return localArrayList;
  }
  
  public void registerCallbackImpl(CallbackManagerImpl paramCallbackManagerImpl, final FacebookCallback<Result> paramFacebookCallback)
  {
    if (paramFacebookCallback == null) {
      paramFacebookCallback = null;
    } else {
      paramFacebookCallback = new ResultProcessor(paramFacebookCallback)
      {
        public void onSuccess(AppCall paramAnonymousAppCall, Bundle paramAnonymousBundle)
        {
          if ("cancel".equalsIgnoreCase(ShareInternalUtility.getNativeDialogCompletionGesture(paramAnonymousBundle))) {
            paramFacebookCallback.onCancel();
          } else {
            paramFacebookCallback.onSuccess(new AppInviteDialog.Result(paramAnonymousBundle));
          }
        }
      };
    }
    paramFacebookCallback = new CallbackManagerImpl.Callback()
    {
      public boolean onActivityResult(int paramAnonymousInt, Intent paramAnonymousIntent)
      {
        return ShareInternalUtility.handleActivityResult(getRequestCode(), paramAnonymousInt, paramAnonymousIntent, paramFacebookCallback);
      }
    };
    paramCallbackManagerImpl.registerCallback(getRequestCode(), paramFacebookCallback);
  }
  
  @Deprecated
  public void show(AppInviteContent paramAppInviteContent) {}
  
  public class NativeHandler
    extends FacebookDialogBase<AppInviteContent, AppInviteDialog.Result>.ModeHandler
  {
    private NativeHandler()
    {
      super();
    }
    
    public boolean canShow(AppInviteContent paramAppInviteContent, boolean paramBoolean)
    {
      return false;
    }
    
    public AppCall createAppCall(final AppInviteContent paramAppInviteContent)
    {
      AppCall localAppCall = createBaseAppCall();
      DialogPresenter.setupAppCallForNativeDialog(localAppCall, new DialogPresenter.ParameterProvider()
      {
        public Bundle getLegacyParameters()
        {
          Log.e("AppInviteDialog", "Attempting to present the AppInviteDialog with an outdated Facebook app on the device");
          return new Bundle();
        }
        
        public Bundle getParameters()
        {
          return AppInviteDialog.access$200(paramAppInviteContent);
        }
      }, AppInviteDialog.access$300());
      return localAppCall;
    }
  }
  
  @Deprecated
  public static final class Result
  {
    private final Bundle bundle;
    
    public Result(Bundle paramBundle)
    {
      bundle = paramBundle;
    }
    
    public Bundle getData()
    {
      return bundle;
    }
  }
  
  public class WebFallbackHandler
    extends FacebookDialogBase<AppInviteContent, AppInviteDialog.Result>.ModeHandler
  {
    private WebFallbackHandler()
    {
      super();
    }
    
    public boolean canShow(AppInviteContent paramAppInviteContent, boolean paramBoolean)
    {
      return false;
    }
    
    public AppCall createAppCall(AppInviteContent paramAppInviteContent)
    {
      AppCall localAppCall = createBaseAppCall();
      DialogPresenter.setupAppCallForWebFallbackDialog(localAppCall, AppInviteDialog.access$200(paramAppInviteContent), AppInviteDialog.access$300());
      return localAppCall;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.widget.AppInviteDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */