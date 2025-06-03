package com.appsflyer.deeplink;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

public class DeepLinkResult
{
  private final DeepLink deepLink;
  private final Error error;
  @NonNull
  private final Status status;
  
  public DeepLinkResult(DeepLink paramDeepLink, Error paramError)
  {
    deepLink = paramDeepLink;
    error = paramError;
    if (paramError != null) {
      paramDeepLink = Status.ERROR;
    }
    for (;;)
    {
      status = paramDeepLink;
      break;
      if (paramDeepLink != null) {
        paramDeepLink = Status.FOUND;
      } else {
        paramDeepLink = Status.NOT_FOUND;
      }
    }
  }
  
  public DeepLink getDeepLink()
  {
    return deepLink;
  }
  
  public Error getError()
  {
    return error;
  }
  
  @NonNull
  public Status getStatus()
  {
    return status;
  }
  
  public String toString()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("deepLink", deepLink);
      localJSONObject.put("error", error);
      localJSONObject.put("status", status);
    }
    catch (JSONException localJSONException)
    {
      AFLogger.afErrorLogForExcManagerOnly("error while creating deep link json", localJSONException);
    }
    return localJSONObject.toString();
  }
  
  public static enum Error
  {
    static
    {
      Error localError1 = new Error("TIMEOUT", 0);
      TIMEOUT = localError1;
      Error localError2 = new Error("NETWORK", 1);
      NETWORK = localError2;
      Error localError3 = new Error("HTTP_STATUS_CODE", 2);
      HTTP_STATUS_CODE = localError3;
      Error localError4 = new Error("UNEXPECTED", 3);
      UNEXPECTED = localError4;
      Error localError5 = new Error("DEVELOPER_ERROR", 4);
      DEVELOPER_ERROR = localError5;
      AFKeystoreWrapper = new Error[] { localError1, localError2, localError3, localError4, localError5 };
    }
    
    private Error() {}
  }
  
  public static enum Status
  {
    static
    {
      Status localStatus1 = new Status("FOUND", 0);
      FOUND = localStatus1;
      Status localStatus2 = new Status("NOT_FOUND", 1);
      NOT_FOUND = localStatus2;
      Status localStatus3 = new Status("ERROR", 2);
      ERROR = localStatus3;
      AFInAppEventType = new Status[] { localStatus1, localStatus2, localStatus3 };
    }
    
    private Status() {}
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.deeplink.DeepLinkResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */