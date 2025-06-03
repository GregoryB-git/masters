package com.facebook.gamingservices;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.facebook.FacebookCallback;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.instrument.crashshield.AutoHandleExceptions;
import java.util.List;
import z2;

@AutoHandleExceptions
public class GamingGroupIntegration
  extends FacebookDialogBase<Void, Result>
{
  private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.GamingGroupIntegration.toRequestCode();
  private static final String ERROR_KEY = "error";
  
  public GamingGroupIntegration(Activity paramActivity)
  {
    super(paramActivity, DEFAULT_REQUEST_CODE);
  }
  
  public GamingGroupIntegration(android.app.Fragment paramFragment)
  {
    super(new FragmentWrapper(paramFragment), DEFAULT_REQUEST_CODE);
  }
  
  public GamingGroupIntegration(androidx.fragment.app.Fragment paramFragment)
  {
    super(new FragmentWrapper(paramFragment), DEFAULT_REQUEST_CODE);
  }
  
  public AppCall createBaseAppCall()
  {
    return null;
  }
  
  public List<FacebookDialogBase<Void, Result>.ModeHandler> getOrderedModeHandlers()
  {
    return null;
  }
  
  public void registerCallbackImpl(CallbackManagerImpl paramCallbackManagerImpl, final FacebookCallback paramFacebookCallback)
  {
    paramCallbackManagerImpl.registerCallback(getRequestCode(), new CallbackManagerImpl.Callback()
    {
      public boolean onActivityResult(int paramAnonymousInt, Intent paramAnonymousIntent)
      {
        if ((paramAnonymousIntent != null) && (paramAnonymousIntent.hasExtra("error")))
        {
          paramAnonymousIntent = (FacebookRequestError)paramAnonymousIntent.getParcelableExtra("error");
          paramFacebookCallback.onError(paramAnonymousIntent.getException());
          return true;
        }
        paramFacebookCallback.onSuccess(new GamingGroupIntegration.Result());
        return true;
      }
    });
  }
  
  public void show()
  {
    showImpl();
  }
  
  public void show(Void paramVoid)
  {
    showImpl();
  }
  
  public void showImpl()
  {
    StringBuilder localStringBuilder = z2.t("https://fb.gg/me/community/");
    localStringBuilder.append(FacebookSdk.getApplicationId());
    startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse(localStringBuilder.toString())), getRequestCode());
  }
  
  public static class Result {}
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.GamingGroupIntegration
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */