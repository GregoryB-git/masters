package com.facebook.gamingservices;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.DaemonRequest.Callback;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.instrument.crashshield.AutoHandleExceptions;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import z2;

@AutoHandleExceptions
public class FriendFinderDialog
  extends FacebookDialogBase<Void, Result>
{
  private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.GamingFriendFinder.toRequestCode();
  private FacebookCallback mCallback;
  
  public FriendFinderDialog(Activity paramActivity)
  {
    super(paramActivity, DEFAULT_REQUEST_CODE);
  }
  
  public FriendFinderDialog(android.app.Fragment paramFragment)
  {
    super(new FragmentWrapper(paramFragment), DEFAULT_REQUEST_CODE);
  }
  
  public FriendFinderDialog(androidx.fragment.app.Fragment paramFragment)
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
    mCallback = paramFacebookCallback;
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
        paramFacebookCallback.onSuccess(new FriendFinderDialog.Result());
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
    Object localObject = AccessToken.getCurrentAccessToken();
    if ((localObject != null) && (!((AccessToken)localObject).isExpired()))
    {
      String str = ((AccessToken)localObject).getApplicationId();
      if (CloudGameLoginHandler.isRunningInCloud())
      {
        Activity localActivity = getActivityContext();
        DaemonRequest.Callback local1 = new DaemonRequest.Callback()
        {
          public void onCompleted(GraphResponse paramAnonymousGraphResponse)
          {
            if (FriendFinderDialog.access$000(FriendFinderDialog.this) != null) {
              if (paramAnonymousGraphResponse.getError() != null) {
                FriendFinderDialog.access$000(FriendFinderDialog.this).onError(new FacebookException(paramAnonymousGraphResponse.getError().getErrorMessage()));
              } else {
                FriendFinderDialog.access$000(FriendFinderDialog.this).onSuccess(new FriendFinderDialog.Result());
              }
            }
          }
        };
        localObject = new JSONObject();
        try
        {
          ((JSONObject)localObject).put("id", str);
          ((JSONObject)localObject).put("deepLink", "FRIEND_FINDER");
          DaemonRequest.executeAsync(localActivity, (JSONObject)localObject, local1, SDKMessageEnum.OPEN_GAMING_SERVICES_DEEP_LINK);
        }
        catch (JSONException localJSONException)
        {
          FacebookCallback localFacebookCallback = mCallback;
          if (localFacebookCallback != null) {
            localFacebookCallback.onError(new FacebookException("Couldn't prepare Friend Finder Dialog"));
          }
        }
        return;
      }
      startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse(z2.o("https://fb.gg/me/friendfinder/", str))), getRequestCode());
      return;
    }
    throw new FacebookException("Attempted to open GamingServices FriendFinder with an invalid access token");
  }
  
  public static class Result {}
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.FriendFinderDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */