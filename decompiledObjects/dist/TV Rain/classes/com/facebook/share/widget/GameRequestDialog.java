package com.facebook.share.widget;

import android.app.Activity;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookSdk;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FacebookDialogBase.ModeHandler;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.Validate;
import com.facebook.share.internal.GameRequestValidation;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.GameRequestContent;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class GameRequestDialog
  extends FacebookDialogBase<GameRequestContent, Result>
{
  private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.GameRequest.toRequestCode();
  private static final String GAME_REQUEST_DIALOG = "apprequests";
  
  public GameRequestDialog(Activity paramActivity)
  {
    super(paramActivity, DEFAULT_REQUEST_CODE);
  }
  
  public GameRequestDialog(android.app.Fragment paramFragment)
  {
    this(new FragmentWrapper(paramFragment));
  }
  
  public GameRequestDialog(androidx.fragment.app.Fragment paramFragment)
  {
    this(new FragmentWrapper(paramFragment));
  }
  
  private GameRequestDialog(FragmentWrapper paramFragmentWrapper)
  {
    super(paramFragmentWrapper, DEFAULT_REQUEST_CODE);
  }
  
  public static boolean canShow()
  {
    return true;
  }
  
  public static void show(Activity paramActivity, GameRequestContent paramGameRequestContent)
  {
    new GameRequestDialog(paramActivity).show(paramGameRequestContent);
  }
  
  public static void show(android.app.Fragment paramFragment, GameRequestContent paramGameRequestContent)
  {
    show(new FragmentWrapper(paramFragment), paramGameRequestContent);
  }
  
  public static void show(androidx.fragment.app.Fragment paramFragment, GameRequestContent paramGameRequestContent)
  {
    show(new FragmentWrapper(paramFragment), paramGameRequestContent);
  }
  
  private static void show(FragmentWrapper paramFragmentWrapper, GameRequestContent paramGameRequestContent)
  {
    new GameRequestDialog(paramFragmentWrapper).show(paramGameRequestContent);
  }
  
  public AppCall createBaseAppCall()
  {
    return new AppCall(getRequestCode());
  }
  
  public List<FacebookDialogBase<GameRequestContent, Result>.ModeHandler> getOrderedModeHandlers()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new ChromeCustomTabHandler(null));
    localArrayList.add(new WebHandler(null));
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
          if (paramAnonymousBundle != null) {
            paramFacebookCallback.onSuccess(new GameRequestDialog.Result(paramAnonymousBundle, null));
          } else {
            onCancel(paramAnonymousAppCall);
          }
        }
      };
    }
    paramCallbackManagerImpl.registerCallback(getRequestCode(), new CallbackManagerImpl.Callback()
    {
      public boolean onActivityResult(int paramAnonymousInt, Intent paramAnonymousIntent)
      {
        return ShareInternalUtility.handleActivityResult(getRequestCode(), paramAnonymousInt, paramAnonymousIntent, paramFacebookCallback);
      }
    });
  }
  
  public class ChromeCustomTabHandler
    extends FacebookDialogBase<GameRequestContent, GameRequestDialog.Result>.ModeHandler
  {
    private ChromeCustomTabHandler()
    {
      super();
    }
    
    public boolean canShow(GameRequestContent paramGameRequestContent, boolean paramBoolean)
    {
      if ((CustomTabUtils.getChromePackage() != null) && (Validate.hasCustomTabRedirectActivity(GameRequestDialog.access$300(GameRequestDialog.this), CustomTabUtils.getDefaultRedirectURI()))) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      }
      return paramBoolean;
    }
    
    public AppCall createAppCall(GameRequestContent paramGameRequestContent)
    {
      GameRequestValidation.validate(paramGameRequestContent);
      AppCall localAppCall = createBaseAppCall();
      Bundle localBundle = WebDialogParameters.create(paramGameRequestContent);
      paramGameRequestContent = AccessToken.getCurrentAccessToken();
      if (paramGameRequestContent != null) {
        localBundle.putString("app_id", paramGameRequestContent.getApplicationId());
      } else {
        localBundle.putString("app_id", FacebookSdk.getApplicationId());
      }
      localBundle.putString("redirect_uri", CustomTabUtils.getDefaultRedirectURI());
      DialogPresenter.setupAppCallForCustomTabDialog(localAppCall, "apprequests", localBundle);
      return localAppCall;
    }
  }
  
  public static final class Result
  {
    public String requestId;
    public List<String> to;
    
    private Result(Bundle paramBundle)
    {
      requestId = paramBundle.getString("request");
      to = new ArrayList();
      while (paramBundle.containsKey(String.format("to[%d]", new Object[] { Integer.valueOf(to.size()) })))
      {
        List localList = to;
        localList.add(paramBundle.getString(String.format("to[%d]", new Object[] { Integer.valueOf(localList.size()) })));
      }
    }
    
    public String getRequestId()
    {
      return requestId;
    }
    
    public List<String> getRequestRecipients()
    {
      return to;
    }
  }
  
  public class WebHandler
    extends FacebookDialogBase<GameRequestContent, GameRequestDialog.Result>.ModeHandler
  {
    private WebHandler()
    {
      super();
    }
    
    public boolean canShow(GameRequestContent paramGameRequestContent, boolean paramBoolean)
    {
      return true;
    }
    
    public AppCall createAppCall(GameRequestContent paramGameRequestContent)
    {
      GameRequestValidation.validate(paramGameRequestContent);
      AppCall localAppCall = createBaseAppCall();
      DialogPresenter.setupAppCallForWebDialog(localAppCall, "apprequests", WebDialogParameters.create(paramGameRequestContent));
      return localAppCall;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.widget.GameRequestDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */