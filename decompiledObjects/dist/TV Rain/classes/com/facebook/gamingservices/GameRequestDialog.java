package com.facebook.gamingservices;

import android.app.Activity;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.DaemonRequest.Callback;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
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
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GameRequestDialog
  extends FacebookDialogBase<GameRequestContent, Result>
{
  private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.GameRequest.toRequestCode();
  private static final String GAME_REQUEST_DIALOG = "apprequests";
  private FacebookCallback mCallback;
  
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
  
  private void showForCloud(GameRequestContent paramGameRequestContent, Object paramObject)
  {
    Activity localActivity = getActivityContext();
    paramObject = AccessToken.getCurrentAccessToken();
    if ((paramObject != null) && (!((AccessToken)paramObject).isExpired()))
    {
      DaemonRequest.Callback local3 = new DaemonRequest.Callback()
      {
        public void onCompleted(GraphResponse paramAnonymousGraphResponse)
        {
          if (GameRequestDialog.access$300(GameRequestDialog.this) != null) {
            if (paramAnonymousGraphResponse.getError() != null) {
              GameRequestDialog.access$300(GameRequestDialog.this).onError(new FacebookException(paramAnonymousGraphResponse.getError().getErrorMessage()));
            } else {
              GameRequestDialog.access$300(GameRequestDialog.this).onSuccess(new GameRequestDialog.Result(paramAnonymousGraphResponse, null));
            }
          }
        }
      };
      String str = ((AccessToken)paramObject).getApplicationId();
      if (paramGameRequestContent.getActionType() != null) {
        paramObject = paramGameRequestContent.getActionType().name();
      } else {
        paramObject = null;
      }
      JSONObject localJSONObject = new JSONObject();
      JSONArray localJSONArray = new JSONArray();
      try
      {
        localJSONObject.put("appID", str);
        localJSONObject.put("actionType", paramObject);
        localJSONObject.put("message", paramGameRequestContent.getMessage());
        localJSONObject.put("title", paramGameRequestContent.getTitle());
        localJSONObject.put("data", paramGameRequestContent.getData());
        if (paramGameRequestContent.getRecipients() != null)
        {
          paramGameRequestContent = paramGameRequestContent.getRecipients().iterator();
          while (paramGameRequestContent.hasNext()) {
            localJSONArray.put((String)paramGameRequestContent.next());
          }
        }
        localJSONObject.put("to", localJSONArray);
        DaemonRequest.executeAsync(localActivity, localJSONObject, local3, SDKMessageEnum.OPEN_GAME_REQUESTS_DIALOG);
      }
      catch (JSONException paramGameRequestContent)
      {
        paramGameRequestContent = mCallback;
        if (paramGameRequestContent != null) {
          paramGameRequestContent.onError(new FacebookException("Couldn't prepare Game Request Dialog"));
        }
      }
      return;
    }
    throw new FacebookException("Attempted to open GameRequestDialog with an invalid access token");
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
    mCallback = paramFacebookCallback;
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
  
  public void showImpl(GameRequestContent paramGameRequestContent, Object paramObject)
  {
    if (CloudGameLoginHandler.isRunningInCloud())
    {
      showForCloud(paramGameRequestContent, paramObject);
      return;
    }
    super.showImpl(paramGameRequestContent, paramObject);
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
      if ((CustomTabUtils.getChromePackage() != null) && (Validate.hasCustomTabRedirectActivity(GameRequestDialog.access$500(GameRequestDialog.this), CustomTabUtils.getDefaultRedirectURI()))) {
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
    
    private Result(GraphResponse paramGraphResponse)
    {
      try
      {
        paramGraphResponse = paramGraphResponse.getJSONObject();
        Object localObject = paramGraphResponse.optJSONObject("data");
        if (localObject != null) {
          paramGraphResponse = (GraphResponse)localObject;
        }
        requestId = paramGraphResponse.getString("request_id");
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        to = ((List)localObject);
        paramGraphResponse = paramGraphResponse.getJSONArray("to");
        for (int i = 0; i < paramGraphResponse.length(); i++) {
          to.add(paramGraphResponse.getString(i));
        }
        return;
      }
      catch (JSONException paramGraphResponse)
      {
        requestId = null;
        to = new ArrayList();
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
 * Qualified Name:     com.facebook.gamingservices.GameRequestDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */