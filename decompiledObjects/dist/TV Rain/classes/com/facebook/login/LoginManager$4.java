package com.facebook.login;

import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.LoginStatusCallback;
import com.facebook.Profile;
import com.facebook.internal.PlatformServiceClient.CompletedListener;
import com.facebook.internal.Utility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

class LoginManager$4
  implements PlatformServiceClient.CompletedListener
{
  public LoginManager$4(LoginManager paramLoginManager, String paramString1, LoginLogger paramLoginLogger, LoginStatusCallback paramLoginStatusCallback, String paramString2) {}
  
  public void completed(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      String str1 = paramBundle.getString("com.facebook.platform.status.ERROR_TYPE");
      Object localObject = paramBundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
      if (str1 != null)
      {
        LoginManager.access$100(str1, (String)localObject, val$loggerRef, val$logger, val$responseCallback);
      }
      else
      {
        String str2 = paramBundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date localDate1 = Utility.getBundleLongAsDate(paramBundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        localObject = paramBundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String str3 = paramBundle.getString("signed request");
        str1 = paramBundle.getString("graph_domain");
        Date localDate2 = Utility.getBundleLongAsDate(paramBundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
        paramBundle = null;
        if (!Utility.isNullOrEmpty(str3)) {
          paramBundle = LoginMethodHandler.getUserIDFromSignedRequest(str3);
        }
        if ((!Utility.isNullOrEmpty(str2)) && (localObject != null) && (!((ArrayList)localObject).isEmpty()) && (!Utility.isNullOrEmpty(paramBundle)))
        {
          paramBundle = new AccessToken(str2, val$applicationId, paramBundle, (Collection)localObject, null, null, null, localDate1, null, localDate2, str1);
          AccessToken.setCurrentAccessToken(paramBundle);
          Profile.fetchProfileForCurrentAccessToken();
          val$logger.logLoginStatusSuccess(val$loggerRef);
          val$responseCallback.onCompleted(paramBundle);
        }
        else
        {
          val$logger.logLoginStatusFailure(val$loggerRef);
          val$responseCallback.onFailure();
        }
      }
    }
    else
    {
      val$logger.logLoginStatusFailure(val$loggerRef);
      val$responseCallback.onFailure();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.LoginManager.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */