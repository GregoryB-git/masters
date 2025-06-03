package com.facebook.login;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.internal.PlatformServiceClient.CompletedListener;
import com.facebook.internal.Utility;
import com.facebook.internal.Utility.GraphMeRequestWithCacheCallback;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class GetTokenLoginMethodHandler
  extends LoginMethodHandler
{
  public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new Parcelable.Creator()
  {
    public GetTokenLoginMethodHandler createFromParcel(Parcel paramAnonymousParcel)
    {
      return new GetTokenLoginMethodHandler(paramAnonymousParcel);
    }
    
    public GetTokenLoginMethodHandler[] newArray(int paramAnonymousInt)
    {
      return new GetTokenLoginMethodHandler[paramAnonymousInt];
    }
  };
  private GetTokenClient getTokenClient;
  
  public GetTokenLoginMethodHandler(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  public GetTokenLoginMethodHandler(LoginClient paramLoginClient)
  {
    super(paramLoginClient);
  }
  
  public void cancel()
  {
    GetTokenClient localGetTokenClient = getTokenClient;
    if (localGetTokenClient != null)
    {
      localGetTokenClient.cancel();
      getTokenClient.setCompletedListener(null);
      getTokenClient = null;
    }
  }
  
  public void complete(final LoginClient.Request paramRequest, final Bundle paramBundle)
  {
    String str = paramBundle.getString("com.facebook.platform.extra.USER_ID");
    if ((str != null) && (!str.isEmpty()))
    {
      onComplete(paramRequest, paramBundle);
    }
    else
    {
      loginClient.notifyBackgroundProcessingStart();
      Utility.getGraphMeRequestWithCacheAsync(paramBundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new Utility.GraphMeRequestWithCacheCallback()
      {
        public void onFailure(FacebookException paramAnonymousFacebookException)
        {
          LoginClient localLoginClient = loginClient;
          localLoginClient.complete(LoginClient.Result.createErrorResult(localLoginClient.getPendingRequest(), "Caught exception", paramAnonymousFacebookException.getMessage()));
        }
        
        public void onSuccess(JSONObject paramAnonymousJSONObject)
        {
          try
          {
            paramAnonymousJSONObject = paramAnonymousJSONObject.getString("id");
            paramBundle.putString("com.facebook.platform.extra.USER_ID", paramAnonymousJSONObject);
            onComplete(paramRequest, paramBundle);
          }
          catch (JSONException localJSONException)
          {
            paramAnonymousJSONObject = loginClient;
            paramAnonymousJSONObject.complete(LoginClient.Result.createErrorResult(paramAnonymousJSONObject.getPendingRequest(), "Caught exception", localJSONException.getMessage()));
          }
        }
      });
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getNameForLogging()
  {
    return "get_token";
  }
  
  public void getTokenCompleted(LoginClient.Request paramRequest, Bundle paramBundle)
  {
    Object localObject1 = getTokenClient;
    if (localObject1 != null) {
      ((PlatformServiceClient)localObject1).setCompletedListener(null);
    }
    getTokenClient = null;
    loginClient.notifyBackgroundProcessingStop();
    if (paramBundle != null)
    {
      localObject1 = paramBundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
      Object localObject2 = paramRequest.getPermissions();
      if ((localObject1 != null) && ((localObject2 == null) || (((AbstractCollection)localObject1).containsAll((Collection)localObject2))))
      {
        complete(paramRequest, paramBundle);
        return;
      }
      paramBundle = new HashSet();
      Iterator localIterator = ((Set)localObject2).iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (String)localIterator.next();
        if (!((ArrayList)localObject1).contains(localObject2)) {
          paramBundle.add(localObject2);
        }
      }
      if (!paramBundle.isEmpty()) {
        addLoggingExtra("new_permissions", TextUtils.join(",", paramBundle));
      }
      paramRequest.setPermissions(paramBundle);
    }
    loginClient.tryNextHandler();
  }
  
  public void onComplete(LoginClient.Request paramRequest, Bundle paramBundle)
  {
    paramRequest = LoginMethodHandler.createAccessTokenFromNativeLogin(paramBundle, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE, paramRequest.getApplicationId());
    paramRequest = LoginClient.Result.createTokenResult(loginClient.getPendingRequest(), paramRequest);
    loginClient.completeAndValidate(paramRequest);
  }
  
  public int tryAuthorize(final LoginClient.Request paramRequest)
  {
    GetTokenClient localGetTokenClient = new GetTokenClient(loginClient.getActivity(), paramRequest.getApplicationId());
    getTokenClient = localGetTokenClient;
    if (!localGetTokenClient.start()) {
      return 0;
    }
    loginClient.notifyBackgroundProcessingStart();
    paramRequest = new PlatformServiceClient.CompletedListener()
    {
      public void completed(Bundle paramAnonymousBundle)
      {
        getTokenCompleted(paramRequest, paramAnonymousBundle);
      }
    };
    getTokenClient.setCompletedListener(paramRequest);
    return 1;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.GetTokenLoginMethodHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */