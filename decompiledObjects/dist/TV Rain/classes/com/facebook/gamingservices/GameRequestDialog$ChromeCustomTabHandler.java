package com.facebook.gamingservices;

import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.internal.AppCall;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FacebookDialogBase.ModeHandler;
import com.facebook.internal.Validate;
import com.facebook.share.internal.GameRequestValidation;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.GameRequestContent;

class GameRequestDialog$ChromeCustomTabHandler
  extends FacebookDialogBase<GameRequestContent, GameRequestDialog.Result>.ModeHandler
{
  private GameRequestDialog$ChromeCustomTabHandler(GameRequestDialog paramGameRequestDialog)
  {
    super(paramGameRequestDialog);
  }
  
  public boolean canShow(GameRequestContent paramGameRequestContent, boolean paramBoolean)
  {
    if ((CustomTabUtils.getChromePackage() != null) && (Validate.hasCustomTabRedirectActivity(GameRequestDialog.access$500(this$0), CustomTabUtils.getDefaultRedirectURI()))) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    return paramBoolean;
  }
  
  public AppCall createAppCall(GameRequestContent paramGameRequestContent)
  {
    GameRequestValidation.validate(paramGameRequestContent);
    AppCall localAppCall = this$0.createBaseAppCall();
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

/* Location:
 * Qualified Name:     com.facebook.gamingservices.GameRequestDialog.ChromeCustomTabHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */