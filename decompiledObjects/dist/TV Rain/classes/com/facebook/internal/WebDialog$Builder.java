package com.facebook.internal;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookException;

public class WebDialog$Builder
{
  private AccessToken accessToken;
  private String action;
  private String applicationId;
  private Context context;
  private WebDialog.OnCompleteListener listener;
  private Bundle parameters;
  private int theme;
  
  public WebDialog$Builder(Context paramContext, String paramString, Bundle paramBundle)
  {
    accessToken = AccessToken.getCurrentAccessToken();
    if (!AccessToken.isCurrentAccessTokenActive())
    {
      String str = Utility.getMetadataApplicationId(paramContext);
      if (str != null) {
        applicationId = str;
      } else {
        throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
      }
    }
    finishInit(paramContext, paramString, paramBundle);
  }
  
  public WebDialog$Builder(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    String str = paramString1;
    if (paramString1 == null) {
      str = Utility.getMetadataApplicationId(paramContext);
    }
    Validate.notNullOrEmpty(str, "applicationId");
    applicationId = str;
    finishInit(paramContext, paramString2, paramBundle);
  }
  
  private void finishInit(Context paramContext, String paramString, Bundle paramBundle)
  {
    context = paramContext;
    action = paramString;
    if (paramBundle != null) {
      parameters = paramBundle;
    } else {
      parameters = new Bundle();
    }
  }
  
  public WebDialog build()
  {
    AccessToken localAccessToken = accessToken;
    if (localAccessToken != null)
    {
      parameters.putString("app_id", localAccessToken.getApplicationId());
      parameters.putString("access_token", accessToken.getToken());
    }
    else
    {
      parameters.putString("app_id", applicationId);
    }
    return WebDialog.newInstance(context, action, parameters, theme, listener);
  }
  
  public String getApplicationId()
  {
    return applicationId;
  }
  
  public Context getContext()
  {
    return context;
  }
  
  public WebDialog.OnCompleteListener getListener()
  {
    return listener;
  }
  
  public Bundle getParameters()
  {
    return parameters;
  }
  
  public int getTheme()
  {
    return theme;
  }
  
  public Builder setOnCompleteListener(WebDialog.OnCompleteListener paramOnCompleteListener)
  {
    listener = paramOnCompleteListener;
    return this;
  }
  
  public Builder setTheme(int paramInt)
  {
    theme = paramInt;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.WebDialog.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */